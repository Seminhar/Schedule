/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2014-12-31 17:08:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.HashMap;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import java.util.ArrayList;
import beans.Category;
import beans.Book;

public final class addItem_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link href=\"style/addItem.css\" rel=\"stylesheet\" />\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"mainContent\">\r\n");
      out.write("\r\n");
      out.write("\t\t<h5>基本信息</h5>\r\n");
      out.write("\t\t<form id=\"mainForm\" action=\"addItem\"\r\n");
      out.write("\t\t\tmethod=\"post\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>图书标题：</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"book_title\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span  class=\"errorMsg\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span  class=\"inputNote\"></span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>图书类别</td>\r\n");
      out.write("\t\t\t\t\t<td><select name=\"category_id\">\r\n");
      out.write("\t\t\t\t\t\t\t");

								ArrayList<Category> cats = (ArrayList<Category>) request
										.getAttribute("cats");
								for (Category cat : cats) {
									out.print("<option value=" + cat.getCategory_id()
											+ " selected='selected'>" + cat.getCategory_name()
											+ "</option>");
								}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>图书ISBN：</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"book_isbn\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span  class=\"errorMsg\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span  class=\"inputNote\"></span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>作者：</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"book_author\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span  class=\"errorMsg\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span  class=\"inputNote\"></span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>出版社：</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"book_publisher\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span  class=\"errorMsg\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span  class=\"inputNote\"></span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>库存数量：</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"book_amount\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span  class=\"errorMsg\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span  class=\"inputNote\"></span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>价格：</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"book_price\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span  class=\"errorMsg\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span  class=\"inputNote\"></span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>折扣：</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"book_discount\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<span  class=\"errorMsg\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span  class=\"inputNote\"></span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>图书简介：</td>\r\n");
      out.write("\t\t\t\t\t<td><textarea maxlength=\"200\" name=\"book_brief\" \r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"margin: 0px; width: 590px; height: 140px;\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t<span  class=\"errorMsg\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span  class=\"inputNote\"></span>\t\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"pdfTmpPath\" value=\"\" /> \r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"picTmpPath\" value=\"\" /> \r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"mainSubmit\" value=\"\" />\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<form id=\"pdfUploadForm\" action=\"addItem\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>上传预览文件（PDF）：</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"file\" name=\"pdfFile\" value=\"选择PDF文件\" /></td>\r\n");
      out.write("\t\t\t\t\t<td><span id=\"pdfUploadError\" class=\"errorMsg\"> </span></td>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"pdfUpload\" value=\"1\" />\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td>   \r\n");
      out.write("\t\t\t\t\t\t<div id=\"progress\">\r\n");
      out.write("                             <div class=\"bar\" style=\"width: 0%;\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <span id=\"percent\"></span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t<form id=\"picUploadForm\" action=\"addItem\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>图片（JPG/PNG/BMP/GIF）：</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"file\" name=\"picFile\" value=\"\" /></td>\r\n");
      out.write("\t\t\t\t\t<td><span id=\"picUploadError\" class=\"errorMsg\"> </span></td>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"picUpload\" value=\"1\" />\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td>   \r\n");
      out.write("\t\t\t\t\t\t<div id=\"progress\">\r\n");
      out.write("                             <div class=\"bar\" style=\"width: 0%;\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <span id=\"percent\"></span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<fieldset >\r\n");
      out.write("\t\t\t\t\t\t\t<legend>缩略图</legend>\r\n");
      out.write("\t\t\t\t  \t\t\t<img id=\"thumbNail\" src=\"");

      out.write("\"></img>\r\n");
      out.write("\t\t\t\t\t\t</fieldset>\t\t\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<input id=\"submit\" type=\"button\" name=\"submit\" value=\"提交\" />\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"script/jquery-1.6.2.min.js\"></script>\r\n");
      out.write("\t<script src=\"script/ui/jquery-ui.min.js\"></script>\r\n");
      out.write("\t<script src=\"script/jquery.fileupload.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"script/addItem.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
