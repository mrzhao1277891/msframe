package com.ect.domain.remoteServices;

import com.ect.domain.model.productOrder.ProductOrder;

/**
 * Created by zhaojun on 2018/2/23.
 * 从其他上下文获取对象调用接口
 */
public interface ProductOrderService {
    ProductOrder underWritting(ProductOrder productOrder) throws Exception;
}
