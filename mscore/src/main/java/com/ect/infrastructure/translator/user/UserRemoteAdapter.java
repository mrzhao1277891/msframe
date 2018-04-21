package com.ect.infrastructure.translator.user;

import com.ect.domain.model.user.User;
import com.ect.domain.remoteServices.UserRemoteService;

/**
 * Created by zhaojun on 2018/2/23.
 */
public class UserRemoteAdapter implements UserRemoteService {

    public User getUser(String userId){
        return new User();
    }
}
