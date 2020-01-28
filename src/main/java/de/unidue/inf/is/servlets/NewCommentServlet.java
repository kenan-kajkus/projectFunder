package de.unidue.inf.is.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.unidue.inf.is.domain.Project;
import de.unidue.inf.is.utils.DBUtil;


public final class NewCommentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
   
                    throws ServletException, IOException {
    	
    	Project p = null;
    	String kennung = request.getParameter("kennung");
    	try {
			p = DBUtil.getProjectById(Integer.parseInt(kennung));
		} catch (NumberFormatException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	request.setAttribute("kennung", kennung);
    	request.setAttribute("project", p);
        request.getRequestDispatcher("new_comment.ftl").forward(request, response);

                    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    {
    	
    	int kennung = Integer.parseInt(request.getParameter("kennung"));
    	String kommentar = request.getParameter("komment");
    	try {
			DBUtil.insertKomment(kennung, kommentar);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }

}
