<%@ page import="java.util.List,com.example.jsp.Employee" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: ooinz
  Date: 2022/4/15
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<Employee> emps = new ArrayList<>();
    for (int i = 0; i <= 5; i++) {
        emps.add(new Employee(i, "emp" + i, 18 + i, "emp" + i + "@163.com"));
    }
%>


<table border="1">
    <th>
        <tr>
        </tr>
    </th>
    <tb>
        <%
            for (int i = 0; i < emps.size(); i++) {
                Employee emp = emps.get(i);
        %>
        <tr>
            <td><%= emp.getId() %>
            </td>
            <td><%= emp.getName() %>
            </td>
            <td><%= emp.getAge() %>
            </td>
            <td><%= emp.getEmail() %>
            </td>
        </tr>
        <%
            }
        %>
        <!--循环六次-->
    </tb>
</table>


</body>
</html>
