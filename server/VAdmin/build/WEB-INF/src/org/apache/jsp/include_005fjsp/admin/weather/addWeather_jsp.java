package org.apache.jsp.include_005fjsp.admin.weather;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addWeather_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_value_property_onclick_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_property_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_property_name;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_logic_messagesPresent_property_message = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleId_styleClass_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_styleId_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_value_property_onclick_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_property_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_logic_messagesPresent_property_message.release();
    _jspx_tagPool_html_form_styleId_styleClass_action.release();
    _jspx_tagPool_html_hidden_styleId_property_nobody.release();
    _jspx_tagPool_html_select_property.release();
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.release();
    _jspx_tagPool_html_submit_value_property_onclick_nobody.release();
    _jspx_tagPool_logic_notEmpty_property_name.release();
    _jspx_tagPool_bean_define_property_name_id_nobody.release();
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_html_select_property_name.release();
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
      out.write("\n \n \t<fieldset><legend>Add a new weather city</legend>\n\t\t<!-- Search by continent -->\n\t\t");
      if (_jspx_meth_html_form_0(_jspx_page_context))
        return;
      out.write("\n\t\t\n\t\t<!-- List of Countries -->\n\t\t");
      //  logic:notEmpty
      org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_0 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
      _jspx_th_logic_notEmpty_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_notEmpty_0.setParent(null);
      _jspx_th_logic_notEmpty_0.setName("myAdminAddWeatherForm");
      _jspx_th_logic_notEmpty_0.setProperty("countries");
      int _jspx_eval_logic_notEmpty_0 = _jspx_th_logic_notEmpty_0.doStartTag();
      if (_jspx_eval_logic_notEmpty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n\t\t\t\n\t\t\t");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
          _jspx_th_bean_define_0.setId("continent");
          _jspx_th_bean_define_0.setName("myAdminAddWeatherForm");
          _jspx_th_bean_define_0.setProperty("continent");
          int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
          if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
          java.lang.Object continent = null;
          continent = (java.lang.Object) _jspx_page_context.findAttribute("continent");
          out.write("\n\t\t\t");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_form_1 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_styleClass_action.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_form_1.setPageContext(_jspx_page_context);
          _jspx_th_html_form_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
          _jspx_th_html_form_1.setAction("/action/adminAddWeather");
          _jspx_th_html_form_1.setStyleId("SearchByCountries");
          _jspx_th_html_form_1.setStyleClass("srvConfigForm");
          int _jspx_eval_html_form_1 = _jspx_th_html_form_1.doStartTag();
          if (_jspx_eval_html_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n\t\t\t\t");
              if (_jspx_meth_html_hidden_1(_jspx_th_html_form_1, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_2 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_hidden_2.setPageContext(_jspx_page_context);
              _jspx_th_html_hidden_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
              _jspx_th_html_hidden_2.setProperty("continent");
              _jspx_th_html_hidden_2.setValue(continent.toString());
              int _jspx_eval_html_hidden_2 = _jspx_th_html_hidden_2.doStartTag();
              if (_jspx_th_html_hidden_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_2);
                return;
              }
              _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_2);
              out.write("\n\t\n\t\t\t\t<label>Countries :</label>\n\t\t\t\t");
              if (_jspx_meth_html_select_1(_jspx_th_html_form_1, _jspx_page_context))
                return;
              out.write("\n\t\t\n\t\t\t\t");
              if (_jspx_meth_html_submit_1(_jspx_th_html_form_1, _jspx_page_context))
                return;
              out.write("\n\t\t\t");
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
          out.write('\n');
          out.write('	');
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
      out.write("\n\n\t\t<!-- List of Cities -->\n\t\t");
      //  logic:notEmpty
      org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_1 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
      _jspx_th_logic_notEmpty_1.setPageContext(_jspx_page_context);
      _jspx_th_logic_notEmpty_1.setParent(null);
      _jspx_th_logic_notEmpty_1.setName("myAdminAddWeatherForm");
      _jspx_th_logic_notEmpty_1.setProperty("cities");
      int _jspx_eval_logic_notEmpty_1 = _jspx_th_logic_notEmpty_1.doStartTag();
      if (_jspx_eval_logic_notEmpty_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_1 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_1.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
          _jspx_th_bean_define_1.setId("continent");
          _jspx_th_bean_define_1.setName("myAdminAddWeatherForm");
          _jspx_th_bean_define_1.setProperty("continent");
          int _jspx_eval_bean_define_1 = _jspx_th_bean_define_1.doStartTag();
          if (_jspx_th_bean_define_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_1);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_1);
          java.lang.Object continent = null;
          continent = (java.lang.Object) _jspx_page_context.findAttribute("continent");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_2 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_2.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
          _jspx_th_bean_define_2.setId("country");
          _jspx_th_bean_define_2.setName("myAdminAddWeatherForm");
          _jspx_th_bean_define_2.setProperty("country");
          int _jspx_eval_bean_define_2 = _jspx_th_bean_define_2.doStartTag();
          if (_jspx_th_bean_define_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_2);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_2);
          java.lang.Object country = null;
          country = (java.lang.Object) _jspx_page_context.findAttribute("country");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_3 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_3.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
          _jspx_th_bean_define_3.setId("city");
          _jspx_th_bean_define_3.setName("myAdminAddWeatherForm");
          _jspx_th_bean_define_3.setProperty("city");
          int _jspx_eval_bean_define_3 = _jspx_th_bean_define_3.doStartTag();
          if (_jspx_th_bean_define_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_3);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_3);
          java.lang.Object city = null;
          city = (java.lang.Object) _jspx_page_context.findAttribute("city");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_4 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_4.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
          _jspx_th_bean_define_4.setId("newCity");
          _jspx_th_bean_define_4.setName("myAdminAddWeatherForm");
          _jspx_th_bean_define_4.setProperty("newCity");
          int _jspx_eval_bean_define_4 = _jspx_th_bean_define_4.doStartTag();
          if (_jspx_th_bean_define_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_4);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_4);
          java.lang.Object newCity = null;
          newCity = (java.lang.Object) _jspx_page_context.findAttribute("newCity");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_5 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_5.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
          _jspx_th_bean_define_5.setId("url");
          _jspx_th_bean_define_5.setName("myAdminAddWeatherForm");
          _jspx_th_bean_define_5.setProperty("url");
          int _jspx_eval_bean_define_5 = _jspx_th_bean_define_5.doStartTag();
          if (_jspx_th_bean_define_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_5);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_5);
          java.lang.Object url = null;
          url = (java.lang.Object) _jspx_page_context.findAttribute("url");
          out.write("\n\t\t\n\t\t");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_form_2 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_styleClass_action.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_form_2.setPageContext(_jspx_page_context);
          _jspx_th_html_form_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
          _jspx_th_html_form_2.setAction("/action/adminAddWeather");
          _jspx_th_html_form_2.setStyleId("SearchByCountries");
          _jspx_th_html_form_2.setStyleClass("srvConfigForm");
          int _jspx_eval_html_form_2 = _jspx_th_html_form_2.doStartTag();
          if (_jspx_eval_html_form_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n\t\t\t<fieldset><legend>Add a new city</legend>\n\t\t\t\t");
              if (_jspx_meth_html_hidden_3(_jspx_th_html_form_2, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_4 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_hidden_4.setPageContext(_jspx_page_context);
              _jspx_th_html_hidden_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
              _jspx_th_html_hidden_4.setProperty("continent");
              _jspx_th_html_hidden_4.setValue(continent.toString());
              int _jspx_eval_html_hidden_4 = _jspx_th_html_hidden_4.doStartTag();
              if (_jspx_th_html_hidden_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_4);
                return;
              }
              _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_4);
              out.write("\n\t\t\t\t");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_5 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_hidden_5.setPageContext(_jspx_page_context);
              _jspx_th_html_hidden_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
              _jspx_th_html_hidden_5.setProperty("country");
              _jspx_th_html_hidden_5.setValue(country.toString());
              int _jspx_eval_html_hidden_5 = _jspx_th_html_hidden_5.doStartTag();
              if (_jspx_th_html_hidden_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_5);
                return;
              }
              _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_5);
              out.write("\n\t\t\t\t\n\t\t\t\t<label>Weather City :</label>\n\t\t\t\t");
              if (_jspx_meth_html_select_2(_jspx_th_html_form_2, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t<strong>OR</strong>\n\t\t\t\t<input type=\"text\" id=\"newCity\" name=\"newCity\" value=\"");
              out.print(newCity);
              out.write("\" size=\"15\" title=\"The city musn't contains any accent.\"/>\n\t\t\t\t<em>Please don't put any accent and use english format.</em>\t\n\t\t\t\t<br />\n\t\t\t\t\n\t\t\t\t<label>City URL :</label>\n\t\t\t\t<input type=\"text\" id=\"urlWeather\" name=\"url\" value=\"");
              out.print(url );
              out.write("\" size=\"20\"/>\t\n\t\t\t\t<br />\n\t\t\t\t\n\t\t\t</fieldset>\n\t\t\t");
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
            _jspx_tagPool_html_form_styleId_styleClass_action.reuse(_jspx_th_html_form_2);
            return;
          }
          _jspx_tagPool_html_form_styleId_styleClass_action.reuse(_jspx_th_html_form_2);
          out.write('\n');
          out.write('	');
          out.write('	');
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
      out.write("\n\t</fieldset>\n\t\n\t");
      //  logic:messagesPresent
      org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_4 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent_property_message.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
      _jspx_th_logic_messagesPresent_4.setPageContext(_jspx_page_context);
      _jspx_th_logic_messagesPresent_4.setParent(null);
      _jspx_th_logic_messagesPresent_4.setMessage("errors");
      _jspx_th_logic_messagesPresent_4.setProperty("success");
      int _jspx_eval_logic_messagesPresent_4 = _jspx_th_logic_messagesPresent_4.doStartTag();
      if (_jspx_eval_logic_messagesPresent_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_6 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_6.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_messagesPresent_4);
          _jspx_th_bean_define_6.setId("city");
          _jspx_th_bean_define_6.setName("myAdminAddWeatherForm");
          _jspx_th_bean_define_6.setProperty("city");
          int _jspx_eval_bean_define_6 = _jspx_th_bean_define_6.doStartTag();
          if (_jspx_th_bean_define_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_6);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_6);
          java.lang.Object city = null;
          city = (java.lang.Object) _jspx_page_context.findAttribute("city");
          out.write('\n');
          out.write('	');
          out.write('	');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_7 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_7.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_messagesPresent_4);
          _jspx_th_bean_define_7.setId("dicoKey");
          _jspx_th_bean_define_7.setName("myAdminAddWeatherForm");
          _jspx_th_bean_define_7.setProperty("dicoCreated");
          int _jspx_eval_bean_define_7 = _jspx_th_bean_define_7.doStartTag();
          if (_jspx_th_bean_define_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_7);
            return;
          }
          _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_7);
          java.lang.Object dicoKey = null;
          dicoKey = (java.lang.Object) _jspx_page_context.findAttribute("dicoKey");
          out.write("\n\t\t<p style=\"color:green; font-weight:bold;\">This city of ");
          out.print(city );
          out.write(" for the weather service was created! よかったね! \\(^o^)/</p>\n\t\t<p style=\"color:green; font-weight:bold;\">The dico key generated is: ");
          out.print( dicoKey);
          out.write("</p>\n\t");
          int evalDoAfterBody = _jspx_th_logic_messagesPresent_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_messagesPresent_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_4);
        return;
      }
      _jspx_tagPool_logic_messagesPresent_property_message.reuse(_jspx_th_logic_messagesPresent_4);
      out.write("\n\t\n</div>\n<!-- FIN DIV CONTENT -->\n\n<script type=\"text/javascript\">\n\tfunction goDispatch(where, dispatchField){\n\t\tdocument.getElementById(dispatchField).value = where;\n\t}\n</script>\n\n");
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
    _jspx_th_logic_messagesPresent_0.setProperty("emptyUrl");
    int _jspx_eval_logic_messagesPresent_0 = _jspx_th_logic_messagesPresent_0.doStartTag();
    if (_jspx_eval_logic_messagesPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t<p class=\"clear error\">Please feel the URL</p>\n\t");
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
    _jspx_th_logic_messagesPresent_1.setProperty("emptyDicoKey");
    int _jspx_eval_logic_messagesPresent_1 = _jspx_th_logic_messagesPresent_1.doStartTag();
    if (_jspx_eval_logic_messagesPresent_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t<p class=\"clear error\">Please feel the dico key</p>\n\t");
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
    _jspx_th_logic_messagesPresent_2.setProperty("incorrectURL");
    int _jspx_eval_logic_messagesPresent_2 = _jspx_th_logic_messagesPresent_2.doStartTag();
    if (_jspx_eval_logic_messagesPresent_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t<p class=\"clear error\">The URL seems incorrect</p>\n\t");
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
    _jspx_th_logic_messagesPresent_3.setProperty("errorSQL");
    int _jspx_eval_logic_messagesPresent_3 = _jspx_th_logic_messagesPresent_3.doStartTag();
    if (_jspx_eval_logic_messagesPresent_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t<p class=\"clear error\">Woups. An error occurred</p>\n\t");
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

  private boolean _jspx_meth_html_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_styleClass_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent(null);
    _jspx_th_html_form_0.setAction("/action/adminAddWeather");
    _jspx_th_html_form_0.setStyleId("SearchByContinent");
    _jspx_th_html_form_0.setStyleClass("srvConfigForm");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n\t\t\t");
        if (_jspx_meth_html_hidden_0(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n\t\t\n\t\t\t<label>Continent :</label>\n\t\t\t");
        if (_jspx_meth_html_select_0(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n\t\t\n\t\t\t");
        if (_jspx_meth_html_submit_0(_jspx_th_html_form_0, _jspx_page_context))
          return true;
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
      return true;
    }
    _jspx_tagPool_html_form_styleId_styleClass_action.reuse(_jspx_th_html_form_0);
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
    _jspx_th_html_hidden_0.setStyleId("dispatchConfigCountries");
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
    _jspx_th_html_select_0.setProperty("continent");
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
      _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_0);
      return true;
    }
    _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_0);
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
    _jspx_th_html_optionsCollection_0.setName("myAdminAddWeatherForm");
    _jspx_th_html_optionsCollection_0.setProperty("continents");
    _jspx_th_html_optionsCollection_0.setLabel("name");
    _jspx_th_html_optionsCollection_0.setValue("name");
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
    _jspx_th_html_submit_0.setValue("Search countries");
    _jspx_th_html_submit_0.setOnclick("goDispatch('displayCountry', 'dispatchConfigCountries')");
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
    _jspx_th_html_hidden_1.setStyleId("dispatchConfigStores");
    _jspx_th_html_hidden_1.setProperty("dispatch");
    int _jspx_eval_html_hidden_1 = _jspx_th_html_hidden_1.doStartTag();
    if (_jspx_th_html_hidden_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_1);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_1);
    return false;
  }

  private boolean _jspx_meth_html_select_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_1 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_1.setPageContext(_jspx_page_context);
    _jspx_th_html_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_select_1.setName("myAdminAddWeatherForm");
    _jspx_th_html_select_1.setProperty("country");
    int _jspx_eval_html_select_1 = _jspx_th_html_select_1.doStartTag();
    if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_1.doInitBody();
      }
      do {
        out.write("\n\t\t\t\t\t");
        if (_jspx_meth_html_optionsCollection_1(_jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write("\n\t\t\t\t");
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

  private boolean _jspx_meth_html_optionsCollection_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:optionsCollection
    org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_optionsCollection_1 = (org.apache.struts.taglib.html.OptionsCollectionTag) _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
    _jspx_th_html_optionsCollection_1.setPageContext(_jspx_page_context);
    _jspx_th_html_optionsCollection_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
    _jspx_th_html_optionsCollection_1.setName("myAdminAddWeatherForm");
    _jspx_th_html_optionsCollection_1.setProperty("countries");
    _jspx_th_html_optionsCollection_1.setLabel("name");
    _jspx_th_html_optionsCollection_1.setValue("isoCode");
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
    _jspx_th_html_submit_1.setValue("Search");
    _jspx_th_html_submit_1.setOnclick("goDispatch('displayCities', 'dispatchConfigStores')");
    int _jspx_eval_html_submit_1 = _jspx_th_html_submit_1.doStartTag();
    if (_jspx_th_html_submit_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_value_property_onclick_nobody.reuse(_jspx_th_html_submit_1);
      return true;
    }
    _jspx_tagPool_html_submit_value_property_onclick_nobody.reuse(_jspx_th_html_submit_1);
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
    _jspx_th_html_hidden_3.setStyleId("dispatchConfigAdd");
    _jspx_th_html_hidden_3.setProperty("dispatch");
    int _jspx_eval_html_hidden_3 = _jspx_th_html_hidden_3.doStartTag();
    if (_jspx_th_html_hidden_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_3);
      return true;
    }
    _jspx_tagPool_html_hidden_styleId_property_nobody.reuse(_jspx_th_html_hidden_3);
    return false;
  }

  private boolean _jspx_meth_html_select_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_2 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_2.setPageContext(_jspx_page_context);
    _jspx_th_html_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_2);
    _jspx_th_html_select_2.setName("myAdminAddWeatherForm");
    _jspx_th_html_select_2.setProperty("city");
    int _jspx_eval_html_select_2 = _jspx_th_html_select_2.doStartTag();
    if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_2.doInitBody();
      }
      do {
        out.write("\n\t\t\t\t\t");
        if (_jspx_meth_html_optionsCollection_2(_jspx_th_html_select_2, _jspx_page_context))
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

  private boolean _jspx_meth_html_optionsCollection_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:optionsCollection
    org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_optionsCollection_2 = (org.apache.struts.taglib.html.OptionsCollectionTag) _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
    _jspx_th_html_optionsCollection_2.setPageContext(_jspx_page_context);
    _jspx_th_html_optionsCollection_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_2);
    _jspx_th_html_optionsCollection_2.setName("myAdminAddWeatherForm");
    _jspx_th_html_optionsCollection_2.setProperty("cities");
    _jspx_th_html_optionsCollection_2.setLabel("name");
    _jspx_th_html_optionsCollection_2.setValue("name");
    int _jspx_eval_html_optionsCollection_2 = _jspx_th_html_optionsCollection_2.doStartTag();
    if (_jspx_th_html_optionsCollection_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_2);
      return true;
    }
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_2);
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
    _jspx_th_html_submit_2.setValue("Create");
    _jspx_th_html_submit_2.setOnclick("goDispatch('add', 'dispatchConfigAdd')");
    int _jspx_eval_html_submit_2 = _jspx_th_html_submit_2.doStartTag();
    if (_jspx_th_html_submit_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_value_property_onclick_nobody.reuse(_jspx_th_html_submit_2);
      return true;
    }
    _jspx_tagPool_html_submit_value_property_onclick_nobody.reuse(_jspx_th_html_submit_2);
    return false;
  }
}
