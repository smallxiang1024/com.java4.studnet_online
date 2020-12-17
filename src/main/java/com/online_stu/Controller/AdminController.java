/**
 * @ClassName AdminController
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/12/5 21:53
 * @updateDate 2020/12/5 21:53
 * @version 1.0
 **/
package com.online_stu.Controller;

import org.apache.catalina.Session;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.Name;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

/**
 @author ljh
 @create 2020-12-05-21:53
 **/
@Controller
public class AdminController {
    @RequestMapping("/admin")
    public String getAdmin(HttpServletRequest request,String name,String password)
    {
        //获取姓名
        request.setAttribute("name",name);
        //放入session域中
        HttpSession session = request.getSession();

        session.setAttribute("name",name);
        session.setAttribute("password",password);

        System.out.println(request.getAttribute("name"));
        return "admin";
    }



    @RequestMapping("/welcome")
    public String getWelcome(){
        return "welcome";
    }


}
