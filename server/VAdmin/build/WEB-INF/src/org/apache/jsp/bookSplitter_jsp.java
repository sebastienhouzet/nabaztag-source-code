package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bookSplitter_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_messagesPresent_property_message;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_enctype_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_property_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_empty_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_file_styleId_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_property_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_logic_messagesPresent_property_message = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_errors_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_enctype_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_property_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_empty_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_file_styleId_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_property_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_logic_messagesPresent_property_message.release();
    _jspx_tagPool_html_errors_property_nobody.release();
    _jspx_tagPool_html_form_enctype_action.release();
    _jspx_tagPool_bean_define_property_name_id_nobody.release();
    _jspx_tagPool_logic_empty_property_name.release();
    _jspx_tagPool_html_file_styleId_property_name_nobody.release();
    _jspx_tagPool_logic_notEmpty_property_name.release();
    _jspx_tagPool_logic_iterate_property_name_id.release();
    _jspx_tagPool_bean_write_property_name_nobody.release();
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

      out.write("\n\n\n\n\n\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");

	int countRow = 0;

      out.write("\n\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n\n<script type=\"text/javascript\" src=\"../include_js/conftools/swfobject-1.5.1.js\"></script>\n\n<title>Book Splitter</title>\n\n</head>\n<body>\n\n");
      if (_jspx_meth_logic_messagesPresent_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_enctype_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("/action/bookSplitter");
      _jspx_th_html_form_0.setEnctype("multipart/form-data");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_define_0.setName("bookSplitterForm");
          _jspx_th_bean_define_0.setProperty("file");
          _jspx_th_bean_define_0.setId("fileId");
          int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
          if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
          java.lang.Object fileId = null;
          fileId = (java.lang.Object) _jspx_page_context.findAttribute("fileId");
          out.write('\n');
          //  logic:empty
          org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_0 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
          _jspx_th_logic_empty_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_empty_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_empty_0.setName("bookSplitterForm");
          _jspx_th_logic_empty_0.setProperty("musicFile");
          int _jspx_eval_logic_empty_0 = _jspx_th_logic_empty_0.doStartTag();
          if (_jspx_eval_logic_empty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write('\n');
              if (_jspx_meth_html_file_0(_jspx_th_logic_empty_0, _jspx_page_context))
                return;
              out.write("\n<input type=\"text\" name=\"file\" value=\"");
              out.print( fileId);
              out.write("\"/>\n\n");
              int evalDoAfterBody = _jspx_th_logic_empty_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_empty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_0);
            return;
          }
          _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_0);
          out.write('\n');
          out.write('\n');
          //  logic:notEmpty
          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_0 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
          _jspx_th_logic_notEmpty_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEmpty_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_notEmpty_0.setName("bookSplitterForm");
          _jspx_th_logic_notEmpty_0.setProperty("musicFile");
          int _jspx_eval_logic_notEmpty_0 = _jspx_th_logic_notEmpty_0.doStartTag();
          if (_jspx_eval_logic_notEmpty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write('\n');
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_1 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_1.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
              _jspx_th_bean_define_1.setName("bookSplitterForm");
              _jspx_th_bean_define_1.setProperty("fileName");
              _jspx_th_bean_define_1.setId("fileName");
              int _jspx_eval_bean_define_1 = _jspx_th_bean_define_1.doStartTag();
              if (_jspx_th_bean_define_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_1);
                return;
              }
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_1);
              java.lang.Object fileName = null;
              fileName = (java.lang.Object) _jspx_page_context.findAttribute("fileName");
              out.write("\n<script type=\"text/javascript\">\nfunction createPlayer(rowId, offset) {\n\n\tvar fileName = \"");
              out.print(fileName);
              out.write("\";\n\tvar fo = new SWFObject('../include_flash/mp3player.swf', \"player\", 350, '20', '7', null, true);\n\tfo.addParam('align', 'center');\n\tfo.addParam('wmode', 'transparent');\n\tfo.addVariable('backcolor', '0xEEEEFF'); \n\tfo.addVariable('frontcolor', '0x886622');\n\t\n\tfo.addVariable('file', \"http://192.168.1.11/vl/bookpreview%3FfileName=\".concat(fileName).concat(\"%26offset=\").concat(offset, \"%26s=.mp3\"));\n\tfo.addVariable('enablejs', \"true\");\t\n\tfo.addVariable('autostart', \"false\");\t\n\t\n\tif (!fo.write(\"player-\".concat(rowId))) {\n\t\tvar container = document.getElementById(\"player-\".concat(rowId));\n\t\tif (container) container.innerHTML = fo.getSWFHTML();\n\t}\n}\n\n</script>\n\t<table id=\"matable\" border=\"1\">\n\t\t<tr>\n\t\t\t");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_2 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_2.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
              _jspx_th_bean_define_2.setName("bookSplitterForm");
              _jspx_th_bean_define_2.setProperty("nbBytes");
              _jspx_th_bean_define_2.setId("nbBytes");
              int _jspx_eval_bean_define_2 = _jspx_th_bean_define_2.doStartTag();
              if (_jspx_th_bean_define_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_2);
                return;
              }
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_2);
              java.lang.Object nbBytes = null;
              nbBytes = (java.lang.Object) _jspx_page_context.findAttribute("nbBytes");
              out.write("\n\t\t\t<td><label style=\"display: block;\">Nom</label></td>\n\t\t\t<td><label style=\"display: block;\">Temps</label></td>\n\t\t\t<td><label style=\"display: block;\">Octets</label></td>\n\t\t</tr>\n\t\t");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_property_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
              _jspx_th_logic_iterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
              _jspx_th_logic_iterate_0.setName("bookSplitterForm");
              _jspx_th_logic_iterate_0.setProperty("listPoint");
              _jspx_th_logic_iterate_0.setId("listPoint");
              int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
              if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object listPoint = null;
                if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_iterate_0.doInitBody();
                }
                listPoint = (java.lang.Object) _jspx_page_context.findAttribute("listPoint");
                do {
                  out.write("\n\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_3 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_3.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
                  _jspx_th_bean_define_3.setName("listPoint");
                  _jspx_th_bean_define_3.setProperty("sec");
                  _jspx_th_bean_define_3.setId("sec");
                  int _jspx_eval_bean_define_3 = _jspx_th_bean_define_3.doStartTag();
                  if (_jspx_th_bean_define_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_3);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_3);
                  java.lang.Object sec = null;
                  sec = (java.lang.Object) _jspx_page_context.findAttribute("sec");
                  out.write("\n\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_4 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_4.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
                  _jspx_th_bean_define_4.setName("listPoint");
                  _jspx_th_bean_define_4.setProperty("nbByte");
                  _jspx_th_bean_define_4.setId("nbByte");
                  int _jspx_eval_bean_define_4 = _jspx_th_bean_define_4.doStartTag();
                  if (_jspx_th_bean_define_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_4);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_4);
                  java.lang.Object nbByte = null;
                  nbByte = (java.lang.Object) _jspx_page_context.findAttribute("nbByte");
                  out.write("\n\t\t\t<tr>\n\t\t\t\t<td><input type=\"text\" name=\"chapitres\" value=\"Chapitre 1\"  /></td>\n\t\t\t\t<td><input type=\"text\" name=\"secs\" value=\"");
                  out.print(sec);
                  out.write("\" onchange=\"javascript:convert(");
                  out.print(countRow );
                  out.write(");javascript:updatePlayer(");
                  out.print(countRow );
                  out.write(");\" /></td>\n\t\t\t\t<td><input type=\"text\" id=\"nbBytes-");
                  out.print(countRow );
                  out.write("\" name=\"nbBytes\"  onchange=\"javascript:updatePlayer(");
                  out.print(countRow );
                  out.write(");convertToTime(");
                  out.print(countRow );
                  out.write(");\"  value=\"");
                  out.print(nbByte);
                  out.write("\" /></td>\n\t\t\t\t<td>\n\t\t\t\t<div name=\"play\" id=\"player-");
                  out.print(countRow);
                  out.write("\" onclick =\"javascript:createPlayer(");
                  out.print(countRow);
                  out.write(',');
                  out.print(nbByte);
                  out.write(");\">\n\t\t\t\t<script type=\"text/javascript\">\n\t\t\t\tvar offset = document.getElementsByName(\"nbBytes\")[");
                  out.print(countRow);
                  out.write("].value;\n\t\t\t\tcreatePlayer(");
                  out.print(countRow++);
                  out.write(", offset );\n\t\t\t\t</script>\n\t\t\t\t</div>\n\t\t\t\t</td>\n\t\t\t</tr>\n\t\t");
                  int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
                  listPoint = (java.lang.Object) _jspx_page_context.findAttribute("listPoint");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_iterate_property_name_id.reuse(_jspx_th_logic_iterate_0);
                return;
              }
              _jspx_tagPool_logic_iterate_property_name_id.reuse(_jspx_th_logic_iterate_0);
              out.write("\n\t</table>\n\t<input type=\"button\" value=\"+\" onclick=\"javascript:addRow();\" />\n\t<input type=\"hidden\" name=\"file\" value=\"");
              out.print(fileId);
              out.write("\" />\n\t<input type=\"hidden\" name=\"fileName\" value=\"");
              out.print(fileName);
              out.write("\" />\n\t");
              int evalDoAfterBody = _jspx_th_logic_notEmpty_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_notEmpty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_0);
            return;
          }
          _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_0);
          out.write("\n\t<input type=\"submit\" value=\"OK\" />\n");
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_html_form_enctype_action.reuse(_jspx_th_html_form_0);
        return;
      }
      _jspx_tagPool_html_form_enctype_action.reuse(_jspx_th_html_form_0);
      out.write("\n<script type=\"text/javascript\">\nvar countRowJs = ");
      out.print(countRow);
      out.write(";\n\nfunction updatePlayer(rowId) {\n\tdocument.getElementById(\"player-\".concat(rowId)).innerHtml = \"\";\n\tvar offset = document.getElementsByName(\"nbBytes\")[rowId].value; //nbBytes\n\tcreatePlayer(rowId, offset);\n}\n\nfunction addRow(){\nvar newRow = document.getElementById('matable').insertRow(-1);\nvar newCell = newRow.insertCell(0);\ninputChapitre = document.createElement (\"input\");\ninputChapitre.setAttribute(\"type\", \"text\");\ninputChapitre.setAttribute(\"name\", \"chapitres\");\ninputChapitre.setAttribute(\"value\", \"Chapitre \".concat(countRowJs+1));\ninputChapitre.setAttribute(\"onChange\", \"\");\nnewCell.appendChild (inputChapitre);\nvar newCell = newRow.insertCell(1);\ninputSec = document.createElement (\"input\");\ninputSec.setAttribute(\"type\", \"text\");\ninputSec.setAttribute(\"name\", \"secs\");\ninputSec.setAttribute(\"value\", \"00:00.0\");\ninputSec.setAttribute(\"onChange\", \"javascript:convert(\".concat(countRowJs,\");updatePlayer(\", countRowJs,\");\"));\nnewCell.appendChild (inputSec);\nnewCell = newRow.insertCell(2);\ninputByte = document.createElement (\"input\");\n");
      out.write("inputByte.setAttribute(\"type\", \"text\");\ninputByte.setAttribute(\"name\", \"nbBytes\");\ninputByte.setAttribute(\"value\", \"0\");\ninputByte.setAttribute(\"onChange\", \"javascript:convertToTime(\".concat(countRowJs,\");updatePlayer(\", countRowJs,\");\"));\nnewCell.appendChild (inputByte);\n\nnewCell = newRow.insertCell(3);\ninputPlay = document.createElement(\"div\");\ninputPlay.setAttribute(\"id\", \"player-\".concat(countRowJs));\nnewCell.appendChild(inputPlay);\n\ncreatePlayer(countRowJs++, 0);\n}\n\n// Script pour la mise à jour automatique du champs Octets à partir du champs Temps.\nvar bitrate\t= ");
      if (_jspx_meth_bean_write_0(_jspx_page_context))
        return;
      out.write(";\n\nfunction convert(inRow) {\n\tvar theSec = document.getElementsByName(\"secs\")[inRow].value;\n\tvar theResult = theSec.match(\"^(\\\\d{1,2}):(\\\\d{2})\\\\.(\\\\d{1,2})$\");\n//TODO alert si le format est mauvais\n\tif (theResult != null && theResult.length == 4){\n\t\tvar minute = parseInt(theResult[1], 10);\n\t\tvar sec = parseInt(theResult[2], 10);\n\t\tvar milli = parseInt(theResult[3], 10);\n\t\n\tif (theResult[3].length < 2) {\n\t\tmilli *= 100;\n\t} else {\n\t\tmilli *=10;\n\t}\t\t\n\tminute *= bitrate;\n\tsec *= bitrate;\n\tmilli *= bitrate;\n//\talert(\"milli \"+milli/1000);\n\t\n\tdocument.getElementsByName(\"nbBytes\")[inRow].value = Math.floor((sec*1000 + minute*60000 + milli)/8);\n\t}\n}\n\nfunction convertToTime(inRow) {\n\n  var octets = document.getElementsByName(\"nbBytes\")[inRow].value\n  octets /= (bitrate/8); //320\n  var milli = octets%1000;\n  var minsec = (octets - milli)/1000;\n  var sec = minsec%60;\n  var min = (minsec - sec)/60;\n\n\t//alert(\"min \"+min+\" sec \"+sec+\" milli \"+milli);\n  milli =Math.ceil(milli/10);\n   \n  if(milli<10)\n  \tmilli=\"0\"+String(milli); \n");
      out.write("  if(sec<10)\n  \tsec=\"0\"+String(sec);\n  if(min<10)\n  \tmin=\"0\"+String(min);\n\t//alert(\"min \"+min+\" sec \"+sec+\" milli \"+milli);\n  var temps = min+\":\"+sec+\".\"+milli;\n \n\tdocument.getElementsByName(\"secs\")[inRow].value = temps;\n}\n</script>\n</body>\n</html>\n");
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

  private boolean _jspx_meth_logic_messagesPresent_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:messagesPresent
    org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_0 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent_property_message.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
    _jspx_th_logic_messagesPresent_0.setPageContext(_jspx_page_context);
    _jspx_th_logic_messagesPresent_0.setParent(null);
    _jspx_th_logic_messagesPresent_0.setMessage("errors");
    _jspx_th_logic_messagesPresent_0.setProperty("fileError");
    int _jspx_eval_logic_messagesPresent_0 = _jspx_th_logic_messagesPresent_0.doStartTag();
    if (_jspx_eval_logic_messagesPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \n\t\t");
        if (_jspx_meth_html_errors_0(_jspx_th_logic_messagesPresent_0, _jspx_page_context))
          return true;
        out.write('\n');
        int evalDoAfterBody = _jspx_th_logic_messagesPresent_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_messagesPresent_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_0);
      return true;
    }
    _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_0);
    return false;
  }

  private boolean _jspx_meth_html_errors_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_messagesPresent_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_0 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_0.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_messagesPresent_0);
    _jspx_th_html_errors_0.setProperty("fileError");
    int _jspx_eval_html_errors_0 = _jspx_th_html_errors_0.doStartTag();
    if (_jspx_th_html_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_0);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_0);
    return false;
  }

  private boolean _jspx_meth_html_file_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:file
    org.apache.struts.taglib.html.FileTag _jspx_th_html_file_0 = (org.apache.struts.taglib.html.FileTag) _jspx_tagPool_html_file_styleId_property_name_nobody.get(org.apache.struts.taglib.html.FileTag.class);
    _jspx_th_html_file_0.setPageContext(_jspx_page_context);
    _jspx_th_html_file_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_0);
    _jspx_th_html_file_0.setName("bookSplitterForm");
    _jspx_th_html_file_0.setProperty("musicFile");
    _jspx_th_html_file_0.setStyleId("musicFile");
    int _jspx_eval_html_file_0 = _jspx_th_html_file_0.doStartTag();
    if (_jspx_th_html_file_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_file_styleId_property_name_nobody.reuse(_jspx_th_html_file_0);
      return true;
    }
    _jspx_tagPool_html_file_styleId_property_name_nobody.reuse(_jspx_th_html_file_0);
    return false;
  }

  private boolean _jspx_meth_bean_write_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_0.setParent(null);
    _jspx_th_bean_write_0.setName("bookSplitterForm");
    _jspx_th_bean_write_0.setProperty("bitRate");
    int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
    if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_0);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_0);
    return false;
  }
}
