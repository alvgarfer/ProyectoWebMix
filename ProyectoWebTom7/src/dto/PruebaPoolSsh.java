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
 * Servlet implementation class PruebaPoolSsh
 */
@WebServlet("/PruebaPoolSsh")
public class PruebaPoolSsh extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PruebaPoolSsh() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String select_pat = "Select id_patol from Patologias where nom_patol = 'Queratocono'";
		Pool pool = Pool.getInstance();
		ResultSet rs = null;
		Connection con = pool.getConnection();
		int idpatol = -5;
		Statement st = null;
		try {
			st = con.createStatement();
			rs =  st.executeQuery(select_pat);
			rs.next();
			idpatol = rs.getInt("id_patol");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			pool.liberarRecursos(con, st, rs);
		}
		
				
		response.getWriter().append("id QUERATOCONO: ").append(String.valueOf(idpatol));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
