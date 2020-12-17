<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2020/10/26
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>学生线上管理系统--课程管理</title>
    <link rel="stylesheet" type="text/css" href="https://www.layuicdn.com/layui/css/layui.css" />
</head>
<body>

<form class="layui-form" id="useradmin"  style="display: none" lay-filter="example">
    <div class="layui-form-item">
        <label class="layui-form-label">课程编号</label>
        <div class="layui-input-block">
            <input type="text" name="cid" lay-verify="id" autocomplete="off" placeholder="请输入课程编号" class="layui-input">
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">课程名</label>
        <div class="layui-input-block">
            <input type="text" name="cname" lay-verify="name" autocomplete="off" placeholder="请输入课程名" class="layui-input">
        </div>
    </div>



    <div class="layui-form-item">
        <label class="layui-form-label">课时</label>
        <div class="layui-input-block">
            <input type="text" name="chours" lay-verify="pass" placeholder="请输入课时" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">学分</label>
            <div class="layui-input-inline">
                <input type="text" name="cscore"  placeholder="请输入学分" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>



    <div class="layui-form-item">
        <div class="layui-input-block">
<%--            <button type="button" class="layui-btn layui-btn-normal" id="LAY-component-form-setval">赋值</button>--%>
<%--            <button type="button" class="layui-btn layui-btn-normal" id="LAY-component-form-getval">取值</button>--%>
            <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
        </div>
    </div>
</form>




<form class="layui-form" id="usersedit"  style="display: none" lay-filter="userseditform">
    <div class="layui-form-item">
        <label class="layui-form-label">课程编号</label>
        <div class="layui-input-block">
            <input type="text" name="cid" lay-verify="id" autocomplete="off" placeholder="请输入课程编号" class="layui-input">
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">课程名</label>
        <div class="layui-input-block">
            <input type="text" name="cname" lay-verify="name" autocomplete="off" placeholder="请输入课程名" class="layui-input">
        </div>
    </div>



    <div class="layui-form-item">
        <label class="layui-form-label">课时</label>
        <div class="layui-input-block">
            <input type="text" name="chours" lay-verify="pass" placeholder="请输入课时" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">学分</label>
            <div class="layui-input-inline">
                <input type="text" name="cscore"  placeholder="请输入学分" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
<%--            <button type="button" class="layui-btn layui-btn-normal" id="LAY-component-form-setval">赋值</button>--%>
<%--            <button type="button" class="layui-btn layui-btn-normal" id="LAY-component-form-getval">取值</button>--%>
            <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo2">立即提交</button>
        </div>
    </div>
</form>










<div type="text/html" id="toolbarDemo1" style="display: none">
    <div class="layui-btn-container">
        <button  class="layui-btn layui-btn-sm" lay-event="add">添加</button>


    </div>
</div>

<table id="demo" lay-filter="test" ></table>


<script src="https://www.layuicdn.com/layui/layui.js"></script>
<script type="text/html" id="toolbarDemo">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="detal">查看</button>
        <button class="layui-btn layui-btn-sm" lay-event="delete">删除</button>

    </div>
</script>
<script>
    //由于模块都一次性加载，因此不用执行 layui.use() 来加载对应模块，直接使用即可：
    //注意：选项卡 依赖 element 模块，否则无法进行功能性操作
    layui.use(['table','laypage','form','jquery'], function() {
        var table = layui.table;
        var laypage = layui.laypage;
        var form = layui.form;
        var $ = layui.jquery;
        //第一个实例
        table.render({
            elem: '#demo'
            , height: 312
            , url: '/Courses' //数据接口
            , page: true //开启分页
            , limit: 10
            , limits: 3
            ,toolbar: '#toolbarDemo1'
            //,toolbar: 'default'
            , cols: [[ //表头
                {type: 'checkbox'}//开启复选框
                //{field: 'id', title: 'ID', width: 80, sort: true, fixed: 'left'}
                , {field: 'cid', title: '课程编号', width: 80}
                , {field: 'cname', title: '课程名', width: 80}
                , {field: 'chours', title: '课时', width: 80}
                , {field: 'cscore', title: '学分', width: 177}

                , {fixed: 'right',title:'操作', width: 150, align: 'center', toolbar: '#toolbarDemo'}
            ]]
            // ,parseData: function (res) {
            //          return {
            //              "code": res.code,
            //              "msg": res.msg,
            //              "count": res.data.total,
            //              "data": res.data.data
            //          }
            //  },
            //  request: {
            //      pageName: 'curr' //页码的参数名称，默认：page
            //      ,limitName: 'nums' //每页数据量的参数名，默认：limit
            //  }

        });


        //监听表中操作事件
        table.on('tool(test)', function (obj) {
            // var checkStatus = table.checkStatus(obj);
            // console.log(checkStatus);
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            var tr = obj.tr; //获得当前行 tr 的DOM对象
            if (layEvent === 'delete') { //删除
                //do somehing
                //layer.alert(data.toString());
                //layer.msg("查看");
                layer.confirm('真的删除吗',function (index) {
                    //删除函数


                    $.ajax({
                        url: '/CourseDel'
                        , type: 'get'
                        //,data :"username="+data.username
                        ,data:{'cid':data.cid}
                        ,success:function(suc){

                                                    obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                                                    layer.close(index);
                                                    console.log(index);
                                                    layer.msg("删除成功",{icon:1});
                                                }


                                        });
                });

            } else if (layEvent === 'detal') {//查看
                //layer.msg("查看");
                layer.open({
                    type: 1,
                    area: ['500px', '700px'],
                    title: "更改信息",
                    fixed: false, //不固定
                    maxmin: true,
                    maxmin: false,
                    shadeClose:false,
                    content: $('#usersedit')
                });
                console.log(data);
                form.val("userseditform",{
                    "cid":data.cid
                    ,"cname":data.cname
                    ,"chours":data.chours
                    ,"cscore":data.cscore

                });
                // layer.alert(JSON.stringify(data), {
                //     title: '当前行数据：'
                // });

            } else if (layEvent === 'update') {
                layer.msg("更新")
            }
        });



        table.on('toolbar(test)',function (obj) {
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            var tr = obj.tr; //获得当前行 tr 的 DOM 对象（如果有的话）
            if (layEvent==='add'){
                //console.log(JSON.stringify(data));
                layer.open({
                    type: 1,
                    area: ['500px', '700px'],
                    title: "更改信息",
                    fixed: false, //不固定
                    maxmin: true,
                    maxmin: false,
                    shadeClose:false,
                    content: $('#useradmin')
                    //content: '/login'
                });

                // $.ajax({
                //     url: '/add'
                //     , type: 'get'
                //     ,data : JSON.stringify(data)
                //     ,dataType:"json"
                //     ,contentType:"application/json",
                //     success:function(suc){
                //         if(suc==200){
                //             //obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                //             layer.close(index);
                //             console.log(index);
                //             layer.msg("删除成功",{icon:1});
                //         }
                //         else{
                //             layer.msg("删除失败",{icon:5});
                //         }
                //     }
                // });
            }
        })


        //监听提交
        form.on('submit(demo1)', function(data){
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            });
            $.post({
                url:"/CourseAdd",
                type:"post",
                data:JSON.stringify(data.field),
                dataType:"json",
                contentType:"application/json",
                success:function(data){
                    // layer.alert('添加成功', {icon: 1});
                },error:function(data){
                    //layer.alert('添加失败', {icon: 2});
                }
            })
            return false;
        });
        //监听更新提交
        form.on('submit(demo2)', function(data){
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            });
            $.post({
                url:"/CourseUpda",
                type:"put",
                data:JSON.stringify(data.field),
                dataType:"json",
                contentType:"application/json",
                success:function(data){
                    // layer.alert('添加成功', {icon: 1});
                },error:function(data){
                    //layer.alert('添加失败', {icon: 2});
                }
            })
            return false;
        });

    });

</script>
</body>
</html>
