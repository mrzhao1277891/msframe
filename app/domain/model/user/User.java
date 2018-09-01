package com.ect.domain.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by zhaojun on 2018/1/25.
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String age;

    public User(String name, String age) throws Exception{
        //守卫验证
        if(name == "" || name == null){
            throw new Exception("用户姓名不能为空");
        }
        if(age == "" || age == null){
            throw new Exception("用户年龄不能为空");
        }
        this.name = name;
        this.age = age;
    }

    public User(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
