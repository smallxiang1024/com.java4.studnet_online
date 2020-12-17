/**
 * @ClassName score
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/11/29 20:03
 * @updateDate 2020/11/29 20:03
 * @version 1.0
 **/
package com.online_stu.bean;

import org.springframework.stereotype.Component;

/**
 @author ljh
 @create 2020-11-29-20:03
 **/

@Component
public class score {

    private String sid;
    private String sname;
    private String cname;
    private String cid;

    private int usual_record;
    private int terminal_record;
    private int total_record;

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

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public int getUsual_record() {
        return usual_record;
    }

    public void setUsual_record(int usual_record) {
        this.usual_record = usual_record;
    }

    public int getTerminal_record() {
        return terminal_record;
    }

    public void setTerminal_record(int terminal_record) {
        this.terminal_record = terminal_record;
    }

    public int getTotal_record() {
        return total_record;
    }

    public void setTotal_record(int total_record) {
        this.total_record = total_record;
    }

    public score(String sid, String sname, String cname, String cid, int usual_record, int terminal_record, int total_record) {
        this.sid = sid;
        this.sname = sname;
        this.cname = cname;
        this.cid = cid;
        this.usual_record = usual_record;
        this.terminal_record = terminal_record;
        this.total_record = total_record;
    }

    public score() {

    }

    @Override
    public String toString() {
        return "score{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", cname='" + cname + '\'' +
                ", cid='" + cid + '\'' +
                ", usual_record=" + usual_record +
                ", terminal_record=" + terminal_record +
                ", total_record=" + total_record +
                '}';
    }
}
