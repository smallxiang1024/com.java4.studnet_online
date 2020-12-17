/**
 * @ClassName Student
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/11/29 19:51
 * @updateDate 2020/11/29 19:51
 * @version 1.0
 **/
package com.online_stu.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 @author ljh
 @create 2020-11-29-19:51
 **/

@Component
public class Student  implements Serializable {
    private String sex;
    private String sid;
    private String sname;
    private String scolleges;
    private String sclass;
    private String stel;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getScolleges() {
        return scolleges;
    }

    public void setScolleges(String scolleges) {
        this.scolleges = scolleges;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public String getStel() {
        return stel;
    }

    public void setStel(String stel) {
        this.stel = stel;
    }

    public Student(String sex, String sid, String sname, String scolleges, String sclass, String stel) {
        this.sex = sex;
        this.sid = sid;
        this.sname = sname;
        this.scolleges = scolleges;
        this.sclass = sclass;
        this.stel = stel;
    }
    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "sex='" + sex + '\'' +
                ", sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", scolleges='" + scolleges + '\'' +
                ", sclass='" + sclass + '\'' +
                ", stel='" + stel + '\'' +
                '}';
    }
}
