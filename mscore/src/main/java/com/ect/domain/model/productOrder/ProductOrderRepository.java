package com.ect.domain.model.productOrder;


import org.springframework.stereotype.Service;

/**
 * Created by zhaojun on 2018/4/17.
 */
@Service
public interface ProductOrderRepository {

    void save(ProductOrder productOrder);
}
