<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2020/10/25
  Time: 16:39
  To change this template use File | Settings | File Templates.
<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2020/10/25
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html  class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>后台登录-X-admin2.2</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="stylesheet" href="/admin/css/font.css">
    <link rel="stylesheet" href="/admin/css/login.css">
    <link rel="stylesheet" href="/admin/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="/admin/lib/layui/layui.js" charset="utf-8"></script>
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body class="login-bg">

<div class="login layui-anim layui-anim-up">
    <div class="message">x-admin2.0-管理登录</div>
    <div id="darkbannerwrap"></div>

    <form method="post" class="layui-form"  action="/admin">
        <input name="name" placeholder="用户名"  type="text" lay-verify="required" class="layui-input" >
        <hr class="hr15">
        <input name="password" lay-verify="required" placeholder="密码"  type="password" class="layui-input">
        <hr class="hr15">

        <div class="layui-form-item">
            <label class="layui-form-label">选择身份</label>
            <div class="layui-input-block">
                <select name="position" lay-verify="required">
                    <option value=""></option>
                    <option value="0">员工</option>
                    <option value="1">主管</option>
                    <option value="2">系统管理员</option>
                </select>
            </div>
        </div>

        <hr class="hr15">

                <input value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit">
<%--        <button class="layui-btn layui-btn-fluid login-btn" lay-submit lay-filter="login" >登录</button>--%>
        <hr class="hr20" >


    </form>


</div>

<script>


</script>

</body>
</html>
