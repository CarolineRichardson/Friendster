<%-- 
    Document   : seeFriends
    Created on : 25-Nov-2015, 16:46:17
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
        <title>JSP Page</title>
    </head>
    <body>
        
<table id="friendsListTable" border="3">
<tr >
    <th bgcolor=>ID</th>
    <th bgcolor=>Sender ID</th>
    <th bgcolor=>Receiver ID</th>

</tr>
<c:forEach var="Friend" begin="0" items="${requestScope.friendList}">
<tr>
    <td>${Friend.ID}&nbsp;&nbsp;</td> 
    <td>${Friend.sender}&nbsp;&nbsp;</td> 
    <td>${Friend.receiver}&nbsp;&nbsp;</td> 
</tr> 

</c:forEach>
.

</table>
        
<table id="usersListTable" border="3">
<tr >
    <th bgcolor=>ID</th>
    <th bgcolor=>Username</th>
</tr>

<c:forEach var="Friend" begin="0" items="${requestScope.friendsList_2}">
<tr>
    <td>${Friend.id}&nbsp;&nbsp;</td> 
    <td>${Friend.username}&nbsp;&nbsp;</td> 
</tr> 
</c:forEach>
</table>
        
        <form id="ListFriends" action="ListFriends" method="post">
        <tr><td>Your ID:</td><td><input type="text" id = "yourID" name="yourID" /></td></tr>  
        <input type="submit" id="ListFriends" value="List Friends"/>
        </form>
    </body>
</html>
