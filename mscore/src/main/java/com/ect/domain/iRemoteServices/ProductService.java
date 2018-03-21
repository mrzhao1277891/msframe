package com.ect.domain.iRemoteServices;

import com.ect.domain.model.product.Product;

/**
 * Created by zhaojun on 2018/2/23.
 * 从其他上下文获取对象调用接口
 */
public interface ProductService {
    Product getProduct(String productId) throws Exception;
}
