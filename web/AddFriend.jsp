<%-- 
    Document   : AddFriend
    Created on : 24-Nov-2015, 14:32:27
    Author     : 13487992
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Of Users</title>
    </head>
    <body>
    <h1>Please enter a friend to search for (username)</h1>
    <form id="friendForm" action="AddFriend" method="post">
    <table>
        <tr><td>Username:</td><td><input type="text" id = "username" name="username" /></td></tr>
    </table>
    <input type="submit" id="AddFriend" value="Submit"/>
    </form>
</body>
</html>
