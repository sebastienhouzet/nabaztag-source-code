package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import net.violet.platform.util.Constantes;

public final class nathanadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_property_name_id_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_logic_notEmpty_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_property_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_logic_notEmpty_name.release();
    _jspx_tagPool_bean_define_name_id_nobody.release();
    _jspx_tagPool_logic_iterate_name_id.release();
    _jspx_tagPool_bean_define_property_name_id_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
 response.setContentType("text/html;charset=UTF-8"); 
      out.write("\n\n\n\n\n\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\n\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n\n<title>Nathan Admin</title>\n</head>\n\n<body>\n\n<h1>NATHAN ADMIN</h1>\n\n<p>\n\tCette page permet de modérer les versions Nathan proposées par les utilisateurs.\n</p>\n\n<a href=\"nathanadmin?action=list\">Lister les versions en attente de validation</a> : affiche les \nversions partagées en attente de validation, pour l'instant ces versions ne sont accessibles que par leur créateur.\n\n<br/><hr/><br/>\n\n");
      out.write('\n');
      //  logic:notEmpty
      org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_0 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
      _jspx_th_logic_notEmpty_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_notEmpty_0.setParent(null);
      _jspx_th_logic_notEmpty_0.setName("resultsList");
      int _jspx_eval_logic_notEmpty_0 = _jspx_th_logic_notEmpty_0.doStartTag();
      if (_jspx_eval_logic_notEmpty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
          _jspx_th_bean_define_0.setId("resultsList");
          _jspx_th_bean_define_0.setName("resultsList");
          int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
          if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_name_id_nobody.reuse(_jspx_th_bean_define_0);
            return;
          }
          _jspx_tagPool_bean_define_name_id_nobody.reuse(_jspx_th_bean_define_0);
          java.lang.Object resultsList = null;
          resultsList = (java.lang.Object) _jspx_page_context.findAttribute("resultsList");
          out.write("\n\n<ul>\n");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_iterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
          _jspx_th_logic_iterate_0.setName("resultsList");
          _jspx_th_logic_iterate_0.setId("version");
          int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
          if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object version = null;
            if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_iterate_0.doInitBody();
            }
            version = (java.lang.Object) _jspx_page_context.findAttribute("version");
            do {
              out.write('\n');
              out.write('	');
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_1 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_1.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
              _jspx_th_bean_define_1.setId("versionId");
              _jspx_th_bean_define_1.setName("version");
              _jspx_th_bean_define_1.setProperty("id");
              int _jspx_eval_bean_define_1 = _jspx_th_bean_define_1.doStartTag();
              if (_jspx_th_bean_define_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_1);
                return;
              }
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_1);
              java.lang.Object versionId = null;
              versionId = (java.lang.Object) _jspx_page_context.findAttribute("versionId");
              out.write("\n\t<li><a href=\"nathanadmin?action=info&versionId=");
              out.print(versionId );
              out.write("\">Version ");
              out.print(versionId);
              out.write("</a></li>\n");
              int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
              version = (java.lang.Object) _jspx_page_context.findAttribute("version");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_0);
            return;
          }
          _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_0);
          out.write("\n</ul>\n\n");
          int evalDoAfterBody = _jspx_th_logic_notEmpty_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_notEmpty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_notEmpty_name.reuse(_jspx_th_logic_notEmpty_0);
        return;
      }
      _jspx_tagPool_logic_notEmpty_name.reuse(_jspx_th_logic_notEmpty_0);
      out.write('\n');
      out.write("\n\n<br/><hr/><br/>\n\n");
      out.write('\n');
      //  logic:notEmpty
      org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_1 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
      _jspx_th_logic_notEmpty_1.setPageContext(_jspx_page_context);
      _jspx_th_logic_notEmpty_1.setParent(null);
      _jspx_th_logic_notEmpty_1.setName("theVersion");
      int _jspx_eval_logic_notEmpty_1 = _jspx_th_logic_notEmpty_1.doStartTag();
      if (_jspx_eval_logic_notEmpty_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_2 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_2.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
          _jspx_th_bean_define_2.setId("theVersion");
          _jspx_th_bean_define_2.setName("theVersion");
          int _jspx_eval_bean_define_2 = _jspx_th_bean_define_2.doStartTag();
          if (_jspx_th_bean_define_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_name_id_nobody.reuse(_jspx_th_bean_define_2);
            return;
          }
          _jspx_tagPool_bean_define_name_id_nobody.reuse(_jspx_th_bean_define_2);
          java.lang.Object theVersion = null;
          theVersion = (java.lang.Object) _jspx_page_context.findAttribute("theVersion");
          out.write('\n');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_3 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_3.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
          _jspx_th_bean_define_3.setId("mp3List");
          _jspx_th_bean_define_3.setName("mp3List");
          int _jspx_eval_bean_define_3 = _jspx_th_bean_define_3.doStartTag();
          if (_jspx_th_bean_define_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_name_id_nobody.reuse(_jspx_th_bean_define_3);
            return;
          }
          _jspx_tagPool_bean_define_name_id_nobody.reuse(_jspx_th_bean_define_3);
          java.lang.Object mp3List = null;
          mp3List = (java.lang.Object) _jspx_page_context.findAttribute("mp3List");
          out.write('\n');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_4 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_4.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
          _jspx_th_bean_define_4.setId("theAuthor");
          _jspx_th_bean_define_4.setName("theAuthor");
          int _jspx_eval_bean_define_4 = _jspx_th_bean_define_4.doStartTag();
          if (_jspx_th_bean_define_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_name_id_nobody.reuse(_jspx_th_bean_define_4);
            return;
          }
          _jspx_tagPool_bean_define_name_id_nobody.reuse(_jspx_th_bean_define_4);
          java.lang.Object theAuthor = null;
          theAuthor = (java.lang.Object) _jspx_page_context.findAttribute("theAuthor");
          out.write('\n');
          out.write('\n');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_5 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_5.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
          _jspx_th_bean_define_5.setId("versionId");
          _jspx_th_bean_define_5.setName("theVersion");
          _jspx_th_bean_define_5.setProperty("id");
          int _jspx_eval_bean_define_5 = _jspx_th_bean_define_5.doStartTag();
          if (_jspx_th_bean_define_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_5);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_5);
          java.lang.Object versionId = null;
          versionId = (java.lang.Object) _jspx_page_context.findAttribute("versionId");
          out.write('\n');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_6 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_6.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
          _jspx_th_bean_define_6.setId("description");
          _jspx_th_bean_define_6.setName("theVersion");
          _jspx_th_bean_define_6.setProperty("description");
          int _jspx_eval_bean_define_6 = _jspx_th_bean_define_6.doStartTag();
          if (_jspx_th_bean_define_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_6);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_6);
          java.lang.Object description = null;
          description = (java.lang.Object) _jspx_page_context.findAttribute("description");
          out.write('\n');
          out.write('\n');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_7 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_7.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
          _jspx_th_bean_define_7.setId("authorLogin");
          _jspx_th_bean_define_7.setName("theAuthor");
          _jspx_th_bean_define_7.setProperty("object_login");
          int _jspx_eval_bean_define_7 = _jspx_th_bean_define_7.doStartTag();
          if (_jspx_th_bean_define_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_7);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_7);
          java.lang.Object authorLogin = null;
          authorLogin = (java.lang.Object) _jspx_page_context.findAttribute("authorLogin");
          out.write('\n');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_8 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_8.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
          _jspx_th_bean_define_8.setId("authorId");
          _jspx_th_bean_define_8.setName("theAuthor");
          _jspx_th_bean_define_8.setProperty("id");
          int _jspx_eval_bean_define_8 = _jspx_th_bean_define_8.doStartTag();
          if (_jspx_th_bean_define_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_8);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_8);
          java.lang.Object authorId = null;
          authorId = (java.lang.Object) _jspx_page_context.findAttribute("authorId");
          out.write("\n\n<h2>Fiche détaillée : ");
          out.print(versionId);
          out.write("</h2>\n\n<p>\nAuteur : ");
          out.print(authorLogin);
          out.write(' ');
          out.write('(');
          out.print(authorId );
          out.write(")<br/>\nDescription : ");
          out.print(description);
          out.write("<br/>\nContenu : <br/>\n\n<ul>\n\t");
int count = 1; 
          out.write('\n');
          out.write('	');
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_1 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_iterate_1.setPageContext(_jspx_page_context);
          _jspx_th_logic_iterate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
          _jspx_th_logic_iterate_1.setName("mp3List");
          _jspx_th_logic_iterate_1.setId("mp3");
          int _jspx_eval_logic_iterate_1 = _jspx_th_logic_iterate_1.doStartTag();
          if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object mp3 = null;
            if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_iterate_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_iterate_1.doInitBody();
            }
            mp3 = (java.lang.Object) _jspx_page_context.findAttribute("mp3");
            do {
              out.write('\n');
              out.write('	');
              out.write('	');
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_9 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_9.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
              _jspx_th_bean_define_9.setId("file");
              _jspx_th_bean_define_9.setName("mp3");
              _jspx_th_bean_define_9.setProperty("file");
              int _jspx_eval_bean_define_9 = _jspx_th_bean_define_9.doStartTag();
              if (_jspx_th_bean_define_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_9);
                return;
              }
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_9);
              java.lang.Object file = null;
              file = (java.lang.Object) _jspx_page_context.findAttribute("file");
              out.write('\n');
              out.write('	');
              out.write('	');
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_10 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_10.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
              _jspx_th_bean_define_10.setId("path");
              _jspx_th_bean_define_10.setName("file");
              _jspx_th_bean_define_10.setProperty("path2mp3");
              int _jspx_eval_bean_define_10 = _jspx_th_bean_define_10.doStartTag();
              if (_jspx_th_bean_define_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_10);
                return;
              }
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_10);
              java.lang.Object path = null;
              path = (java.lang.Object) _jspx_page_context.findAttribute("path");
              out.write("\n\t\t<li><a href=\"http://");
              out.print(Constantes.STREAM_SERVER);
              out.print(path.toString().replaceAll("broadcast",""));
              out.write("\">Partie ");
              out.print(count++);
              out.write("</a></li>\n\t");
              int evalDoAfterBody = _jspx_th_logic_iterate_1.doAfterBody();
              mp3 = (java.lang.Object) _jspx_page_context.findAttribute("mp3");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_iterate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_1);
            return;
          }
          _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_1);
          out.write("\n</ul>\n\n\n<a href=\"nathanadmin?action=accept&versionId=");
          out.print(versionId);
          out.write("\">Accepter cette version</a> cette version sera accessible pour\ntous les utilisateurs.<br/>\n<a href=\"nathanadmin?action=refuse&versionId=");
          out.print(versionId);
          out.write("\">Refuser cette version</a> cette version ne sera accessible que pour\nson auteur et n'apparaîtra plus dans la liste des versions à modérer.\n</p>\n\n");
          int evalDoAfterBody = _jspx_th_logic_notEmpty_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_notEmpty_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_notEmpty_name.reuse(_jspx_th_logic_notEmpty_1);
        return;
      }
      _jspx_tagPool_logic_notEmpty_name.reuse(_jspx_th_logic_notEmpty_1);
      out.write("\n\n\n\n</body>\n\n</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
