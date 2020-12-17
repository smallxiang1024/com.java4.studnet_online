/**
 * @ClassName scoureController
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/12/2 21:42
 * @updateDate 2020/12/2 21:42
 * @version 1.0
 **/
package com.online_stu.Controller;

import com.online_stu.bean.Course;
import com.online_stu.bean.score;
import com.online_stu.dao.Course_scoreDao;
import com.online_stu.service.CourseService;
import com.online_stu.service.course_coreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 @author ljh
 @create 2020-12-02-21:42
 **/
@Controller
public class scoureController {
        @Autowired
        private course_coreService coreService;

        @RequestMapping("/Score")
        @ResponseBody  //获取学生成绩信息
        public Map<String,Object> getScoreList(){
            Map<String,Object> map = new HashMap<String, Object>();
            List<Course> courses = coreService.SelctBylist();
            System.out.println(courses);
            map.put("data", courses);
            map.put("count", courses.size());

            map.put("code", 0);
            map.put("msg", "");
            return map;
        }

        @RequestMapping("/Scores")
        public String getScoresView(){
            return "score";
        }


        @RequestMapping("/ScoreAdd")
        public String ScoreAdd(@RequestBody score cc){
            System.out.println(cc.toString());
            coreService.insertCore(cc);
           return null;
        }

//    @RequestMapping("/CourseDel")
//    @ResponseBody
//    public String ccourseDel(int cid){
//        System.out.println(cid);
//        coreService.deleteCoreById(cid);
//        return "{suc:200}";
//    }

    @RequestMapping("/ScoreDel")
    @ResponseBody
    public String ScoreDel(int sid){

        System.out.println("删除学生成绩"+sid);
        coreService.deleteCoreById(sid);
        return "{suc:200}";
    }
}
