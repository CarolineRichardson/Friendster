
<%-- 
    Document   : Login
    Created on : 23-Nov-2015, 12:57:00
    Author     : 13487992
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        
        
        <form id="loginForm" action="Login" method="post">
        <table>
        <tr><td>Username:</td><td><input type="text" id = "username" name="username" /></td></tr>
        <tr><td>Password:</td><td><input type="password" id = "password" name="password" /></td></tr>
        </table>
        <input type="submit" id="Login" value="Login"/>
        </form>
        
        
    <a href="ListUser.jsp"><strong>Go to List of users</strong></a>
    <a href="CreateUser.jsp"><strong>Create a user</strong></a>
    <a href="ListGames.jsp"><strong>Go to List of Games</strong></a>
    
    </body>
    
</html>

