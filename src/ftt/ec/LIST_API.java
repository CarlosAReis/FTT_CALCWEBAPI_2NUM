package ftt.ec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LIST_API
 */
//TODO Ler arquivo no init e criar array list no init() e carregar dados do arquivo
//TODO salvar dados do array list no arquivo no destroy()
//TODO implementar os verbos no http para controlar a lista de dados
@WebServlet("/LIST_API")
public class LIST_API extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private HashMap <String, String> userData;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LIST_API() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Passei no INIT"+ new java.util.Date());
		
		this.userData = new HashMap<String,String>();
		
		/*BufferedReader buffRead;
		
		try {
			buffRead = new BufferedReader(new FileReader("C:\\Users\\carlo\\eclipse-workspace\\FTT_WEB_SOMADOR2Numbers\\WebContent\\TEXTOLista\\ListaWeb.txt"));
			String lido = "";
			
			String[] partes = new String[2];
			
			int c=0;
			while((lido = buffRead.readLine()) != null) {
				if( lido !=null) {
					 partes = lido.split(";");
					System.out.println(partes[0]);
					System.out.println(partes[1]);
					
					c++;
				}else {break;}
			}
			
		
			
			buffRead.close();
			String nome[] = new String[c];
			String idade[] = new String[c];
			BufferedReader novoBufRead;
			
			
				novoBufRead = new BufferedReader(new FileReader("C:\\Users\\carlo\\eclipse-workspace\\FTT_WEB_SOMADOR2Numbers\\WebContent\\TEXTOLista\\ListaWeb.txt"));
				lido = "";
				
				int seq = 0;
				
				while((lido = novoBufRead.readLine()) != null) {
					if( lido !=null) {
						 partes = lido.split(";");
						 nome[seq]= partes[0];
						 idade[seq]= partes[1];
						
						seq++;
					}else {break;}
				}
				int j =0;
				while (j < 5) {
					System.out.println(nome[j] + idade[j]);
					j++;
				}
				novoBufRead.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Passei no DESTROY"+ new java.util.Date());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		if (id == null)
		{
			response.getWriter().append(this.userData.toString()); //retornar em um fetch ou uma paginação 
		}
		else {
			try {
				response.getWriter().append(this.userData.get(id).toString());
			}catch (Exception e) {
				response.getWriter().append("Ops......ID = " + id + " not Found");
			}
			
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Passei no GET"+ new java.util.Date());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("Passei no POST"+ new java.util.Date());
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Passei no PUT"+ new java.util.Date());
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		this.userData.put(id, name);
		response.getWriter().append(name+ " inserido");
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Passei no DELETE"+ new java.util.Date());
		String id = request.getParameter("id");
		if (id != null)
		{
			response.getWriter().append(this.userData.remove(id).toString());
			response.getWriter().append(id + "  => Deletado");
		}else if (id == null){
			response.getWriter().append("id informado invalido, não ha o que deletar");
		}else {
			response.getWriter().append("informe um id");
		}
		
	}

}
