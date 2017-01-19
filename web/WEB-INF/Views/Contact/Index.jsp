<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 19.1.2017
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/submitContactForm" method="post">
    <p>
        Person Name : <input name="personName" type="text" placeholder="Enter name"/>
    </p>
    <p>
        Person Email : <input name="personEmail" type="email" placeholder="Enter email"/>
    </p>
    <p>
        Person Message : <input name="personMessage" type="text" placeholder="Enter text"/>
    </p>
    <p>
        <input type="submit" value="Send Messsage"/>
    </p>
</form>

</body>
</html>
