package com.atguigu.bean;

import javax.persistence.*;
import java.io.Serializable;

//根据JPA规范：进行ORM映射
// Object   Relationship
// User类   user表
// 属性名称  字段名称
// java类型  SQL类型

@Entity //声明实体类
@Table(name = "t_user")
public class User implements Serializable {

    // 主键
    @Id //声明主键字段
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // IDENTITY 等价于auto_increment
    @Column(name = "id")
    private Integer id;
    // 用户名
    @Column(name = "username",unique = true,nullable = false)
    private String username;
    // 密码
    //@Column(name = "password",nullable = false)
    private String password;
    // 姓名
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
