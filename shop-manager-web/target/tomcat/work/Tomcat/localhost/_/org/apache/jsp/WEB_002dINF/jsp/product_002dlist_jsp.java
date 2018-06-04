/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-06-04 10:50:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<title>产品列表</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"/lib/zTree/v3/css/zTreeStyle/zTreeStyle.css\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"pos-r\">\r\n");
      out.write("\t<div class=\"pos-a\"\r\n");
      out.write("\t\tstyle=\"width: 200px; left: 0; top: 0; bottom: 0; height: 100%; border-right: 1px solid #e5e5e5; background-color: #f5f5f5; overflow: auto;\">\r\n");
      out.write("\t\t<ul id=\"treeDemo\" class=\"ztree\"></ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"margin-left: 200px;\">\r\n");
      out.write("\t\t<nav class=\"breadcrumb\">\r\n");
      out.write("\t\t\t<i class=\"Hui-iconfont\">&#xe67f;</i> 首页 <span class=\"c-gray en\">&gt;</span>\r\n");
      out.write("\t\t\t产品管理 <span class=\"c-gray en\">&gt;</span> 产品列表 <a\r\n");
      out.write("\t\t\t\tclass=\"btn btn-success radius r\"\r\n");
      out.write("\t\t\t\tstyle=\"line-height: 1.6em; margin-top: 3px\"\r\n");
      out.write("\t\t\t\thref=\"javascript:location.replace(location.href);\" title=\"刷新\"><i\r\n");
      out.write("\t\t\t\tclass=\"Hui-iconfont\">&#xe68f;</i></a>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<div class=\"page-container\">\r\n");
      out.write("\t\t\t<div class=\"cl pd-5 bg-1 bk-gray mt-20\">\r\n");
      out.write("\t\t\t\t<span class=\"l\"> \r\n");
      out.write("\t\t\t\t<a href=\"javascript:;\" onclick=\"product_dels()\"\r\n");
      out.write("\t\t\t\t\tclass=\"btn btn-danger radius\">\r\n");
      out.write("\t\t\t\t\t<i class=\"Hui-iconfont\">&#xe6e2;</i>批量删除\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<a class=\"btn btn-primary radius\"\r\n");
      out.write("\t\t\t\t\tonclick=\"product_edit('编辑产品','product-add')\" href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"Hui-iconfont\">&#xe60c;</i> 编辑产品\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"testIframe\" class=\"mt-20\">\r\n");
      out.write("\t\t\t\t<table\r\n");
      out.write("\t\t\t\t\tclass=\"table table-border table-bordered table-bg table-hover table-sort\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr class=\"text-c\">\r\n");
      out.write("\t\t\t\t\t\t\t<th><input type=\"checkbox\" class=\"checkall\" /></th>\r\n");
      out.write("\t\t\t\t\t\t\t<th width=\"90\">商品ID</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th >商品标题</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th width=\"150\">商品价格(单位为分)</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th width=\"80\">库存</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!--请在下方写此页面业务相关的脚本-->\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/lib/zTree/v3/js/jquery.ztree.all-3.5.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/lib/My97DatePicker/4.8/WdatePicker.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/lib/datatables/1.10.0/jquery.dataTables.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/lib/datatables/jquery.jeditable.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/lib/laypage/1.2/laypage.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar setting = {\r\n");
      out.write("\t\t\t//定义树显示方式\r\n");
      out.write("\t\t\tview : {\r\n");
      out.write("\t\t\t\tdblClickExpand : false,\r\n");
      out.write("\t\t\t\tshowLine : false,\r\n");
      out.write("\t\t\t\tselectedMulti : false\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t//定义数据参数\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\tsimpleData : {\r\n");
      out.write("\t\t\t\t\tenable : true,\r\n");
      out.write("\t\t\t\t\tidKey : \"id\",\r\n");
      out.write("\t\t\t\t\tpIdKey : \"parentId\",\r\n");
      out.write("\t\t\t\t\trootPId : \"\"\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tcallback : {\r\n");
      out.write("\t\t\t\tbeforeClick : function(treeId, treeNode) {\r\n");
      out.write("\t\t\t\t\tvar zTree = $.fn.zTree.getZTreeObj(\"tree\");\r\n");
      out.write("\t\t\t\t\t//判断是否有子类目,没子类目不展开\r\n");
      out.write("\t\t\t\t\tif (treeNode.isParent) {\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t//demoIframe.attr(\"src\",\"kasg.jsp\");\r\n");
      out.write("\t\t\t\t\t\t//判断是顶级类目，查询该类下商品\r\n");
      out.write("\t\t\t\t\t\tfindProduct(treeNode.id);\r\n");
      out.write("\t\t\t\t\t\treturn true;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\t//初始化商品分类菜单树\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\tvar zNodes;\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl : \"/restful/page/category\",\r\n");
      out.write("\t\t\t\ttype : \"GET\",\r\n");
      out.write("\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\tasync : false,\r\n");
      out.write("\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\tzNodes = data;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tvar t = $(\"#treeDemo\");\r\n");
      out.write("\t\t\tt = $.fn.zTree.init(t, setting, zNodes);\r\n");
      out.write("\t\t\t//demoIframe = $(\"#testIframe\");\r\n");
      out.write("\t\t\t//sdemoIframe.on(\"load\", loadReady);\r\n");
      out.write("\t\t\tvar zTree = $.fn.zTree.getZTreeObj(\"tree\");\r\n");
      out.write("\t\t\t//zTree.selectNode(zTree.getNodeByParam(\"id\", '2'));\r\n");
      out.write("\t\t\trefreshDataTable(null);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tvar vcid = null;\r\n");
      out.write("\t\t var refreshDataTable=function(cid) {\r\n");
      out.write("\t\t\t vcid=cid;\r\n");
      out.write("\t\t\t //重新构建table  \r\n");
      out.write("             $('.table-sort').dataTable().fnClearTable();\r\n");
      out.write("             $('.table-sort').dataTable().fnDestroy();\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t var table = $('.table-sort').dataTable({\r\n");
      out.write("\t\t\t\t\"bProcessing\" : false, //是否显示加载\r\n");
      out.write("\t\t\t\t\"sAjaxSource\" : '/restful/page/product/', //请求资源路径\r\n");
      out.write("\t\t\t\t\"serverSide\" : true, //开启服务器处理模式\r\n");
      out.write("\t\t\t\t\"destroy\" : true, //重新加载表格\r\n");
      out.write("\t\t\t\t/*\r\n");
      out.write("\t\t\t\t使用ajax，在服务端处理数据\r\n");
      out.write("\t\t\t\tsSource:即是\"sAjaxSource\"\r\n");
      out.write("\t\t\t\taoData:要传递到服务端的参数\r\n");
      out.write("\t\t\t\tfnCallback:处理返回数据的回调函数\r\n");
      out.write("\t\t\t\t */\r\n");
      out.write("\t\t\t\t\"fnServerData\" : retrieveData,\r\n");
      out.write("\t\t\t\t       \t\t\r\n");
      out.write("\t\t\t\t\"columns\" : [ \r\n");
      out.write("\t\t\t\t             {\r\n");
      out.write("\t\t\t\t            \t \"sClass\" : \"text-c\",\r\n");
      out.write("\t\t\t\t                 \"data\": \"id\",\r\n");
      out.write("\t\t\t\t                 \"render\": function (data, type, full, meta) {\r\n");
      out.write("\t\t\t\t                     return '<input type=\"checkbox\"  class=\"checkchild\"  value=\"' + data + '\" />';\r\n");
      out.write("\t\t\t\t                 },\r\n");
      out.write("\t\t\t\t                 \"bSortable\": false\r\n");
      out.write("\t\t\t\t             },\r\n");
      out.write("\t\t\t\t    {data : \"id\"}, \r\n");
      out.write("\t\t\t\t    {data : \"title\"},\r\n");
      out.write("\t\t\t\t    {data : \"price\"},\r\n");
      out.write("\t\t\t\t\t{data : \"num\"}\r\n");
      out.write("\t\t\t\t]\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t }\r\n");
      out.write("\t\tfunction retrieveData(sSource, aoData, fnCallback) {\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t'type' : 'GET',\r\n");
      out.write("\t\t\t\t\t\"url\" : sSource,\r\n");
      out.write("\t\t\t\t\t\"dataType\" : \"json\",\r\n");
      out.write("\t\t\t\t\t\"data\" : {\r\n");
      out.write("\t\t\t\t\t\t\"aodata\" : JSON.stringify(aoData),\r\n");
      out.write("\t\t\t\t\t\t\"cid\" : vcid\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\"success\" : function(resp) {\r\n");
      out.write("\t\t\t\t\t\tfnCallback(resp);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t//查询分类下商品\r\n");
      out.write("\t\tfunction findProduct(cid) {\r\n");
      out.write("\t\t\tvcid=cid;\r\n");
      out.write("\t\t\trefreshDataTable(cid);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/*产品批量删除*/\r\n");
      out.write("\t\tfunction product_dels(){\r\n");
      out.write("\t\t\tlayer.confirm('确认要删除选中商品吗？',function(index){\r\n");
      out.write("\t\t\t\t//取出所有选中\r\n");
      out.write("\t\t\t      var ids  = $('input:checkbox:checked').map(function(){\r\n");
      out.write("\t\t\t    \t  if($(this).val()!=\"on\"){\r\n");
      out.write("\t\t\t    \t \t return $(this).val();\r\n");
      out.write("\t\t\t    \t  };\r\n");
      out.write("\t\t\t      }).get().join(\",\");\r\n");
      out.write("\t\t\t      if(!ids){\r\n");
      out.write("\t\t\t    \t  layer.msg('没有选择商品!',{icon:2,time:1000});\r\n");
      out.write("\t\t\t    \t  return ;\r\n");
      out.write("\t\t\t      }\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\ttype: 'post',\r\n");
      out.write("\t\t\t\t\turl: '/restful/page/product',\r\n");
      out.write("\t\t\t\t\tdataType: 'json',\r\n");
      out.write("\t\t\t\t\tdata:{\"ids\":ids,\"_method\":\"DELETE\"},\r\n");
      out.write("\t\t\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\t\t\trefreshDataTable(null);\r\n");
      out.write("\t\t\t\t\t\tlayer.msg('已删除!',{icon:1,time:1000});\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\terror:function(data) {\r\n");
      out.write("\t\t\t\t\t\tconsole.log(data.msg);\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t});\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t//添加产品\r\n");
      out.write("\t\tfunction product_add(title,url){\r\n");
      out.write("\t\t\tvar index = layer.open({\r\n");
      out.write("\t\t\t\ttype: 2,\r\n");
      out.write("\t\t\t\ttitle: title,\r\n");
      out.write("\t\t\t\tcontent: url\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tlayer.full(index);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
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
