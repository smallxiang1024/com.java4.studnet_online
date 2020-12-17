/**
 * @ClassName UserTest
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/12/10 17:43
 * @updateDate 2020/12/10 17:43
 * @version 1.0
 **/

import com.online_stu.bean.score;
import com.online_stu.bean.user;
import com.online_stu.dao.Course_scoreDao;
import com.online_stu.dao.UserDao;
import org.apache.catalina.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 @author ljh
 @create 2020-12-10-17:43
 **/
public class UserTest {


    @Test//测试user
    public void  test6() throws IOException {
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        UserDao mapper =  session.getMapper(UserDao.class);
        //List<Student> list = new ArrayList<>();
        //List<Course> courses = mapper.SelectCourse_scoreBylist();
        user u1 = new user(1234,"lj","15472","245678@163.com");

        //mapper.addUser(u1);
       mapper.deleteByid(1234);
//        System.out.println(uu.toString());
        session.commit();
    }



}
