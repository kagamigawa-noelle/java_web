<%--
  Created by IntelliJ IDEA.
  User: Shinelon
  Date: 2022/5/15
  Time: 23:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="javaModel.entity.User" language="java" %>
<html>
<head>
    <meta charset=\"utf-8\">
</head>
<body>
<table border='2' cellspacing='0'>
    <% User user=(User) request.getAttribute("user"); %>
    <h1><%=user.getName()%>同学提交成功！</h1>
    <tr>
        <th>信息名</th>
        <th>值</th>
    </tr>
    <tr>
        <td>状态</td>
        <td><%=user.getJob()%></td>
    </tr>
    <tr>
        <td>教育程度</td>
        <td><%=user.getRecord()%></td>
    </tr>
    <tr>
        <td>计算机科学或工程学是您的主要研究领域吗？</td>
        <td><%=user.getIsMain()%></td>
    </tr>
    <tr>
        <td>电子邮件地址</td>
        <td><%=user.getEmail()%></td>
    </tr>
    <tr>
        <td>姓名</td>
        <td><%=user.getName()%></td>
    </tr>
    <tr>
        <td>国家/地区</td>
        <td><%=user.getNation()%></td>
    </tr>
    <tr>
        <td>出生日期</td>
        <td><%=user.getBirth()%></td>
    </tr>
    <tr>
        <td>您的学术机构的名称</td>
        <td><%=user.getSchool()%></td>
    </tr>
    <tr>
        <td>您的学术机构的网站</td>
        <td><%=user.getWebside()%></td>
    </tr>
    <tr>
        <td>是否有国家颁发的文凭</td>
        <td><%=user.getIsN()%></td>
    </tr>
    <tr>
        <td>一年或更长全日制</td>
        <td><%=user.getIsM()%></td>
    </tr>
    <tr>
        <td>官方文件</td>
        <td><%=user.getFile()%></td>
    </tr>
    <tr>
        <td>学生证等链接</td>
        <td><%=user.getZhengming()%></td>
    </tr>
    <tr>
        <td>学信网报告在线验证码</td>
        <td><%=user.getYanzheng()%></td>
    </tr>
    <tr>
        <td>注释</td>
        <td><%=user.getZhushi()%></td>
    </tr>
    <tr>
        <td>不到13岁</td>
        <td><%=user.getAgeless()%></td>
    </tr>
    <tr>
        <td>阅读并接受</td>
        <td><%=user.getIsAllow()%></td>
    </tr>
    <tr>
        <td>同意各种信息</td>
        <td><%=user.getAgree()%></td>
    </tr>
</table>
</body>
</html>
