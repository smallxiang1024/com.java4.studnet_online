/**
 * @ClassName Course
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/11/29 19:57
 * @updateDate 2020/11/29 19:57
 * @version 1.0
 **/
package com.online_stu.bean;

import org.springframework.stereotype.Component;

/**
 @author ljh
 @create 2020-11-29-19:57
 **/
@Component
public class Course {

    private String cid;
    private String cname;
    private int chours;
    private int cscore;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getChours() {
        return chours;
    }

    public void setChours(int chours) {
        this.chours = chours;
    }

    public int getCscore() {
        return cscore;
    }

    public void setCscore(int cscore) {
        this.cscore = cscore;
    }

    public Course(String cid, String cname, int chours, int cscore) {
        this.cid = cid;
        this.cname = cname;
        this.chours = chours;
        this.cscore = cscore;
    }

    public Course() {

    }

    @Override
    public String toString() {
        return "Course{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                ", chours=" + chours +
                ", cscore=" + cscore +
                '}';
    }
}
