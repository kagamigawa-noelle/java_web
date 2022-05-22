<%--
  Created by IntelliJ IDEA.
  User: Shinelon
  Date: 2022/4/25
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>域对象</title>
</head>
<body>
    <%
        pageContext.setAttribute("pageContextKey", "保存在pageContext中得数据");
    %>
    <%= pageContext.getAttribute("pageContextKey") %>
    <%=    request.getAttribute("reqKey")%>
    <%=     session.getAttribute("sesskey")%>
    <%=     application.getAttribute("appkey")%>
<a href="domainObject2.jsp">跳转到domainObject2.jsp页面</a>
</body>
</html>
