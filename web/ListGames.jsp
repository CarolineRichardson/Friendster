<%-- 
    Document   : ListGames
    Created on : 26-Nov-2015, 17:12:57
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

    <h1>List of Games currently in the Database</h1>
    
<table id="gameListTable" border="3">
<tr >
    <th bgcolor=>ID</th>
    <th bgcolor=>Name</th>
</tr>
<c:forEach var="Game" begin="0" items="${requestScope.gamesList}">
<tr>
    <td>${Game.gn}&nbsp;&nbsp;</td> 
    <td>${Game.name}&nbsp;&nbsp;</td> 
</tr> 

</c:forEach>
<form id="ListGames" action="ListGames" method="post">
    <input type="submit" id="ListGames" value="List Games"/>
</form>

<form id="CreateGame" action="CreateGame" method="post">
<tr><td>Name: </td><td><input type="text" id = "name" name="name" /></td></tr>
    <input type="submit" id="CreateGame" value="Create a Game"/>
</form>

</table>
<a href="Login.jsp"><strong>Login a user</strong></a>

</body>
</html>