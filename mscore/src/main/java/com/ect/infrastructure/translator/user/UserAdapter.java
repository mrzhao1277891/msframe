package com.ect.infrastructure.translator.user;

import com.ect.domain.model.user.User;

/**
 * Created by zhaojun on 2018/2/23.
 */
public class UserAdapter {

    public User getUser(String userId){
        return new User();
    }
}
