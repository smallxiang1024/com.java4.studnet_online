/**
 * @ClassName StudnetDao
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/11/29 20:32
 * @updateDate 2020/11/29 20:32
 * @version 1.0
 **/
package com.online_stu.dao;

import com.online_stu.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 @author ljh
 @create 2020-11-29-20:32
 **/
@Repository("studnetDao")
public interface StudnetDao {
    //查询所有学生
    public List<Student> SelectListStudnet();
    //按照id查询
    public Student SelectById(int id);

    //更新学生
    public void UpdateStudnet(Student ss);
    //插入学生
    public void InsertStudnet(Student ss);
    //按照sno删除
    public void DeleteStudnet(int sno);
}
