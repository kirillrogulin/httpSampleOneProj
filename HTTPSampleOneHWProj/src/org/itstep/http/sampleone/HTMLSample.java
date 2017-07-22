package org.itstep.http.sampleone;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HTMLSample")
public class HTMLSample extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public HTMLSample() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String helloParam = null;
		
		try { helloParam = "Hello, " + request.getParameter(request.getParameterNames().nextElement()) + "!"; }
		catch(Exception ex) { helloParam = "Hello world!"; }
		
		StringBuilder sb = new StringBuilder("");
		sb.append("<!DOCTYPE html>\n")
			.append("<html lang=\"ru\">\n")
			.append("<head>\n")
			.append("<title>First HTTPServlet page</title>\n")
			.append("<meta charset=\"utf-8\">\n")
			.append("</head>\n")
			.append("<body style=\"text-align: center;\">\n")
			.append("<b>")
			.append("<h1 style=\"font-family: SansSerif;\">")
			.append(helloParam)
			.append("</h1>\n")
			.append("</b>\n")
			.append("<hr style=\"width: 80%;\"/>\n")
			.append("</body>\n")
			.append("</html>");
		response.getWriter().append(sb);
	}
}
