

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Addvote
 */
@WebServlet("/Addvote")
public class Addvote extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		

		try {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/voting","root","1234");

			String user=request.getParameter("user");
			String vote=request.getParameter("vote");

			PreparedStatement ps=con.prepareStatement("select * from voters where name=?");
			ps.setString(1, user);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				if(rs.getString("vote")==null) {
					PreparedStatement ps2=con.prepareStatement("update voters set vote=? where name=?");
					ps2.setString(1, vote);
					ps2.setString(2, user);
					ps2.executeUpdate();
					RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
					rd.include(request, response);
				}else{
					out.print("this user already voted");
					RequestDispatcher rd=request.getRequestDispatcher("VotingBooth.jsp");
					rd.include(request, response);
				}
					
				
			}else{
				out.print("this user not found");
				RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
				rd.include(request, response);
			
			}

	
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
