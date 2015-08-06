/*******************************************************************************
    list.h
    JOB60842サンプルプログラム
    リスト制御ルーチン (ヘッダのみ)

    Copyright(C) 2003, Oki Electric Industry Co.,Ltd.
      All rights reserved.

    更新履歴
    Mar.31,2003 rev1.00:新規作成
*******************************************************************************/
#ifndef _LIST_H_
#define _LIST_H_

typedef struct _LIST_ENTRY {
	struct _LIST_ENTRY *Blink;
	struct _LIST_ENTRY *Flink;
}LIST_ENTRY, *pLIST_ENTRY;

/* リストに追加する */
__inline void __list_add(pLIST_ENTRY entry, pLIST_ENTRY Blink, pLIST_ENTRY Flink)
{
	entry->Blink = Blink;	
	entry->Flink = Flink;
	Blink->Flink = entry;
	Flink->Blink = entry;	
}

/* リストから削除する */
__inline void __list_del(pLIST_ENTRY Blink, pLIST_ENTRY Flink)
{
	Flink->Blink = Blink;
	Blink->Flink = Flink;
}

/* リストエントリ定義 */
#define DEFINE_LIST_ENTRY(entry) \
LIST_ENTRY entry = {&(entry), &(entry)}

/* リストを初期状態(空)にする */
#define INIT_LIST_ENTRY(ptr) do { \
	(ptr)->Flink = (ptr); (ptr)->Blink = (ptr); \
} while (0)

/* エントリが属する構造体の先頭のアドレスを取得する */
#define list_struct_entry(entry, type, member) \
	((type *)((char *)(entry)-(unsigned long)(&((type *)0)->member)))


/* エントリをリストに先頭に追加する */
__inline void list_add_top(pLIST_ENTRY entry, pLIST_ENTRY head)
{
	__list_add(entry, head, head->Flink);
}

/* エントリをリストの最後に追加する */
__inline void list_add(pLIST_ENTRY entry, pLIST_ENTRY head)
{
	__list_add(entry, head->Blink, head);
}

/* エントリをリストから削除する */
__inline void list_del(pLIST_ENTRY entry)
{
	__list_del(entry->Blink, entry->Flink);
}

/* リストが空かチェックする */
__inline int list_empty(pLIST_ENTRY head)
{
	return (head->Flink == head);
}

#endif /* _LIST_H_ */
