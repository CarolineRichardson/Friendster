

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account</title>
    </head>
    <body>

    <h1>Here's your Details:</h1>
    
<table id="userListTable" border="3">
<tr >
    <th bgcolor=>ID</th>
    <th bgcolor=>Username</th>
    <th bgcolor=>FriendCode</th>
    <th bgcolor=>Country</th>
    <th bgcolor=>Email</th>
    
</tr>
<c:forEach var="User" begin="0" items="${requestScope.userList}">
<tr>
    <td>${User.id}&nbsp;&nbsp;</td>
    <td>${User.username}&nbsp;&nbsp;</td> 
    <td>${User.friendCode}&nbsp;&nbsp;</td> 
    <td>${User.country}&nbsp;&nbsp;</td> 
    <td>${User.email}&nbsp;&nbsp;</td> 
</tr> 

</c:forEach>

</table>
    
<a href="AddFriend.jsp"><strong>Add a Friend</strong></a>
</body>
</html>
