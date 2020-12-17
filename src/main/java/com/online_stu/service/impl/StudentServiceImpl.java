/**
 * @ClassName StudentServiceImpl
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/11/29 23:22
 * @updateDate 2020/11/29 23:22
 * @version 1.0
 **/
package com.online_stu.service.impl;

import com.online_stu.bean.Student;
import com.online_stu.dao.StudnetDao;
import com.online_stu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 @author ljh
 @create 2020-11-29-23:22
 **/
@Service("studentServiceImpl")
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    @Qualifier("studnetDao")
    private StudnetDao studnetDao;

    public StudnetDao getStudnetDao() {
        return studnetDao;
    }

    public void setStudnetDao(StudnetDao studnetDao) {
        this.studnetDao = studnetDao;
    }

    @Override
    public List<Student> SelectList() {
        List<Student> list = studnetDao.SelectListStudnet();
        return list;
    }

    @Override
    public Student SelectById(int id) {
        return null;
    }

    @Override
    public void UpdateStudent(Student ss) {
        studnetDao.UpdateStudnet(ss);
    }

    @Override
    public void DeleteStudnet(int sno) {
        studnetDao.DeleteStudnet(sno);
    }

    @Override
    public void InsertStudent(Student ss) {
        studnetDao.InsertStudnet(ss);
    }
}
