package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by Allen
 */
public interface IUserService {
    ServerResponse<User> login(String username, String password);
}