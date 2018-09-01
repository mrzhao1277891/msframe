package com.ect.domain.domainServices;

import com.ect.domain.model.productOrder.ProductOrder;

/**
 * Created by zhaojun on 2018/4/6.
 */
public interface UnderWrittingService {
    String underWritting(ProductOrder productOrder) throws Exception;
}
