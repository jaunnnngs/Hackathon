/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.69
 * Generated at: 2021-08-12 01:38:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.St_005fboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.PrintWriter");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <meta name=\"author\" content=\"\" />\r\n");
      out.write("        <title>Warm Place_맛집후기쓰기</title>\r\n");
      out.write("        <!-- Favicon-->\r\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\r\n");
      out.write("        <!-- Bootstrap icons-->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");

	
	// 현재 세션 상태를 체크한다
	String userID = null;
	if (session.getAttribute("userID") != null) {
		userID = (String) session.getAttribute("userID");
	}
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("        <!-- Responsive navbar-->\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("            <div class=\"container px-5\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"../St_Join/main.jsp\">Warm Place</a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("                 <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                 ");

					// 로그인 하지 않았을 때 보여지는 화면
					if(userID == null){
				
      out.write("\r\n");
      out.write("                    <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" aria-current=\"page\" href=\"../St_board/login.jsp\">로그인</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"../St_Join/st_userJoin.jsp\">회원가입</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"../St_Reservation/map.jsp\">예약하기</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"../St_board/bbs.jsp\">맛집후기</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#!\">마이페이지</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("				");

				// 로그인이 되어 있는 상태에서 보여주는 화면
					}else{
				
      out.write("\r\n");
      out.write("                    <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" aria-current=\"page\" href=\"../St_board/logoutAction.jsp\">로그아웃</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"../St_Join/st_userJoin.jsp\">회원가입</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"../St_Reservation/map.jsp\">예약하기</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"../St_board/bbs.jsp\">맛집후기</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#!\">Contact</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    ");

				}
			
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("         ");

        if (userID == null) {
    		PrintWriter script = response.getWriter();
    		script.println("<script>");
    		script.println("alert('로그인을 하세요')");
    		script.println("location.href='../St_board/login.jsp'");
    		script.println("</script>");
    	} else {
  
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<!-- 게시판 글쓰기 양식 영역 시작 -->\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<form method=\"post\" action=\"writeAction.jsp\">\r\n");
      out.write("				<table class=\"table table-striped\" style=\"text-align: center; border: 1px solid #dddddd\">\r\n");
      out.write("					<thead>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<th colspan=\"2\" style=\"background-color: #eeeeee; text-align: center;\">게시판 글쓰기 양식</th>\r\n");
      out.write("						</tr>\r\n");
      out.write("					</thead>\r\n");
      out.write("					<tbody>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td><input type=\"text\" class=\"form-control\" placeholder=\"글 제목\" name=\"bbsTitle\" maxlength=\"50\"></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td><textarea class=\"form-control\" placeholder=\"글 내용\" name=\"bbsContent\" maxlength=\"2048\" style=\"height: 350px;\"></textarea></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("					</tbody>\r\n");
      out.write("				</table>\r\n");
      out.write("				<!-- 글쓰기 버튼 생성 -->\r\n");
      out.write("				<input type=\"submit\" class=\"btn btn-primary pull-right\" value=\"글쓰기\">\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- 게시판 글쓰기 양식 영역 끝 -->\r\n");
      out.write("	\r\n");
      out.write("	<!-- 부트스트랩 참조 영역 -->\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("	<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("	");

}
	
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
