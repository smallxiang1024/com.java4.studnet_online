/**
 * @ClassName CourseController
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/12/2 17:12
 * @updateDate 2020/12/2 17:12
 * @version 1.0
 **/
package com.online_stu.Controller;

import com.online_stu.bean.Course;
import com.online_stu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.crypto.KeySelector;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 @author ljh
 @create 2020-12-02-17:12
 **/
@Controller
public class CourseController {

    @Autowired
    private CourseService courseServiceImpl;

    @RequestMapping("/Courses")
    @ResponseBody
    public Map<String,Object> getList(){
        List<Course> courses = courseServiceImpl.selctByList();
        System.out.println(courses);
        Map<String,Object> map = new HashMap<String, Object>();

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", courses.size());
        //map.put("limit", 10);
        map.put("data", courses);
        return map;
    }

    @RequestMapping("/Course")
    public String getCourses(){
        return "Course";
    }

    @RequestMapping("/CourseAdd")
    public String CourseAdd(@RequestBody Course cc){


        courseServiceImpl.addCourse(cc);

        return null;
         }
        //更新
    @RequestMapping("/CourseUpda")
    public String CourseUpda(@RequestBody Course cc){


        courseServiceImpl.updateBysid(cc);

        return null;
    }

    @RequestMapping("/CourseDel")
    @ResponseBody
    public String CourseDel(int cid){
        System.out.println(cid);
        courseServiceImpl.deleteBysid(cid);
         return "{suc:200}";
    }
}
