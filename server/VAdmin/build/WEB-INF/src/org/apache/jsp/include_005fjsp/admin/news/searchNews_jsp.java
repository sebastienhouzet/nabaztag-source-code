package org.apache.jsp.include_005fjsp.admin.news;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class searchNews_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 response.setContentType("text/html;charset=UTF-8"); 
      out.write("\n\n\n\n\n");
      out.write("\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n<title>Admin</title>\r\n<link href=\"../include_jsp/admin/css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<body>\r\n");
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
      out.write('\n');
      out.write('	');
      if (_jspx_meth_logic_messagesPresent_6(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');
      if (_jspx_meth_logic_messagesPresent_7(_jspx_page_context))
        return;
      out.write("\n\t\n\t\n\t<fieldset><legend>Search News</legend>\n\t\t<label><strong>Search news by product and lang</strong></label> \n\t\n\t\t<!-- languages and products combobox -->\n\t\t");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_styleClass_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("/action/adminSearchNews");
      _jspx_th_html_form_0.setStyleId("SearchLangByType");
      _jspx_th_html_form_0.setStyleClass("srvConfigForm");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n\t\t\t");
          if (_jspx_meth_html_hidden_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n\t\t\n\t\t\t<label>Language :</label>\n\t\t\t");
          if (_jspx_meth_html_select_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n\t\t\n\t\t\t<label>Product :</label>\n\t\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_bean_define_0.setId("names");
          _jspx_th_bean_define_0.setName("myAdminSearchNewsForm");
          _jspx_th_bean_define_0.setProperty("namesList");
          int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
          if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
          java.lang.Object names = null;
          names = (java.lang.Object) _jspx_page_context.findAttribute("names");
          out.write("\n\t\t\t");
          if (_jspx_meth_html_select_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n\t\n\t\t\t");
          if (_jspx_meth_html_submit_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write('\n');
          out.write('	');
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
      out.write("\n\t</fieldset>\n\n\t<!--NEWS -->\n\t");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_0 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_equal_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_equal_0.setParent(null);
      _jspx_th_logic_equal_0.setName("myAdminSearchNewsForm");
      _jspx_th_logic_equal_0.setProperty("display");
      _jspx_th_logic_equal_0.setValue("displayNews");
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
          _jspx_th_logic_notEmpty_0.setName("myAdminSearchNewsForm");
          _jspx_th_logic_notEmpty_0.setProperty("newsList");
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
              _jspx_th_bean_define_1.setName("myAdminSearchNewsForm");
              _jspx_th_bean_define_1.setProperty("product");
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
              _jspx_th_bean_define_2.setName("myAdminSearchNewsForm");
              _jspx_th_bean_define_2.setProperty("language");
              int _jspx_eval_bean_define_2 = _jspx_th_bean_define_2.doStartTag();
              if (_jspx_th_bean_define_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_2);
                return;
              }
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_2);
              java.lang.Object theLanguage = null;
              theLanguage = (java.lang.Object) _jspx_page_context.findAttribute("theLanguage");
              out.write("\n\t\t\t<div class=\"results\">\n\t\t\t\t<table>\n\t\t\t\t\t<thead>\n\t\t\t\t\t\t<tr>\n\t\t\t\t\t\t\t<th>News Title</th>\n\t\t\t\t\t\t\t<th>News abstract</th>\n\t\t\t\t\t\t\t<th>News intro</th>\n\t\t\t\t\t\t\t<th>News body</th>\n\t\t\t\t\t\t\t<th>News date publication</th>\n\t\t\t\t\t\t\t<th>News date expiration</th>\n\t\t\t\t\t\t\t<th>Edit</th>\n\t\t\t\t\t\t\t<th>Delete</th>\n\t\t\t\t\t\t\t<th>News small image</th>\n\t\t\t\t\t\t</tr>\n\t\t\t\t\t</thead>\n\t\t\t\t\t<tbody>\n\t\t\t\t\t\t");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_property_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
              _jspx_th_logic_iterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
              _jspx_th_logic_iterate_0.setName("myAdminSearchNewsForm");
              _jspx_th_logic_iterate_0.setProperty("newsList");
              _jspx_th_logic_iterate_0.setId("theNews");
              int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
              if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object theNews = null;
                if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_iterate_0.doInitBody();
                }
                theNews = (java.lang.Object) _jspx_page_context.findAttribute("theNews");
                do {
                  out.write("\n\t\t\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_3 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_3.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
                  _jspx_th_bean_define_3.setId("idNews");
                  _jspx_th_bean_define_3.setName("theNews");
                  _jspx_th_bean_define_3.setProperty("id");
                  int _jspx_eval_bean_define_3 = _jspx_th_bean_define_3.doStartTag();
                  if (_jspx_th_bean_define_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_3);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_3);
                  java.lang.Object idNews = null;
                  idNews = (java.lang.Object) _jspx_page_context.findAttribute("idNews");
                  out.write("\n\t\t\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_4 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_4.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
                  _jspx_th_bean_define_4.setId("titleNews");
                  _jspx_th_bean_define_4.setName("theNews");
                  _jspx_th_bean_define_4.setProperty("title");
                  int _jspx_eval_bean_define_4 = _jspx_th_bean_define_4.doStartTag();
                  if (_jspx_th_bean_define_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_4);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_4);
                  java.lang.Object titleNews = null;
                  titleNews = (java.lang.Object) _jspx_page_context.findAttribute("titleNews");
                  out.write("\n\t\t\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_5 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_5.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
                  _jspx_th_bean_define_5.setId("abstractNews");
                  _jspx_th_bean_define_5.setName("theNews");
                  _jspx_th_bean_define_5.setProperty("newsabstract");
                  int _jspx_eval_bean_define_5 = _jspx_th_bean_define_5.doStartTag();
                  if (_jspx_th_bean_define_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_5);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_5);
                  java.lang.Object abstractNews = null;
                  abstractNews = (java.lang.Object) _jspx_page_context.findAttribute("abstractNews");
                  out.write("\n\t\t\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_6 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_6.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
                  _jspx_th_bean_define_6.setId("introNews");
                  _jspx_th_bean_define_6.setName("theNews");
                  _jspx_th_bean_define_6.setProperty("intro");
                  int _jspx_eval_bean_define_6 = _jspx_th_bean_define_6.doStartTag();
                  if (_jspx_th_bean_define_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_6);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_6);
                  java.lang.Object introNews = null;
                  introNews = (java.lang.Object) _jspx_page_context.findAttribute("introNews");
                  out.write("\n\t\t\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_7 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_7.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
                  _jspx_th_bean_define_7.setId("bodyNews");
                  _jspx_th_bean_define_7.setName("theNews");
                  _jspx_th_bean_define_7.setProperty("body");
                  int _jspx_eval_bean_define_7 = _jspx_th_bean_define_7.doStartTag();
                  if (_jspx_th_bean_define_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_7);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_7);
                  java.lang.Object bodyNews = null;
                  bodyNews = (java.lang.Object) _jspx_page_context.findAttribute("bodyNews");
                  out.write("\n\t\t\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_8 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_8.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
                  _jspx_th_bean_define_8.setId("datePubNews");
                  _jspx_th_bean_define_8.setName("theNews");
                  _jspx_th_bean_define_8.setProperty("date_pub");
                  int _jspx_eval_bean_define_8 = _jspx_th_bean_define_8.doStartTag();
                  if (_jspx_th_bean_define_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_8);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_8);
                  java.lang.Object datePubNews = null;
                  datePubNews = (java.lang.Object) _jspx_page_context.findAttribute("datePubNews");
                  out.write("\n\t\t\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_9 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_9.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
                  _jspx_th_bean_define_9.setId("dateExpNews");
                  _jspx_th_bean_define_9.setName("theNews");
                  _jspx_th_bean_define_9.setProperty("date_exp");
                  int _jspx_eval_bean_define_9 = _jspx_th_bean_define_9.doStartTag();
                  if (_jspx_th_bean_define_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_9);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_9);
                  java.lang.Object dateExpNews = null;
                  dateExpNews = (java.lang.Object) _jspx_page_context.findAttribute("dateExpNews");
                  out.write("\n\t\t\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_10 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_10.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
                  _jspx_th_bean_define_10.setId("smallImage");
                  _jspx_th_bean_define_10.setName("theNews");
                  _jspx_th_bean_define_10.setProperty("picture_small");
                  int _jspx_eval_bean_define_10 = _jspx_th_bean_define_10.doStartTag();
                  if (_jspx_th_bean_define_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_10);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_10);
                  java.lang.Object smallImage = null;
                  smallImage = (java.lang.Object) _jspx_page_context.findAttribute("smallImage");
                  out.write("\n\t\t\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_11 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_11.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
                  _jspx_th_bean_define_11.setId("smallPath");
                  _jspx_th_bean_define_11.setName("theNews");
                  _jspx_th_bean_define_11.setProperty("picture_smallURL");
                  int _jspx_eval_bean_define_11 = _jspx_th_bean_define_11.doStartTag();
                  if (_jspx_th_bean_define_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_11);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_11);
                  java.lang.Object smallPath = null;
                  smallPath = (java.lang.Object) _jspx_page_context.findAttribute("smallPath");
                  out.write("\n\t\t\t\t\t\t\t\n\t\t\t\t\t\t\t<tr>\n\t\t\t\t\t\t\t\t<td>");
                  out.print(titleNews);
                  out.write("</td>\n\t\t\t\t\t\t\t\t<td>");
                  out.print(abstractNews);
                  out.write("</td>\n\t\t\t\t\t\t\t\t<td>");
                  out.print(introNews);
                  out.write("</td>\n\t\t\t\t\t\t\t\t<td>");
                  out.print(bodyNews);
                  out.write("</td>\n\t\t\t\t\t\t\t\t<td>");
                  out.print(datePubNews);
                  out.write("</td>\n\t\t\t\t\t\t\t\t<td>");
                  out.print(dateExpNews);
                  out.write("</td>\n\t\t\t\t\t\t\t\t<td><a href=\"adminSearchNews.do?dispatch=displayInfo&idNews=");
                  out.print(idNews);
                  out.write("&product=");
                  out.print(nameProduct);
                  out.write("&language=");
                  out.print(theLanguage);
                  out.write("\">View/Modify</a></td>\n\t\t\t\t\t\t\t\t<td><a href=\"adminSearchNews.do?dispatch=delete&idNews=");
                  out.print(idNews);
                  out.write("&product=");
                  out.print(nameProduct);
                  out.write("&language=");
                  out.print(theLanguage);
                  out.write("\">Delete</a></td>\n\t\t\t\t\t\t\t    <td><a href=\"");
                  out.print(smallPath);
                  out.write("\"><img src=\"");
                  out.print(smallPath);
                  out.write("\" alt=\"");
                  out.print(smallImage);
                  out.write("\" class=\"picture\"/></a></td>\n\t\t\t\t\t\t\t</tr>\n\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
                  theNews = (java.lang.Object) _jspx_page_context.findAttribute("theNews");
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
          //  logic:empty
          org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_0 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
          _jspx_th_logic_empty_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_empty_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
          _jspx_th_logic_empty_0.setName("myAdminSearchNewsForm");
          _jspx_th_logic_empty_0.setProperty("newsList");
          int _jspx_eval_logic_empty_0 = _jspx_th_logic_empty_0.doStartTag();
          if (_jspx_eval_logic_empty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n\t\t\t");
              if (_jspx_meth_logic_messagesPresent_8(_jspx_th_logic_empty_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t");
              if (_jspx_meth_logic_messagesPresent_9(_jspx_th_logic_empty_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t");
              if (_jspx_meth_logic_messagesPresent_10(_jspx_th_logic_empty_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t");
              //  logic:messagesPresent
              org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_11 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent_property_message.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
              _jspx_th_logic_messagesPresent_11.setPageContext(_jspx_page_context);
              _jspx_th_logic_messagesPresent_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_0);
              _jspx_th_logic_messagesPresent_11.setMessage("errors");
              _jspx_th_logic_messagesPresent_11.setProperty("noSuchProduct");
              int _jspx_eval_logic_messagesPresent_11 = _jspx_th_logic_messagesPresent_11.doStartTag();
              if (_jspx_eval_logic_messagesPresent_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n\t\t\t\t<fieldset><legend class=\"clear error\">noSuchProduct :-(</legend>\n\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_12 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_12.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_messagesPresent_11);
                  _jspx_th_bean_define_12.setId("product");
                  _jspx_th_bean_define_12.setName("myAdminSearchNewsForm");
                  _jspx_th_bean_define_12.setProperty("product");
                  int _jspx_eval_bean_define_12 = _jspx_th_bean_define_12.doStartTag();
                  if (_jspx_th_bean_define_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_12);
                    return;
                  }
                  _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_12);
                  java.lang.Object product = null;
                  product = (java.lang.Object) _jspx_page_context.findAttribute("product");
                  out.write("\n\t\t\t\t\t<p class=\"error\">");
                  out.print(product );
                  out.write(" noSuchProduct...♪♪♪♪♪</p>\n\t\t\t\t</fieldset>\n\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_messagesPresent_11.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_messagesPresent_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_11);
                return;
              }
              _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_11);
              out.write("\n\t\t\t<fieldset><legend class=\"clear error\">ごめんなさい。。(￣▽￣;)</legend>\n\t\t\t\t\t<p class=\"error\">No match...♪</p>\n\t\t\t</fieldset>\n\t\t");
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
      out.write("\n\n\t<!--INFO NEWS -->\n\t");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_1 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_equal_1.setPageContext(_jspx_page_context);
      _jspx_th_logic_equal_1.setParent(null);
      _jspx_th_logic_equal_1.setName("myAdminSearchNewsForm");
      _jspx_th_logic_equal_1.setProperty("display");
      _jspx_th_logic_equal_1.setValue("infoNews");
      int _jspx_eval_logic_equal_1 = _jspx_th_logic_equal_1.doStartTag();
      if (_jspx_eval_logic_equal_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_13 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_13.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_13.setId("nameProduct");
          _jspx_th_bean_define_13.setName("myAdminSearchNewsForm");
          _jspx_th_bean_define_13.setProperty("product");
          int _jspx_eval_bean_define_13 = _jspx_th_bean_define_13.doStartTag();
          if (_jspx_th_bean_define_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_13);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_13);
          java.lang.Object nameProduct = null;
          nameProduct = (java.lang.Object) _jspx_page_context.findAttribute("nameProduct");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_14 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_14.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_14.setId("theLanguage");
          _jspx_th_bean_define_14.setName("myAdminSearchNewsForm");
          _jspx_th_bean_define_14.setProperty("language");
          int _jspx_eval_bean_define_14 = _jspx_th_bean_define_14.doStartTag();
          if (_jspx_th_bean_define_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_14);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_14);
          java.lang.Object theLanguage = null;
          theLanguage = (java.lang.Object) _jspx_page_context.findAttribute("theLanguage");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_15 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_15.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_15.setId("theNews");
          _jspx_th_bean_define_15.setName("myAdminSearchNewsForm");
          _jspx_th_bean_define_15.setProperty("theNewsData");
          int _jspx_eval_bean_define_15 = _jspx_th_bean_define_15.doStartTag();
          if (_jspx_th_bean_define_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_15);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_15);
          java.lang.Object theNews = null;
          theNews = (java.lang.Object) _jspx_page_context.findAttribute("theNews");
          out.write("\n\t\t\n\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_16 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_16.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_16.setId("idNews");
          _jspx_th_bean_define_16.setName("theNews");
          _jspx_th_bean_define_16.setProperty("id");
          int _jspx_eval_bean_define_16 = _jspx_th_bean_define_16.doStartTag();
          if (_jspx_th_bean_define_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_16);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_16);
          java.lang.Object idNews = null;
          idNews = (java.lang.Object) _jspx_page_context.findAttribute("idNews");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_17 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_17.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_17.setId("titleNews");
          _jspx_th_bean_define_17.setName("theNews");
          _jspx_th_bean_define_17.setProperty("title");
          int _jspx_eval_bean_define_17 = _jspx_th_bean_define_17.doStartTag();
          if (_jspx_th_bean_define_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_17);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_17);
          java.lang.Object titleNews = null;
          titleNews = (java.lang.Object) _jspx_page_context.findAttribute("titleNews");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_18 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_18.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_18.setId("abstractNews");
          _jspx_th_bean_define_18.setName("theNews");
          _jspx_th_bean_define_18.setProperty("newsabstract");
          int _jspx_eval_bean_define_18 = _jspx_th_bean_define_18.doStartTag();
          if (_jspx_th_bean_define_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_18);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_18);
          java.lang.Object abstractNews = null;
          abstractNews = (java.lang.Object) _jspx_page_context.findAttribute("abstractNews");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_19 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_19.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_19.setId("introNews");
          _jspx_th_bean_define_19.setName("theNews");
          _jspx_th_bean_define_19.setProperty("intro");
          int _jspx_eval_bean_define_19 = _jspx_th_bean_define_19.doStartTag();
          if (_jspx_th_bean_define_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_19);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_19);
          java.lang.Object introNews = null;
          introNews = (java.lang.Object) _jspx_page_context.findAttribute("introNews");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_20 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_20.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_20.setId("bodyNews");
          _jspx_th_bean_define_20.setName("theNews");
          _jspx_th_bean_define_20.setProperty("body");
          int _jspx_eval_bean_define_20 = _jspx_th_bean_define_20.doStartTag();
          if (_jspx_th_bean_define_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_20);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_20);
          java.lang.Object bodyNews = null;
          bodyNews = (java.lang.Object) _jspx_page_context.findAttribute("bodyNews");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_21 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_21.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_21.setId("pubYear");
          _jspx_th_bean_define_21.setName("theNews");
          _jspx_th_bean_define_21.setProperty("pubYear");
          int _jspx_eval_bean_define_21 = _jspx_th_bean_define_21.doStartTag();
          if (_jspx_th_bean_define_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_21);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_21);
          java.lang.Object pubYear = null;
          pubYear = (java.lang.Object) _jspx_page_context.findAttribute("pubYear");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_22 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_22.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_22.setId("pubMonth");
          _jspx_th_bean_define_22.setName("theNews");
          _jspx_th_bean_define_22.setProperty("pubMonth");
          int _jspx_eval_bean_define_22 = _jspx_th_bean_define_22.doStartTag();
          if (_jspx_th_bean_define_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_22);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_22);
          java.lang.Object pubMonth = null;
          pubMonth = (java.lang.Object) _jspx_page_context.findAttribute("pubMonth");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_23 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_23.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_23.setId("pubDay");
          _jspx_th_bean_define_23.setName("theNews");
          _jspx_th_bean_define_23.setProperty("pubMonth");
          int _jspx_eval_bean_define_23 = _jspx_th_bean_define_23.doStartTag();
          if (_jspx_th_bean_define_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_23);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_23);
          java.lang.Object pubDay = null;
          pubDay = (java.lang.Object) _jspx_page_context.findAttribute("pubDay");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_24 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_24.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_24.setId("expYear");
          _jspx_th_bean_define_24.setName("theNews");
          _jspx_th_bean_define_24.setProperty("expYear");
          int _jspx_eval_bean_define_24 = _jspx_th_bean_define_24.doStartTag();
          if (_jspx_th_bean_define_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_24);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_24);
          java.lang.Object expYear = null;
          expYear = (java.lang.Object) _jspx_page_context.findAttribute("expYear");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_25 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_25.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_25.setId("expMonth");
          _jspx_th_bean_define_25.setName("theNews");
          _jspx_th_bean_define_25.setProperty("expMonth");
          int _jspx_eval_bean_define_25 = _jspx_th_bean_define_25.doStartTag();
          if (_jspx_th_bean_define_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_25);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_25);
          java.lang.Object expMonth = null;
          expMonth = (java.lang.Object) _jspx_page_context.findAttribute("expMonth");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_26 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_26.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_26.setId("expDay");
          _jspx_th_bean_define_26.setName("theNews");
          _jspx_th_bean_define_26.setProperty("expDay");
          int _jspx_eval_bean_define_26 = _jspx_th_bean_define_26.doStartTag();
          if (_jspx_th_bean_define_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_26);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_26);
          java.lang.Object expDay = null;
          expDay = (java.lang.Object) _jspx_page_context.findAttribute("expDay");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_27 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_27.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_27.setId("langNews");
          _jspx_th_bean_define_27.setName("theNews");
          _jspx_th_bean_define_27.setProperty("lang");
          int _jspx_eval_bean_define_27 = _jspx_th_bean_define_27.doStartTag();
          if (_jspx_th_bean_define_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_27);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_27);
          java.lang.Object langNews = null;
          langNews = (java.lang.Object) _jspx_page_context.findAttribute("langNews");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_28 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_28.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_28.setId("productNews");
          _jspx_th_bean_define_28.setName("theNews");
          _jspx_th_bean_define_28.setProperty("product");
          int _jspx_eval_bean_define_28 = _jspx_th_bean_define_28.doStartTag();
          if (_jspx_th_bean_define_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_28);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_28);
          java.lang.Object productNews = null;
          productNews = (java.lang.Object) _jspx_page_context.findAttribute("productNews");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_29 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_29.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_29.setId("smallPictureNews");
          _jspx_th_bean_define_29.setName("theNews");
          _jspx_th_bean_define_29.setProperty("picture_small");
          int _jspx_eval_bean_define_29 = _jspx_th_bean_define_29.doStartTag();
          if (_jspx_th_bean_define_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_29);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_29);
          java.lang.Object smallPictureNews = null;
          smallPictureNews = (java.lang.Object) _jspx_page_context.findAttribute("smallPictureNews");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_30 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_30.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_30.setId("smallPath");
          _jspx_th_bean_define_30.setName("theNews");
          _jspx_th_bean_define_30.setProperty("picture_smallURL");
          int _jspx_eval_bean_define_30 = _jspx_th_bean_define_30.doStartTag();
          if (_jspx_th_bean_define_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_30);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_30);
          java.lang.Object smallPath = null;
          smallPath = (java.lang.Object) _jspx_page_context.findAttribute("smallPath");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_31 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_31.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_31.setId("bigPictureNews");
          _jspx_th_bean_define_31.setName("theNews");
          _jspx_th_bean_define_31.setProperty("picture_big");
          int _jspx_eval_bean_define_31 = _jspx_th_bean_define_31.doStartTag();
          if (_jspx_th_bean_define_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_31);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_31);
          java.lang.Object bigPictureNews = null;
          bigPictureNews = (java.lang.Object) _jspx_page_context.findAttribute("bigPictureNews");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_32 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_32.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_bean_define_32.setId("bigPath");
          _jspx_th_bean_define_32.setName("theNews");
          _jspx_th_bean_define_32.setProperty("picture_bigURL");
          int _jspx_eval_bean_define_32 = _jspx_th_bean_define_32.doStartTag();
          if (_jspx_th_bean_define_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_32);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_32);
          java.lang.Object bigPath = null;
          bigPath = (java.lang.Object) _jspx_page_context.findAttribute("bigPath");
          out.write("\n\t\t\n\t\t");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_form_1 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_styleClass_enctype_action.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_form_1.setPageContext(_jspx_page_context);
          _jspx_th_html_form_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_1);
          _jspx_th_html_form_1.setAction("/action/adminSearchNews");
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
              _jspx_th_html_hidden_2.setProperty("idNews");
              _jspx_th_html_hidden_2.setValue(idNews.toString());
              int _jspx_eval_html_hidden_2 = _jspx_th_html_hidden_2.doStartTag();
              if (_jspx_th_html_hidden_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_2);
                return;
              }
              _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_2);
              out.write("\t\n\t\t\t<fieldset><legend>Update News</legend>\n\t\t\t\t\n\t\t\t\t<label>News title :</label>\n\t\t\t\t<input type=\"text\" id=\"newsTitle\" name=\"title\" value=\"");
              out.print(titleNews.toString());
              out.write("\"/>\t\n\t\t\t\t<br />\n\t\t\t\n\t\t\t\t<label>News language :</label>\n\t\t\t\t");
              if (_jspx_meth_html_select_2(_jspx_th_html_form_1, _jspx_page_context))
                return;
              out.write("\n\t\t\t\n\t\t\t\t<label>News product :</label>\n\t\t\t\t");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_33 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_33.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
              _jspx_th_bean_define_33.setId("names");
              _jspx_th_bean_define_33.setName("myAdminSearchNewsForm");
              _jspx_th_bean_define_33.setProperty("namesList");
              int _jspx_eval_bean_define_33 = _jspx_th_bean_define_33.doStartTag();
              if (_jspx_th_bean_define_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_33);
                return;
              }
              _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_33);
              java.lang.Object names = null;
              names = (java.lang.Object) _jspx_page_context.findAttribute("names");
              out.write("\n\t\t\t\t");
              if (_jspx_meth_html_select_3(_jspx_th_html_form_1, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t<br />\n\t\t\t\t\n\t\t\t\t<label>News Abstract :</label>\n\t\t\t\t<textarea rows=\"5\" cols=\"50\" name=\"summary\" >");
              out.print(abstractNews);
              out.write("</textarea>\n\t\t\t\t<br />\n\t\t\t\t\n\t\t\t\t<label>News Intro :</label>\n\t\t\t\t<input type=\"text\" id=\"newsIntro\" name=\"intro\" value=\"");
              out.print(introNews);
              out.write("\"/>\t\n\t\t\t\t<br />\n\t\t\t\t\n\t\t\t\t<label>News Body :</label>\n\t\t\t\t\t<textarea rows=\"5\" cols=\"50\" name=\"body\">");
              out.print(bodyNews);
              out.write("</textarea>\n\t\t\t\t<br /><br />\n\t\t\t\t\n\t\t\t\t<label>News Publication Date :&nbsp;</label>\n\t\t\t\t<input type=\"text\" id=\"newsPubYear\" name=\"pubYear\" value=\"");
              out.print(pubYear );
              out.write("\" size=\"4\"/>\t\n\t\t\t\t<input type=\"text\" id=\"newsPubMonth\" name=\"pubMonth\" value=\"");
              out.print(pubMonth );
              out.write("\" size=\"2\" />\t\n\t\t\t\t<input type=\"text\" id=\"newsPubDay\" name=\"pubDay\" value=\"");
              out.print(pubDay );
              out.write("\" size=\"2\" />\t\n\t\t\t\t<br />\n\t\t\t\t<label>News Expiration Date :&nbsp;</label>\n\t\t\t\t<input type=\"text\" id=\"newsExpYear\" name=\"expYear\" value=\"");
              out.print(expYear );
              out.write("\" size=\"4\" />\t\n\t\t\t\t<input type=\"text\" id=\"newsExpMonth\" name=\"expMonth\" value=\"");
              out.print(expMonth );
              out.write("\" size=\"2\" />\t\n\t\t\t\t<input type=\"text\" id=\"newsExpDay\" name=\"expDay\" value=\"");
              out.print(expDay );
              out.write("\" size=\"2\" />\t\n\t\t\t\t<br /><br /><hr /><br />\n\t\t\t\t\n\t\t\t\t<label>Press Small Picture :</label>\n\t\t\t\t");
              if (_jspx_meth_html_file_0(_jspx_th_html_form_1, _jspx_page_context))
                return;
              out.write("&nbsp;\n\t\t\t\t<a href=\"");
              out.print(smallPath);
              out.write("\"><img src=\"");
              out.print(smallPath);
              out.write("\" alt=\"");
              out.print(smallPictureNews);
              out.write("\" class=\"picture\"/></a>\n\t\t\t\t<br />\n\t\t\t\t\n\t\t\t\t<label>Press Big Picture :</label>\n\t\t\t\t");
              if (_jspx_meth_html_file_1(_jspx_th_html_form_1, _jspx_page_context))
                return;
              out.write("&nbsp; \n\t\t\t\t<a href=\"");
              out.print(bigPath);
              out.write("\"><img src=\"");
              out.print(bigPath);
              out.write("\" alt=\"");
              out.print(bigPictureNews);
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
          _jspx_th_html_form_2.setAction("/action/adminSearchNews");
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
              _jspx_th_html_hidden_4.setProperty("idNews");
              _jspx_th_html_hidden_4.setValue(idNews.toString());
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
      out.write('\n');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_logic_messagesPresent_12(_jspx_page_context))
        return;
      out.write("\n\n</div>\n<!-- FIN DIV CONTENT -->\n\n<script type=\"text/javascript\">\n\tfunction goDispatch(where, dispatchField){\n\t\tdocument.getElementById(dispatchField).value = where;\n\t}\n\n\tfunction confirmDeletion(){\n\t\tif (window.confirm('Do you really want to do that ?')) {\n\t\t\t\treturn true;\n\t\t}\n\t\treturn false;\n\t}\n</script>\n");
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
    _jspx_th_logic_messagesPresent_2.setProperty("emptyIntro");
    int _jspx_eval_logic_messagesPresent_2 = _jspx_th_logic_messagesPresent_2.doStartTag();
    if (_jspx_eval_logic_messagesPresent_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t<p class=\"clear error\">Please fill the intro.</p>\n\t");
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
    _jspx_th_logic_messagesPresent_3.setProperty("emptyBody");
    int _jspx_eval_logic_messagesPresent_3 = _jspx_th_logic_messagesPresent_3.doStartTag();
    if (_jspx_eval_logic_messagesPresent_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t<p class=\"clear error\">Please fill the body.</p>\n\t");
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
    _jspx_th_logic_messagesPresent_4.setProperty("invalidDatePub");
    int _jspx_eval_logic_messagesPresent_4 = _jspx_th_logic_messagesPresent_4.doStartTag();
    if (_jspx_eval_logic_messagesPresent_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t<strong>The publication date seems incorrect.</strong>\n\t");
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
    _jspx_th_logic_messagesPresent_5.setProperty("incorrectSize");
    int _jspx_eval_logic_messagesPresent_5 = _jspx_th_logic_messagesPresent_5.doStartTag();
    if (_jspx_eval_logic_messagesPresent_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t<p class=\"clear error\">the file size does not exceeded 10MB.</p>\n\t");
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

  private boolean _jspx_meth_logic_messagesPresent_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:messagesPresent
    org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_6 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent_property_message.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
    _jspx_th_logic_messagesPresent_6.setPageContext(_jspx_page_context);
    _jspx_th_logic_messagesPresent_6.setParent(null);
    _jspx_th_logic_messagesPresent_6.setMessage("errors");
    _jspx_th_logic_messagesPresent_6.setProperty("uploadFailed");
    int _jspx_eval_logic_messagesPresent_6 = _jspx_th_logic_messagesPresent_6.doStartTag();
    if (_jspx_eval_logic_messagesPresent_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t<p class=\"clear error\">Upload failed.</p>\n\t");
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

  private boolean _jspx_meth_logic_messagesPresent_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:messagesPresent
    org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_7 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent_property_message.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
    _jspx_th_logic_messagesPresent_7.setPageContext(_jspx_page_context);
    _jspx_th_logic_messagesPresent_7.setParent(null);
    _jspx_th_logic_messagesPresent_7.setMessage("errors");
    _jspx_th_logic_messagesPresent_7.setProperty("updateFailed");
    int _jspx_eval_logic_messagesPresent_7 = _jspx_th_logic_messagesPresent_7.doStartTag();
    if (_jspx_eval_logic_messagesPresent_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t<p class=\"clear error\">Woups ! An internal error occured and the press wasn't updated.</p>\n\t");
        int evalDoAfterBody = _jspx_th_logic_messagesPresent_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_messagesPresent_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_7);
      return true;
    }
    _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_7);
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
    _jspx_th_html_hidden_0.setStyleId("dispatchConfigNews");
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
    _jspx_th_html_select_0.setName("myAdminSearchNewsForm");
    _jspx_th_html_select_0.setProperty("language");
    int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
    if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_0.doInitBody();
      }
      do {
        out.write("\n\t\t\t\t");
        if (_jspx_meth_html_optionsCollection_0(_jspx_th_html_select_0, _jspx_page_context))
          return true;
        out.write("\n\t\t\t");
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
    _jspx_th_html_optionsCollection_0.setName("myAdminSearchNewsForm");
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
    _jspx_th_html_select_1.setProperty("product");
    int _jspx_eval_html_select_1 = _jspx_th_html_select_1.doStartTag();
    if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_1.doInitBody();
      }
      do {
        out.write("\n\t\t\t\t");
        if (_jspx_meth_html_options_0(_jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write(" \n\t\t\t");
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
    _jspx_th_html_submit_0.setOnclick("goDispatch('displayContent', 'dispatchConfigNews')");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_value_property_onclick_nobody.reuse(_jspx_th_html_submit_0);
      return true;
    }
    _jspx_tagPool_html_submit_value_property_onclick_nobody.reuse(_jspx_th_html_submit_0);
    return false;
  }

  private boolean _jspx_meth_logic_messagesPresent_8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:messagesPresent
    org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_8 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent_property_message.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
    _jspx_th_logic_messagesPresent_8.setPageContext(_jspx_page_context);
    _jspx_th_logic_messagesPresent_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_0);
    _jspx_th_logic_messagesPresent_8.setMessage("errors");
    _jspx_th_logic_messagesPresent_8.setProperty("invalidParam");
    int _jspx_eval_logic_messagesPresent_8 = _jspx_th_logic_messagesPresent_8.doStartTag();
    if (_jspx_eval_logic_messagesPresent_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t\t\t<fieldset><legend class=\"clear error\">invalidParam :-(</legend>\n\t\t\t\t\t<p class=\"error\">Language, Product...♪♪♪♪♪</p>\n\t\t\t\t</fieldset>\n\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_messagesPresent_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_messagesPresent_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_8);
      return true;
    }
    _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_8);
    return false;
  }

  private boolean _jspx_meth_logic_messagesPresent_9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:messagesPresent
    org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_9 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent_property_message.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
    _jspx_th_logic_messagesPresent_9.setPageContext(_jspx_page_context);
    _jspx_th_logic_messagesPresent_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_0);
    _jspx_th_logic_messagesPresent_9.setMessage("errors");
    _jspx_th_logic_messagesPresent_9.setProperty("APIException1");
    int _jspx_eval_logic_messagesPresent_9 = _jspx_th_logic_messagesPresent_9.doStartTag();
    if (_jspx_eval_logic_messagesPresent_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t\t\t<fieldset><legend class=\"clear error\">APIException1 :-(</legend>\n\t\t\t\t\t<p class=\"error\">???...♪♪♪♪♪</p>\n\t\t\t\t</fieldset>\n\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_messagesPresent_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_messagesPresent_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_9);
      return true;
    }
    _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_9);
    return false;
  }

  private boolean _jspx_meth_logic_messagesPresent_10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_empty_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:messagesPresent
    org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_10 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent_property_message.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
    _jspx_th_logic_messagesPresent_10.setPageContext(_jspx_page_context);
    _jspx_th_logic_messagesPresent_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_empty_0);
    _jspx_th_logic_messagesPresent_10.setMessage("errors");
    _jspx_th_logic_messagesPresent_10.setProperty("APIException2");
    int _jspx_eval_logic_messagesPresent_10 = _jspx_th_logic_messagesPresent_10.doStartTag();
    if (_jspx_eval_logic_messagesPresent_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t\t\t<fieldset><legend class=\"clear error\">APIException2 :-(</legend>\n\t\t\t\t\t<p class=\"error\">???...♪♪♪♪♪</p>\n\t\t\t\t</fieldset>\n\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_messagesPresent_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_messagesPresent_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_10);
      return true;
    }
    _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_10);
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
    _jspx_th_html_select_2.setName("myAdminSearchNewsForm");
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
    _jspx_th_html_optionsCollection_1.setName("myAdminSearchNewsForm");
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
    _jspx_th_html_select_3.setName("myAdminSearchNewsForm");
    _jspx_th_html_select_3.setProperty("product");
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
    _jspx_th_html_file_0.setProperty("smallImageFile");
    int _jspx_eval_html_file_0 = _jspx_th_html_file_0.doStartTag();
    if (_jspx_th_html_file_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_file_property_nobody.reuse(_jspx_th_html_file_0);
      return true;
    }
    _jspx_tagPool_html_file_property_nobody.reuse(_jspx_th_html_file_0);
    return false;
  }

  private boolean _jspx_meth_html_file_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:file
    org.apache.struts.taglib.html.FileTag _jspx_th_html_file_1 = (org.apache.struts.taglib.html.FileTag) _jspx_tagPool_html_file_property_nobody.get(org.apache.struts.taglib.html.FileTag.class);
    _jspx_th_html_file_1.setPageContext(_jspx_page_context);
    _jspx_th_html_file_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_file_1.setProperty("bigImageFile");
    int _jspx_eval_html_file_1 = _jspx_th_html_file_1.doStartTag();
    if (_jspx_th_html_file_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_file_property_nobody.reuse(_jspx_th_html_file_1);
      return true;
    }
    _jspx_tagPool_html_file_property_nobody.reuse(_jspx_th_html_file_1);
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

  private boolean _jspx_meth_logic_messagesPresent_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:messagesPresent
    org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_12 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent_property_message.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
    _jspx_th_logic_messagesPresent_12.setPageContext(_jspx_page_context);
    _jspx_th_logic_messagesPresent_12.setParent(null);
    _jspx_th_logic_messagesPresent_12.setMessage("errors");
    _jspx_th_logic_messagesPresent_12.setProperty("updateSucceeded");
    int _jspx_eval_logic_messagesPresent_12 = _jspx_th_logic_messagesPresent_12.doStartTag();
    if (_jspx_eval_logic_messagesPresent_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t<p style=\"color:green; font-weight:bold;\">The News was updated \\(^o^)/</p>\n\t");
        int evalDoAfterBody = _jspx_th_logic_messagesPresent_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_messagesPresent_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_12);
      return true;
    }
    _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_12);
    return false;
  }
}
