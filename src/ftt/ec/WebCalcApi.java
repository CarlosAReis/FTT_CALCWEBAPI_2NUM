package ftt.ec;

import java.io.IOException;
import java.math.BigInteger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ftt.ec.control.CalculabigInteger;

/**
 * Servlet implementation class WebCalcApi
 */
@WebServlet("/WebCalcApi")
public class WebCalcApi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WebCalcApi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Passei no GET"+ new java.util.Date());
		
		CalculabigInteger big = new CalculabigInteger(request.getParameter("a"),request.getParameter("b"));
		//int a = Integer.valueOf(request.getParameter("a"));
		//int b = Integer.valueOf(request.getParameter("b"));
		//BigInteger a = new BigInteger(request.getParameter("a"));
		//BigInteger b = new BigInteger(request.getParameter("b"));
		//BigInteger soma = a.add(b) ;
		// TODO Auto-generated method stub
		//TODO implementar a soma com big integer
		/*if (a != 0 || b!=0 ) {
			response.getWriter().append(String.valueOf(a+b));
		}else {
			response.getWriter().append("zero");
		}*/
		//big.setA(request.getParameter("a"));
		//big.setB(request.getParameter("b"));
		
		response.getWriter().append(big.getSum());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Passei no POST"+ new java.util.Date());
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
