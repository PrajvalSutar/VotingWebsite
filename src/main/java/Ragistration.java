

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ragistration
 */
@WebServlet("/Ragistration")
public class Ragistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/voting","root","1234");

				String btn=request.getParameter("sub");
				if(btn.equals("Ragister")) {
		
					String name=request.getParameter("name");
					String pass=request.getParameter("pass");
					String eid=request.getParameter("eid");
					String pno=request.getParameter("pno");
				
				PreparedStatement ps=con.prepareStatement("insert into voters(name,Pass,eid,pno) values(?,?,?,?)");
				ps.setString(1, name);
				ps.setString(2, pass);
				ps.setString(3, eid);
				ps.setString(4, pno);
				
				
				int status=ps.executeUpdate();
				if(status==1) {
					out.print("Account Ragisterd.....");
					RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
					rd.include(request, response);
				}
				else {
					out.print("Error......");
				}
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
