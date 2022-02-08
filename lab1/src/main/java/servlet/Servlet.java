package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import flower.Flowers;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		
		Flowers flower1 = new Flowers("Orchid", "assets/orchid.jpg", "Orchids are one of the richest species among the families of the plant world. Orchids do not depend on the soil, receive more valuable ultraviolet radiation and are not destroyed by animals.");
		Flowers flower2 = new Flowers("Rainbow rose", "assets/rainbow_rose.jpg", "This is what the most beautiful and charming flower in the world looks like. Giving it to express your respect, respect or tender feelings has become a good tradition. The rose is the most successful plant for garden landscaping.");
		out.println("[" + flower1 + ", " + flower2 + "]");
	}

}
