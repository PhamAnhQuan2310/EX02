/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package murach.email;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import murach.business.User;

/**
 *
 * @author ANH QUAN
 */
@WebServlet(name = "EmailListServlet", urlPatterns = {"/EmailListServlet"})
public class EmailListServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {
        
        String url = "/index.html";
        
        // get current action
        String action = request.getParameter("action");
        if(action == null){
            action = "join";  // default action
        } // <-- Đóng ngoặc nhọn ở đây để kết thúc khối if
        
        // perform action and set URL to appropriate page
        if(action.equals("join")){
            url = "/index.html";    // the "join" page
        }
        else if (action.equals("add")){
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String date = request.getParameter("date");
            String source = request.getParameter("source");
            String yesone = request.getParameter("yesone");
            String yestwo = request.getParameter("yestwo");
            String options = request.getParameter("options");
            
            // store data in User object and save User object in db
            User user = new User(firstName, lastName, email, date, source, yesone, yestwo, options);
           
            
            // set User object in request object and set URL
            request.setAttribute("user", user);
            url = "/thanks.jsp"; // the "thanks" page
        }
        
        // forward request and response objects to specified URL
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response); // chuyển qua trang thanks.jsp request & response
        
    }
        
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }                   
}