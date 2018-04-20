package com.ect.infrastructure.translator.product;

import com.ect.domain.remoteServices.ProductOrderService;
import com.ect.domain.model.productOrder.ProductOrder;

/**
 * Created by zhaojun on 2018/2/23.
 */
public class ProductOrderServiceImpl implements ProductOrderService {
    public ProductOrder underWritting(ProductOrder productOrder) throws Exception{
        return new ProductOrder();
    }
}
