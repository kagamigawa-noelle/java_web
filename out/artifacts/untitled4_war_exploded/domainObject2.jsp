<%--
  Created by IntelliJ IDEA.
  User: Shinelon
  Date: 2022/4/25
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>域对象</title>
</head>
<body>
<%= pageContext.getAttribute("pageContextKey") %>
<%=    request.getAttribute("reqKey")%>
<%=     session.getAttribute("sessKey")%>
<%=     application.getAttribute("appKey")%>
</body>
</html>
