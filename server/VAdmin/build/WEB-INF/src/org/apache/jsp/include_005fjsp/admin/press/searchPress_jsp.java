package org.apache.jsp.include_005fjsp.admin.press;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class searchPress_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/include_jsp/admin/header.jsp");
    _jspx_dependants.add("/include_jsp/admin/navigation.jsp");
    _jspx_dependants.add("/include_jsp/admin/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_messagesPresent_property_message;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleId_styleClass_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_styleId_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_property_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_options_property_labelProperty_collection_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_value_property_onclick_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_equal_value_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_property_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_empty_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleId_styleClass_enctype_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_file_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_value_styleClass_property_onclick_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleId_styleClass_onsubmit_action;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_logic_messagesPresent_property_message = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleId_styleClass_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_styleId_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_property_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_options_property_labelProperty_collection_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_value_property_onclick_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_equal_value_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_property_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_empty_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleId_styleClass_enctype_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_file_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_value_styleClass_property_onclick_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleId_styleClass_onsubmit_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_logic_messagesPresent_property_message.release();
    _jspx_tagPool_html_form_styleId_styleClass_action.release();
    _jspx_tagPool_html_hidden_styleId_property_nobody.release();
    _jspx_tagPool_html_select_property_name.release();
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.release();
    _jspx_tagPool_bean_define_property_name_id_nobody.release();
    _jspx_tagPool_html_select_property.release();
    _jspx_tagPool_html_options_property_labelProperty_collection_nobody.release();
    _jspx_tagPool_html_submit_value_property_onclick_nobody.release();
    _jspx_tagPool_logic_equal_value_property_name.release();
    _jspx_tagPool_logic_notEmpty_property_name.release();
    _jspx_tagPool_logic_iterate_property_name_id.release();
    _jspx_tagPool_logic_empty_property_name.release();
    _jspx_tagPool_html_form_styleId_styleClass_enctype_action.release();
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_html_file_property_nobody.release();
    _jspx_tagPool_html_submit_value_styleClass_property_onclick_nobody.release();
    _jspx_tagPool_html_form_styleId_styleClass_onsubmit_action.release();
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
      out.write("\n\n\n\n\n\n");
      out.write("\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n<title>Admin</title>\r\n<link href=\"../include_jsp/admin/css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<body>\r\n");
      out.write('\n');
      out.write('\n');
      out.write('\r');
      out.write('\n');
 response.setContentType("text/html;charset=UTF-8"); 
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n<div id=\"navigation\">\r\n\r\n\t<div id=\"internationalization\">\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminChangeLocale.do?dispatch=english&redirect=goHome\"><img src=\"../include_img/flags/en.gif\" border=\"0\"/></a></li>\r\n\t\t\t<li><a href=\"adminChangeLocale.do?dispatch=french&redirect=goHome\"><img src=\"../include_img/flags/fr.gif\" border=\"0\"/></a></li>\r\n\t\t\t<li><a href=\"adminChangeLocale.do?dispatch=japanese&redirect=goHome\"><img src=\"../include_img/flags/jp.gif\" border=\"0\"/></a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\r\n\t<div class=\"nav-prim\">\r\n\t\t<a href=\"admin.do?dispatch=disconnect\">Log off</a>\r\n\t\t<br /><br />\r\n\t\t<hr />\r\n\t\t<h2>Objects</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminSearchObject.do?dispatch=load\">Search</a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\t<div class=\"nav-prim\">\r\n\t\t<h2>Services</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminSearchApplication.do?dispatch=load\">Search</a></li>\r\n\t\t\t<li><a href=\"adminAddApplication.do?dispatch=load\">Add</a></li>\r\n\t\t\t<li><a href=\"adminRankApplication.do?dispatch=load\">Rank</a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\t<div class=\"nav-prim\">\r\n");
      out.write("\t\t<h2>News</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminSearchNews.do?dispatch=load\">Search</a></li>\r\n\t\t\t<li><a href=\"adminAddNews.do?dispatch=load\">Add</a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\t<div class=\"nav-prim\">\r\n\t\t<h2>Press</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminSearchPress.do?dispatch=load\">Search</a></li>\r\n\t\t\t<li><a href=\"adminAddPress.do?dispatch=load\">Add</a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\t<div class=\"nav-prim\">\r\n\t\t<h2>Store</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminSearchStore.do?dispatch=load\">Search</a></li>\r\n\t\t\t<li><a href=\"adminAddStore.do?dispatch=load\">Add</a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\t<div class=\"nav-prim\">\r\n\t\t<h2>Weather</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminAddWeather.do?dispatch=load\">Add</a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\t<div class=\"nav-prim\">\r\n\t\t<h2>Dico</h2>\r\n\t\t<ul>\r\n\t\t\t<li><a href=\"adminSearchDico.do?dispatch=load\">Search</a></li>\r\n\t\t\t<li><a href=\"adminAddDico.do?dispatch=load\">Add</a></li>\r\n\t\t\t<li><a href=\"adminImportDico.do?dispatch=load\">Import</a></li>\r\n\t\t\t<li><a href=\"adminExportDico.do?dispatch=load\">Export</a></li>\r\n\t\t</ul>\r\n");
      out.write("\t</div>\r\n</div>");
      out.write("\n\n<!-- DEBUT DIV CONTENT -->\n<div id=\"content\">\n\n\t");
      if (_jspx_meth_logic_messagesPresent_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');
      if (_jspx_meth_logic_messagesPresent_1(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');
      if (_jspx_meth_logic_messagesPresent_2(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');
      if (_jspx_meth_logic_messagesPresent_3(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');
      if (_jspx_meth_logic_messagesPresent_4(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');
      if (_jspx_meth_logic_messagesPresent_5(_jspx_page_context))
        return;
      out.write("\n\n\t<fieldset><legend>Search a Press</legend>\n\t<label><strong>Search press by lang and product</strong></label> \n\n\t<!-- Search form -->\n\t");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_styleClass_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("/action/adminSearchPress");
      _jspx_th_html_form_0.setStyleId("SearchPressByLangAndProduct");
      _jspx_th_html_form_0.setStyleClass("srvConfigForm");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          out.write('	');
          out.write('	');
          if (_jspx_meth_html_hidden_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n\t\n\t\t<label>Language :</label>\n\t\t");
          if (_jspx_meth_html_select_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n\t\n\t<label>Product :</label>\n\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_define_0.setId("names");
          _jspx_th_bean_define_0.setName("myAdminSearchPressForm");
          _jspx_th_bean_define_0.setProperty("namesList");
          int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
          if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
          java.lang.Object names = null;
          names = (java.lang.Object) _jspx_page_context.findAttribute("names");
          out.write('\n');
          out.write('	');
          if (_jspx_meth_html_select_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write('\n');
          out.write('	');
          out.write('	');
          if (_jspx_meth_html_submit_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write('\n');
          out.write('	');
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
      out.write("\n\n\t<!--PRESS -->\n\t");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_0 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_equal_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_equal_0.setParent(null);
      _jspx_th_logic_equal_0.setName("myAdminSearchPressForm");
      _jspx_th_logic_equal_0.setProperty("display");
      _jspx_th_logic_equal_0.setValue("displayPress");
      int _jspx_eval_logic_equal_0 = _jspx_th_logic_equal_0.doStartTag();
      if (_jspx_eval_logic_equal_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          out.write('	');
          out.write('	');
          //  logic:notEmpty
          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_0 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
          _jspx_th_logic_notEmpty_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEmpty_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
          _jspx_th_logic_notEmpty_0.setName("myAdminSearchPressForm");
          _jspx_th_logic_notEmpty_0.setProperty("pressList");
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
              _jspx_th_bean_define_1.setId("nameProduct");
              _jspx_th_bean_define_1.setName("myAdminSearchPressForm");
              _jspx_th_bean_define_1.setProperty("productPress");
              int _jspx_eval_bean_define_1 = _jspx_th_bean_define_1.doStartTag();
              if (_jspx_th_bean_define_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_1);
                return;
              }
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_1);
              java.lang.Object nameProduct = null;
              nameProduct = (java.lang.Object) _jspx_page_context.findAttribute("nameProduct");
              out.write('\n');
              out.write('	');
              out.write('	');
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_2 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_2.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
              _jspx_th_bean_define_2.setId("theLanguage");
              _jspx_th_bean_define_2.setName("myAdminSearchPressForm");
              _jspx_th_bean_define_2.setProperty("language");
              int _jspx_eval_bean_define_2 = _jspx_th_bean_define_2.doStartTag();
              if (_jspx_th_bean_define_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_2);
                return;
              }
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_2);
              java.lang.Object theLanguage = null;
              theLanguage = (java.lang.Object) _jspx_page_context.findAttribute("theLanguage");
              out.write("\n\t\t\n\t\t\t<div class=\"results\">\n\t\t\t\t<table>\n\t\t\t\t\t<thead>\n\t\t\t\t\t\t<tr>\n\t\t\t\t\t\t\t<th>Press Title</th>\n\t\t\t\t\t\t\t<th>Press abstract</th>\n\t\t\t\t\t\t\t<th>Press Url</th>\n\t\t\t\t\t\t\t<th>Edit</th>\n\t\t\t\t\t\t\t<th>Delete</th>\n\t\t\t\t\t\t\t<th>Press Image</th>\n\t\t\t\t\t\t</tr>\n\t\t\t\t\t</thead>\n\t\t\t\t\t<tbody>\n\t\t\t\t\t\t");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_property_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
              _jspx_th_logic_iterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
              _jspx_th_logic_iterate_0.setName("myAdminSearchPressForm");
              _jspx_th_logic_iterate_0.setProperty("pressList");
              _jspx_th_logic_iterate_0.setId("thePress");
              int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
              if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object thePress = null;
                if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_iterate_0.doInitBody();
                }
                thePress = (java.lang.Object) _jspx_page_context.findAttribute("thePress");
                do {
                  out.write("\n\t\t\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_3 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_3.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
                  _jspx_th_bean_define_3.setId("idPress");
                  _jspx_th_bean_define_3.setName("thePress");
                  _jspx_th_bean_define_3.setProperty("id");
                  int _jspx_eval_bean_define_3 = _jspx_th_bean_define_3.doStartTag();
                  if (_jspx_th_bean_define_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_3);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_3);
                  java.lang.Object idPress = null;
                  idPress = (java.lang.Object) _jspx_page_context.findAttribute("idPress");
                  out.write("\n\t\t\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_4 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_4.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
                  _jspx_th_bean_define_4.setId("titlePress");
                  _jspx_th_bean_define_4.setName("thePress");
                  _jspx_th_bean_define_4.setProperty("title");
                  int _jspx_eval_bean_define_4 = _jspx_th_bean_define_4.doStartTag();
                  if (_jspx_th_bean_define_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_4);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_4);
                  java.lang.Object titlePress = null;
                  titlePress = (java.lang.Object) _jspx_page_context.findAttribute("titlePress");
                  out.write("\n\t\t\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_5 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_5.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
                  _jspx_th_bean_define_5.setId("abstractPress");
                  _jspx_th_bean_define_5.setName("thePress");
                  _jspx_th_bean_define_5.setProperty("summary");
                  int _jspx_eval_bean_define_5 = _jspx_th_bean_define_5.doStartTag();
                  if (_jspx_th_bean_define_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_5);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_5);
                  java.lang.Object abstractPress = null;
                  abstractPress = (java.lang.Object) _jspx_page_context.findAttribute("abstractPress");
                  out.write("\n\t\t\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_6 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_6.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
                  _jspx_th_bean_define_6.setId("urlPress");
                  _jspx_th_bean_define_6.setName("thePress");
                  _jspx_th_bean_define_6.setProperty("url");
                  int _jspx_eval_bean_define_6 = _jspx_th_bean_define_6.doStartTag();
                  if (_jspx_th_bean_define_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_6);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_6);
                  java.lang.Object urlPress = null;
                  urlPress = (java.lang.Object) _jspx_page_context.findAttribute("urlPress");
                  out.write("\n\t\t\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_7 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_7.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
                  _jspx_th_bean_define_7.setId("imagePress");
                  _jspx_th_bean_define_7.setName("thePress");
                  _jspx_th_bean_define_7.setProperty("picture");
                  int _jspx_eval_bean_define_7 = _jspx_th_bean_define_7.doStartTag();
                  if (_jspx_th_bean_define_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_7);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_7);
                  java.lang.Object imagePress = null;
                  imagePress = (java.lang.Object) _jspx_page_context.findAttribute("imagePress");
                  out.write("\n\t\t\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_8 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_8.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
                  _jspx_th_bean_define_8.setId("imagePath");
                  _jspx_th_bean_define_8.setName("thePress");
                  _jspx_th_bean_define_8.setProperty("pictureURL");
                  int _jspx_eval_bean_define_8 = _jspx_th_bean_define_8.doStartTag();
                  if (_jspx_th_bean_define_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_8);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_8);
                  java.lang.Object imagePath = null;
                  imagePath = (java.lang.Object) _jspx_page_context.findAttribute("imagePath");
                  out.write("\n\t\t\t\t\t\t\t<tr>\n\t\t\t\t\t\t\t\t<td>");
                  out.print(titlePress);
                  out.write("</td>\n\t\t\t\t\t\t\t\t<td>");
                  out.print(abstractPress);
                  out.write("</td>\n\t\t\t\t\t\t\t\t<td>");
                  out.print(urlPress);
                  out.write("</td>\n\t\t\t\t\t\t\t\t<td><a href=\"adminSearchPress.do?dispatch=displayInfo&idPress=");
                  out.print(idPress);
                  out.write("&productPress=");
                  out.print(nameProduct);
                  out.write("&language=");
                  out.print(theLanguage);
                  out.write("\">View/Modify</a></td>\n\t\t\t\t\t\t\t\t<td><a href=\"adminSearchPress.do?dispatch=delete&idPress=");
                  out.print(idPress);
                  out.write("&productPress=");
                  out.print(nameProduct);
                  out.write("&language=");
                  out.print(theLanguage);
                  out.write("\">Delete</a></td>\n\t\t\t\t\t\t\t\t<td><a href=\"");
                  out.print(imagePath);
                  out.write("\"><img src=\"");
                  out.print(imagePath);
                  out.write("\" alt=\"");
                  out.print(imagePress);
                  out.write("\" class=\"picture\"/></a></td>\n\t\t\t\t\t\t\t</tr>\n\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
                  thePress = (java.lang.Object) _jspx_page_context.findAttribute("thePress");
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
              out.write("\n\t\t\t\t\t</tbody>\n\t\t\t\t</table>\n\t\t\t</div>\n\t\t");
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
          out.write('\n');
          out.write('	');
          out.write('	');
          if (_jspx_meth_logic_empty_0(_jspx_th_logic_equal_0, _jspx_page_context))
            return;
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
      out.write("\n\n\n\t<!--INFO Press -->\n\t");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_1 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_equal_1.setPageContext(_jspx_page_context);
      _jspx_th_logic_equal_1.setParent(null);
      _jspx_th_logic_equal_1.setName("myAdminSearchPressForm");
      _jspx_th_logic_equal_1.setProperty("display");
      _jspx_th_logic_equal_1.setValue("infoPress");
      int _jspx_eval_logic_equal_1 = _jspx_th_logic_equal_1.doStartTag();
      if (_jspx_eval_logic_equal_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_9 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_9.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_9.setId("nameProduct");
          _jspx_th_bean_define_9.setName("myAdminSearchPressForm");
          _jspx_th_bean_define_9.setProperty("productPress");
          int _jspx_eval_bean_define_9 = _jspx_th_bean_define_9.doStartTag();
          if (_jspx_th_bean_define_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_9);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_9);
          java.lang.Object nameProduct = null;
          nameProduct = (java.lang.Object) _jspx_page_context.findAttribute("nameProduct");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_10 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_10.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_10.setId("theLanguage");
          _jspx_th_bean_define_10.setName("myAdminSearchPressForm");
          _jspx_th_bean_define_10.setProperty("language");
          int _jspx_eval_bean_define_10 = _jspx_th_bean_define_10.doStartTag();
          if (_jspx_th_bean_define_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_10);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_10);
          java.lang.Object theLanguage = null;
          theLanguage = (java.lang.Object) _jspx_page_context.findAttribute("theLanguage");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_11 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_11.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_11.setId("thePress");
          _jspx_th_bean_define_11.setName("myAdminSearchPressForm");
          _jspx_th_bean_define_11.setProperty("thePressData");
          int _jspx_eval_bean_define_11 = _jspx_th_bean_define_11.doStartTag();
          if (_jspx_th_bean_define_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_11);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_11);
          java.lang.Object thePress = null;
          thePress = (java.lang.Object) _jspx_page_context.findAttribute("thePress");
          out.write("\n\t\t\n\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_12 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_12.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_12.setId("idPress");
          _jspx_th_bean_define_12.setName("thePress");
          _jspx_th_bean_define_12.setProperty("id");
          int _jspx_eval_bean_define_12 = _jspx_th_bean_define_12.doStartTag();
          if (_jspx_th_bean_define_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_12);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_12);
          java.lang.Object idPress = null;
          idPress = (java.lang.Object) _jspx_page_context.findAttribute("idPress");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_13 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_13.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_13.setId("titlePress");
          _jspx_th_bean_define_13.setName("thePress");
          _jspx_th_bean_define_13.setProperty("title");
          int _jspx_eval_bean_define_13 = _jspx_th_bean_define_13.doStartTag();
          if (_jspx_th_bean_define_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_13);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_13);
          java.lang.Object titlePress = null;
          titlePress = (java.lang.Object) _jspx_page_context.findAttribute("titlePress");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_14 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_14.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_14.setId("abstractPress");
          _jspx_th_bean_define_14.setName("thePress");
          _jspx_th_bean_define_14.setProperty("summary");
          int _jspx_eval_bean_define_14 = _jspx_th_bean_define_14.doStartTag();
          if (_jspx_th_bean_define_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_14);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_14);
          java.lang.Object abstractPress = null;
          abstractPress = (java.lang.Object) _jspx_page_context.findAttribute("abstractPress");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_15 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_15.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_15.setId("urlPress");
          _jspx_th_bean_define_15.setName("thePress");
          _jspx_th_bean_define_15.setProperty("url");
          int _jspx_eval_bean_define_15 = _jspx_th_bean_define_15.doStartTag();
          if (_jspx_th_bean_define_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_15);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_15);
          java.lang.Object urlPress = null;
          urlPress = (java.lang.Object) _jspx_page_context.findAttribute("urlPress");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_16 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_16.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_16.setId("langPress");
          _jspx_th_bean_define_16.setName("thePress");
          _jspx_th_bean_define_16.setProperty("lang");
          int _jspx_eval_bean_define_16 = _jspx_th_bean_define_16.doStartTag();
          if (_jspx_th_bean_define_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_16);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_16);
          java.lang.Object langPress = null;
          langPress = (java.lang.Object) _jspx_page_context.findAttribute("langPress");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_17 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_17.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_17.setId("productPress");
          _jspx_th_bean_define_17.setName("thePress");
          _jspx_th_bean_define_17.setProperty("product");
          int _jspx_eval_bean_define_17 = _jspx_th_bean_define_17.doStartTag();
          if (_jspx_th_bean_define_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_17);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_17);
          java.lang.Object productPress = null;
          productPress = (java.lang.Object) _jspx_page_context.findAttribute("productPress");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_18 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_18.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_18.setId("picturePress");
          _jspx_th_bean_define_18.setName("thePress");
          _jspx_th_bean_define_18.setProperty("picture");
          int _jspx_eval_bean_define_18 = _jspx_th_bean_define_18.doStartTag();
          if (_jspx_th_bean_define_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_18);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_18);
          java.lang.Object picturePress = null;
          picturePress = (java.lang.Object) _jspx_page_context.findAttribute("picturePress");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_19 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_19.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_19.setId("imagePath");
          _jspx_th_bean_define_19.setName("thePress");
          _jspx_th_bean_define_19.setProperty("pictureURL");
          int _jspx_eval_bean_define_19 = _jspx_th_bean_define_19.doStartTag();
          if (_jspx_th_bean_define_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_19);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_19);
          java.lang.Object imagePath = null;
          imagePath = (java.lang.Object) _jspx_page_context.findAttribute("imagePath");
          out.write("\n\t\t\n\t\t");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_form_1 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_styleClass_enctype_action.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_form_1.setPageContext(_jspx_page_context);
          _jspx_th_html_form_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_html_form_1.setAction("/action/adminSearchPress");
          _jspx_th_html_form_1.setStyleId("updateSearchConfig");
          _jspx_th_html_form_1.setStyleClass("updateSearchForm");
          _jspx_th_html_form_1.setEnctype("multipart/form-data");
          int _jspx_eval_html_form_1 = _jspx_th_html_form_1.doStartTag();
          if (_jspx_eval_html_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n\t\t\t");
              if (_jspx_meth_html_hidden_1(_jspx_th_html_form_1, _jspx_page_context))
                return;
              out.write("\n\t\t\t");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_2 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_hidden_2.setPageContext(_jspx_page_context);
              _jspx_th_html_hidden_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
              _jspx_th_html_hidden_2.setProperty("idPress");
              _jspx_th_html_hidden_2.setValue(idPress.toString());
              int _jspx_eval_html_hidden_2 = _jspx_th_html_hidden_2.doStartTag();
              if (_jspx_th_html_hidden_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_2);
                return;
              }
              _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_2);
              out.write("\t\n\t\t\t<fieldset><legend>Update Press</legend>\n\t\t\t\n\t\t\t\t<label>Press title :</label>\n\t\t\t\t<input type=\"text\" id=\"PressTitle\" name=\"title\" value=\"");
              out.print(titlePress);
              out.write("\"/>\t\n\t\t\t\t<br />\n\t\t\t\n\t\t\t\t<label>Press language :</label>\n\t\t\t\t");
              if (_jspx_meth_html_select_2(_jspx_th_html_form_1, _jspx_page_context))
                return;
              out.write("\n\t\t\t\n\t\t\t\t<label>Press product :</label>\n\t\t\t\t");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_20 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_20.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
              _jspx_th_bean_define_20.setId("names");
              _jspx_th_bean_define_20.setName("myAdminSearchPressForm");
              _jspx_th_bean_define_20.setProperty("namesList");
              int _jspx_eval_bean_define_20 = _jspx_th_bean_define_20.doStartTag();
              if (_jspx_th_bean_define_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_20);
                return;
              }
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_20);
              java.lang.Object names = null;
              names = (java.lang.Object) _jspx_page_context.findAttribute("names");
              out.write("\n\t\t\t\t");
              if (_jspx_meth_html_select_3(_jspx_th_html_form_1, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t<br />\n\t\t\t\t\n\t\t\t\t<label>Press Abstract :</label>\n\t\t\t\t<textarea rows=\"5\" cols=\"50\" name=\"summary\" align=\"center\">");
              out.print(abstractPress);
              out.write("</textarea>\n\t\t\t\t<br />\n\t\t\t\t\n\t\t\t\t<label>Press URL :</label>\n\t\t\t\t<input type=\"text\" id=\"urlTitle\" name=\"url\" value=\"");
              out.print(urlPress);
              out.write("\"/>\t\n\t\t\t\t<br />\n\t\t\t\t\n\t\t\t\t<label>Press Picture :</label>\n\t\t\t\t");
              if (_jspx_meth_html_file_0(_jspx_th_html_form_1, _jspx_page_context))
                return;
              out.write("&nbsp; \n\t\t\t\t<a href=\"");
              out.print(imagePath);
              out.write("\"><img src=\"");
              out.print(imagePath);
              out.write("\" alt=\"");
              out.print(picturePress);
              out.write("\" class=\"picture\"/></a>\n\t\t\t\t<br />\n\t\t\t\t\n\t\t\t\t");
              if (_jspx_meth_html_submit_1(_jspx_th_html_form_1, _jspx_page_context))
                return;
              out.write("\n\t\t\t</fieldset>\n\t\t");
              int evalDoAfterBody = _jspx_th_html_form_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_html_form_styleId_styleClass_enctype_action.reuse(_jspx_th_html_form_1);
            return;
          }
          _jspx_tagPool_html_form_styleId_styleClass_enctype_action.reuse(_jspx_th_html_form_1);
          out.write("\n\t\t\n\t\t");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_form_2 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_styleClass_onsubmit_action.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_form_2.setPageContext(_jspx_page_context);
          _jspx_th_html_form_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_html_form_2.setAction("/action/adminSearchPress");
          _jspx_th_html_form_2.setStyleId("deleteSearchConfig");
          _jspx_th_html_form_2.setStyleClass("deleteSearchForm");
          _jspx_th_html_form_2.setOnsubmit("return confirmDeletion()");
          int _jspx_eval_html_form_2 = _jspx_th_html_form_2.doStartTag();
          if (_jspx_eval_html_form_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n\t\t\t");
              if (_jspx_meth_html_hidden_3(_jspx_th_html_form_2, _jspx_page_context))
                return;
              out.write("\t\n\t\t\t");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_4 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_hidden_4.setPageContext(_jspx_page_context);
              _jspx_th_html_hidden_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
              _jspx_th_html_hidden_4.setProperty("idPress");
              _jspx_th_html_hidden_4.setValue(idPress.toString());
              int _jspx_eval_html_hidden_4 = _jspx_th_html_hidden_4.doStartTag();
              if (_jspx_th_html_hidden_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_4);
                return;
              }
              _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_4);
              out.write("\t\t\n\t\t\t");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_5 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_hidden_5.setPageContext(_jspx_page_context);
              _jspx_th_html_hidden_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
              _jspx_th_html_hidden_5.setProperty("product");
              _jspx_th_html_hidden_5.setValue(nameProduct.toString());
              int _jspx_eval_html_hidden_5 = _jspx_th_html_hidden_5.doStartTag();
              if (_jspx_th_html_hidden_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_5);
                return;
              }
              _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_5);
              out.write("\t\t\n\t\t\t");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_6 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_hidden_6.setPageContext(_jspx_page_context);
              _jspx_th_html_hidden_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
              _jspx_th_html_hidden_6.setProperty("language");
              _jspx_th_html_hidden_6.setValue(theLanguage.toString());
              int _jspx_eval_html_hidden_6 = _jspx_th_html_hidden_6.doStartTag();
              if (_jspx_th_html_hidden_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_6);
                return;
              }
              _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_6);
              out.write("\t\t\n\t\t\t");
              if (_jspx_meth_html_submit_2(_jspx_th_html_form_2, _jspx_page_context))
                return;
              out.write('\n');
              out.write('	');
              out.write('	');
              int evalDoAfterBody = _jspx_th_html_form_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_form_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_html_form_styleId_styleClass_onsubmit_action.reuse(_jspx_th_html_form_2);
            return;
          }
          _jspx_tagPool_html_form_styleId_styleClass_onsubmit_action.reuse(_jspx_th_html_form_2);
          out.write('\n');
          out.write('	');
          int evalDoAfterBody = _jspx_th_logic_equal_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_equal_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_1);
        return;
      }
      _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_1);
      out.write("\n\t\n\t");
      if (_jspx_meth_logic_messagesPresent_6(_jspx_page_context))
        return;
      out.write("\n\n</div>\n<!-- FIN DIV CONTENT -->\n\n<script type=\"text/javascript\">\n\tfunction goDispatch(where, dispatchField){\n\t\tdocument.getElementById(dispatchField).value = where;\n\t}\n\n\tfunction confirmDeletion(){\n\t\tif (window.confirm('Do you really want to do that ?')) {\n\t\t\t\treturn true;\n\t\t}\n\t\treturn false;\n\t}\n</script>\n\n");
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

  private boolean _jspx_meth_logic_messagesPresent_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:messagesPresent
    org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_0 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent_property_message.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
    _jspx_th_logic_messagesPresent_0.setPageContext(_jspx_page_context);
    _jspx_th_logic_messagesPresent_0.setParent(null);
    _jspx_th_logic_messagesPresent_0.setMessage("errors");
    _jspx_th_logic_messagesPresent_0.setProperty("emptyTitle");
    int _jspx_eval_logic_messagesPresent_0 = _jspx_th_logic_messagesPresent_0.doStartTag();
    if (_jspx_eval_logic_messagesPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t<p class=\"clear error\">Please fill the title.</p>\n\t");
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

  private boolean _jspx_meth_logic_messagesPresent_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:messagesPresent
    org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_1 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent_property_message.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
    _jspx_th_logic_messagesPresent_1.setPageContext(_jspx_page_context);
    _jspx_th_logic_messagesPresent_1.setParent(null);
    _jspx_th_logic_messagesPresent_1.setMessage("errors");
    _jspx_th_logic_messagesPresent_1.setProperty("emptySummary");
    int _jspx_eval_logic_messagesPresent_1 = _jspx_th_logic_messagesPresent_1.doStartTag();
    if (_jspx_eval_logic_messagesPresent_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t<p class=\"clear error\">Please fill the summary.</p>\n\t");
        int evalDoAfterBody = _jspx_th_logic_messagesPresent_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_messagesPresent_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_1);
      return true;
    }
    _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_1);
    return false;
  }

  private boolean _jspx_meth_logic_messagesPresent_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:messagesPresent
    org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_2 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent_property_message.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
    _jspx_th_logic_messagesPresent_2.setPageContext(_jspx_page_context);
    _jspx_th_logic_messagesPresent_2.setParent(null);
    _jspx_th_logic_messagesPresent_2.setMessage("errors");
    _jspx_th_logic_messagesPresent_2.setProperty("emptyUrl");
    int _jspx_eval_logic_messagesPresent_2 = _jspx_th_logic_messagesPresent_2.doStartTag();
    if (_jspx_eval_logic_messagesPresent_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t<p class=\"clear error\">Please fill the url.</p>\n\t");
        int evalDoAfterBody = _jspx_th_logic_messagesPresent_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_messagesPresent_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_2);
      return true;
    }
    _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_2);
    return false;
  }

  private boolean _jspx_meth_logic_messagesPresent_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:messagesPresent
    org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_3 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent_property_message.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
    _jspx_th_logic_messagesPresent_3.setPageContext(_jspx_page_context);
    _jspx_th_logic_messagesPresent_3.setParent(null);
    _jspx_th_logic_messagesPresent_3.setMessage("errors");
    _jspx_th_logic_messagesPresent_3.setProperty("incorrectSize");
    int _jspx_eval_logic_messagesPresent_3 = _jspx_th_logic_messagesPresent_3.doStartTag();
    if (_jspx_eval_logic_messagesPresent_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t<p class=\"clear error\">the file size does not exceeded 10MB.</p>\n\t");
        int evalDoAfterBody = _jspx_th_logic_messagesPresent_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_messagesPresent_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_3);
      return true;
    }
    _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_3);
    return false;
  }

  private boolean _jspx_meth_logic_messagesPresent_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:messagesPresent
    org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_4 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent_property_message.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
    _jspx_th_logic_messagesPresent_4.setPageContext(_jspx_page_context);
    _jspx_th_logic_messagesPresent_4.setParent(null);
    _jspx_th_logic_messagesPresent_4.setMessage("errors");
    _jspx_th_logic_messagesPresent_4.setProperty("uploadFailed");
    int _jspx_eval_logic_messagesPresent_4 = _jspx_th_logic_messagesPresent_4.doStartTag();
    if (_jspx_eval_logic_messagesPresent_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t<p class=\"clear error\">Upload failed.</p>\n\t");
        int evalDoAfterBody = _jspx_th_logic_messagesPresent_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_messagesPresent_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_4);
      return true;
    }
    _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_4);
    return false;
  }

  private boolean _jspx_meth_logic_messagesPresent_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:messagesPresent
    org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_5 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent_property_message.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
    _jspx_th_logic_messagesPresent_5.setPageContext(_jspx_page_context);
    _jspx_th_logic_messagesPresent_5.setParent(null);
    _jspx_th_logic_messagesPresent_5.setMessage("errors");
    _jspx_th_logic_messagesPresent_5.setProperty("updateFailed");
    int _jspx_eval_logic_messagesPresent_5 = _jspx_th_logic_messagesPresent_5.doStartTag();
    if (_jspx_eval_logic_messagesPresent_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t<p class=\"clear error\">Woups ! An internal error occured and the press wasn't updated.</p>\n\t");
        int evalDoAfterBody = _jspx_th_logic_messagesPresent_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_messagesPresent_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_5);
      return true;
    }
    _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_5);
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
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_0.setPageContext(_jspx_page_context);
    _jspx_th_html_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_0.setName("myAdminSearchPressForm");
    _jspx_th_html_select_0.setProperty("language");
    int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
    if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_0.doInitBody();
      }
      do {
        out.write("\n\t\t\t");
        if (_jspx_meth_html_optionsCollection_0(_jspx_th_html_select_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        out.write('	');
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

  private boolean _jspx_meth_html_optionsCollection_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:optionsCollection
    org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_optionsCollection_0 = (org.apache.struts.taglib.html.OptionsCollectionTag) _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
    _jspx_th_html_optionsCollection_0.setPageContext(_jspx_page_context);
    _jspx_th_html_optionsCollection_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
    _jspx_th_html_optionsCollection_0.setName("myAdminSearchPressForm");
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

  private boolean _jspx_meth_html_select_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_1 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_1.setPageContext(_jspx_page_context);
    _jspx_th_html_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_1.setProperty("productPress");
    int _jspx_eval_html_select_1 = _jspx_th_html_select_1.doStartTag();
    if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_1.doInitBody();
      }
      do {
        out.write('\n');
        out.write('	');
        out.write('	');
        if (_jspx_meth_html_options_0(_jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write(' ');
        out.write('\n');
        out.write('	');
        int evalDoAfterBody = _jspx_th_html_select_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_1);
      return true;
    }
    _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_1);
    return false;
  }

  private boolean _jspx_meth_html_options_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_0 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_property_labelProperty_collection_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_options_0.setPageContext(_jspx_page_context);
    _jspx_th_html_options_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
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

  private boolean _jspx_meth_logic_empty_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:empty
    org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_0 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
    _jspx_th_logic_empty_0.setPageContext(_jspx_page_context);
    _jspx_th_logic_empty_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
    _jspx_th_logic_empty_0.setName("myAdminSearchPressForm");
    _jspx_th_logic_empty_0.setProperty("pressList");
    int _jspx_eval_logic_empty_0 = _jspx_th_logic_empty_0.doStartTag();
    if (_jspx_eval_logic_empty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t\t<fieldset><legend class=\"clear error\">ごめんなさい。。(￣▽￣;)</legend>\n\t\t\t\t<p class=\"error\">No match...♪</p>\n\t\t\t</fieldset>\n\t\t");
        int evalDoAfterBody = _jspx_th_logic_empty_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_empty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_0);
      return true;
    }
    _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_0);
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
    _jspx_th_html_hidden_1.setStyleId("dispatchConfigUpdate");
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
    _jspx_th_html_select_2.setName("myAdminSearchPressForm");
    _jspx_th_html_select_2.setProperty("language");
    int _jspx_eval_html_select_2 = _jspx_th_html_select_2.doStartTag();
    if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_2.doInitBody();
      }
      do {
        out.write("\n\t\t\t\t\t");
        if (_jspx_meth_html_optionsCollection_1(_jspx_th_html_select_2, _jspx_page_context))
          return true;
        out.write("\n\t\t\t\t");
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
    _jspx_th_html_optionsCollection_1.setName("myAdminSearchPressForm");
    _jspx_th_html_optionsCollection_1.setProperty("langList");
    _jspx_th_html_optionsCollection_1.setLabel("name");
    _jspx_th_html_optionsCollection_1.setValue("iso_code");
    int _jspx_eval_html_optionsCollection_1 = _jspx_th_html_optionsCollection_1.doStartTag();
    if (_jspx_th_html_optionsCollection_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_1);
      return true;
    }
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_1);
    return false;
  }

  private boolean _jspx_meth_html_select_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_3 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_3.setPageContext(_jspx_page_context);
    _jspx_th_html_select_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_select_3.setName("myAdminSearchPressForm");
    _jspx_th_html_select_3.setProperty("productPress");
    int _jspx_eval_html_select_3 = _jspx_th_html_select_3.doStartTag();
    if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_3.doInitBody();
      }
      do {
        out.write("\n\t\t\t\t\t");
        if (_jspx_meth_html_options_1(_jspx_th_html_select_3, _jspx_page_context))
          return true;
        out.write(" \n\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_select_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_select_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_select_property_name.reuse(_jspx_th_html_select_3);
      return true;
    }
    _jspx_tagPool_html_select_property_name.reuse(_jspx_th_html_select_3);
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
    _jspx_th_html_options_1.setCollection("names");
    _jspx_th_html_options_1.setProperty("value");
    _jspx_th_html_options_1.setLabelProperty("label");
    int _jspx_eval_html_options_1 = _jspx_th_html_options_1.doStartTag();
    if (_jspx_th_html_options_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_options_property_labelProperty_collection_nobody.reuse(_jspx_th_html_options_1);
      return true;
    }
    _jspx_tagPool_html_options_property_labelProperty_collection_nobody.reuse(_jspx_th_html_options_1);
    return false;
  }

  private boolean _jspx_meth_html_file_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:file
    org.apache.struts.taglib.html.FileTag _jspx_th_html_file_0 = (org.apache.struts.taglib.html.FileTag) _jspx_tagPool_html_file_property_nobody.get(org.apache.struts.taglib.html.FileTag.class);
    _jspx_th_html_file_0.setPageContext(_jspx_page_context);
    _jspx_th_html_file_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_file_0.setProperty("imageFile");
    int _jspx_eval_html_file_0 = _jspx_th_html_file_0.doStartTag();
    if (_jspx_th_html_file_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_file_property_nobody.reuse(_jspx_th_html_file_0);
      return true;
    }
    _jspx_tagPool_html_file_property_nobody.reuse(_jspx_th_html_file_0);
    return false;
  }

  private boolean _jspx_meth_html_submit_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_1 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_value_styleClass_property_onclick_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_1.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_submit_1.setProperty("submit");
    _jspx_th_html_submit_1.setStyleClass("update");
    _jspx_th_html_submit_1.setValue("update");
    _jspx_th_html_submit_1.setOnclick("goDispatch('update', 'dispatchConfigUpdate')");
    int _jspx_eval_html_submit_1 = _jspx_th_html_submit_1.doStartTag();
    if (_jspx_th_html_submit_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_value_styleClass_property_onclick_nobody.reuse(_jspx_th_html_submit_1);
      return true;
    }
    _jspx_tagPool_html_submit_value_styleClass_property_onclick_nobody.reuse(_jspx_th_html_submit_1);
    return false;
  }

  private boolean _jspx_meth_html_hidden_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_3 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_styleId_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_3.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_html_hidden_3.setStyleId("dispatchConfigDelete");
    _jspx_th_html_hidden_3.setProperty("dispatch");
    int _jspx_eval_html_hidden_3 = _jspx_th_html_hidden_3.doStartTag();
    if (_jspx_th_html_hidden_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_3);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_3);
    return false;
  }

  private boolean _jspx_meth_html_submit_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_2 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_value_styleClass_property_onclick_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_2.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_html_submit_2.setProperty("submit");
    _jspx_th_html_submit_2.setStyleClass("back");
    _jspx_th_html_submit_2.setValue("delete");
    _jspx_th_html_submit_2.setOnclick("goDispatch('delete', 'dispatchConfigDelete')");
    int _jspx_eval_html_submit_2 = _jspx_th_html_submit_2.doStartTag();
    if (_jspx_th_html_submit_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_value_styleClass_property_onclick_nobody.reuse(_jspx_th_html_submit_2);
      return true;
    }
    _jspx_tagPool_html_submit_value_styleClass_property_onclick_nobody.reuse(_jspx_th_html_submit_2);
    return false;
  }

  private boolean _jspx_meth_logic_messagesPresent_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:messagesPresent
    org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_6 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent_property_message.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
    _jspx_th_logic_messagesPresent_6.setPageContext(_jspx_page_context);
    _jspx_th_logic_messagesPresent_6.setParent(null);
    _jspx_th_logic_messagesPresent_6.setMessage("errors");
    _jspx_th_logic_messagesPresent_6.setProperty("updateSucceeded");
    int _jspx_eval_logic_messagesPresent_6 = _jspx_th_logic_messagesPresent_6.doStartTag();
    if (_jspx_eval_logic_messagesPresent_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t<p style=\"color:green; font-weight:bold;\">The Press was updated \\(^o^)/</p>\n\t");
        int evalDoAfterBody = _jspx_th_logic_messagesPresent_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_messagesPresent_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_6);
      return true;
    }
    _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_6);
    return false;
  }
}
