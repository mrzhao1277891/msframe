package com.ect.biz.command.impl;

import com.ect.biz.command.UserManageService;
import org.springframework.stereotype.Service;

/**
 * Created by zhaojun on 2018/2/1.
 * 对接收到的数据做一些非业务性验证。
 * 事务的控制
 * 最重要的是协调多个聚合之间的操作，用通用模型语言讲故事。
 *
 * 这里注意，领域驱动设计推荐事务控制范围为aggregate，即每个事务只对一个aggregate进行修改。
 * 如果需要对多个aggregate进行修改，则采用消息队列的方式，保证数据的最终一致性来解决。
 */
@Service
public class UserManageServiceImpl implements UserManageService{

}
