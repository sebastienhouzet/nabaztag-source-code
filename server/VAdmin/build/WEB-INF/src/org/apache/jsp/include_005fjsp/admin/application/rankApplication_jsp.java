package org.apache.jsp.include_005fjsp.admin.application;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rankApplication_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/struts-nested.tld");
    _jspx_dependants.add("/include_jsp/admin/header.jsp");
    _jspx_dependants.add("/include_jsp/admin/navigation.jsp");
    _jspx_dependants.add("/include_jsp/admin/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleId_styleClass_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_property_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_options_property_name_labelProperty_collection_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_nested_form_styleClass_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_styleId_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_nested_root_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_nested_iterate_type_scope_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_nested_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_nested_write_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_nested_text_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_nested_submit_value_property_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_errors_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleId_styleClass_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_property_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_options_property_name_labelProperty_collection_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_nested_form_styleClass_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_styleId_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_nested_root_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_nested_iterate_type_scope_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_nested_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_nested_write_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_nested_text_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_nested_submit_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_errors_property_nobody.release();
    _jspx_tagPool_html_form_styleId_styleClass_action.release();
    _jspx_tagPool_bean_define_property_name_id_nobody.release();
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_bean_message_key_nobody.release();
    _jspx_tagPool_html_select_property_name.release();
    _jspx_tagPool_html_options_property_name_labelProperty_collection_nobody.release();
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.release();
    _jspx_tagPool_html_submit_value_property_nobody.release();
    _jspx_tagPool_logic_notEmpty_property_name.release();
    _jspx_tagPool_nested_form_styleClass_action.release();
    _jspx_tagPool_html_hidden_value_styleId_property_nobody.release();
    _jspx_tagPool_nested_root_name.release();
    _jspx_tagPool_nested_iterate_type_scope_property_name.release();
    _jspx_tagPool_nested_hidden_value_property_nobody.release();
    _jspx_tagPool_nested_write_property_nobody.release();
    _jspx_tagPool_nested_text_property_nobody.release();
    _jspx_tagPool_nested_submit_value_property_nobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
 response.setContentType("text/html;charset=UTF-8"); 
      out.write("\n\n\n\n\n\n\n");
      out.write("\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n<title>Admin</title>\r\n<link href=\"../include_jsp/admin/css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<body>\r\n");
      out.write('\n');
      out.write('\n');
      out.write('\r');
      out.write('\n');
 response.setContentType("text/html;charset=UTF-8"); 
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n<div id=\"navigation\">\r\n\r\n\t<div id=\"internationalization\">\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminChangeLocale.do?dispatch=english&redirect=goHome\"><img src=\"../include_img/flags/en.gif\" border=\"0\"/></a></li>\r\n\t\t\t<li><a href=\"adminChangeLocale.do?dispatch=french&redirect=goHome\"><img src=\"../include_img/flags/fr.gif\" border=\"0\"/></a></li>\r\n\t\t\t<li><a href=\"adminChangeLocale.do?dispatch=japanese&redirect=goHome\"><img src=\"../include_img/flags/jp.gif\" border=\"0\"/></a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\r\n\t<div class=\"nav-prim\">\r\n\t\t<a href=\"admin.do?dispatch=disconnect\">Log off</a>\r\n\t\t<br /><br />\r\n\t\t<hr />\r\n\t\t<h2>Objects</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminSearchObject.do?dispatch=load\">Search</a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\t<div class=\"nav-prim\">\r\n\t\t<h2>Services</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminSearchApplication.do?dispatch=load\">Search</a></li>\r\n\t\t\t<li><a href=\"adminAddApplication.do?dispatch=load\">Add</a></li>\r\n\t\t\t<li><a href=\"adminRankApplication.do?dispatch=load\">Rank</a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\t<div class=\"nav-prim\">\r\n");
      out.write("\t\t<h2>News</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminSearchNews.do?dispatch=load\">Search</a></li>\r\n\t\t\t<li><a href=\"adminAddNews.do?dispatch=load\">Add</a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\t<div class=\"nav-prim\">\r\n\t\t<h2>Press</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminSearchPress.do?dispatch=load\">Search</a></li>\r\n\t\t\t<li><a href=\"adminAddPress.do?dispatch=load\">Add</a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\t<div class=\"nav-prim\">\r\n\t\t<h2>Store</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminSearchStore.do?dispatch=load\">Search</a></li>\r\n\t\t\t<li><a href=\"adminAddStore.do?dispatch=load\">Add</a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\t<div class=\"nav-prim\">\r\n\t\t<h2>Weather</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminAddWeather.do?dispatch=load\">Add</a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\t<div class=\"nav-prim\">\r\n\t\t<h2>Dico</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminSearchDico.do?dispatch=load\">Search</a></li>\r\n\t\t\t<li><a href=\"adminAddDico.do?dispatch=load\">Add</a></li>\r\n\t\t\t<li><a href=\"adminImportDico.do?dispatch=load\">Import</a></li>\r\n\t\t\t<li><a href=\"adminExportDico.do?dispatch=load\">Export</a></li>\r\n\t\t</ul>\r\n");
      out.write("\t</div>\r\n</div>");
      out.write("\n\n<!-- DEBUT DIV CONTENT -->\n<div id=\"content\">\n\n\t<p class=\"clear error\">");
      if (_jspx_meth_html_errors_0(_jspx_page_context))
        return;
      out.write("</p>\n\t\n\t");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_styleClass_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("/action/adminRankApplication");
      _jspx_th_html_form_0.setStyleId("rankApplication");
      _jspx_th_html_form_0.setStyleClass("srvConfigForm");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_define_0.setId("categories");
          _jspx_th_bean_define_0.setName("myAdminApplicationForm");
          _jspx_th_bean_define_0.setProperty("categoriesList");
          int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
          if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
          java.lang.Object categories = null;
          categories = (java.lang.Object) _jspx_page_context.findAttribute("categories");
          out.write('\n');
          out.write('	');
          out.write('	');
          if (_jspx_meth_html_hidden_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\n\t\t\n\t\t<fieldset><legend>Search applications by</legend>\n\t\t\n\t\t\t<label>");
          if (_jspx_meth_bean_message_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          if (_jspx_meth_bean_message_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("</label>\n\t\t\t");
          if (_jspx_meth_html_select_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n\t\t\t\t\t\n\t\t\t<label>Application lang :</label>\n\t\t\t");
          if (_jspx_meth_html_select_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n\t\t<br />\n\t\t");
          if (_jspx_meth_html_submit_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n\n\t\t</fieldset>\n\t");
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_html_form_styleId_styleClass_action.reuse(_jspx_th_html_form_0);
        return;
      }
      _jspx_tagPool_html_form_styleId_styleClass_action.reuse(_jspx_th_html_form_0);
      out.write("\n\t\n\t\n\t");
      //  logic:notEmpty
      org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_0 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
      _jspx_th_logic_notEmpty_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_notEmpty_0.setParent(null);
      _jspx_th_logic_notEmpty_0.setName("myAdminApplicationForm");
      _jspx_th_logic_notEmpty_0.setProperty("applicationList");
      int _jspx_eval_logic_notEmpty_0 = _jspx_th_logic_notEmpty_0.doStartTag();
      if (_jspx_eval_logic_notEmpty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_1 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_1.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
          _jspx_th_bean_define_1.setId("language");
          _jspx_th_bean_define_1.setName("myAdminApplicationForm");
          _jspx_th_bean_define_1.setProperty("language");
          int _jspx_eval_bean_define_1 = _jspx_th_bean_define_1.doStartTag();
          if (_jspx_th_bean_define_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_1);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_1);
          java.lang.Object language = null;
          language = (java.lang.Object) _jspx_page_context.findAttribute("language");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_2 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_2.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
          _jspx_th_bean_define_2.setId("cat");
          _jspx_th_bean_define_2.setName("myAdminApplicationForm");
          _jspx_th_bean_define_2.setProperty("cat");
          int _jspx_eval_bean_define_2 = _jspx_th_bean_define_2.doStartTag();
          if (_jspx_th_bean_define_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_2);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_2);
          java.lang.Object cat = null;
          cat = (java.lang.Object) _jspx_page_context.findAttribute("cat");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  nested:form
          org.apache.struts.taglib.nested.html.NestedFormTag _jspx_th_nested_form_0 = (org.apache.struts.taglib.nested.html.NestedFormTag) _jspx_tagPool_nested_form_styleClass_action.get(org.apache.struts.taglib.nested.html.NestedFormTag.class);
          _jspx_th_nested_form_0.setPageContext(_jspx_page_context);
          _jspx_th_nested_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
          _jspx_th_nested_form_0.setAction("/action/adminRankApplication");
          _jspx_th_nested_form_0.setStyleClass("srvConfigForm");
          int _jspx_eval_nested_form_0 = _jspx_th_nested_form_0.doStartTag();
          if (_jspx_eval_nested_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n\t\t\t");
              if (_jspx_meth_html_hidden_1(_jspx_th_nested_form_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_2 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_hidden_2.setPageContext(_jspx_page_context);
              _jspx_th_html_hidden_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_form_0);
              _jspx_th_html_hidden_2.setStyleId("language");
              _jspx_th_html_hidden_2.setProperty("language");
              _jspx_th_html_hidden_2.setValue(language.toString());
              int _jspx_eval_html_hidden_2 = _jspx_th_html_hidden_2.doStartTag();
              if (_jspx_th_html_hidden_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_2);
                return;
              }
              _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_2);
              out.write("\n\t\t\t");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_3 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_hidden_3.setPageContext(_jspx_page_context);
              _jspx_th_html_hidden_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_form_0);
              _jspx_th_html_hidden_3.setStyleId("cat");
              _jspx_th_html_hidden_3.setProperty("cat");
              _jspx_th_html_hidden_3.setValue(cat.toString());
              int _jspx_eval_html_hidden_3 = _jspx_th_html_hidden_3.doStartTag();
              if (_jspx_th_html_hidden_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_3);
                return;
              }
              _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_3);
              out.write("\n\t\t\t");
              //  nested:root
              org.apache.struts.taglib.nested.NestedRootTag _jspx_th_nested_root_0 = (org.apache.struts.taglib.nested.NestedRootTag) _jspx_tagPool_nested_root_name.get(org.apache.struts.taglib.nested.NestedRootTag.class);
              _jspx_th_nested_root_0.setPageContext(_jspx_page_context);
              _jspx_th_nested_root_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_form_0);
              _jspx_th_nested_root_0.setName("myAdminApplicationForm");
              int _jspx_eval_nested_root_0 = _jspx_th_nested_root_0.doStartTag();
              if (_jspx_eval_nested_root_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_nested_root_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_nested_root_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_nested_root_0.doInitBody();
                }
                do {
                  out.write("\n\t\t\t\t");
                  //  nested:iterate
                  org.apache.struts.taglib.nested.logic.NestedIterateTag _jspx_th_nested_iterate_0 = (org.apache.struts.taglib.nested.logic.NestedIterateTag) _jspx_tagPool_nested_iterate_type_scope_property_name.get(org.apache.struts.taglib.nested.logic.NestedIterateTag.class);
                  _jspx_th_nested_iterate_0.setPageContext(_jspx_page_context);
                  _jspx_th_nested_iterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_root_0);
                  _jspx_th_nested_iterate_0.setName("myAdminApplicationForm");
                  _jspx_th_nested_iterate_0.setProperty("applicationList");
                  _jspx_th_nested_iterate_0.setScope("request");
                  _jspx_th_nested_iterate_0.setType("net.violet.vadmin.objects.data.GetApplicationData");
                  int _jspx_eval_nested_iterate_0 = _jspx_th_nested_iterate_0.doStartTag();
                  if (_jspx_eval_nested_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_nested_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_nested_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_nested_iterate_0.doInitBody();
                    }
                    do {
                      out.write("\n\t\t\t\t\t");
                      //  bean:define
                      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_3 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                      _jspx_th_bean_define_3.setPageContext(_jspx_page_context);
                      _jspx_th_bean_define_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
                      _jspx_th_bean_define_3.setId("appId");
                      _jspx_th_bean_define_3.setName("applicationList");
                      _jspx_th_bean_define_3.setProperty("id");
                      int _jspx_eval_bean_define_3 = _jspx_th_bean_define_3.doStartTag();
                      if (_jspx_th_bean_define_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_3);
                        return;
                      }
                      _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_3);
                      java.lang.Object appId = null;
                      appId = (java.lang.Object) _jspx_page_context.findAttribute("appId");
                      out.write("\n\t\t\t\t\t");
                      //  bean:define
                      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_4 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                      _jspx_th_bean_define_4.setPageContext(_jspx_page_context);
                      _jspx_th_bean_define_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
                      _jspx_th_bean_define_4.setId("appName");
                      _jspx_th_bean_define_4.setName("applicationList");
                      _jspx_th_bean_define_4.setProperty("name");
                      int _jspx_eval_bean_define_4 = _jspx_th_bean_define_4.doStartTag();
                      if (_jspx_th_bean_define_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_4);
                        return;
                      }
                      _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_4);
                      java.lang.Object appName = null;
                      appName = (java.lang.Object) _jspx_page_context.findAttribute("appName");
                      out.write("\n          \t\t\t");
                      //  nested:hidden
                      org.apache.struts.taglib.nested.html.NestedHiddenTag _jspx_th_nested_hidden_0 = (org.apache.struts.taglib.nested.html.NestedHiddenTag) _jspx_tagPool_nested_hidden_value_property_nobody.get(org.apache.struts.taglib.nested.html.NestedHiddenTag.class);
                      _jspx_th_nested_hidden_0.setPageContext(_jspx_page_context);
                      _jspx_th_nested_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
                      _jspx_th_nested_hidden_0.setProperty("id");
                      _jspx_th_nested_hidden_0.setValue(appId.toString());
                      int _jspx_eval_nested_hidden_0 = _jspx_th_nested_hidden_0.doStartTag();
                      if (_jspx_th_nested_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _jspx_tagPool_nested_hidden_value_property_nobody.reuse(_jspx_th_nested_hidden_0);
                        return;
                      }
                      _jspx_tagPool_nested_hidden_value_property_nobody.reuse(_jspx_th_nested_hidden_0);
                      out.write("\n          \t\t\t");
                      //  nested:hidden
                      org.apache.struts.taglib.nested.html.NestedHiddenTag _jspx_th_nested_hidden_1 = (org.apache.struts.taglib.nested.html.NestedHiddenTag) _jspx_tagPool_nested_hidden_value_property_nobody.get(org.apache.struts.taglib.nested.html.NestedHiddenTag.class);
                      _jspx_th_nested_hidden_1.setPageContext(_jspx_page_context);
                      _jspx_th_nested_hidden_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
                      _jspx_th_nested_hidden_1.setProperty("name");
                      _jspx_th_nested_hidden_1.setValue(appName.toString());
                      int _jspx_eval_nested_hidden_1 = _jspx_th_nested_hidden_1.doStartTag();
                      if (_jspx_th_nested_hidden_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _jspx_tagPool_nested_hidden_value_property_nobody.reuse(_jspx_th_nested_hidden_1);
                        return;
                      }
                      _jspx_tagPool_nested_hidden_value_property_nobody.reuse(_jspx_th_nested_hidden_1);
                      out.write("\n\t\t\t\t\t<p>&nbsp;-&nbsp;");
                      if (_jspx_meth_nested_write_0(_jspx_th_nested_iterate_0, _jspx_page_context))
                        return;
                      out.write("&nbsp;");
                      if (_jspx_meth_nested_text_0(_jspx_th_nested_iterate_0, _jspx_page_context))
                        return;
                      out.write("</p>\n\t\t\t\t");
                      int evalDoAfterBody = _jspx_th_nested_iterate_0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_nested_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_nested_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_nested_iterate_type_scope_property_name.reuse(_jspx_th_nested_iterate_0);
                    return;
                  }
                  _jspx_tagPool_nested_iterate_type_scope_property_name.reuse(_jspx_th_nested_iterate_0);
                  out.write("\n\t\t\t");
                  int evalDoAfterBody = _jspx_th_nested_root_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_nested_root_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_nested_root_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_nested_root_name.reuse(_jspx_th_nested_root_0);
                return;
              }
              _jspx_tagPool_nested_root_name.reuse(_jspx_th_nested_root_0);
              out.write("\n\t\t\t");
              if (_jspx_meth_nested_submit_0(_jspx_th_nested_form_0, _jspx_page_context))
                return;
              out.write('\n');
              out.write('	');
              out.write('	');
              int evalDoAfterBody = _jspx_th_nested_form_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_nested_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_nested_form_styleClass_action.reuse(_jspx_th_nested_form_0);
            return;
          }
          _jspx_tagPool_nested_form_styleClass_action.reuse(_jspx_th_nested_form_0);
          out.write('\n');
          out.write('	');
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
      out.write("\n\t\n\t<p style=\"color:green; font-weight:bold;\">");
      if (_jspx_meth_html_errors_1(_jspx_page_context))
        return;
      out.write("</p>\n\t\n</div>\n<!-- FIN DIV CONTENT -->\n\n");
      out.write("<br class=\"clear\"/>\r\n</body>\r\n</html>");
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

  private boolean _jspx_meth_html_errors_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_0 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_0.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_0.setParent(null);
    _jspx_th_html_errors_0.setProperty("wrongValue");
    int _jspx_eval_html_errors_0 = _jspx_th_html_errors_0.doStartTag();
    if (_jspx_th_html_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_0);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_0);
    return false;
  }

  private boolean _jspx_meth_html_hidden_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_0 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_0.setProperty("dispatch");
    _jspx_th_html_hidden_0.setValue("displayApplications");
    int _jspx_eval_html_hidden_0 = _jspx_th_html_hidden_0.doStartTag();
    if (_jspx_th_html_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_0);
      return true;
    }
    _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_0.setKey("common.category");
    int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
    if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_0);
      return true;
    }
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_1 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_1.setKey("common.column");
    int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
    if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_1);
      return true;
    }
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_1);
    return false;
  }

  private boolean _jspx_meth_html_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_0.setPageContext(_jspx_page_context);
    _jspx_th_html_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_0.setName("myAdminApplicationForm");
    _jspx_th_html_select_0.setProperty("cat");
    int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
    if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_0.doInitBody();
      }
      do {
        out.write("\n\t\t\t\t");
        if (_jspx_meth_html_options_0(_jspx_th_html_select_0, _jspx_page_context))
          return true;
        out.write(" \n\t\t\t");
        int evalDoAfterBody = _jspx_th_html_select_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_select_property_name.reuse(_jspx_th_html_select_0);
      return true;
    }
    _jspx_tagPool_html_select_property_name.reuse(_jspx_th_html_select_0);
    return false;
  }

  private boolean _jspx_meth_html_options_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_0 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_property_name_labelProperty_collection_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_options_0.setPageContext(_jspx_page_context);
    _jspx_th_html_options_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
    _jspx_th_html_options_0.setName("myAdminApplicationForm");
    _jspx_th_html_options_0.setCollection("categories");
    _jspx_th_html_options_0.setProperty("value");
    _jspx_th_html_options_0.setLabelProperty("label");
    int _jspx_eval_html_options_0 = _jspx_th_html_options_0.doStartTag();
    if (_jspx_th_html_options_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_options_property_name_labelProperty_collection_nobody.reuse(_jspx_th_html_options_0);
      return true;
    }
    _jspx_tagPool_html_options_property_name_labelProperty_collection_nobody.reuse(_jspx_th_html_options_0);
    return false;
  }

  private boolean _jspx_meth_html_select_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_1 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_1.setPageContext(_jspx_page_context);
    _jspx_th_html_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_1.setName("myAdminApplicationForm");
    _jspx_th_html_select_1.setProperty("language");
    int _jspx_eval_html_select_1 = _jspx_th_html_select_1.doStartTag();
    if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_1.doInitBody();
      }
      do {
        out.write("\n\t\t\t\t");
        if (_jspx_meth_html_optionsCollection_0(_jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write("\n\t\t\t");
        int evalDoAfterBody = _jspx_th_html_select_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_select_property_name.reuse(_jspx_th_html_select_1);
      return true;
    }
    _jspx_tagPool_html_select_property_name.reuse(_jspx_th_html_select_1);
    return false;
  }

  private boolean _jspx_meth_html_optionsCollection_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:optionsCollection
    org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_optionsCollection_0 = (org.apache.struts.taglib.html.OptionsCollectionTag) _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
    _jspx_th_html_optionsCollection_0.setPageContext(_jspx_page_context);
    _jspx_th_html_optionsCollection_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
    _jspx_th_html_optionsCollection_0.setName("myAdminApplicationForm");
    _jspx_th_html_optionsCollection_0.setProperty("langList");
    _jspx_th_html_optionsCollection_0.setLabel("name");
    _jspx_th_html_optionsCollection_0.setValue("iso_code");
    int _jspx_eval_html_optionsCollection_0 = _jspx_th_html_optionsCollection_0.doStartTag();
    if (_jspx_th_html_optionsCollection_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_0);
      return true;
    }
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_0);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_value_property_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_submit_0.setProperty("submit");
    _jspx_th_html_submit_0.setValue("Search");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_value_property_nobody.reuse(_jspx_th_html_submit_0);
      return true;
    }
    _jspx_tagPool_html_submit_value_property_nobody.reuse(_jspx_th_html_submit_0);
    return false;
  }

  private boolean _jspx_meth_html_hidden_1(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_1 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_1.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_form_0);
    _jspx_th_html_hidden_1.setProperty("dispatch");
    _jspx_th_html_hidden_1.setValue("updateRank");
    int _jspx_eval_html_hidden_1 = _jspx_th_html_hidden_1.doStartTag();
    if (_jspx_th_html_hidden_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_1);
      return true;
    }
    _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_1);
    return false;
  }

  private boolean _jspx_meth_nested_write_0(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:write
    org.apache.struts.taglib.nested.bean.NestedWriteTag _jspx_th_nested_write_0 = (org.apache.struts.taglib.nested.bean.NestedWriteTag) _jspx_tagPool_nested_write_property_nobody.get(org.apache.struts.taglib.nested.bean.NestedWriteTag.class);
    _jspx_th_nested_write_0.setPageContext(_jspx_page_context);
    _jspx_th_nested_write_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_nested_write_0.setProperty("name");
    int _jspx_eval_nested_write_0 = _jspx_th_nested_write_0.doStartTag();
    if (_jspx_th_nested_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_nested_write_property_nobody.reuse(_jspx_th_nested_write_0);
      return true;
    }
    _jspx_tagPool_nested_write_property_nobody.reuse(_jspx_th_nested_write_0);
    return false;
  }

  private boolean _jspx_meth_nested_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:text
    org.apache.struts.taglib.nested.html.NestedTextTag _jspx_th_nested_text_0 = (org.apache.struts.taglib.nested.html.NestedTextTag) _jspx_tagPool_nested_text_property_nobody.get(org.apache.struts.taglib.nested.html.NestedTextTag.class);
    _jspx_th_nested_text_0.setPageContext(_jspx_page_context);
    _jspx_th_nested_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_nested_text_0.setProperty("rank");
    int _jspx_eval_nested_text_0 = _jspx_th_nested_text_0.doStartTag();
    if (_jspx_th_nested_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_nested_text_property_nobody.reuse(_jspx_th_nested_text_0);
      return true;
    }
    _jspx_tagPool_nested_text_property_nobody.reuse(_jspx_th_nested_text_0);
    return false;
  }

  private boolean _jspx_meth_nested_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:submit
    org.apache.struts.taglib.nested.html.NestedSubmitTag _jspx_th_nested_submit_0 = (org.apache.struts.taglib.nested.html.NestedSubmitTag) _jspx_tagPool_nested_submit_value_property_nobody.get(org.apache.struts.taglib.nested.html.NestedSubmitTag.class);
    _jspx_th_nested_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_nested_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_form_0);
    _jspx_th_nested_submit_0.setProperty("submit");
    _jspx_th_nested_submit_0.setValue("Update");
    int _jspx_eval_nested_submit_0 = _jspx_th_nested_submit_0.doStartTag();
    if (_jspx_th_nested_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_nested_submit_value_property_nobody.reuse(_jspx_th_nested_submit_0);
      return true;
    }
    _jspx_tagPool_nested_submit_value_property_nobody.reuse(_jspx_th_nested_submit_0);
    return false;
  }

  private boolean _jspx_meth_html_errors_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_1 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_1.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_1.setParent(null);
    _jspx_th_html_errors_1.setProperty("success");
    int _jspx_eval_html_errors_1 = _jspx_th_html_errors_1.doStartTag();
    if (_jspx_th_html_errors_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_1);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_1);
    return false;
  }
}
