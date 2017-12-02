package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.vo.CartVo;

/**
 * Created by Allen
 */
public interface ICartService {
    ServerResponse<CartVo> add (Integer userId, Integer productId, Integer count);
    ServerResponse<CartVo>update(Integer userId,Integer productId,Integer count);
    ServerResponse<CartVo>deleteProduct(Integer userId,String productIds);
    ServerResponse<CartVo>list(Integer userId);
    ServerResponse<CartVo>selectOrUnselect(Integer userId,Integer productId,Integer checked);
}
