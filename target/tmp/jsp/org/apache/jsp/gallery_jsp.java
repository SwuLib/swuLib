/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.3.7.v20160115
 * Generated at: 2017-03-08 04:17:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gallery_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/Administrator/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("file:/C:/Users/Administrator/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar", Long.valueOf(1488789968176L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Gallery</title>\r\n");
      out.write("    <!-- for-mobile-apps -->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("    <meta name=\"keywords\" content=\"\"/>\r\n");
      out.write("    <script type=\"application/x-javascript\"> addEventListener(\"load\", function () {\r\n");
      out.write("        setTimeout(hideURLbar, 0);\r\n");
      out.write("    }, false);\r\n");
      out.write("    function hideURLbar() {\r\n");
      out.write("        window.scrollTo(0, 1);\r\n");
      out.write("    } </script>\r\n");
      out.write("    <!-- //for-mobile-apps -->\r\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("    <link href=\"css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!--web-fonts-->\r\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Lato:300,400,700\" rel=\"stylesheet\">\r\n");
      out.write("    <!--//web-fonts-->\r\n");
      out.write("    <!--//fonts-->\r\n");
      out.write("    <!-- js -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- banner -->\r\n");
      out.write("<div class=\"banner about-banner-w3ls \" id=\"home\">\r\n");
      out.write("    <!-- header -->\r\n");
      out.write("    <header>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <!-- navigation -->\r\n");
      out.write("            <nav class=\"navbar navbar-default\">\r\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <div class=\"w3-logo\">\r\n");
      out.write("                        <div style=\"position: relative;float: left;margin-top: -10px\">\r\n");
      out.write("                            <img width=\"80px\" src=\"http://192.168.1.101:8080/image/swu.png\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div style=\"position: relative;float: left;margin-left: 16px\">\r\n");
      out.write("                            <h1><a href=\"index.jsp\">物联智能创新中心</a></h1>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li><a href=\"index.jsp\"><B>主页</B></a></li>\r\n");
      out.write("                        <li><a href=\"news.jsp\"><B>中心动态</B></a></li>\r\n");
      out.write("                        <li><a class=\"active\" href=\"gallery\"><B>生活风采</B></a></li>\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\"\r\n");
      out.write("                               aria-haspopup=\"true\" aria-expanded=\"false\"><B>中心概况</B><span class=\"caret\"></span></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><a href=\"team.jsp\"><B>团队建设</B></a></li>\r\n");
      out.write("                                <li><a href=\"projects.jsp\"><B>科研项目</B></a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"contact.jsp\"><B>联系我们</B></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                </div><!-- /.navbar-collapse -->\r\n");
      out.write("\r\n");
      out.write("            </nav>\r\n");
      out.write("            <div class=\"clearfix\"></div>\r\n");
      out.write("            <!-- //navigation -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- //header -->\r\n");
      out.write("    <h2> 我们的风采</h2>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- //banner -->\r\n");
      out.write("\r\n");
      out.write("<!--gallery-->\r\n");
      out.write("<div id=\"gallery gal-page-agileits-w3layouts\" class=\"welcome gallery\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"gallery-info\">\r\n");
      out.write("            <div class=\"col-md-6 gallery-grids glry-grid1\">\r\n");
      out.write("                <div class=\"gallery-grids-top\">\r\n");
      out.write("                    <a href=\"#portfolioModal1\" class=\"b-link-stripe b-animate-go wow zoomIn animated\"\r\n");
      out.write("                       data-wow-delay=\".5s\" data-toggle=\"modal\">\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${photoDtos[0].pUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("                        <div class=\"b-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"b-animate b-from-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"img-responsive\" src=\"images/search.png\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"gallery-grids-top\">\r\n");
      out.write("                    <div class=\"col-md-6 bottom-grids\">\r\n");
      out.write("                        <a href=\"#portfolioModal2\" class=\"b-link-stripe b-animate-go wow zoomIn animated\"\r\n");
      out.write("                           data-wow-delay=\".5s\" data-toggle=\"modal\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${photoDtos[1].pUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("                            <div class=\"b-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"b-animate b-from-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img class=\"img-responsive\" src=\"images/search.png\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 bottom-grids \">\r\n");
      out.write("                        <a href=\"#portfolioModal3\" class=\"b-link-stripe b-animate-go wow zoomIn animated\"\r\n");
      out.write("                           data-wow-delay=\".5s\" data-toggle=\"modal\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${photoDtos[2].pUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("                            <div class=\"b-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"b-animate b-from-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img class=\"img-responsive\" src=\"images/search.png\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clearfix\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6 gallery-grids glry-grid1\">\r\n");
      out.write("                <div class=\"gallery-grids-top\">\r\n");
      out.write("                    <div class=\"col-md-6 bottom-grids2 \">\r\n");
      out.write("                        <a href=\"#portfolioModal4\" class=\"b-link-stripe b-animate-go wow zoomIn animated\"\r\n");
      out.write("                           data-wow-delay=\".5s\" data-toggle=\"modal\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${photoDtos[3].pUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("                            <div class=\"b-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"b-animate b-from-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img class=\"img-responsive\" src=\"images/search.png\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 bottom-grids2 \">\r\n");
      out.write("                        <a href=\"#portfolioModal5\" class=\"b-link-stripe b-animate-go wow zoomIn animated\"\r\n");
      out.write("                           data-wow-delay=\".5s\" data-toggle=\"modal\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${photoDtos[4].pUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("                            <div class=\"b-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"b-animate b-from-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img class=\"img-responsive\" src=\"images/search.png\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clearfix\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"gallery-grids-top \">\r\n");
      out.write("                    <a href=\"#portfolioModal6\" class=\"b-link-stripe b-animate-go wow zoomIn animated\"\r\n");
      out.write("                       data-wow-delay=\".5s\" data-toggle=\"modal\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${photoDtos[5].pUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("                        <div class=\"b-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"b-animate b-from-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"img-responsive\" src=\"images/search.png\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clearfix\"></div>\r\n");
      out.write("            <!-- gallery Modals -->\r\n");
      out.write("            <div class=\"portfolio-modal modal fade\" id=\"portfolioModal1\" tabindex=\"-1\" aria-hidden=\"true\">\r\n");
      out.write("                <div class=\"modal-content g gal\">\r\n");
      out.write("                    <div class=\"close-modal\" data-dismiss=\"modal\">\r\n");
      out.write("                        <div class=\"lr\">\r\n");
      out.write("                            <div class=\"rl\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"portfolio-container\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-lg-8 col-lg-offset-2\">\r\n");
      out.write("                                <div class=\"modal-body\">\r\n");
      out.write("                                    <h3>Our Gallery</h3>\r\n");
      out.write("                                    <hr>\r\n");
      out.write("                                    <img src=\"images/gg1.jpg\" class=\"img-responsive img-centered\" alt=\"\">\r\n");
      out.write("                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem\r\n");
      out.write("                                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an\r\n");
      out.write("                                        unknown printer took a galley of type and scrambled it to make a type specimen\r\n");
      out.write("                                        book.</p>\r\n");
      out.write("                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem\r\n");
      out.write("                                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an\r\n");
      out.write("                                        unknown printer took a galley of type and scrambled it to make a type specimen\r\n");
      out.write("                                        book.</p>\r\n");
      out.write("                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem\r\n");
      out.write("                                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an\r\n");
      out.write("                                        unknown printer took a galley of type and scrambled it to make a type specimen\r\n");
      out.write("                                        book.</p>\r\n");
      out.write("                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem\r\n");
      out.write("                                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an\r\n");
      out.write("                                        unknown printer took a galley of type and scrambled it to make a type specimen\r\n");
      out.write("                                        book.</p>\r\n");
      out.write("                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem\r\n");
      out.write("                                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an\r\n");
      out.write("                                        unknown printer took a galley of type and scrambled it to make a type specimen\r\n");
      out.write("                                        book.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"portfolio-modal modal fade\" id=\"portfolioModal2\" tabindex=\"-1\" aria-hidden=\"true\">\r\n");
      out.write("                <div class=\"modal-content g\">\r\n");
      out.write("                    <div class=\"close-modal\" data-dismiss=\"modal\">\r\n");
      out.write("                        <div class=\"lr\">\r\n");
      out.write("                            <div class=\"rl\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"portfolio-container\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-lg-8 col-lg-offset-2\">\r\n");
      out.write("                                <div class=\"modal-body\">\r\n");
      out.write("                                    <h3>Our Gallery</h3>\r\n");
      out.write("                                    <hr>\r\n");
      out.write("                                    <img src=\"images/gg2.jpg\" class=\"img-responsive img-centered\" alt=\"\">\r\n");
      out.write("                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem\r\n");
      out.write("                                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an\r\n");
      out.write("                                        unknown printer took a galley of type and scrambled it to make a type specimen\r\n");
      out.write("                                        book.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"portfolio-modal modal fade\" id=\"portfolioModal3\" tabindex=\"-1\" aria-hidden=\"true\">\r\n");
      out.write("                <div class=\"modal-content g\">\r\n");
      out.write("                    <div class=\"close-modal\" data-dismiss=\"modal\">\r\n");
      out.write("                        <div class=\"lr\">\r\n");
      out.write("                            <div class=\"rl\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"portfolio-container\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-lg-8 col-lg-offset-2\">\r\n");
      out.write("                                <div class=\"modal-body\">\r\n");
      out.write("                                    <h3>Our Gallery</h3>\r\n");
      out.write("                                    <hr>\r\n");
      out.write("                                    <img src=\"images/gg3.jpg\" class=\"img-responsive img-centered\" alt=\"\">\r\n");
      out.write("                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem\r\n");
      out.write("                                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an\r\n");
      out.write("                                        unknown printer took a galley of type and scrambled it to make a type specimen\r\n");
      out.write("                                        book.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"portfolio-modal modal fade\" id=\"portfolioModal4\" tabindex=\"-1\" aria-hidden=\"true\">\r\n");
      out.write("                <div class=\"modal-content g\">\r\n");
      out.write("                    <div class=\"close-modal\" data-dismiss=\"modal\">\r\n");
      out.write("                        <div class=\"lr\">\r\n");
      out.write("                            <div class=\"rl\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"portfolio-container\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-lg-8 col-lg-offset-2\">\r\n");
      out.write("                                <div class=\"modal-body\">\r\n");
      out.write("                                    <h3>Our Gallery</h3>\r\n");
      out.write("                                    <hr>\r\n");
      out.write("                                    <img src=\"images/gg4.jpg\" class=\"img-responsive img-centered\" alt=\"\">\r\n");
      out.write("                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem\r\n");
      out.write("                                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an\r\n");
      out.write("                                        unknown printer took a galley of type and scrambled it to make a type specimen\r\n");
      out.write("                                        book.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"portfolio-modal modal fade\" id=\"portfolioModal5\" tabindex=\"-1\" aria-hidden=\"true\">\r\n");
      out.write("                <div class=\"modal-content g\">\r\n");
      out.write("                    <div class=\"close-modal\" data-dismiss=\"modal\">\r\n");
      out.write("                        <div class=\"lr\">\r\n");
      out.write("                            <div class=\"rl\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"portfolio-container\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-lg-8 col-lg-offset-2\">\r\n");
      out.write("                                <div class=\"modal-body\">\r\n");
      out.write("                                    <h3>Our Gallery</h3>\r\n");
      out.write("                                    <hr>\r\n");
      out.write("                                    <img src=\"images/gg5.jpg\" class=\"img-responsive img-centered\" alt=\"\">\r\n");
      out.write("                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem\r\n");
      out.write("                                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an\r\n");
      out.write("                                        unknown printer took a galley of type and scrambled it to make a type specimen\r\n");
      out.write("                                        book.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"portfolio-modal modal fade\" id=\"portfolioModal6\" tabindex=\"-1\" aria-hidden=\"true\">\r\n");
      out.write("                <div class=\"modal-content g\">\r\n");
      out.write("                    <div class=\"close-modal\" data-dismiss=\"modal\">\r\n");
      out.write("                        <div class=\"lr\">\r\n");
      out.write("                            <div class=\"rl\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"portfolio-container\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-lg-8 col-lg-offset-2\">\r\n");
      out.write("                                <div class=\"modal-body\">\r\n");
      out.write("                                    <h3>Our Gallery</h3>\r\n");
      out.write("                                    <hr>\r\n");
      out.write("                                    <img src=\"images/gg6.jpg\" class=\"img-responsive img-centered\" alt=\"\">\r\n");
      out.write("                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem\r\n");
      out.write("                                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an\r\n");
      out.write("                                        unknown printer took a galley of type and scrambled it to make a type specimen\r\n");
      out.write("                                        book.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--//gallery Modals -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- gallery -->\r\n");
      out.write("<div class=\"gallery\" id=\"gallery\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <ul id=\"flexiselDemo1\">\r\n");
      out.write("            <li>\r\n");
      out.write("                <div class=\"wthree_testimonials_grid_main\">\r\n");
      out.write("                    <img src=\"http://192.168.1.101:8080/image/lib3.jpg\" alt=\" \" class=\"img-responsive\"/>\r\n");
      out.write("                    <h6>Make the best choice for your education</h6>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <div class=\"wthree_testimonials_grid_main\">\r\n");
      out.write("                    <img src=\"http://192.168.1.101:8080/image/lib4.jpg\" alt=\" \" class=\"img-responsive\"/>\r\n");
      out.write("                    <h6>Make the best choice for your education</h6>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <div class=\"wthree_testimonials_grid_main\">\r\n");
      out.write("                    <img src=\"http://192.168.1.101:8080/image/lib5.jpg\" alt=\" \" class=\"img-responsive\"/>\r\n");
      out.write("                    <h6>Make the best choice for your education</h6>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <div class=\"wthree_testimonials_grid_main\">\r\n");
      out.write("                    <img src=\"http://192.168.1.101:8080/image/lib7.jpg\" alt=\" \" class=\"img-responsive\"/>\r\n");
      out.write("                    <h6>Make the best choice for your education</h6>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <div class=\"wthree_testimonials_grid_main\">\r\n");
      out.write("                    <img src=\"http://192.168.1.101:8080/image/lib4.jpg\" alt=\" \" class=\"img-responsive\"/>\r\n");
      out.write("                    <h6>Make the best choice for your education</h6>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--//gallery-->\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"copyright-wthree\">\r\n");
      out.write("    <p>Copyright &copy; 2017.Company name All rights reserved.<a target=\"_blank\" href=\"\"></a></p>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- //Footer -->\r\n");
      out.write("<a href=\"#home\" class=\"scroll\" id=\"toTop\" style=\"display: block;\"> <span id=\"toTopHover\"\r\n");
      out.write("                                                                         style=\"opacity: 1;\"> </span></a>\r\n");
      out.write("<!-- //smooth scrolling -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- start-smoth-scrolling -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    jQuery(document).ready(function ($) {\r\n");
      out.write("        $(\".scroll\").click(function (event) {\r\n");
      out.write("            event.preventDefault();\r\n");
      out.write("            $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<!-- start-smoth-scrolling -->\r\n");
      out.write("<!-- here stars scrolling icon -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        /*\r\n");
      out.write("         var defaults = {\r\n");
      out.write("         containerID: 'toTop', // fading element id\r\n");
      out.write("         containerHoverID: 'toTopHover', // fading element hover id\r\n");
      out.write("         scrollSpeed: 1200,\r\n");
      out.write("         easingType: 'linear'\r\n");
      out.write("         };\r\n");
      out.write("         */\r\n");
      out.write("\r\n");
      out.write("        $().UItoTop({easingType: 'easeOutQuart'});\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<!-- //here ends scrolling icon -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(window).load(function () {\r\n");
      out.write("        $(\"#flexiselDemo1\").flexisel({\r\n");
      out.write("            visibleItems: 3,\r\n");
      out.write("            animationSpeed: 1000,\r\n");
      out.write("            autoPlay: true,\r\n");
      out.write("            autoPlaySpeed: 3000,\r\n");
      out.write("            pauseOnHover: true,\r\n");
      out.write("            enableResponsiveBreakpoints: true,\r\n");
      out.write("            responsiveBreakpoints: {\r\n");
      out.write("                portrait: {\r\n");
      out.write("                    changePoint: 480,\r\n");
      out.write("                    visibleItems: 1\r\n");
      out.write("                },\r\n");
      out.write("                landscape: {\r\n");
      out.write("                    changePoint: 640,\r\n");
      out.write("                    visibleItems: 2\r\n");
      out.write("                },\r\n");
      out.write("                tablet: {\r\n");
      out.write("                    changePoint: 768,\r\n");
      out.write("                    visibleItems: 2\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\r\n");
      out.write("<!-- //gallery -->\r\n");
      out.write("<!--js for bootstrap working-->\r\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("<!-- //for bootstrap working -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- script-for-menu -->\r\n");
      out.write("<script>\r\n");
      out.write("    $(\"span.menu\").click(function () {\r\n");
      out.write("        $(\".top-nav ul\").slideToggle(\"slow\", function () {\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<!-- script-for-menu -->\r\n");
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
