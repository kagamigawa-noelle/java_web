<%@ page import="java.util.ArrayList" %>
<%@ page import="javaModel.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: Shinelon
  Date: 2022/5/25
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有用户</title>
</head>
<body>
    <% ArrayList<User> users=(ArrayList<User>) request.getAttribute("users"); %>
    <table border="2">
        <tr><th>状态</th><th>教育程度</th><th>计算机科学或工程学是您的主要研究领域吗？</th><th>电子邮件地址</th>
        <th>姓名</th><th>国家/地区</th><th>出生日期</th><th>您的学术机构的名称</th><th>您的学术机构的网站</th>
        <th>是否有国家颁发的文凭</th><th>一年或更长全日制</th><th>官方文件</th><th>学生证等链接</th><th>学信网报告在线验证码</th>
        <th>注释</th><th>不到13岁</th><th>阅读并接受</th><th>同意各种信息</th><th>操作</th>
        </tr>
        <%
            System.out.println(users.get(0).getName());
            for (int i = 0; i <users.size() ; i++) {
        %>
        <tr>
            <td><%= users.get(i).getJob()%> </td>
            <td><%= users.get(i).getRecord()%> </td>
            <td><%= users.get(i).getIsMain()%> </td>
            <td><%= users.get(i).getEmail()%> </td>
            <td><%= users.get(i).getName()%> </td>
            <td><%= users.get(i).getNation()%> </td>
            <td><%= users.get(i).getBirth()%> </td>
            <td><%= users.get(i).getSchool()%> </td>
            <td><%= users.get(i).getWebside()%> </td>
            <td><%= users.get(i).getIsN()%> </td>
            <td><%= users.get(i).getIsM()%> </td>
            <td><%= users.get(i).getFile()%> </td>
            <td><%= users.get(i).getZhengming()%> </td>
            <td><%= users.get(i).getYanzheng()%> </td>
            <td><%= users.get(i).getZhushi()%> </td>
            <td><%= users.get(i).getAgeless()%> </td>
            <td><%= users.get(i).getIsAllow()%> </td>
            <td><%= users.get(i).getAgree()%> </td>
            <td><a href="/update?id=<%= users.get(i).getId()%>" >更新</a> <a onclick="del()" id="del" href="/delete?id=<%= users.get(i).getId()%>">删除</a></td>
        </tr>
        <%
            }
        %>
        <a href="/application.html">新增用户</a>
    </table>

</body>
    <script type="text/javascript">
        function del() {
            if(!confirm("真的要删除吗？？不可挽回哦！！")){
                window.event.preventDefault()
            }
        }
    </script>
</html>
