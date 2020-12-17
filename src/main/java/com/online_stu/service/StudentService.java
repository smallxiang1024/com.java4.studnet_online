/**
 * @ClassName StudentService
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/11/29 23:03
 * @updateDate 2020/11/29 23:03
 * @version 1.0
 **/


package com.online_stu.service;

import com.online_stu.bean.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 @author ljh
 @create 2020-11-29-23:03
 **/

public interface StudentService {
    //查询所有
    public List<Student> SelectList();
    //查询按照id
    public Student SelectById(int id);

    //修改
    public void UpdateStudent(Student ss);
    //删除
    public void DeleteStudnet(int sno);

    //添加
    public void InsertStudent(Student ss);
}
