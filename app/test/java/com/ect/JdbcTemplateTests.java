package com.ect;

import com.ect.biz.command.UserManageService;
import com.ect.view.query.UserQueryService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhaojun on 2018/2/1.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class JdbcTemplateTests {

    @Autowired
    private UserQueryService userQueryService;
    @Autowired
    private UserManageService userManageService;

    @Before
    public void setUp() {
//        // 准备，清空user表
//        userManageService.deleteAllUsers();
    }

    @Test
    public void test() throws Exception {
//        // 插入5个用户
//        userManageService.create("sunrun", 1);
//        userManageService.create("b", 2);
//        userManageService.create("c", 3);
//        userManageService.create("d", 4);
//        userManageService.create("e", 5);
//
//        // 查数据库，应该有5个用户
//        Assert.assertEquals(5, userQueryService.getAllUsers().intValue());
//
//        // 删除两个用户
//        userManageService.deleteByName("a");
//        userManageService.deleteByName("e");
//
//        // 查数据库，应该有5个用户
//        Assert.assertEquals(3, userQueryService.getAllUsers().intValue());

    }


}