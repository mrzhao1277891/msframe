package com.ect.domain.remoteServices;

import com.ect.domain.model.user.User;

/**
 * Created by zhaojun on 2018/2/23.
 */
public interface UserRemoteService {
    User getUser(String userId);
}
