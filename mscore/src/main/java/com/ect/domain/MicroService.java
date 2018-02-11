package com.ect.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by zhaojun on 2018/1/24.
 */
@Component
public class MicroService {
    @Value("${com.mscore.projectname}")
    private String projectName;
    @Value("${com.mscore.author}")
    private String author;
    @Value("${com.mscore.introduction}")
    private String introduction;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
