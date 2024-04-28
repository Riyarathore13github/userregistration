
package com.isecure;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.isecure.DTO.UserDTO;
import com.isecure.DAO.UserDAO;

@WebServlet(name = "RegistrationServlet", urlPatterns = {"/RegistrationServlet"})
public class RegistrationServlet extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		String address = request.getParameter("address");
                String mobile = request.getParameter("mobile");
                
                 String date=request.getParameter("date");
              String gender=request.getParameter("gender");
                String department = request.getParameter("department");
                String program = request.getParameter("program");
                String branch = request.getParameter("branch");
                String admission= request.getParameter("admission");
                String password=request.getParameter("password");
               
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";
      
              UserDTO userdto=new UserDTO();
              userdto.setName(name);
              userdto.setAddress(address);
              userdto.setEmail(email);
              userdto.setMobile(mobile);
              userdto.setDate(date);
              userdto.setGender(gender);
              userdto.setDepartment(department);
              userdto.setProgram(program);
              userdto.setBranch(branch);
              userdto.setAdmission(admission);
              userdto.setPassword(password);
              
              
              UserDAO userdao=new UserDAO();
              System.out.println(userdto);
              int i = userdao.UserRegister(userdto);

				System.out.println("i");
				if (i < 0) {
					response.sendRedirect("registration.jsp");
				} else {
					response.sendRedirect("login.jsp");
				}
   
    }
 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
