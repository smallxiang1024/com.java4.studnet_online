/**
 * @ClassName StudnetController
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/11/30 20:57
 * @updateDate 2020/11/30 20:57
 * @version 1.0
 **/
package com.online_stu.Controller;

import com.online_stu.bean.Student;
import com.online_stu.service.StudentService;
import com.online_stu.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.soap.SAAJMetaFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 @author ljh
 @create 2020-11-30-20:57
 **/
@Controller
public class StudnetController {
    @Autowired
    @Qualifier("studentServiceImpl")
    private StudentService studentService;
    //查询全部表中数据
        @RequestMapping("/Studnets")
    @ResponseBody
    public Map<String,Object> test(){
    List<Student> list = studentService.SelectList();
        System.out.println(list);
        Map<String,Object> map = new HashMap<String, Object>();

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", list.size());
        //map.put("limit", 10);
        map.put("data", list);
        return map;
    }

    @RequestMapping("/student")
    public String test1(){
        return "Student";
    }
    //添加学生
    @RequestMapping("/stuAdd")
    public String AddStudent(@RequestBody Student student){
        System.out.println(student.toString());
               studentService.InsertStudent(student);

        return "forward:/student";
    }

    //删除学生
    @RequestMapping("/stuDel")
    @ResponseBody
    public String DelStudent(int sid){
        System.out.println(sid);
        studentService.DeleteStudnet(sid);
        return "{suc:200}";
    }

}
