package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * Created by Allen
 */
public interface IOrderService {
    ServerResponse pay(Long orderNo, Integer userId, String path);
}
