package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Product;

/**
 * Created by Allen
 */
public interface IProductService {
    ServerResponse saveOrUpdateProduct(Product product);
}
