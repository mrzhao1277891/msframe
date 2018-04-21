package com.ect.domain.model.productOrder;

import com.ect.domain.remoteServices.ProductOrderRemoteService;
import com.ect.infrastructure.translator.product.ProductOrderRemoteServiceImpl;

/**
 * Created by zhaojun on 2018/4/6.
 */
public class ProductOrder {
    String productOrderNo;
    String underWrittingResult;

    public String getProductOrderNo() {
        return productOrderNo;
    }

    public String underWritting(ProductOrder productOrder) throws Exception{
        //发送领域事件等

        return this.underWrittingResult;
    }
}
