package dto;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Pool;

/**
 * Servlet implementation class pruebapullssh
 */
@WebServlet("/pruebapullssh")
public class pruebapullssh extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pruebapullssh()
    {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String select_pat = "Select Id_patol from Patologias where nom_patol = 'CATARATAS'";
		Pool pool = null;
		pool = Pool.getInstance();
		Connection conn = Pool.getConnection();
		Statement st = null;
		ResultSet rs = null;
		int idpatol = 0;
		
		try 
		{
			st = conn.createStatement();
			rs = st.executeQuery(select_pat);
			rs.next();
			idpatol = rs.getInt("id_patol");
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			Pool.liberarRecursos(conn, st, rs);	
		}
		
		response.getWriter().append("ID DE LAS CARACATAS: ").append(String.valueOf(idpatol));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request,response);
	}
}