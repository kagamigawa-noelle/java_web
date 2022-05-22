<%--
  Created by IntelliJ IDEA.
  User: Shinelon
  Date: 2022/5/8
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>登录</title>
    <style>
        .logim{
            width: 360px;
            height: 200px;
            margin: 100px auto;
            background-color: #F5F5F5;
            display: flex;
            flex-direction: column;
            justify-content: space-around;
            padding-left: 40px;
        }
        .logim input[name]{
            width: 300px;
        }
        .bt input{
            width: 100px;
            height: 40px;
            color: white;
            font-weight: 600;
            background-color: #00A6FD;
            border: 0;
            border-radius: 20px;

        }
        .bt input:hover{
            cursor: pointer;
        }
        .bt span{
            font-size: 14px;
            font-weight: 500;
            color: #538BCA;
            margin-left: 8px;
        }
        .bt span:hover{
            text-decoration: underline;
            cursor: pointer;
        }

    </style>
</head>
<body>
<form action="/login1" method="post">
    <div class="logim">
        <h4>Sign in with existing account</h4>
        <input type="text" name="username" placeholder="Email address or Username">
        <input type="password" placeholder="Password" name="password">
        <div class="bt">
            <input type="submit" value="Sign In">
            <span>Forgot Password?</span>
        </div>
    </div>
</form>

</body>
</html>
