/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package murach.business;

import jakarta.servlet.annotation.WebServlet;
import java.io.Serializable;


/**
 *
 * @author ANH QUAN
 */
@WebServlet(name = "User", urlPatterns = {"/User"})
public class User implements Serializable {

    public static void insert(User user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String firstName;
    private String lastName;
    private String email;
    private String date;
    private String source;
    private String yesone;
    private String yestwo;
    private String options;
    
    public User(){
        firstName = "";
        lastName = "";
        email = "";
        date = "";
        source = "";
        yesone = "";
        yestwo = "";
        options = "";
        
    }
    
    public User(String firstName, String lastName, String email, String date, String source, String yesone, String yestwo, String options)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.date = date;
        this.source = source;
        this.yesone = yesone;
        this.yestwo = yestwo;
        this.options = options;
    }

    
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public String getEmail() 
    {
        return email;       
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getDate() 
    {
        return date;       
    }
    
    public void setDate(String date)
    {
        this.date = date;
    }
    
    public String getSource()
    {
        return source;
    }
    public void setSource(String source)
    {
        this.source = source;
    }
    public String getYesone()
    {
        return yesone;
    }
    public void setYesone(String yesone)
    {
        this.yesone = yesone;
    }
    public String getYestwo()
    {
        return yestwo;
    }
    public void setYestwo(String yestwo)
    {
        this.yestwo = yestwo;
    }
    public String getOptions()
    {
        return options;
    }
    public void setOptions(String options)
    {
        this.options = options;
    }
}
