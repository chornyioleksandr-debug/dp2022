package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import Flowers.Flower;
import Flowers.Mock;
import crud.Lab3CrudInterface;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet/*")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Flower> lf = new Mock().getFlowerList();
	
	ServletConfigInterface servletConfig;
	Lab3CrudInterface lab3Crud;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        this.servletConfig = new ServletConfig();
        this.lab3Crud = servletConfig.getCrud();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		lab3Crud.updateFlower(lf);
		lf = lab3Crud.readFlower();
		setAccessControlHeaders(response);
		response.setContentType("application/json");
		response.getWriter().println(lf);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		setAccessControlHeaders(response);
		Flower user = Helpers.flowerParse(request);
		user.setId(Helpers.getNextId(lf));
		lf.add(user);
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		setAccessControlHeaders(response);
		Flower flower = Helpers.flowerParse(request);
		int id = Integer.parseInt(request.getPathInfo().substring(1));
		System.out.println(id);
		response.setContentType("application/json");
		int index = Helpers.getIndexByFlowerId(id, lf);
		lf.set(index,flower);
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		setAccessControlHeaders(response);
		int id = Integer.parseInt(request.getPathInfo().substring(1));
		System.out.println(id);
		response.setContentType("application/json");
		int index = Helpers.getIndexByFlowerId(id, lf);
		lf.remove(index);
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doOptions(HttpServletRequest, HttpServletResponse)
	 */
	protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		setAccessControlHeaders(response);
		response.setStatus(HttpServletResponse.SC_OK);
	}
	
	private void setAccessControlHeaders(HttpServletResponse resp) {
		  resp.setHeader("Access-Control-Allow-Origin", "*");
	      resp.setHeader("Access-Control-Allow-Methods", "*");
	      resp.setHeader("Access-Control-Allow-Headers", "*");
	  }

}
