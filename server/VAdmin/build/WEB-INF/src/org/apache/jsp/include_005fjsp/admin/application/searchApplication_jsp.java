package org.apache.jsp.include_005fjsp.admin.application;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class searchApplication_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/include_jsp/admin/header.jsp");
    _jspx_dependants.add("/include_jsp/admin/navigation.jsp");
    _jspx_dependants.add("/include_jsp/admin/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_property_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleId_styleClass_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_styleId_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_options_property_labelProperty_collection_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_value_property_onclick_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_styleId_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_messagesPresent_property_message;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_equal_value_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleId_styleClass_enctype_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_readonly_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_property_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_multibox_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_file_property_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_errors_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_property_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleId_styleClass_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_styleId_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_options_property_labelProperty_collection_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_value_property_onclick_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_styleId_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_messagesPresent_property_message = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_equal_value_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleId_styleClass_enctype_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_readonly_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_property_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_multibox_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_file_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_errors_property_nobody.release();
    _jspx_tagPool_bean_define_property_name_id_nobody.release();
    _jspx_tagPool_html_form_styleId_styleClass_action.release();
    _jspx_tagPool_html_hidden_styleId_property_nobody.release();
    _jspx_tagPool_html_select_property.release();
    _jspx_tagPool_html_options_property_labelProperty_collection_nobody.release();
    _jspx_tagPool_html_select_property_name.release();
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.release();
    _jspx_tagPool_html_submit_value_property_onclick_nobody.release();
    _jspx_tagPool_logic_notEmpty_property_name.release();
    _jspx_tagPool_html_hidden_value_styleId_property_nobody.release();
    _jspx_tagPool_logic_messagesPresent_property_message.release();
    _jspx_tagPool_bean_write_property_name_nobody.release();
    _jspx_tagPool_logic_equal_value_property_name.release();
    _jspx_tagPool_html_form_styleId_styleClass_enctype_action.release();
    _jspx_tagPool_bean_message_key_nobody.release();
    _jspx_tagPool_html_text_readonly_property.release();
    _jspx_tagPool_logic_iterate_property_name_id.release();
    _jspx_tagPool_html_multibox_property.release();
    _jspx_tagPool_html_file_property_nobody.release();
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

      out.write('c');
      out.write('\r');
      out.write('\n');
 response.setContentType("text/html;charset=UTF-8"); 
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n<title>Admin</title>\r\n<link href=\"../include_jsp/admin/css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<body>\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
 response.setContentType("text/html;charset=UTF-8"); 
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n<div id=\"navigation\">\r\n\r\n\t<div id=\"internationalization\">\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminChangeLocale.do?dispatch=english&redirect=goHome\"><img src=\"../include_img/flags/en.gif\" border=\"0\"/></a></li>\r\n\t\t\t<li><a href=\"adminChangeLocale.do?dispatch=french&redirect=goHome\"><img src=\"../include_img/flags/fr.gif\" border=\"0\"/></a></li>\r\n\t\t\t<li><a href=\"adminChangeLocale.do?dispatch=japanese&redirect=goHome\"><img src=\"../include_img/flags/jp.gif\" border=\"0\"/></a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\r\n\t<div class=\"nav-prim\">\r\n\t\t<a href=\"admin.do?dispatch=disconnect\">Log off</a>\r\n\t\t<br /><br />\r\n\t\t<hr />\r\n\t\t<h2>Objects</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminSearchObject.do?dispatch=load\">Search</a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\t<div class=\"nav-prim\">\r\n\t\t<h2>Services</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminSearchApplication.do?dispatch=load\">Search</a></li>\r\n\t\t\t<li><a href=\"adminAddApplication.do?dispatch=load\">Add</a></li>\r\n\t\t\t<li><a href=\"adminRankApplication.do?dispatch=load\">Rank</a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\t<div class=\"nav-prim\">\r\n");
      out.write("\t\t<h2>News</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminSearchNews.do?dispatch=load\">Search</a></li>\r\n\t\t\t<li><a href=\"adminAddNews.do?dispatch=load\">Add</a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\t<div class=\"nav-prim\">\r\n\t\t<h2>Press</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminSearchPress.do?dispatch=load\">Search</a></li>\r\n\t\t\t<li><a href=\"adminAddPress.do?dispatch=load\">Add</a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\t<div class=\"nav-prim\">\r\n\t\t<h2>Store</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminSearchStore.do?dispatch=load\">Search</a></li>\r\n\t\t\t<li><a href=\"adminAddStore.do?dispatch=load\">Add</a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\t<div class=\"nav-prim\">\r\n\t\t<h2>Weather</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminAddWeather.do?dispatch=load\">Add</a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\t<div class=\"nav-prim\">\r\n\t\t<h2>Dico</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminSearchDico.do?dispatch=load\">Search</a></li>\r\n\t\t\t<li><a href=\"adminAddDico.do?dispatch=load\">Add</a></li>\r\n\t\t\t<li><a href=\"adminImportDico.do?dispatch=load\">Import</a></li>\r\n\t\t\t<li><a href=\"adminExportDico.do?dispatch=load\">Export</a></li>\r\n\t\t</ul>\r\n");
      out.write("\t</div>\r\n</div>");
      out.write("\r\n\r\n<div id=\"content\">\r\n\t\r\n\t<p class=\"clear error\">");
      if (_jspx_meth_html_errors_0(_jspx_page_context))
        return;
      out.write("</p>\r\n\t<p class=\"clear error\">");
      if (_jspx_meth_html_errors_1(_jspx_page_context))
        return;
      out.write("</p>\r\n\t<p class=\"clear error\">");
      if (_jspx_meth_html_errors_2(_jspx_page_context))
        return;
      out.write("</p>\r\n\t<p class=\"clear error\">");
      if (_jspx_meth_html_errors_3(_jspx_page_context))
        return;
      out.write("</p>\r\n\t<p class=\"clear error\">");
      if (_jspx_meth_html_errors_4(_jspx_page_context))
        return;
      out.write("</p>\r\n\t<p class=\"clear error\">");
      if (_jspx_meth_html_errors_5(_jspx_page_context))
        return;
      out.write("</p>\r\n\t<p class=\"clear error\">");
      if (_jspx_meth_html_errors_6(_jspx_page_context))
        return;
      out.write("</p>\r\n\t<p class=\"clear error\">");
      if (_jspx_meth_html_errors_7(_jspx_page_context))
        return;
      out.write("</p>\r\n\t<p class=\"clear error\">");
      if (_jspx_meth_html_errors_8(_jspx_page_context))
        return;
      out.write("</p>\r\n\t<p class=\"clear error\">");
      if (_jspx_meth_html_errors_9(_jspx_page_context))
        return;
      out.write("</p>\r\n\t<p class=\"clear error\">");
      if (_jspx_meth_html_errors_10(_jspx_page_context))
        return;
      out.write("</p>\r\n\t<p class=\"clear error\">");
      if (_jspx_meth_html_errors_11(_jspx_page_context))
        return;
      out.write("</p>\r\n\t<p class=\"clear error\">");
      if (_jspx_meth_html_errors_12(_jspx_page_context))
        return;
      out.write("</p>\r\n\t<p class=\"clear error\">");
      if (_jspx_meth_html_errors_13(_jspx_page_context))
        return;
      out.write("</p>\r\n\t<p class=\"clear error\">");
      if (_jspx_meth_html_errors_14(_jspx_page_context))
        return;
      out.write("</p>\r\n\t<p class=\"clear error\">");
      if (_jspx_meth_html_errors_15(_jspx_page_context))
        return;
      out.write("</p>\r\n\t<p class=\"clear error\">");
      if (_jspx_meth_html_errors_16(_jspx_page_context))
        return;
      out.write("</p>\r\n\r\n\t");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
      _jspx_th_bean_define_0.setParent(null);
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
      out.write("\r\n\t\r\n\t<!-- Two first comboboxes -->\r\n\t<fieldset>\r\n  \t<legend>Search Application</legend>\r\n\t\t<p><strong>Search Applications by type and lang</strong></p>\r\n\t\r\n\t\t<!-- languages and products combobox -->\r\n\t\t");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_styleClass_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("/action/adminSearchApplication");
      _jspx_th_html_form_0.setStyleId("SearchLangByType");
      _jspx_th_html_form_0.setStyleClass("srvConfigForm");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\t\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_1 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_1.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_define_1.setId("names");
          _jspx_th_bean_define_1.setName("myAdminApplicationForm");
          _jspx_th_bean_define_1.setProperty("namesList");
          int _jspx_eval_bean_define_1 = _jspx_th_bean_define_1.doStartTag();
          if (_jspx_th_bean_define_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_1);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_1);
          java.lang.Object names = null;
          names = (java.lang.Object) _jspx_page_context.findAttribute("names");
          out.write("\r\n\t\t\t");
          if (_jspx_meth_html_hidden_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n\t\t\t\r\n      <div class=\"field\">\r\n        <label>\r\n          <span>Application Type :</span>\r\n          ");
          if (_jspx_meth_html_select_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n        </label>\r\n\t\t\t</div>\r\n      \r\n      <div class=\"field\">\r\n        <label>\r\n          <span>Language :</span>\r\n          ");
          if (_jspx_meth_html_select_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n        </label>\r\n\t\t\t</div>\r\n      \r\n      <div class=\"call2action\">\r\n        ");
          if (_jspx_meth_html_submit_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n      </div>\r\n\t\t");
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
      out.write("\r\n\t\t<br />\r\n\t\t\r\n\t\t<!-- Final combobox --> \r\n\t");
      //  logic:notEmpty
      org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_0 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
      _jspx_th_logic_notEmpty_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_notEmpty_0.setParent(null);
      _jspx_th_logic_notEmpty_0.setName("myAdminApplicationForm");
      _jspx_th_logic_notEmpty_0.setProperty("applicationList");
      int _jspx_eval_logic_notEmpty_0 = _jspx_th_logic_notEmpty_0.doStartTag();
      if (_jspx_eval_logic_notEmpty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_2 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_2.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
          _jspx_th_bean_define_2.setId("nameService");
          _jspx_th_bean_define_2.setName("myAdminApplicationForm");
          _jspx_th_bean_define_2.setProperty("nameService");
          int _jspx_eval_bean_define_2 = _jspx_th_bean_define_2.doStartTag();
          if (_jspx_th_bean_define_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_2);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_2);
          java.lang.Object nameService = null;
          nameService = (java.lang.Object) _jspx_page_context.findAttribute("nameService");
          out.write("\r\n\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_3 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_3.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
          _jspx_th_bean_define_3.setId("language");
          _jspx_th_bean_define_3.setName("myAdminApplicationForm");
          _jspx_th_bean_define_3.setProperty("language");
          int _jspx_eval_bean_define_3 = _jspx_th_bean_define_3.doStartTag();
          if (_jspx_th_bean_define_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_3);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_3);
          java.lang.Object language = null;
          language = (java.lang.Object) _jspx_page_context.findAttribute("language");
          out.write("\r\n\t\t");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_form_1 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_styleClass_action.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_form_1.setPageContext(_jspx_page_context);
          _jspx_th_html_form_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
          _jspx_th_html_form_1.setAction("/action/adminSearchApplication");
          _jspx_th_html_form_1.setStyleId("SearchContentByType");
          _jspx_th_html_form_1.setStyleClass("srvConfigForm");
          int _jspx_eval_html_form_1 = _jspx_th_html_form_1.doStartTag();
          if (_jspx_eval_html_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n\t\t\t");
              if (_jspx_meth_html_hidden_1(_jspx_th_html_form_1, _jspx_page_context))
                return;
              out.write("\r\n\t\t\t");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_2 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_hidden_2.setPageContext(_jspx_page_context);
              _jspx_th_html_hidden_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
              _jspx_th_html_hidden_2.setStyleId("dispatchConfigContent");
              _jspx_th_html_hidden_2.setProperty("nameService");
              _jspx_th_html_hidden_2.setValue(nameService.toString() );
              int _jspx_eval_html_hidden_2 = _jspx_th_html_hidden_2.doStartTag();
              if (_jspx_th_html_hidden_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_2);
                return;
              }
              _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_2);
              out.write("\r\n\t\t\t");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_3 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_hidden_3.setPageContext(_jspx_page_context);
              _jspx_th_html_hidden_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
              _jspx_th_html_hidden_3.setStyleId("dispatchConfigContent");
              _jspx_th_html_hidden_3.setProperty("language");
              _jspx_th_html_hidden_3.setValue(language.toString() );
              int _jspx_eval_html_hidden_3 = _jspx_th_html_hidden_3.doStartTag();
              if (_jspx_th_html_hidden_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_3);
                return;
              }
              _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_3);
              out.write("\r\n\t\t\t\r\n      <div class=\"field\">\r\n        <label>\r\n          <span>List of content :</span>\r\n          ");
              if (_jspx_meth_html_select_2(_jspx_th_html_form_1, _jspx_page_context))
                return;
              out.write("\r\n        </label>\r\n      </div>\r\n      \r\n      <div class=\"call2action\">\r\n        ");
              if (_jspx_meth_html_submit_1(_jspx_th_html_form_1, _jspx_page_context))
                return;
              out.write("\r\n      </div>\r\n      \r\n\t\t");
              int evalDoAfterBody = _jspx_th_html_form_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_html_form_styleId_styleClass_action.reuse(_jspx_th_html_form_1);
            return;
          }
          _jspx_tagPool_html_form_styleId_styleClass_action.reuse(_jspx_th_html_form_1);
          out.write('\r');
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
      out.write(" \r\n\t\r\n\t");
      if (_jspx_meth_logic_messagesPresent_0(_jspx_page_context))
        return;
      out.write(" \r\n\t</fieldset>\r\n\r\n\t<!-- update APPLICATION -->\r\n\t");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_0 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_equal_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_equal_0.setParent(null);
      _jspx_th_logic_equal_0.setName("myAdminApplicationForm");
      _jspx_th_logic_equal_0.setProperty("display");
      _jspx_th_logic_equal_0.setValue("displayApplication");
      int _jspx_eval_logic_equal_0 = _jspx_th_logic_equal_0.doStartTag();
      if (_jspx_eval_logic_equal_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\t\t");
          //  logic:notEmpty
          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_1 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
          _jspx_th_logic_notEmpty_1.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEmpty_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
          _jspx_th_logic_notEmpty_1.setName("myAdminApplicationForm");
          _jspx_th_logic_notEmpty_1.setProperty("appliInfo");
          int _jspx_eval_logic_notEmpty_1 = _jspx_th_logic_notEmpty_1.doStartTag();
          if (_jspx_eval_logic_notEmpty_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n\t\t\t");
              //  html:form
              org.apache.struts.taglib.html.FormTag _jspx_th_html_form_2 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_styleClass_enctype_action.get(org.apache.struts.taglib.html.FormTag.class);
              _jspx_th_html_form_2.setPageContext(_jspx_page_context);
              _jspx_th_html_form_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
              _jspx_th_html_form_2.setAction("/action/adminSearchApplication");
              _jspx_th_html_form_2.setStyleId("update");
              _jspx_th_html_form_2.setStyleClass("srvConfigForm");
              _jspx_th_html_form_2.setEnctype("multipart/form-data");
              int _jspx_eval_html_form_2 = _jspx_th_html_form_2.doStartTag();
              if (_jspx_eval_html_form_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_4 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_4.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_bean_define_4.setId("trueFalse");
                  _jspx_th_bean_define_4.setName("myAdminApplicationForm");
                  _jspx_th_bean_define_4.setProperty("trueFalse");
                  int _jspx_eval_bean_define_4 = _jspx_th_bean_define_4.doStartTag();
                  if (_jspx_th_bean_define_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_4);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_4);
                  java.lang.Object trueFalse = null;
                  trueFalse = (java.lang.Object) _jspx_page_context.findAttribute("trueFalse");
                  out.write("\r\n\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_5 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_5.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_bean_define_5.setId("applicationId");
                  _jspx_th_bean_define_5.setName("myAdminApplicationForm");
                  _jspx_th_bean_define_5.setProperty("applicationId");
                  int _jspx_eval_bean_define_5 = _jspx_th_bean_define_5.doStartTag();
                  if (_jspx_th_bean_define_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_5);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_5);
                  java.lang.Object applicationId = null;
                  applicationId = (java.lang.Object) _jspx_page_context.findAttribute("applicationId");
                  out.write("\r\n\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_6 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_6.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_bean_define_6.setId("theApplication");
                  _jspx_th_bean_define_6.setName("myAdminApplicationForm");
                  _jspx_th_bean_define_6.setProperty("appliInfo");
                  int _jspx_eval_bean_define_6 = _jspx_th_bean_define_6.doStartTag();
                  if (_jspx_th_bean_define_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_6);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_6);
                  java.lang.Object theApplication = null;
                  theApplication = (java.lang.Object) _jspx_page_context.findAttribute("theApplication");
                  out.write("\r\n\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_7 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_7.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_bean_define_7.setId("nameService");
                  _jspx_th_bean_define_7.setName("myAdminApplicationForm");
                  _jspx_th_bean_define_7.setProperty("nameService");
                  int _jspx_eval_bean_define_7 = _jspx_th_bean_define_7.doStartTag();
                  if (_jspx_th_bean_define_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_7);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_7);
                  java.lang.Object nameService = null;
                  nameService = (java.lang.Object) _jspx_page_context.findAttribute("nameService");
                  out.write("\r\n\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_8 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_8.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_bean_define_8.setId("language");
                  _jspx_th_bean_define_8.setName("myAdminApplicationForm");
                  _jspx_th_bean_define_8.setProperty("language");
                  int _jspx_eval_bean_define_8 = _jspx_th_bean_define_8.doStartTag();
                  if (_jspx_th_bean_define_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_8);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_8);
                  java.lang.Object language = null;
                  language = (java.lang.Object) _jspx_page_context.findAttribute("language");
                  out.write("\r\n\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_9 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_9.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_bean_define_9.setId("voices");
                  _jspx_th_bean_define_9.setName("myAdminApplicationForm");
                  _jspx_th_bean_define_9.setProperty("voices");
                  int _jspx_eval_bean_define_9 = _jspx_th_bean_define_9.doStartTag();
                  if (_jspx_th_bean_define_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_9);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_9);
                  java.lang.Object voices = null;
                  voices = (java.lang.Object) _jspx_page_context.findAttribute("voices");
                  out.write("\r\n\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_10 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_10.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_bean_define_10.setId("service");
                  _jspx_th_bean_define_10.setName("myAdminApplicationForm");
                  _jspx_th_bean_define_10.setProperty("namesList");
                  int _jspx_eval_bean_define_10 = _jspx_th_bean_define_10.doStartTag();
                  if (_jspx_th_bean_define_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_10);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_10);
                  java.lang.Object service = null;
                  service = (java.lang.Object) _jspx_page_context.findAttribute("service");
                  out.write("\r\n\t\t\t\r\n\t\t\t\t<fieldset><legend>");
                  if (_jspx_meth_bean_message_0(_jspx_th_html_form_2, _jspx_page_context))
                    return;
                  out.write("</legend>\r\n\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_11 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_11.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_bean_define_11.setId("name");
                  _jspx_th_bean_define_11.setName("theApplication");
                  _jspx_th_bean_define_11.setProperty("name");
                  int _jspx_eval_bean_define_11 = _jspx_th_bean_define_11.doStartTag();
                  if (_jspx_th_bean_define_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_11);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_11);
                  java.lang.Object name = null;
                  name = (java.lang.Object) _jspx_page_context.findAttribute("name");
                  out.write("\r\n\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_12 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_12.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_bean_define_12.setId("url");
                  _jspx_th_bean_define_12.setName("theApplication");
                  _jspx_th_bean_define_12.setProperty("url");
                  int _jspx_eval_bean_define_12 = _jspx_th_bean_define_12.doStartTag();
                  if (_jspx_th_bean_define_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_12);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_12);
                  java.lang.Object url = null;
                  url = (java.lang.Object) _jspx_page_context.findAttribute("url");
                  out.write("\r\n\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_13 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_13.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_bean_define_13.setId("title");
                  _jspx_th_bean_define_13.setName("theApplication");
                  _jspx_th_bean_define_13.setProperty("title");
                  int _jspx_eval_bean_define_13 = _jspx_th_bean_define_13.doStartTag();
                  if (_jspx_th_bean_define_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_13);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_13);
                  java.lang.Object title = null;
                  title = (java.lang.Object) _jspx_page_context.findAttribute("title");
                  out.write("\r\n\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_14 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_14.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_bean_define_14.setId("description");
                  _jspx_th_bean_define_14.setName("theApplication");
                  _jspx_th_bean_define_14.setProperty("description");
                  int _jspx_eval_bean_define_14 = _jspx_th_bean_define_14.doStartTag();
                  if (_jspx_th_bean_define_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_14);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_14);
                  java.lang.Object description = null;
                  description = (java.lang.Object) _jspx_page_context.findAttribute("description");
                  out.write("\r\n\t\t\t\t    ");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_15 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_15.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_bean_define_15.setId("category");
                  _jspx_th_bean_define_15.setName("theApplication");
                  _jspx_th_bean_define_15.setProperty("category");
                  int _jspx_eval_bean_define_15 = _jspx_th_bean_define_15.doStartTag();
                  if (_jspx_th_bean_define_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_15);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_15);
                  java.lang.Object category = null;
                  category = (java.lang.Object) _jspx_page_context.findAttribute("category");
                  out.write("\r\n\t\t\t\t    ");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_16 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_16.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_bean_define_16.setId("picture");
                  _jspx_th_bean_define_16.setName("theApplication");
                  _jspx_th_bean_define_16.setProperty("picture");
                  int _jspx_eval_bean_define_16 = _jspx_th_bean_define_16.doStartTag();
                  if (_jspx_th_bean_define_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_16);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_16);
                  java.lang.Object picture = null;
                  picture = (java.lang.Object) _jspx_page_context.findAttribute("picture");
                  out.write("\r\n\t\t\t\t    ");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_17 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_17.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_bean_define_17.setId("picturePath");
                  _jspx_th_bean_define_17.setName("theApplication");
                  _jspx_th_bean_define_17.setProperty("pictureURL");
                  int _jspx_eval_bean_define_17 = _jspx_th_bean_define_17.doStartTag();
                  if (_jspx_th_bean_define_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_17);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_17);
                  java.lang.Object picturePath = null;
                  picturePath = (java.lang.Object) _jspx_page_context.findAttribute("picturePath");
                  out.write("\r\n\t\t\t\t    ");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_18 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_18.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_bean_define_18.setId("icon");
                  _jspx_th_bean_define_18.setName("theApplication");
                  _jspx_th_bean_define_18.setProperty("icon");
                  int _jspx_eval_bean_define_18 = _jspx_th_bean_define_18.doStartTag();
                  if (_jspx_th_bean_define_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_18);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_18);
                  java.lang.Object icon = null;
                  icon = (java.lang.Object) _jspx_page_context.findAttribute("icon");
                  out.write("\r\n\t\t\t\t    ");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_19 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_19.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_bean_define_19.setId("iconPath");
                  _jspx_th_bean_define_19.setName("theApplication");
                  _jspx_th_bean_define_19.setProperty("iconURL");
                  int _jspx_eval_bean_define_19 = _jspx_th_bean_define_19.doStartTag();
                  if (_jspx_th_bean_define_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_19);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_19);
                  java.lang.Object iconPath = null;
                  iconPath = (java.lang.Object) _jspx_page_context.findAttribute("iconPath");
                  out.write("\r\n\t\t\t\t    ");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_20 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_20.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_bean_define_20.setId("announcement");
                  _jspx_th_bean_define_20.setName("theApplication");
                  _jspx_th_bean_define_20.setProperty("announcement");
                  int _jspx_eval_bean_define_20 = _jspx_th_bean_define_20.doStartTag();
                  if (_jspx_th_bean_define_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_20);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_20);
                  java.lang.Object announcement = null;
                  announcement = (java.lang.Object) _jspx_page_context.findAttribute("announcement");
                  out.write("\r\n\r\n\t\t\t\t\t");
                  if (_jspx_meth_html_hidden_4(_jspx_th_html_form_2, _jspx_page_context))
                    return;
                  out.write("\r\n\t\t\t\t\t");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_5 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_hidden_5.setPageContext(_jspx_page_context);
                  _jspx_th_html_hidden_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_html_hidden_5.setStyleId("applicationId");
                  _jspx_th_html_hidden_5.setProperty("applicationId");
                  _jspx_th_html_hidden_5.setValue(applicationId.toString());
                  int _jspx_eval_html_hidden_5 = _jspx_th_html_hidden_5.doStartTag();
                  if (_jspx_th_html_hidden_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_5);
                    return;
                  }
                  _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_5);
                  out.write("\r\n\t\t\t\t\t");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_6 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_hidden_6.setPageContext(_jspx_page_context);
                  _jspx_th_html_hidden_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_html_hidden_6.setStyleId("nameService");
                  _jspx_th_html_hidden_6.setProperty("nameService");
                  _jspx_th_html_hidden_6.setValue(nameService.toString());
                  int _jspx_eval_html_hidden_6 = _jspx_th_html_hidden_6.doStartTag();
                  if (_jspx_th_html_hidden_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_6);
                    return;
                  }
                  _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_6);
                  out.write("\r\n\t\t\t\t\t");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_7 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_hidden_7.setPageContext(_jspx_page_context);
                  _jspx_th_html_hidden_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_html_hidden_7.setStyleId("language");
                  _jspx_th_html_hidden_7.setProperty("language");
                  _jspx_th_html_hidden_7.setValue(language.toString());
                  int _jspx_eval_html_hidden_7 = _jspx_th_html_hidden_7.doStartTag();
                  if (_jspx_th_html_hidden_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_7);
                    return;
                  }
                  _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_7);
                  out.write("\r\n\t\t\t\t\t");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_8 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_hidden_8.setPageContext(_jspx_page_context);
                  _jspx_th_html_hidden_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_html_hidden_8.setStyleId("announcement");
                  _jspx_th_html_hidden_8.setProperty("announcement");
                  _jspx_th_html_hidden_8.setValue(announcement.toString());
                  int _jspx_eval_html_hidden_8 = _jspx_th_html_hidden_8.doStartTag();
                  if (_jspx_th_html_hidden_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_8);
                    return;
                  }
                  _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_8);
                  out.write("\r\n\t\t\t\t\t");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_9 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_hidden_9.setPageContext(_jspx_page_context);
                  _jspx_th_html_hidden_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_html_hidden_9.setStyleId("title");
                  _jspx_th_html_hidden_9.setProperty("title");
                  _jspx_th_html_hidden_9.setValue(title.toString());
                  int _jspx_eval_html_hidden_9 = _jspx_th_html_hidden_9.doStartTag();
                  if (_jspx_th_html_hidden_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_9);
                    return;
                  }
                  _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_9);
                  out.write("\r\n\t\t\t\t\t");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_10 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_hidden_10.setPageContext(_jspx_page_context);
                  _jspx_th_html_hidden_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_html_hidden_10.setStyleId("description");
                  _jspx_th_html_hidden_10.setProperty("description");
                  _jspx_th_html_hidden_10.setValue(description.toString());
                  int _jspx_eval_html_hidden_10 = _jspx_th_html_hidden_10.doStartTag();
                  if (_jspx_th_html_hidden_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_10);
                    return;
                  }
                  _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_10);
                  out.write("\r\n\t\t\t\t\t");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_11 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_hidden_11.setPageContext(_jspx_page_context);
                  _jspx_th_html_hidden_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_html_hidden_11.setStyleId("iconId");
                  _jspx_th_html_hidden_11.setProperty("iconFileId");
                  _jspx_th_html_hidden_11.setValue(icon.toString());
                  int _jspx_eval_html_hidden_11 = _jspx_th_html_hidden_11.doStartTag();
                  if (_jspx_th_html_hidden_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_11);
                    return;
                  }
                  _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_11);
                  out.write("\r\n\t\t\t\t\t");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_12 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_hidden_12.setPageContext(_jspx_page_context);
                  _jspx_th_html_hidden_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_html_hidden_12.setStyleId("pictureId");
                  _jspx_th_html_hidden_12.setProperty("pictureFileId");
                  _jspx_th_html_hidden_12.setValue(picture.toString());
                  int _jspx_eval_html_hidden_12 = _jspx_th_html_hidden_12.doStartTag();
                  if (_jspx_th_html_hidden_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_12);
                    return;
                  }
                  _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_12);
                  out.write("\r\n\t\t\t\t\t");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_13 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_hidden_13.setPageContext(_jspx_page_context);
                  _jspx_th_html_hidden_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_html_hidden_13.setStyleId("formerURL");
                  _jspx_th_html_hidden_13.setProperty("formerURL");
                  _jspx_th_html_hidden_13.setValue(url.toString());
                  int _jspx_eval_html_hidden_13 = _jspx_th_html_hidden_13.doStartTag();
                  if (_jspx_th_html_hidden_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_13);
                    return;
                  }
                  _jspx_tagPool_html_hidden_value_styleId_property_nobody.reuse(_jspx_th_html_hidden_13);
                  out.write("\r\n\t\t\t\t\t\t\t\t\t    \r\n          <fieldset>\r\n            <legend>Application:</legend>\r\n            <div class=\"field\">\r\n              <label>\r\n              \t<span>Type:</span>\r\n                ");
                  //  html:text
                  org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_readonly_property.get(org.apache.struts.taglib.html.TextTag.class);
                  _jspx_th_html_text_0.setPageContext(_jspx_page_context);
                  _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_html_text_0.setProperty("nameService");
                  _jspx_th_html_text_0.setReadonly(true);
                  int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
                  if (_jspx_eval_html_text_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_text_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_text_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_text_0.doInitBody();
                    }
                    do {
                      out.print(nameService);
                      int evalDoAfterBody = _jspx_th_html_text_0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_text_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_html_text_readonly_property.reuse(_jspx_th_html_text_0);
                    return;
                  }
                  _jspx_tagPool_html_text_readonly_property.reuse(_jspx_th_html_text_0);
                  out.write("\r\n                <input type=\"text\" id=\"appliName\" name=\"name\" value=\"");
                  out.print(name);
                  out.write("\" />\r\n              </label>\r\n            </div>\r\n            \r\n            <div class=\"field\">\r\n              <div id=\"tts\">\r\n                <label>\r\n                  <span>");
                  if (_jspx_meth_bean_message_1(_jspx_th_html_form_2, _jspx_page_context))
                    return;
                  out.write("</span>\r\n                  <input type=\"text\" id=\"TTSText\" name=\"TTSText\" />\r\n                  <label>&nbsp;");
                  if (_jspx_meth_bean_message_2(_jspx_th_html_form_2, _jspx_page_context))
                    return;
                  out.write("</label>\r\n                  ");
                  if (_jspx_meth_html_select_3(_jspx_th_html_form_2, _jspx_page_context))
                    return;
                  out.write("\r\n                </label>\r\n              </div>\r\n            </div>\r\n            \r\n            <div class=\"field\">\r\n              <label>\r\n                <span><strong>");
                  if (_jspx_meth_bean_message_3(_jspx_th_html_form_2, _jspx_page_context))
                    return;
                  out.write("</strong></span>\r\n                ");
                  if (_jspx_meth_html_select_4(_jspx_th_html_form_2, _jspx_page_context))
                    return;
                  out.write("\r\n              </label>\r\n            </div>\r\n            \r\n            <div class=\"field\">\r\n              <label>\r\n              \t<span><strong>");
                  if (_jspx_meth_bean_message_4(_jspx_th_html_form_2, _jspx_page_context))
                    return;
                  out.write("</strong></span>\r\n              \t");
                  if (_jspx_meth_html_select_5(_jspx_th_html_form_2, _jspx_page_context))
                    return;
                  out.write("\r\n\t\t\t\t\t\t\t</label>\r\n            </div>\r\n          </fieldset>\t\t\t\t\r\n\t\t\t\r\n\t\t\t\t\t<fieldset>\r\n          \t<legend>");
                  if (_jspx_meth_bean_message_5(_jspx_th_html_form_2, _jspx_page_context))
                    return;
                  out.write("</legend>\r\n\t\t\t\t\t\t<p>");
                  if (_jspx_meth_bean_message_6(_jspx_th_html_form_2, _jspx_page_context))
                    return;
                  out.write("</p>\r\n\t\t\t\t\t\t");
                  //  logic:iterate
                  org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_property_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
                  _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
                  _jspx_th_logic_iterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_logic_iterate_0.setName("myAdminApplicationForm");
                  _jspx_th_logic_iterate_0.setProperty("langList");
                  _jspx_th_logic_iterate_0.setId("lang");
                  int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
                  if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    java.lang.Object lang = null;
                    if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_logic_iterate_0.doInitBody();
                    }
                    lang = (java.lang.Object) _jspx_page_context.findAttribute("lang");
                    do {
                      out.write("\t\r\n\t\t\t\t\t\t\t<label>\r\n                ");
                      if (_jspx_meth_html_multibox_0(_jspx_th_logic_iterate_0, _jspx_page_context))
                        return;
                      out.write("\r\n                ");
                      if (_jspx_meth_bean_write_5(_jspx_th_logic_iterate_0, _jspx_page_context))
                        return;
                      out.write("\r\n              </label>\r\n\t\t\t\t\t\t");
                      int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
                      lang = (java.lang.Object) _jspx_page_context.findAttribute("lang");
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
                  out.write("\r\n\t\t\t\t\t\t<br />\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t<p>");
                  if (_jspx_meth_bean_message_7(_jspx_th_html_form_2, _jspx_page_context))
                    return;
                  out.write("</p>\r\n\t\t\t\t\t\t");
                  //  logic:iterate
                  org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_1 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_property_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
                  _jspx_th_logic_iterate_1.setPageContext(_jspx_page_context);
                  _jspx_th_logic_iterate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
                  _jspx_th_logic_iterate_1.setName("myAdminApplicationForm");
                  _jspx_th_logic_iterate_1.setProperty("hardwareList");
                  _jspx_th_logic_iterate_1.setId("hw");
                  int _jspx_eval_logic_iterate_1 = _jspx_th_logic_iterate_1.doStartTag();
                  if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    java.lang.Object hw = null;
                    if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_logic_iterate_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_logic_iterate_1.doInitBody();
                    }
                    hw = (java.lang.Object) _jspx_page_context.findAttribute("hw");
                    do {
                      out.write("\r\n            \t<label>\r\n                ");
                      if (_jspx_meth_html_multibox_1(_jspx_th_logic_iterate_1, _jspx_page_context))
                        return;
                      out.write("\r\n                ");
                      if (_jspx_meth_bean_write_7(_jspx_th_logic_iterate_1, _jspx_page_context))
                        return;
                      out.write("\r\n              </label>\r\n\t\t\t\t\t\t");
                      int evalDoAfterBody = _jspx_th_logic_iterate_1.doAfterBody();
                      hw = (java.lang.Object) _jspx_page_context.findAttribute("hw");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_logic_iterate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_logic_iterate_property_name_id.reuse(_jspx_th_logic_iterate_1);
                    return;
                  }
                  _jspx_tagPool_logic_iterate_property_name_id.reuse(_jspx_th_logic_iterate_1);
                  out.write("\r\n\t\t\t\t\t</fieldset>\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\t\t<fieldset>\r\n          \t<legend>");
                  if (_jspx_meth_bean_message_8(_jspx_th_html_form_2, _jspx_page_context))
                    return;
                  out.write("</legend>\r\n\t\t\t\t\t\t<div class=\"field\">\r\n              <label>\r\n                <span>");
                  if (_jspx_meth_bean_message_9(_jspx_th_html_form_2, _jspx_page_context))
                    return;
                  out.write("</span>\r\n                <input type=\"text\" id=\"url\" name=\"url\" value=\"");
                  out.print(url);
                  out.write("\"/>\t\r\n              </label>\r\n            </div>\r\n\t\t\t\t\t\t\r\n            <div class=\"field\">\r\n              <a href=\"");
                  out.print(iconPath);
                  out.write("\"><img src=\"");
                  out.print(iconPath);
                  out.write("\" alt=\"");
                  out.print(icon);
                  out.write("\" class=\"picture2\"/></a>&nbsp;\r\n              <label>\r\n              \t<strong>");
                  if (_jspx_meth_bean_message_10(_jspx_th_html_form_2, _jspx_page_context))
                    return;
                  out.write("</strong>\r\n                ");
                  if (_jspx_meth_html_file_0(_jspx_th_html_form_2, _jspx_page_context))
                    return;
                  out.write("\r\n\t\t\t\t\t\t\t</label>\r\n            </div>\r\n\r\n\t\t\t\t\t\t<div class=\"field\">\r\n              <a href=\"");
                  out.print(picturePath);
                  out.write("\"><img src=\"");
                  out.print(picturePath);
                  out.write("\" alt=\"");
                  out.print(picture);
                  out.write("\" class=\"picture2\"/></a>\r\n              <label>\r\n              \t<strong>");
                  if (_jspx_meth_bean_message_11(_jspx_th_html_form_2, _jspx_page_context))
                    return;
                  out.write("</strong>\r\n                ");
                  if (_jspx_meth_html_file_1(_jspx_th_html_form_2, _jspx_page_context))
                    return;
                  out.write("\r\n\t\t\t\t\t\t\t</label>\r\n\t\t\t\t\t\t</div> \r\n\t\t\t\t\t</fieldset>\r\n\t\t\t\t\t\r\n          <div class=\"call2action\">\r\n            ");
                  if (_jspx_meth_html_submit_2(_jspx_th_html_form_2, _jspx_page_context))
                    return;
                  out.write("\r\n          </div>\r\n\t\t\t\t\t\r\n\t\t\t\t</fieldset>\r\n\t\t\t");
                  int evalDoAfterBody = _jspx_th_html_form_2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_html_form_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_form_styleId_styleClass_enctype_action.reuse(_jspx_th_html_form_2);
                return;
              }
              _jspx_tagPool_html_form_styleId_styleClass_enctype_action.reuse(_jspx_th_html_form_2);
              out.write("\r\n\t\t\t\r\n\t\t\t<p style=\"color:green; font-weight:bold;\">");
              if (_jspx_meth_html_errors_17(_jspx_th_logic_notEmpty_1, _jspx_page_context))
                return;
              out.write("</p> \r\n\t\t");
              int evalDoAfterBody = _jspx_th_logic_notEmpty_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_notEmpty_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_1);
            return;
          }
          _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_1);
          out.write('\r');
          out.write('\n');
          out.write('	');
          int evalDoAfterBody = _jspx_th_logic_equal_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_equal_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_0);
        return;
      }
      _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_0);
      out.write("\r\n\r\n</div>\r\n<!-- FIN APPLICATION -->\r\n\r\n<script type=\"text/javascript\">\r\n\tfunction goDispatch(where, dispatchField){\r\n\t\tdocument.getElementById(dispatchField).value = where;\r\n\t}\r\n\r\n\tfunction confirmDeletion(){\r\n\t\tif (window.confirm('Do you really want to do that ?')) {\r\n\t\t\t\treturn true;\r\n\t\t}\r\n\t\treturn false;\r\n\t}\r\n\r\n\tfunction checkHidding(){\r\n\t\tif(document.getElementById('serviceId').value == 'net.violet.external.'){\r\n\t\t\tdocument.getElementById('tts').style.display = 'none';\r\n\t\t}\r\n\t\telse{\r\n\t\t\tdocument.getElementById('tts').style.display = 'block';\r\n\t\t}\r\n\t}\r\n</script>\r\n");
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
    _jspx_th_html_errors_0.setProperty("emptyName");
    int _jspx_eval_html_errors_0 = _jspx_th_html_errors_0.doStartTag();
    if (_jspx_th_html_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_0);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_0);
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
    _jspx_th_html_errors_1.setProperty("emptyTTS");
    int _jspx_eval_html_errors_1 = _jspx_th_html_errors_1.doStartTag();
    if (_jspx_th_html_errors_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_1);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_1);
    return false;
  }

  private boolean _jspx_meth_html_errors_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_2 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_2.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_2.setParent(null);
    _jspx_th_html_errors_2.setProperty("emptyUrl");
    int _jspx_eval_html_errors_2 = _jspx_th_html_errors_2.doStartTag();
    if (_jspx_th_html_errors_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_2);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_2);
    return false;
  }

  private boolean _jspx_meth_html_errors_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_3 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_3.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_3.setParent(null);
    _jspx_th_html_errors_3.setProperty("emptyTitle");
    int _jspx_eval_html_errors_3 = _jspx_th_html_errors_3.doStartTag();
    if (_jspx_th_html_errors_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_3);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_3);
    return false;
  }

  private boolean _jspx_meth_html_errors_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_4 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_4.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_4.setParent(null);
    _jspx_th_html_errors_4.setProperty("emptyDescription");
    int _jspx_eval_html_errors_4 = _jspx_th_html_errors_4.doStartTag();
    if (_jspx_th_html_errors_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_4);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_4);
    return false;
  }

  private boolean _jspx_meth_html_errors_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_5 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_5.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_5.setParent(null);
    _jspx_th_html_errors_5.setProperty("emptyLanguages");
    int _jspx_eval_html_errors_5 = _jspx_th_html_errors_5.doStartTag();
    if (_jspx_th_html_errors_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_5);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_5);
    return false;
  }

  private boolean _jspx_meth_html_errors_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_6 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_6.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_6.setParent(null);
    _jspx_th_html_errors_6.setProperty("emptyHardware");
    int _jspx_eval_html_errors_6 = _jspx_th_html_errors_6.doStartTag();
    if (_jspx_th_html_errors_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_6);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_6);
    return false;
  }

  private boolean _jspx_meth_html_errors_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_7 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_7.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_7.setParent(null);
    _jspx_th_html_errors_7.setProperty("incorrectSize");
    int _jspx_eval_html_errors_7 = _jspx_th_html_errors_7.doStartTag();
    if (_jspx_th_html_errors_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_7);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_7);
    return false;
  }

  private boolean _jspx_meth_html_errors_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_8 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_8.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_8.setParent(null);
    _jspx_th_html_errors_8.setProperty("ttsFailed");
    int _jspx_eval_html_errors_8 = _jspx_th_html_errors_8.doStartTag();
    if (_jspx_th_html_errors_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_8);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_8);
    return false;
  }

  private boolean _jspx_meth_html_errors_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_9 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_9.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_9.setParent(null);
    _jspx_th_html_errors_9.setProperty("existingName");
    int _jspx_eval_html_errors_9 = _jspx_th_html_errors_9.doStartTag();
    if (_jspx_th_html_errors_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_9);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_9);
    return false;
  }

  private boolean _jspx_meth_html_errors_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_10 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_10.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_10.setParent(null);
    _jspx_th_html_errors_10.setProperty("invalidParameter");
    int _jspx_eval_html_errors_10 = _jspx_th_html_errors_10.doStartTag();
    if (_jspx_th_html_errors_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_10);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_10);
    return false;
  }

  private boolean _jspx_meth_html_errors_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_11 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_11.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_11.setParent(null);
    _jspx_th_html_errors_11.setProperty("badUrl");
    int _jspx_eval_html_errors_11 = _jspx_th_html_errors_11.doStartTag();
    if (_jspx_th_html_errors_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_11);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_11);
    return false;
  }

  private boolean _jspx_meth_html_errors_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_12 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_12.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_12.setParent(null);
    _jspx_th_html_errors_12.setProperty("uploadFailed");
    int _jspx_eval_html_errors_12 = _jspx_th_html_errors_12.doStartTag();
    if (_jspx_th_html_errors_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_12);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_12);
    return false;
  }

  private boolean _jspx_meth_html_errors_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_13 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_13.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_13.setParent(null);
    _jspx_th_html_errors_13.setProperty("createFailed");
    int _jspx_eval_html_errors_13 = _jspx_th_html_errors_13.doStartTag();
    if (_jspx_th_html_errors_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_13);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_13);
    return false;
  }

  private boolean _jspx_meth_html_errors_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_14 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_14.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_14.setParent(null);
    _jspx_th_html_errors_14.setProperty("noFile");
    int _jspx_eval_html_errors_14 = _jspx_th_html_errors_14.doStartTag();
    if (_jspx_th_html_errors_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_14);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_14);
    return false;
  }

  private boolean _jspx_meth_html_errors_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_15 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_15.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_15.setParent(null);
    _jspx_th_html_errors_15.setProperty("invalidParameter");
    int _jspx_eval_html_errors_15 = _jspx_th_html_errors_15.doStartTag();
    if (_jspx_th_html_errors_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_15);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_15);
    return false;
  }

  private boolean _jspx_meth_html_errors_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_16 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_16.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_16.setParent(null);
    _jspx_th_html_errors_16.setProperty("existingName");
    int _jspx_eval_html_errors_16 = _jspx_th_html_errors_16.doStartTag();
    if (_jspx_th_html_errors_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_16);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_16);
    return false;
  }

  private boolean _jspx_meth_html_hidden_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_0 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_0.setStyleId("dispatchConfigService");
    _jspx_th_html_hidden_0.setProperty("dispatch");
    int _jspx_eval_html_hidden_0 = _jspx_th_html_hidden_0.doStartTag();
    if (_jspx_th_html_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_0);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_0);
    return false;
  }

  private boolean _jspx_meth_html_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_0.setPageContext(_jspx_page_context);
    _jspx_th_html_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_0.setProperty("nameService");
    int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
    if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_0.doInitBody();
      }
      do {
        out.write("\r\n            ");
        if (_jspx_meth_html_options_0(_jspx_th_html_select_0, _jspx_page_context))
          return true;
        out.write(" \r\n          ");
        int evalDoAfterBody = _jspx_th_html_select_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_0);
      return true;
    }
    _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_0);
    return false;
  }

  private boolean _jspx_meth_html_options_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_0 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_property_labelProperty_collection_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_options_0.setPageContext(_jspx_page_context);
    _jspx_th_html_options_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
    _jspx_th_html_options_0.setCollection("names");
    _jspx_th_html_options_0.setProperty("value");
    _jspx_th_html_options_0.setLabelProperty("label");
    int _jspx_eval_html_options_0 = _jspx_th_html_options_0.doStartTag();
    if (_jspx_th_html_options_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_options_property_labelProperty_collection_nobody.reuse(_jspx_th_html_options_0);
      return true;
    }
    _jspx_tagPool_html_options_property_labelProperty_collection_nobody.reuse(_jspx_th_html_options_0);
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
        out.write("\r\n            ");
        if (_jspx_meth_html_optionsCollection_0(_jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write("\r\n          ");
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
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_value_property_onclick_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_submit_0.setProperty("submit");
    _jspx_th_html_submit_0.setValue("Search contents");
    _jspx_th_html_submit_0.setOnclick("goDispatch('displayContent', 'dispatchConfigService')");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_value_property_onclick_nobody.reuse(_jspx_th_html_submit_0);
      return true;
    }
    _jspx_tagPool_html_submit_value_property_onclick_nobody.reuse(_jspx_th_html_submit_0);
    return false;
  }

  private boolean _jspx_meth_html_hidden_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_1 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_1.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_hidden_1.setStyleId("dispatchConfigContent");
    _jspx_th_html_hidden_1.setProperty("dispatch");
    int _jspx_eval_html_hidden_1 = _jspx_th_html_hidden_1.doStartTag();
    if (_jspx_th_html_hidden_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_1);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_1);
    return false;
  }

  private boolean _jspx_meth_html_select_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_2 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_2.setPageContext(_jspx_page_context);
    _jspx_th_html_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_select_2.setName("myAdminApplicationForm");
    _jspx_th_html_select_2.setProperty("applicationId");
    int _jspx_eval_html_select_2 = _jspx_th_html_select_2.doStartTag();
    if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_2.doInitBody();
      }
      do {
        out.write("\r\n            ");
        if (_jspx_meth_html_optionsCollection_1(_jspx_th_html_select_2, _jspx_page_context))
          return true;
        out.write("\r\n          ");
        int evalDoAfterBody = _jspx_th_html_select_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_select_property_name.reuse(_jspx_th_html_select_2);
      return true;
    }
    _jspx_tagPool_html_select_property_name.reuse(_jspx_th_html_select_2);
    return false;
  }

  private boolean _jspx_meth_html_optionsCollection_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:optionsCollection
    org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_optionsCollection_1 = (org.apache.struts.taglib.html.OptionsCollectionTag) _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
    _jspx_th_html_optionsCollection_1.setPageContext(_jspx_page_context);
    _jspx_th_html_optionsCollection_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_2);
    _jspx_th_html_optionsCollection_1.setName("myAdminApplicationForm");
    _jspx_th_html_optionsCollection_1.setProperty("applicationList");
    _jspx_th_html_optionsCollection_1.setLabel("name");
    _jspx_th_html_optionsCollection_1.setValue("id");
    int _jspx_eval_html_optionsCollection_1 = _jspx_th_html_optionsCollection_1.doStartTag();
    if (_jspx_th_html_optionsCollection_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_1);
      return true;
    }
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_1);
    return false;
  }

  private boolean _jspx_meth_html_submit_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_1 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_value_property_onclick_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_1.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_submit_1.setProperty("submit");
    _jspx_th_html_submit_1.setValue("Display Application");
    _jspx_th_html_submit_1.setOnclick("goDispatch('displayApplication', 'dispatchConfigContent')");
    int _jspx_eval_html_submit_1 = _jspx_th_html_submit_1.doStartTag();
    if (_jspx_th_html_submit_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_value_property_onclick_nobody.reuse(_jspx_th_html_submit_1);
      return true;
    }
    _jspx_tagPool_html_submit_value_property_onclick_nobody.reuse(_jspx_th_html_submit_1);
    return false;
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
    _jspx_th_logic_messagesPresent_0.setProperty("noApplicationMatch");
    int _jspx_eval_logic_messagesPresent_0 = _jspx_th_logic_messagesPresent_0.doStartTag();
    if (_jspx_eval_logic_messagesPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n\t\t<fieldset><legend class=\"clear error\">ごめんなさい。。(￣▽￣;)</legend>\r\n\t\t\t<p class=\"clear error\">");
        if (_jspx_meth_bean_write_0(_jspx_th_logic_messagesPresent_0, _jspx_page_context))
          return true;
        out.write("\"の勤務と\"");
        if (_jspx_meth_bean_write_1(_jspx_th_logic_messagesPresent_0, _jspx_page_context))
          return true;
        out.write("\"の言語は応用ではありません。。</p>\r\n\t\t\t<p class=\"clear error\">The \"");
        if (_jspx_meth_bean_write_2(_jspx_th_logic_messagesPresent_0, _jspx_page_context))
          return true;
        out.write("\" service and the \"");
        if (_jspx_meth_bean_write_3(_jspx_th_logic_messagesPresent_0, _jspx_page_context))
          return true;
        out.write("\" language don't match with any application. Sorry.</p>\r\n\t\t</fieldset>\r\n\t");
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

  private boolean _jspx_meth_bean_write_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_messagesPresent_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_messagesPresent_0);
    _jspx_th_bean_write_0.setName("myAdminApplicationForm");
    _jspx_th_bean_write_0.setProperty("nameService");
    int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
    if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_0);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_0);
    return false;
  }

  private boolean _jspx_meth_bean_write_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_messagesPresent_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_1 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_messagesPresent_0);
    _jspx_th_bean_write_1.setName("myAdminApplicationForm");
    _jspx_th_bean_write_1.setProperty("language");
    int _jspx_eval_bean_write_1 = _jspx_th_bean_write_1.doStartTag();
    if (_jspx_th_bean_write_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_1);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_1);
    return false;
  }

  private boolean _jspx_meth_bean_write_2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_messagesPresent_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_2 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_2.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_messagesPresent_0);
    _jspx_th_bean_write_2.setName("myAdminApplicationForm");
    _jspx_th_bean_write_2.setProperty("nameService");
    int _jspx_eval_bean_write_2 = _jspx_th_bean_write_2.doStartTag();
    if (_jspx_th_bean_write_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_2);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_2);
    return false;
  }

  private boolean _jspx_meth_bean_write_3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_messagesPresent_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_3 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_3.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_messagesPresent_0);
    _jspx_th_bean_write_3.setName("myAdminApplicationForm");
    _jspx_th_bean_write_3.setProperty("language");
    int _jspx_eval_bean_write_3 = _jspx_th_bean_write_3.doStartTag();
    if (_jspx_th_bean_write_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_3);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_3);
    return false;
  }

  private boolean _jspx_meth_bean_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_bean_message_0.setKey("application.info");
    int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
    if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_0);
      return true;
    }
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_0);
    return false;
  }

  private boolean _jspx_meth_html_hidden_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_4 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_4.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_html_hidden_4.setStyleId("dispatchUpdate");
    _jspx_th_html_hidden_4.setProperty("dispatch");
    int _jspx_eval_html_hidden_4 = _jspx_th_html_hidden_4.doStartTag();
    if (_jspx_th_html_hidden_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_4);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_4);
    return false;
  }

  private boolean _jspx_meth_bean_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_1 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_bean_message_1.setKey("common.voice");
    int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
    if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_1);
      return true;
    }
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_2 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_2.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_bean_message_2.setKey("common.in");
    int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
    if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_2);
      return true;
    }
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_2);
    return false;
  }

  private boolean _jspx_meth_html_select_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_3 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_3.setPageContext(_jspx_page_context);
    _jspx_th_html_select_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_html_select_3.setProperty("TTSLanguage");
    int _jspx_eval_html_select_3 = _jspx_th_html_select_3.doStartTag();
    if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_3.doInitBody();
      }
      do {
        out.write("\r\n                  ");
        if (_jspx_meth_html_options_1(_jspx_th_html_select_3, _jspx_page_context))
          return true;
        out.write(" \r\n                  ");
        int evalDoAfterBody = _jspx_th_html_select_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_select_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_3);
      return true;
    }
    _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_3);
    return false;
  }

  private boolean _jspx_meth_html_options_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_1 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_property_labelProperty_collection_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_options_1.setPageContext(_jspx_page_context);
    _jspx_th_html_options_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_3);
    _jspx_th_html_options_1.setCollection("voices");
    _jspx_th_html_options_1.setProperty("id");
    _jspx_th_html_options_1.setLabelProperty("title");
    int _jspx_eval_html_options_1 = _jspx_th_html_options_1.doStartTag();
    if (_jspx_th_html_options_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_options_property_labelProperty_collection_nobody.reuse(_jspx_th_html_options_1);
      return true;
    }
    _jspx_tagPool_html_options_property_labelProperty_collection_nobody.reuse(_jspx_th_html_options_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_3 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_3.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_bean_message_3.setKey("common.category");
    int _jspx_eval_bean_message_3 = _jspx_th_bean_message_3.doStartTag();
    if (_jspx_th_bean_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_3);
      return true;
    }
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_3);
    return false;
  }

  private boolean _jspx_meth_html_select_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_4 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_4.setPageContext(_jspx_page_context);
    _jspx_th_html_select_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_html_select_4.setProperty("cat");
    int _jspx_eval_html_select_4 = _jspx_th_html_select_4.doStartTag();
    if (_jspx_eval_html_select_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_4.doInitBody();
      }
      do {
        out.write("\r\n                ");
        if (_jspx_meth_html_options_2(_jspx_th_html_select_4, _jspx_page_context))
          return true;
        out.write(" \r\n                ");
        int evalDoAfterBody = _jspx_th_html_select_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_select_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_4);
      return true;
    }
    _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_4);
    return false;
  }

  private boolean _jspx_meth_html_options_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_2 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_property_labelProperty_collection_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_options_2.setPageContext(_jspx_page_context);
    _jspx_th_html_options_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_4);
    _jspx_th_html_options_2.setCollection("categories");
    _jspx_th_html_options_2.setProperty("value");
    _jspx_th_html_options_2.setLabelProperty("label");
    int _jspx_eval_html_options_2 = _jspx_th_html_options_2.doStartTag();
    if (_jspx_th_html_options_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_options_property_labelProperty_collection_nobody.reuse(_jspx_th_html_options_2);
      return true;
    }
    _jspx_tagPool_html_options_property_labelProperty_collection_nobody.reuse(_jspx_th_html_options_2);
    return false;
  }

  private boolean _jspx_meth_bean_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_4 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_4.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_bean_message_4.setKey("common.visibility");
    int _jspx_eval_bean_message_4 = _jspx_th_bean_message_4.doStartTag();
    if (_jspx_th_bean_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_4);
      return true;
    }
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_4);
    return false;
  }

  private boolean _jspx_meth_html_select_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_5 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_5.setPageContext(_jspx_page_context);
    _jspx_th_html_select_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_html_select_5.setName("myAdminApplicationForm");
    _jspx_th_html_select_5.setProperty("isVisible");
    int _jspx_eval_html_select_5 = _jspx_th_html_select_5.doStartTag();
    if (_jspx_eval_html_select_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_5.doInitBody();
      }
      do {
        out.write("\r\n              \t");
        if (_jspx_meth_html_options_3(_jspx_th_html_select_5, _jspx_page_context))
          return true;
        out.write(" \r\n              \t");
        int evalDoAfterBody = _jspx_th_html_select_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_select_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_select_property_name.reuse(_jspx_th_html_select_5);
      return true;
    }
    _jspx_tagPool_html_select_property_name.reuse(_jspx_th_html_select_5);
    return false;
  }

  private boolean _jspx_meth_html_options_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_3 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_property_labelProperty_collection_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_options_3.setPageContext(_jspx_page_context);
    _jspx_th_html_options_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_5);
    _jspx_th_html_options_3.setCollection("trueFalse");
    _jspx_th_html_options_3.setProperty("value");
    _jspx_th_html_options_3.setLabelProperty("label");
    int _jspx_eval_html_options_3 = _jspx_th_html_options_3.doStartTag();
    if (_jspx_th_html_options_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_options_property_labelProperty_collection_nobody.reuse(_jspx_th_html_options_3);
      return true;
    }
    _jspx_tagPool_html_options_property_labelProperty_collection_nobody.reuse(_jspx_th_html_options_3);
    return false;
  }

  private boolean _jspx_meth_bean_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_5 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_5.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_bean_message_5.setKey("application.language_hardware");
    int _jspx_eval_bean_message_5 = _jspx_th_bean_message_5.doStartTag();
    if (_jspx_th_bean_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_5);
      return true;
    }
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_5);
    return false;
  }

  private boolean _jspx_meth_bean_message_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_6 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_6.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_bean_message_6.setKey("common.languages");
    int _jspx_eval_bean_message_6 = _jspx_th_bean_message_6.doStartTag();
    if (_jspx_th_bean_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_6);
      return true;
    }
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_6);
    return false;
  }

  private boolean _jspx_meth_html_multibox_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_multibox_0 = (org.apache.struts.taglib.html.MultiboxTag) _jspx_tagPool_html_multibox_property.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_multibox_0.setPageContext(_jspx_page_context);
    _jspx_th_html_multibox_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_html_multibox_0.setProperty("languages");
    int _jspx_eval_html_multibox_0 = _jspx_th_html_multibox_0.doStartTag();
    if (_jspx_eval_html_multibox_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_multibox_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_multibox_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_multibox_0.doInitBody();
      }
      do {
        out.write("\r\n                  ");
        if (_jspx_meth_bean_write_4(_jspx_th_html_multibox_0, _jspx_page_context))
          return true;
        out.write("\r\n                ");
        int evalDoAfterBody = _jspx_th_html_multibox_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_multibox_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_multibox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_multibox_property.reuse(_jspx_th_html_multibox_0);
      return true;
    }
    _jspx_tagPool_html_multibox_property.reuse(_jspx_th_html_multibox_0);
    return false;
  }

  private boolean _jspx_meth_bean_write_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_multibox_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_4 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_4.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_multibox_0);
    _jspx_th_bean_write_4.setName("lang");
    _jspx_th_bean_write_4.setProperty("iso_code");
    int _jspx_eval_bean_write_4 = _jspx_th_bean_write_4.doStartTag();
    if (_jspx_th_bean_write_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_4);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_4);
    return false;
  }

  private boolean _jspx_meth_bean_write_5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_5 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_5.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_5.setName("lang");
    _jspx_th_bean_write_5.setProperty("name");
    int _jspx_eval_bean_write_5 = _jspx_th_bean_write_5.doStartTag();
    if (_jspx_th_bean_write_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_5);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_5);
    return false;
  }

  private boolean _jspx_meth_bean_message_7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_7 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_7.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_bean_message_7.setKey("common.hardware");
    int _jspx_eval_bean_message_7 = _jspx_th_bean_message_7.doStartTag();
    if (_jspx_th_bean_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_7);
      return true;
    }
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_7);
    return false;
  }

  private boolean _jspx_meth_html_multibox_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:multibox
    org.apache.struts.taglib.html.MultiboxTag _jspx_th_html_multibox_1 = (org.apache.struts.taglib.html.MultiboxTag) _jspx_tagPool_html_multibox_property.get(org.apache.struts.taglib.html.MultiboxTag.class);
    _jspx_th_html_multibox_1.setPageContext(_jspx_page_context);
    _jspx_th_html_multibox_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_html_multibox_1.setProperty("hardware");
    int _jspx_eval_html_multibox_1 = _jspx_th_html_multibox_1.doStartTag();
    if (_jspx_eval_html_multibox_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_multibox_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_multibox_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_multibox_1.doInitBody();
      }
      do {
        out.write("\r\n                  ");
        if (_jspx_meth_bean_write_6(_jspx_th_html_multibox_1, _jspx_page_context))
          return true;
        out.write("\r\n                ");
        int evalDoAfterBody = _jspx_th_html_multibox_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_multibox_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_multibox_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_multibox_property.reuse(_jspx_th_html_multibox_1);
      return true;
    }
    _jspx_tagPool_html_multibox_property.reuse(_jspx_th_html_multibox_1);
    return false;
  }

  private boolean _jspx_meth_bean_write_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_multibox_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_6 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_6.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_multibox_1);
    _jspx_th_bean_write_6.setName("hw");
    _jspx_th_bean_write_6.setProperty("code");
    int _jspx_eval_bean_write_6 = _jspx_th_bean_write_6.doStartTag();
    if (_jspx_th_bean_write_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_6);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_6);
    return false;
  }

  private boolean _jspx_meth_bean_write_7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_7 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_7.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_bean_write_7.setName("hw");
    _jspx_th_bean_write_7.setProperty("name");
    int _jspx_eval_bean_write_7 = _jspx_th_bean_write_7.doStartTag();
    if (_jspx_th_bean_write_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_7);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_7);
    return false;
  }

  private boolean _jspx_meth_bean_message_8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_8 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_8.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_bean_message_8.setKey("application.profile");
    int _jspx_eval_bean_message_8 = _jspx_th_bean_message_8.doStartTag();
    if (_jspx_th_bean_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_8);
      return true;
    }
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_8);
    return false;
  }

  private boolean _jspx_meth_bean_message_9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_9 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_9.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_bean_message_9.setKey("common.url");
    int _jspx_eval_bean_message_9 = _jspx_th_bean_message_9.doStartTag();
    if (_jspx_th_bean_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_9);
      return true;
    }
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_9);
    return false;
  }

  private boolean _jspx_meth_bean_message_10(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_10 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_10.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_bean_message_10.setKey("common.icon");
    int _jspx_eval_bean_message_10 = _jspx_th_bean_message_10.doStartTag();
    if (_jspx_th_bean_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_10);
      return true;
    }
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_10);
    return false;
  }

  private boolean _jspx_meth_html_file_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:file
    org.apache.struts.taglib.html.FileTag _jspx_th_html_file_0 = (org.apache.struts.taglib.html.FileTag) _jspx_tagPool_html_file_property_nobody.get(org.apache.struts.taglib.html.FileTag.class);
    _jspx_th_html_file_0.setPageContext(_jspx_page_context);
    _jspx_th_html_file_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_html_file_0.setProperty("iconFile");
    int _jspx_eval_html_file_0 = _jspx_th_html_file_0.doStartTag();
    if (_jspx_th_html_file_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_file_property_nobody.reuse(_jspx_th_html_file_0);
      return true;
    }
    _jspx_tagPool_html_file_property_nobody.reuse(_jspx_th_html_file_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_11(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_11 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_11.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_bean_message_11.setKey("common.picture");
    int _jspx_eval_bean_message_11 = _jspx_th_bean_message_11.doStartTag();
    if (_jspx_th_bean_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_11);
      return true;
    }
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_11);
    return false;
  }

  private boolean _jspx_meth_html_file_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:file
    org.apache.struts.taglib.html.FileTag _jspx_th_html_file_1 = (org.apache.struts.taglib.html.FileTag) _jspx_tagPool_html_file_property_nobody.get(org.apache.struts.taglib.html.FileTag.class);
    _jspx_th_html_file_1.setPageContext(_jspx_page_context);
    _jspx_th_html_file_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_html_file_1.setProperty("pictureFile");
    int _jspx_eval_html_file_1 = _jspx_th_html_file_1.doStartTag();
    if (_jspx_th_html_file_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_file_property_nobody.reuse(_jspx_th_html_file_1);
      return true;
    }
    _jspx_tagPool_html_file_property_nobody.reuse(_jspx_th_html_file_1);
    return false;
  }

  private boolean _jspx_meth_html_submit_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_2 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_value_property_onclick_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_2.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_html_submit_2.setProperty("submit");
    _jspx_th_html_submit_2.setValue("Update application");
    _jspx_th_html_submit_2.setOnclick("goDispatch('callAPI', 'dispatchUpdate')");
    int _jspx_eval_html_submit_2 = _jspx_th_html_submit_2.doStartTag();
    if (_jspx_th_html_submit_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_value_property_onclick_nobody.reuse(_jspx_th_html_submit_2);
      return true;
    }
    _jspx_tagPool_html_submit_value_property_onclick_nobody.reuse(_jspx_th_html_submit_2);
    return false;
  }

  private boolean _jspx_meth_html_errors_17(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_17 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_17.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
    _jspx_th_html_errors_17.setProperty("success");
    int _jspx_eval_html_errors_17 = _jspx_th_html_errors_17.doStartTag();
    if (_jspx_th_html_errors_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_17);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_17);
    return false;
  }
}
