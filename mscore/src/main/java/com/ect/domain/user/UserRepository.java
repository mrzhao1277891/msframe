package com.ect.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhaojun on 2018/2/2.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * 读写分离中的写模型的查找对象只根据实体对象的唯一标识
     * spring-data jpa中自动实现，可以不用另行定义
     */
    User findById(String id);

}
