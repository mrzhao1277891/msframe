package com.ect.infrastructure.translator.product;

import com.ect.domain.remoteServices.ProductOrderRemoteService;
import com.ect.domain.model.productOrder.ProductOrder;

/**
 * Created by zhaojun on 2018/2/23.
 */
public class ProductOrderRemoteServiceImpl implements ProductOrderRemoteService {
    public ProductOrder underWritting(ProductOrder productOrder) throws Exception{
        return new ProductOrder();
    }
}
