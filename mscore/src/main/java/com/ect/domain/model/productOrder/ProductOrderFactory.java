package com.ect.domain.model.productOrder;

import com.ect.domain.model.QuoteSlip.QuoteSlip;
import org.springframework.stereotype.Service;

/**
 * Created by zhaojun on 2018/4/17.
 */
@Service
public class ProductOrderFactory {

    public ProductOrder createProductOrder(QuoteSlip quoteSlip){
        return new ProductOrder();
    }
}
