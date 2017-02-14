

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DiLaHora
 */
@WebServlet("/DiLaHora")
public class DiLaHora extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiLaHora()
    {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//System.out.println("Ha llamado al get");
		PrintWriter pw = response.getWriter();
		/*pw.write("Actualizate \n");
		pw.write("Funciona \n");
		pw.write("Escribe \n");*/
		
		Calendar calendar = Calendar.getInstance();
		int hora = calendar.get(Calendar.HOUR);
		int minutos = calendar.get(Calendar.MINUTE);
		int segundos = calendar.get(Calendar.SECOND);
		
		pw.write("<h1> La hora es: </h1>");
		pw.write(" <button> Hora: </buttom>");	
		pw.write(hora + ": " + minutos + ": " + segundos + "\n");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
