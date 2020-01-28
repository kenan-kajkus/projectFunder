package de.unidue.inf.is.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.unidue.inf.is.domain.Project;
import de.unidue.inf.is.domain.Spende;
import de.unidue.inf.is.utils.DBUtil;



public final class ViewProjectServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
                    throws ServletException, IOException {
    	Project p = null;

    	List<Spende> list = new ArrayList<>();
    		String kennung = request.getParameter("kennung");
    		try {
				p = DBUtil.getProjectById(Integer.parseInt(kennung));
			} catch (NumberFormatException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		try {
    			list = DBUtil.getSpende(Integer.parseInt(kennung));
    		} catch (NumberFormatException | SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		request.setAttribute("project", p);
    		request.setAttribute("spenderList", list);
            request.getRequestDispatcher("view_project.ftl").forward(request, response);                
    }

}