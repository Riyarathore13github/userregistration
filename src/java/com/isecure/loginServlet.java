package com.isecure;
import com.isecure.DAO.UserDAO;
import com.isecure.DTO.UserDTO;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          String name = request.getParameter("name");
        String password=request.getParameter("password");
     
        UserDAO userDAO = new UserDAO();
        HttpSession session=request.getSession();
      UserDTO user = userDAO.loginCheck(name, password);
  
        //System.out.println(user);
           if (user.getId() != 0) {
               session.setAttribute("login",user);
            response.sendRedirect("index.jsp"); // 
         
        } else {
            session.setAttribute("error","Inavlid Id and Password");
            response.sendRedirect("login.jsp"); // 
        }
    }

   
}
  