/**
 * @ClassName LoginController
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/12/9 17:02
 * @updateDate 2020/12/9 17:02
 * @version 1.0
 **/
package com.online_stu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 @author ljh
 @create 2020-12-09-17:02
 **/
@Controller
public class LoginController {
        //获取登录界面
    @RequestMapping("/login")
    public String getLogin(){

        return "login";
    }
    @RequestMapping("/loginout")
    public String getlouout(HttpSession session){
        session.removeAttribute("name");
        session.removeAttribute("password");
        return "login";
    }

}
