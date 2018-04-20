package com.ect.domain.model.productOrder;

import com.ect.domain.domainServices.UnderWrittingService;
import com.ect.infrastructure.iRemoteService.UnderWrittingServiceImpl;

/**
 * Created by zhaojun on 2018/4/6.
 */
public class ProductOrder {
    String productOrderNo;

    public String getProductOrderNo() {
        return productOrderNo;
    }

    public String underWritting(ProductOrder productOrder) throws Exception{
        UnderWrittingService underWrittingService = new UnderWrittingServiceImpl();
        String underWrittingResult = underWrittingService.underWritting(productOrder);

        return underWrittingResult;
    }
}
