<%-- 
    Document   : thanks
    Created on : Sep 5, 2024, 9:43:33 AM
    Author     : ANH QUAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="main.css" type="text/css"/>
    </head>
    
        <h1>Hello World!</h1>
        
        <p>Here is the information that you entered:</p>
        
        <label>Email</label>
        <span>${user.email}</span><br>
        <label>First Name:</label>
        <span>${user.firstName}</span><br>
        <label>Last Name:</label>
        <span>${user.lastName}</span><br>
        <label>Date:</label>
        <span>${user.date}</span><br>
        <label>Source</label>
        <span>${user.source}</span><br>
        
        <c:if test="${not empty user.yesone}">
        <span>${user.yesone}</span><br>
        </c:if>
        <c:if test="${not empty user.yestwo}">
        <span>${user.yestwo}</span><br>
        </c:if>

        <span>${user.options}</span>
        
        <p>To enter another email address, click on the Back
            button in your browser or the Return button shown
            below.</p>
        
        <form action="" method="get">
            <input type="hidden" name="action" value="join">
            <input type="submit" value="Return">
        </form>
    
</html>

