/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-06-04 10:50:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/common/head.jsp", out, false);
      out.write("\r\n");
      out.write("<title>商城后台管理系统</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header class=\"navbar-wrapper\">\r\n");
      out.write("\t<div class=\"navbar navbar-fixed-top\">\r\n");
      out.write("\t\t<div class=\"container-fluid cl\"> <a class=\"logo navbar-logo f-l mr-10 hidden-xs\" href=\"/\">商城后台</a> <a class=\"logo navbar-logo-m f-l mr-10 visible-xs\" href=\"/aboutHui.shtml\">H-ui</a> \r\n");
      out.write("\t\t\t<span class=\"logo navbar-slogan f-l mr-10 hidden-xs\">v3.0</span> \r\n");
      out.write("\t\t\t<a aria-hidden=\"false\" class=\"nav-toggle Hui-iconfont visible-xs\" href=\"javascript:;\">&#xe667;</a>\r\n");
      out.write("\t\t<nav id=\"Hui-userbar\" class=\"nav navbar-nav navbar-userbar hidden-xs\">\r\n");
      out.write("\t\t\t<ul class=\"cl\">\r\n");
      out.write("\t\t\t\t<li>超级管理员</li>\r\n");
      out.write("\t\t\t\t<li class=\"dropDown dropDown_hover\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"dropDown_A\">admin <i class=\"Hui-iconfont\">&#xe6d5;</i></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropDown-menu menu radius box-shadow\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"javascript:;\" onClick=\"myselfinfo()\">个人信息</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">切换账户</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">退出</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li id=\"Hui-skin\" class=\"dropDown right dropDown_hover\"> <a href=\"javascript:;\" class=\"dropDown_A\" title=\"换肤\"><i class=\"Hui-iconfont\" style=\"font-size:18px\">&#xe62a;</i></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropDown-menu menu radius box-shadow\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"javascript:;\" data-val=\"default\" title=\"默认（黑色）\">默认（黑色）</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"javascript:;\" data-val=\"blue\" title=\"蓝色\">蓝色</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"javascript:;\" data-val=\"green\" title=\"绿色\">绿色</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"javascript:;\" data-val=\"red\" title=\"红色\">红色</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"javascript:;\" data-val=\"yellow\" title=\"黄色\">黄色</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"javascript:;\" data-val=\"orange\" title=\"橙色\">橙色</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</header>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/common/menu.jsp", out, false);
      out.write("\r\n");
      out.write("<div class=\"dislpayArrow hidden-xs\"><a class=\"pngfix\" href=\"javascript:void(0);\" onClick=\"displaynavbar(this)\"></a></div>\r\n");
      out.write("<section class=\"Hui-article-box\">\r\n");
      out.write("\t<div id=\"Hui-tabNav\" class=\"Hui-tabNav hidden-xs\">\r\n");
      out.write("\t\t<div class=\"Hui-tabNav-wp\">\r\n");
      out.write("\t\t\t<ul id=\"min_title_list\" class=\"acrossTab cl\">\r\n");
      out.write("\t\t\t\t<li class=\"active\">\r\n");
      out.write("\t\t\t\t\t<span title=\"我的桌面\" data-href=\"/restful/page/welcome\">我的桌面</span>\r\n");
      out.write("\t\t\t\t\t<em></em></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<div class=\"Hui-tabNav-more btn-group\"><a id=\"js-tabNav-prev\" class=\"btn radius btn-default size-S\" href=\"javascript:;\"><i class=\"Hui-iconfont\">&#xe6d4;</i></a><a id=\"js-tabNav-next\" class=\"btn radius btn-default size-S\" href=\"javascript:;\"><i class=\"Hui-iconfont\">&#xe6d7;</i></a></div>\r\n");
      out.write("</div>\r\n");
      out.write("\t<div id=\"iframe_box\" class=\"Hui-article\">\r\n");
      out.write("\t\t<div class=\"show_iframe\">\r\n");
      out.write("\t\t\t<div style=\"display:none\" class=\"loading\"></div>\r\n");
      out.write("\t\t\t<iframe scrolling=\"yes\" frameborder=\"0\" src=\"/common/welcome.jsp\"></iframe>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<div class=\"contextMenu\" id=\"Huiadminmenu\">\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li id=\"closethis\">关闭当前 </li>\r\n");
      out.write("\t\t<li id=\"closeall\">关闭全部 </li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("<!--请在下方写此页面业务相关的脚本-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/lib/jquery.contextmenu/jquery.contextmenu.r2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("/*个人信息*/\r\n");
      out.write("function myselfinfo(){\r\n");
      out.write("\tlayer.open({\r\n");
      out.write("\t\ttype: 1,\r\n");
      out.write("\t\tarea: ['300px','200px'],\r\n");
      out.write("\t\tfix: false, //不固定\r\n");
      out.write("\t\tmaxmin: true,\r\n");
      out.write("\t\tshade:0.4,\r\n");
      out.write("\t\ttitle: '查看信息',\r\n");
      out.write("\t\tcontent: '<div>管理员信息</div>'\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*资讯-添加*/\r\n");
      out.write("function article_add(title,url){\r\n");
      out.write("\tvar index = layer.open({\r\n");
      out.write("\t\ttype: 2,\r\n");
      out.write("\t\ttitle: title,\r\n");
      out.write("\t\tcontent: url\r\n");
      out.write("\t});\r\n");
      out.write("\tlayer.full(index);\r\n");
      out.write("}\r\n");
      out.write("/*图片-添加*/\r\n");
      out.write("function picture_add(title,url){\r\n");
      out.write("\tvar index = layer.open({\r\n");
      out.write("\t\ttype: 2,\r\n");
      out.write("\t\ttitle: title,\r\n");
      out.write("\t\tcontent: url\r\n");
      out.write("\t});\r\n");
      out.write("\tlayer.full(index);\r\n");
      out.write("}\r\n");
      out.write("/*产品-添加*/\r\n");
      out.write("function product_add(title,url){\r\n");
      out.write("\tvar index = layer.open({\r\n");
      out.write("\t\ttype: 2,\r\n");
      out.write("\t\ttitle: title,\r\n");
      out.write("\t\tcontent: url\r\n");
      out.write("\t});\r\n");
      out.write("\tlayer.full(index);\r\n");
      out.write("}\r\n");
      out.write("/*用户-添加*/\r\n");
      out.write("function member_add(title,url,w,h){\r\n");
      out.write("\tlayer_show(title,url,w,h);\r\n");
      out.write("}\r\n");
      out.write("</script> \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
