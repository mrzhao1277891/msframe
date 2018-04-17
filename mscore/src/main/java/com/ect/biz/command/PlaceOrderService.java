package com.ect.biz.command;

import com.ect.domain.model.productOrder.ProductOrder;
import org.springframework.stereotype.Service;

/**
 * Created by zhaojun on 2018/4/17.
 */
@Service
public interface PlaceOrderService {

    ProductOrder placeOrder() throws Exception;
}
