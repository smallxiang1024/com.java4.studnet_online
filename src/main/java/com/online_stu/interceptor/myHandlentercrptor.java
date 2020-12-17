/**
 * @ClassName myHandlentercrptor
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/12/9 20:54
 * @updateDate 2020/12/9 20:54
 * @version 1.0
 **/
package com.online_stu.interceptor;

import com.online_stu.bean.user;
import com.online_stu.service.UserService;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 @author ljh
 @create 2020-12-09-20:54
 **/
//配置一个拦截器，用于检验是否登录
@Component
public class myHandlentercrptor implements HandlerInterceptor {

    @Autowired
    UserService userService;
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
//        String name = (String) httpServletRequest.getSession().getAttribute("name");
//        String password = (String) httpServletRequest.getSession().getAttribute("password");
//        System.out.println(name+password);
//        user user = userService.selectByNamePassService(name, password);
//        if (user!=null&&name.equals(user.getName())&&password.equals(user.getPassword())) {
//            System.out.println("用户名正确");
//            return true;
//        }
//        httpServletRequest.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(httpServletRequest,httpServletResponse);
//        System.out.println("用户名错误");
//        return false;
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

        String name = (String) httpServletRequest.getSession().getAttribute("name");
        String password = (String) httpServletRequest.getSession().getAttribute("password");
        System.out.println("用户姓名和密码"+name+password);
        user user = userService.selectByNamePassService(name, password);
        if (user!=null&&name.equals(user.getName())&&password.equals(user.getPassword())) {
            System.out.println("用户名正确");

        }else {
            httpServletRequest.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(httpServletRequest,httpServletResponse);
        }

        //System.out.println("用户名错误");
        System.out.println("postHandle");

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("afterCompletion");
    }

}
