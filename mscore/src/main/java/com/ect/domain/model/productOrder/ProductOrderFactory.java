package com.ect.domain.model.productOrder;

import org.springframework.stereotype.Service;

/**
 * Created by zhaojun on 2018/4/17.
 */
@Service
public class ProductOrderFactory {

    public ProductOrder createProductOrder(){
        return new ProductOrder();
    }
}
