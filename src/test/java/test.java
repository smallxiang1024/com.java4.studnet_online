/**
 * @ClassName test
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/11/29 21:10
 * @updateDate 2020/11/29 21:10
 * @version 1.0
 **/

import com.online_stu.bean.Course;
import com.online_stu.bean.Student;
import com.online_stu.bean.score;
import com.online_stu.dao.CourseDao;
import com.online_stu.dao.Course_scoreDao;
import com.online_stu.dao.StudnetDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 @author ljh
 @create 2020-11-29-21:10
 **/
public class test {

    @Test//测试添加
    public void  test() throws IOException {
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        StudnetDao mapper = session.getMapper(StudnetDao.class);
        Student student = new Student();
        student.setSid("111");
        student.setSname("121212");
        student.setSclass("23123");
        student.setScolleges("12213");
        student.setSex("男");
        student.setStel("11212");
        mapper.InsertStudnet(student);

        session.commit();

    }



    @Test//测试修改
    public void  test1() throws IOException {
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        StudnetDao mapper = session.getMapper(StudnetDao.class);
        Student student = new Student();
        student.setSid("111");
        student.setSname("121212");
        student.setSclass("23123");
        student.setScolleges("12213");
        student.setSex("女");
        student.setStel("11212");
        mapper.UpdateStudnet(student);
        session.commit();
    }


    @Test//测试删除
    public void  test2() throws IOException {
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        StudnetDao mapper = session.getMapper(StudnetDao.class);
        Student student = new Student();
        student.setSid("111");
        student.setSname("121212");
        student.setSclass("23123");
        student.setScolleges("12213");
        student.setSex("女");
        student.setStel("11212");
        mapper.DeleteStudnet(111);
        session.commit();
    }


    @Test//测试查询
    public void  test3() throws IOException {
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        StudnetDao mapper = session.getMapper(StudnetDao.class);
        List<Student> list = new ArrayList<>();
        list = mapper.SelectListStudnet();
        System.out.println(list);
        session.commit();
    }

    @Test//测试按照id查询
    public void  test4() throws IOException {
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        StudnetDao mapper = session.getMapper(StudnetDao.class);
        //List<Student> list = new ArrayList<>();
        Student student = new Student();
        student = mapper.SelectById(17015641);
        System.out.println(student);
        session.commit();
    }



    @Test//测试course
    public void  test5() throws IOException {
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        CourseDao mapper =  session.getMapper(CourseDao.class);
        //List<Student> list = new ArrayList<>();
        //List<Course> courses = mapper.SelectCourse_scoreBylist();
       Course cc = new Course();
       cc.setCscore(1211);
       cc.setCname("21");
       cc.setCid("213");
       cc.setChours(3);
        mapper.addCourse(cc);
        session.commit();
    }

    @Test//测试course
    public void  test6() throws IOException {
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        Course_scoreDao mapper =  session.getMapper(Course_scoreDao.class);
        //List<Student> list = new ArrayList<>();
        //List<Course> courses = mapper.SelectCourse_scoreBylist();
        score sss = new score();
        sss.setSid("12");
        sss.setCid("11");
        sss.setCname("asdf");
        sss.setTerminal_record(11);
        sss.setUsual_record(123);
        sss.setSname("1245");

        mapper.addCourse_score(sss);

        session.commit();
    }






}
