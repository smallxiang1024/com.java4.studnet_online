/**
 * @ClassName user
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/12/10 17:10
 * @updateDate 2020/12/10 17:10
 * @version 1.0
 **/
package com.online_stu.bean;

import org.springframework.stereotype.Component;

/**
 @author ljh
 @create 2020-12-10-17:10
 **/
@Component
public class user {

    private int id;
    private String name;
    private String password;
    private String email;

    public user(int id, String name, String password, String email) {
        super();
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }
    public user() {
        // TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
