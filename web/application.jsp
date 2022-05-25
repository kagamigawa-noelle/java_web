<%@ page import="javaModel.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: Shinelon
  Date: 2022/5/25
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    User user=(User)request.getAttribute("user");
%>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Jetbrains</title>
    <style>
        @media screen and (max-device-width:1080px) {
            .top {
                width: 1080px;
            }
        }

        * {
            margin: 0;
            padding: 0;
        }

        .mainbox ul {
            display: inline-block;
            margin-top: 15px;
            padding-left: 0;
            border-bottom: 1px solid #D3D3D3;
        }

        .mainbox ul li {
            float: left;
            overflow: hidden;
            display: inline-block;
            text-align: center;
            color: #838583;
            font-size: 16px;
            padding: 15px 0;
            list-style: none;
            margin-right: 24px;
        }

        .mainbox ul li:hover {
            border-bottom: 1px solid black;
            color: #161616;
            cursor: pointer;
        }

        .mainbox ul li:nth-child(4) {
            margin-right: 0;
        }

        .con {
            width: 1080px;
            margin: auto;
        }

        .top {
            height: 76px;
            display: flex;
            justify-content: center;
            align-items: center;
            background-color: #161616;
        }

        .top>img {
            margin-right: 20%;
        }

        .top div {
            display: flex;
            align-items: center;
            margin-left: 20%;
        }

        .top select {
            font-size: 16px;
            width: 200px;
            height: 45px;
        }

        .main {
            position: relative;
        }

        .main h1 {
            margin-top: 50px;
            margin-bottom: 48px;
            font-size: 34px;
        }

        .main>span {
            font-size: 18px;
            color: #2E2E2E;
        }

        .main span a {
            color: #6075D6;
        }

        .mainbox {
            position: relative;
            margin-top: 50px;
            padding-top: 60px;
            padding-left: 20px;
            background-color: #F5F5F5;
            overflow: hidden;
        }

        .mainbox span {
            display: inline-block;
            float: left;
            overflow: hidden;
            color: #838583;
            padding-bottom: 10px;
            margin-top: 28px;
            width: 180px;
        }

        .ways {
            overflow: hidden;
        }

        .way-email {
            overflow: hidden;
            vertical-align: middle;
        }

        .way-email input {
            width: 20px;
            height: 20px;
        }

        label {
            font-size: 18px;
        }

        .left {
            margin-top: 26px;
            float: left;
        }

        .left .student {
            margin-bottom: 10px;
        }

        .left .teacher {
            margin-bottom: 15px;
        }

        .email-stu {
            overflow: hidden;
        }

        .email-stu>div {
            float: left;
        }

        .email-stu div select {
            width: 500px;
            height: 45px;
            font-size: 17px;
            margin-top: 20px;
            margin-bottom: 17px;
        }

        .email-stu>div div {
            color: #545754;
        }

        i,
        em {
            display: block;
            text-decoration: none;
            font-style: normal;
        }

        .email-stu i {
            margin: 15px 0;
        }

        .mail div {
            float: left;
        }

        .mail div input {
            width: 500px;
            height: 40px;
            margin-top: 20px;
            font-size: 16px;
            margin-bottom: 10px;
        }

        .mail div i,
        .isic i {
            font-size: 13px;
            color: #777777;
        }

        .mail {
            overflow: hidden;
        }

        .name>div {
            float: left;
            margin-top: 28px;
            color: #838583;
        }

        .name>div strong {
            color: #161616;
        }

        .name i {
            display: block;
        }

        .name i input {
            width: 240px;
            height: 35px;
            margin-top: 10px;
            padding-left: 8px;
            font-size: 16px;
        }

        .name {
            overflow: hidden;
        }

        .nation {
            overflow: hidden;
        }

        .nation div {
            float: left;
        }

        .nation div select {
            width: 500px;
            height: 40px;
            margin-top: 22px;
            font-weight: bold;
            font-size: 16px;
        }

        .age13 {
            overflow: hidden;
        }

        .age13 div {
            float: left;
        }

        .age13 div input {
            margin-top: 47px;
            cursor: pointer;
        }

        .age13 div label {
            color: #3A4D54;
            font-size: 16px;
            cursor: pointer;
        }

        a {
            color: #18ABF9!important;
        }

        .age13 h2 {
            display: inline-block;
            font-weight: 400;
            font-size: 13px;
            margin-left: 10px;
            text-decoration: underline;
            color: #838583;
            cursor: pointer;
        }

        .sub {
            width: 155px;
            height: 52px;
            border: 0;
            background-color: #18A3FA;
            border-radius: 30px;
            color: white;
            font-weight: 600;
            margin-bottom: 25px;
        }

        .bottom ul li {
            display: inline-block;
            list-style: none;
            color: #838583;
            font-size: 14px;
            border-right: 2px solid #ccc;
            padding-right: 5px;
        }

        .bottom ul li:nth-child(6) {
            border: 0;
        }

        .bottom ul li:nth-child(n+2):nth-child(-n+5) {
            text-decoration: underline;
            cursor: pointer;
        }

        .bottom ul li:nth-child(n+2):nth-child(-n+5):hover {
            color: #18A3FA;
        }

        .bottom ul {
            margin-top: 70px;
            margin-bottom: 30px;
        }

        .main .mainbox .ways .active {
            color: #18A3FA;
            border-bottom: 3px solid #18ABF9;
        }

        #github {
            overflow: hidden;
            padding-top: 35px;
            padding-left: 100px;
        }

        #github img {
            float: left;
            display: block;
            width: 70px;
            height: 80px;
        }

        #github p {
            color: #545754;
            margin-left: 25px;
            float: left;
            display: block;
        }

        #github input {
            width: 185px;
            height: 50px;
            border: 0;
            color: white;
            border-radius: 30px;
            background-color: #18A3FA;
            margin-top: 25px;
            margin-left: 90px;
        }

        #github a {
            display: inline-block;
            margin-top: 35px;
            margin-left: 90px;
            margin-bottom: 60px;
        }

        .isic {
            overflow: hidden;
            display: none;
        }

        .isic div {
            float: left;
        }

        .isic div input {
            width: 315px;
            height: 40px;
            margin-top: 20px;
            margin-bottom: 10px;
        }

        #isicimg {
            position: absolute;
            display: none;
            background-image: url(http://localhost:8080/isic);
            top: 690px;
            left: 530px;
            width: 175px;
            height: 130px;
        }

        .warn {
            display: none;
        }

        .warn div {
            color: #AB8656;
            margin-top: 35px;
        }

        .warn div p {
            display: block;
            margin-left: 180px;
            margin-top: 10px;
        }

        .out {
            display: none;
            overflow: hidden;
            margin-top: 20px;
        }

        #xuexin {
            overflow: hidden;
        }

        #xuexin input {
            display: block;
            float: left;
            margin-top: 15px;
            width: 190px;
            height: 40px;
        }

        #sch {
            overflow: hidden;
        }

        #sch input {
            display: block;
            float: left;
            width: 500px;
            height: 40px;
            margin-top: 20px;
        }

        #web {
            overflow: hidden;
        }

        #web input {
            display: block;
            float: left;
            width: 490px;
            height: 40px;
            margin-top: 20px;
            font-size: 16px;
            padding-left: 10px;
        }

        #options {
            overflow: hidden;
            margin-top: 20px;
        }

        #options label {
            cursor: pointer;
        }

        #options p {
            font-size: 17px;
            display: block;
            margin-bottom: 10px;
            color: #777777;
        }

        .file {
            float: left;
            z-index: -1;
            width: 115px;
            height: 40px;
            text-align: center;
            margin-top: 20px;
            line-height: 40px;
            background-color: #F5F5F5;
            border: 1px solid #ccc;
            border-radius: 20px;
        }

        .file i {
            display: block;
            position: absolute;
            margin-left: 30px;
            color: #18ABF9;
            font-size: 14px;
        }

        #files .file input {
            position: relative;
            cursor: pointer;
            opacity: 0;
            width: 115px;
            height: 40px;
            z-index: 999;
            margin: 0;
        }

        .out em {
            float: left;
            display: block;
            margin-top: 28px;
            font-size: 15px;
            color: #777777;
        }

        #files {
            position: relative;
            overflow: hidden;
        }

        #files .att {
            position: absolute;
            width: 250px;
            height: 150px;
            top: 25px;
            left: 720px;
        }

        #files .att p {
            margin: 0;
            margin-bottom: 10px;
            font-size: 13px;
        }

        #files .att p img {
            display: block;
            float: left;
            width: 40px;
            height: 55px;
            margin-right: 10px;
        }

        #files p {
            display: block;
            float: left;
            width: 1000px;
            margin-left: 190px;
            margin-top: 22px;
            color: #777777;
        }

        #files input {
            display: block;
            float: left;
            margin-left: 190px;
            width: 500px;
            height: 40px;
            margin-top: 10px;
        }

        #test {
            overflow: hidden;
        }

        #test input {
            display: block;
            float: left;
            width: 500px;
            height: 40px;
            margin-left: 10px;
            margin-top: 20px;
        }

        #zhushi textarea {
            display: block;
            float: left;
            width: 500px;
            height: 100px;
            margin-top: 30px;
            margin-left: 10px;
        }

        .team {
            display: none;
        }
    </style>
</head>

<body>
<!-- 头部部分 -->
<div class="top">
    <img src="http://localhost:8080/logo">
    <div>
        <img src="http://localhost:8080/text" class="wen">
        <select>
            <option>简体中文</option>
            <option>English</option>
            <option>Japanese</option>
        </select>
    </div>

</div>
<!-- 主体部分 -->
<form action="http://localhost:8080/updateuser?id=<%=user.getId()%>" method="post">
    <div class="main con">
        <h1>JetBrains 学习产品</h1>
        <span>在应用之前，请阅读<a href="#">教育订阅条款和常见问题解答</a>。</span>
        <div class="mainbox">
            <div id="isicimg"></div>
            <div class="ways">
                <span>申请方式:</span>
                <ul>
                    <li index="0">
                        大学电子邮件地址</li>
                    <li index="1">ISIC/ITIC 成员</li>
                    <li class="active" index="2">官方文件</li>
                    <li index="3">GitHub</li>
                </ul>
            </div>
            <div id="containt">
                <div class="warn">
                    <span></span>
                    <div>
                        您的申请和正式文件将由真人审查。<br> 处理时间大概需要两周。
                        <p>要立即获得免费许可证，请考虑选择其他申请方式。</p>

                    </div>
                </div>
                <div class="way-email">
                    <span>状态：</span>
                    <div class="left">
                        <div class="student">
                            <input type="radio" name="work" id="stu" <%=user.getJob().equals("我是学生")?"checked":""%> value="我是学生">
                            <label for="stu">我是学生</label>
                        </div>
                        <div class="teacher">
                            <input type="radio" name="work" id="tea" value="我是老师" <%=user.getJob().equals("我是老师")?"checked":""%>>
                            <label for="tea">我是教师</label>
                        </div>

                    </div>
                </div>
                <div class="email-stu">
                    <span>教育程度：</span>
                    <div>
                        <select name="record">
                            <option <%=user.getRecord().equals("中学（初中或高中）")?"selected":""%> value="中学（初中或高中）">中学（初中或高中）</option>
                            <option <%=user.getRecord().equals("职业教育")?"selected":""%> value="职业教育">职业教育</option>
                            <option <%=user.getRecord().equals("大学生")?"selected":""%> value="大学生">大学生</option>
                            <option <%=user.getRecord().equals("硕士研究生/博士研究生")?"selected":""%> value="硕士研究生/博士研究生">硕士研究生/博士研究生</option>
                        </select>
                        <div>
                            计算机科学或工程学是您的主要研究领域吗？
                        </div>
                        <i>
                            <em><input type="radio" name="isMain" id="is" <%=user.getIsMain().equals("是")?"checked":""%>><label for="is">是</label></em>
                            <em><input type="radio" name="isMain" id="not" <%=user.getIsMain().equals("否")?"checked":""%>><label for="not" value="不是">否</label></em>
                        </i>
                    </div>

                </div>
                <div class="mail">
                    <span>电子邮件地址:</span>
                    <div id="stu-email">
                        <input type="email" placeholder="大学电子邮件地址，如js@mit.edu" name="email">
                        <i>
                            本人保证以上提供的大学电子邮件地址有效<br/>
                            并且属于本人。
                        </i>
                    </div>
                    <div id="isic-email" style="display: none;">
                        <input type="email" name="email2" value="<%=user.getEmail()%>">
                        <i>
                            我确认上面提供的电子邮件地址属于我。
                        </i>
                    </div>
                </div>
                <div class="name">
                    <span>姓名：</span>
                    <div>您的护照、驾驶执照或其他合法证件上显示的<strong>真名</strong>。
                        <i><input type="text" placeholder="名" name="firstName" value="<%=user.getName().substring(1)%>"> <input type="text" placeholder="姓" name="lastName" value="<%=user.getName().substring(0,1)%>"></i>
                    </div>

                </div>
                <div class="nation">
                    <span>国家/地区：</span>
                    <div>
                        <select name="nation" value="<%=user.getNation()%>">
                            <option <%=user.getNation().equals("中国大陆")?"selected":""%> value="中国大陆">中国大陆</option>
                            <option <%=user.getNation().equals("法国")?"selected":""%> value="法国">法国</option>
                            <option <%=user.getNation().equals("德国")?"selected":""%> value="德国">德国</option>
                            <option <%=user.getNation().equals("日本")?"selected":""%> value="日本">日本</option>
                            <option <%=user.getNation().equals("韩国")?"selected":""%> value="韩国">韩国</option>
                            <option <%=user.getNation().equals("朝鲜")?"selected":""%> value="朝鲜">朝鲜</option>
                            <option <%=user.getNation().equals("俄罗斯")?"selected":""%> value="俄罗斯">俄罗斯</option>
                            <option <%=user.getNation().equals("乌克兰")?"selected":""%> value="乌克兰">乌克兰</option>
                        </select>
                    </div>
                </div>
                <div class="isic">
                    <span>ISIC/ITIC 姓名:</span>
                    <div>
                        <input type="text">
                        <i>卡片上显示的您的姓名（如 B. Smart）。
                        </i>
                    </div>

                </div>
                <div class="isic">
                    <span>ISIC/ITIC ID:</span>
                    <div>
                        <input type="text">
                        <i>您的 ISIC/ITIC 序列号（如 S123456789012X）。
                        </i>
                    </div>

                </div>
                <div class="out">
                    <div id="xuexin">
                        <span>出生日期：</span>
                        <input type="date" name="birth" value="<%=user.getBirth()%>">
                    </div>
                    <div id="sch">
                        <span>您的学术机构的名称：</span>
                        <input type="text" name="school" value="<%=user.getSchool()%>">
                    </div>
                    <div id="web">
                            <span>您的学术机构的网站：
                            </span>
                        <input type="text" placeholder="http:\\myschool.edu" name="webside" value="<%=user.getWebside()%>">
                    </div>
                    <div id="options" class="stum">
                        <span></span>
                        <p><input type="checkbox" id="m" name="isN" <%=user.getIsN().equals("有")?"checked":""%> <label for="m">我就读的教育机构提供高等教育
                            <br> &nbsp;&nbsp; 并颁发国家认可的文凭</label>
                        </p>
                        <span></span>
                        <p><input type="checkbox" id="t" name="isM" <%=user.getIsM().equals("是")?"checked":""%>><label for="t">我参加的教育课程需要一年或
                            <br> &nbsp;&nbsp;更长时间的全日制学习来完成</label>
                    </div>
                    <div id="options" class="team">
                        <span></span>
                        <p><input type="checkbox" id="zz" > <label for="zz">我就读的教育机构提供高等教育
                            <br> &nbsp;&nbsp; 并颁发国家认可的文凭</label>
                        </p>
                        <span></span>
                        <p><input type="checkbox" id="xx"><label for="xx">我教授的课程是教育项目的一部分 <br> &nbsp;&nbsp;
                            需要一年或
                            更长时间的全日制学习来完成</label>
                        </p>
                        <span></span>
                        <p><input type="checkbox" id="yy"><label for="yy">我全日制授课，并将所提供的许可证仅用于<br> &nbsp;&nbsp;
                            非商业教育目的</label>
                        </p>
                    </div>
                    <div id="files">
                        <div class="att">
                            <p>
                                我们需要您提供最近 6 个月内的注册信 <br> 息或成绩单。
                            </p>
                            <p>该文件必须包含：您的姓名、学生证 <br> 号、日期等信息。</p>
                            <p><img src="http://localhost:8080/li" id="pdf">您还可以使用 <a href="#">chsi.com.cn</a> 的学 <br> 校状态验证报告。<br> <a href="#">它是什么样的？</a>
                            </p>
                        </div>
                        <span>官方文件：</span>
                        <div class="file">
                            <i>添加文件</i>
                            <input type="file" name="file" value="<%=user.getFile()%>">
                        </div>
                        <em>（最大4mb）</em>
                        <p>添加任何证明您与您的学术机构有附属关系的正式文件（如学生 <br> 证），或提供可以找到此类信息的链接：</p>
                        <input type="text" name="zhengming" value="<%=user.getZhengming()%>">
                    </div>
                    <div id="test">
                            <span>学信网报告在线验证码：
                            </span>
                        <input type="text" name="yanzheng" value="<%=user.getYanzheng()%>">
                    </div>
                    <div id="zhushi">
                        <span>注释（可选）：</span>
                        <textarea name="zhushi"><%=user.getZhushi()%></textarea>
                    </div>

                </div>

                <div class="age13">
                    <span></span>
                    <div id="min13">
                        <input type="checkbox" id="age" name="ageless" <%=user.getAgeless().equals("是")?"checked":""%>>
                        <label for="age">我不到13岁</label>
                    </div>
                </div>
                <div class="age13">
                    <span></span>
                    <div>
                        <input type="checkbox" id="xie" name="isAllow" <%=user.getIsAllow().equals("同意")?"checked":""%>>
                        <label for="xie">我已阅读并接受</label>
                        <a href="#">JetBrains Account协议</a><br>

                        <input type="checkbox" id="agree" name="agree" <%=user.getAgree().equals("同意")?"checked":""%>>
                        <label for="agree">我同意在关于我或我的组织持有的 JetBrains 产品或使用的服务的电子邮件通讯中使用我的姓名、电
                            <br>&nbsp;&nbsp;&nbsp;
                            子邮件地址和位置数据。</label>
                        <h2 class="more">更多优势</h2>
                        <br>
                        <input type="submit" class="sub" value="申请免费产品">

                    </div>
                </div>
            </div>
            <div id="github" style="display: none;">
                <img src="http://localhost:8080/bag" alt="">
                <p>
                    您已经有 GitHub 学生开发者包了吗？<br> 如果有，您可以使用 GitHub 帐户申请 JetBrains 工具的免费许可证。<br><br> 我们会将您转到 GitHub 来验证您的学生身份，然后再返回这里来询问一些最终的附加细节。
                </p>
                <input type="submit" value="通过GITHUB授权"><br>
                <a href="#">如果你还没有 GitHub 学生开发者包，请了解更多关于 GitHub 教育</a>的信息。

            </div>

        </div>

        <!-- 底部部分 -->
        <div class="bottom">
            <ul>
                <li>Copyright © 2000–2022 JetBrains s.r.o.</li>
                <li>帮助</li>
                <li>支持</li>
                <li>JetBrains 隐私政策</li>
                <li>JetBrains 帐户协议</li>
                <li>Build #2022.03-2747</li>
            </ul>
        </div>
    </div>
</form>

<script type="text/javascript">
    // 大学电子邮件地址，ISIC/ITIC 成员，老师与学生之间的切换逻辑部分
    var student = document.getElementsByClassName('student')[0];
    var teacher = document.getElementsByClassName('teacher')[0];
    var edu = document.getElementsByClassName('email-stu')[0];
    var age13 = document.getElementById("min13")
    var ways = document.querySelector('.mainbox .ways ul');
    var childs = ways.children;
    var downlo=document.getElementById("pdf");
    downlo.onclick=function(){
        window.location.href="http://localhost:8080/pdfdown"
    }
    teacher.onclick = function(e) {
        if (childs[3].getAttribute('class') !== 'active') {
            edu.style.display = 'none';
            age13.style.display = 'none'
            document.getElementById('isicimg').style.top = '510px';
            document.getElementById('isicimg').style.backgroundPosition = '0px 220px'
        }
        if (childs[2].getAttribute('class') == 'active') {
            document.getElementsByClassName('team')[0].style.display = 'block';
            document.getElementsByClassName('stum')[0].style.display = 'none';
            document.getElementById('test').style.display = 'none';
        }
    }
    student.onclick = function() {
        if (childs[3].getAttribute('class') !== 'active') {
            edu.style.display = 'block'
            age13.style.display = 'block'
            document.getElementById('isicimg').style.top = '690px';
            document.getElementById('isicimg').style.backgroundPosition = '0 0'
        }
        if (childs[2].getAttribute('class') == 'active') {
            document.getElementsByClassName('team')[0].style.display = 'none';
            document.getElementsByClassName('stum')[0].style.display = 'block';
            document.getElementById('test').style.display = 'block';
        }

    }

    ways.onclick = function(e) {
        console.log(e.target.getAttribute('index'))
        if (e.target.getAttribute('index') !== null) {
            for (let i = 0; i < childs.length; i++) {
                childs[i].removeAttribute('class');
            }
            e.target.setAttribute('class', 'active');
            if (e.target.getAttribute('index') == 1) {
                document.getElementsByClassName('isic')[0].style.display = 'block';
                document.getElementsByClassName('isic')[1].style.display = 'block';
                document.getElementById('isicimg').style.display = 'block'
            } else {
                document.getElementsByClassName('isic')[0].style.display = 'none';
                document.getElementsByClassName('isic')[1].style.display = 'none';
                document.getElementById('isicimg').style.display = 'none'
            }
            if (e.target.getAttribute('index') == 2) {
                document.getElementsByClassName('warn')[0].style.display = 'block';
                document.getElementsByClassName('out')[0].style.display = 'block';
            } else {
                document.getElementsByClassName('warn')[0].style.display = 'none';
                document.getElementsByClassName('out')[0].style.display = 'none';
            }
            if (e.target.getAttribute('index') == 1 || e.target.getAttribute('index') == 2) {
                document.getElementById('stu-email').style.display = 'none';
                document.getElementById('isic-email').style.display = 'block';
            } else {
                document.getElementById('stu-email').style.display = 'block';
                document.getElementById('isic-email').style.display = 'none';
            }
            if (e.target.getAttribute('index') == 3) {
                document.getElementById('containt').style.display = 'none'
                document.getElementById('github').style.display = 'block'
            } else {
                document.getElementById('containt').style.display = 'block'
                document.getElementById('github').style.display = 'none'
            }
        }
    }
</script>
</body>

</html>