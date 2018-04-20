package com.ect.biz.command.impl;

import com.ect.biz.command.PlaceOrderService;
import com.ect.domain.model.QuoteSlip.QuoteSlip;
import com.ect.domain.model.productOrder.ProductOrder;
import com.ect.domain.model.productOrder.ProductOrderFactory;
import com.ect.domain.model.productOrder.ProductOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhaojun on 2018/4/17.
 */
public class PlaceOrderServiceImpl implements PlaceOrderService{
    @Autowired
    ProductOrderFactory productOrderFactory;
    @Autowired
    ProductOrderRepository productOrderRepository;

    public ProductOrder placeOrder(QuoteSlip quoteSlip) throws Exception{
        ProductOrder productOrder = productOrderFactory.createProductOrder(quoteSlip);
        String underWrittingResult = productOrder.underWritting(productOrder);
        if(underWrittingResult.equals("核保失败") || underWrittingResult.equals("人工核保中")){
            //给被保人发送短信
        }
        productOrderRepository.save(productOrder);
        return productOrder;
    }
}
