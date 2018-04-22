package com.ect.infrastructure.facade.rpcService.facadeImpl;

import com.ect.biz.command.PlaceOrderService;
import com.ect.domain.model.QuoteSlip.QuoteSlip;
import com.ect.domain.model.productOrder.ProductOrder;
import com.ect.infrastructure.facade.rpcService.dto.PlaceOrderRequestDto;
import com.ect.infrastructure.facade.rpcService.dto.PlaceOrderResponseDto;
import com.ect.infrastructure.translator.productOrder.ProductOrderTranslator;
import com.ect.infrastructure.translator.quoteSlip.QuoteSlipTranslator;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunrun on 2018/4/20.
 */
public class PlaceOrder {
    @Autowired
    PlaceOrderService placeOrderService;
    @Autowired
    QuoteSlipTranslator quoteSlipTranslator;
    @Autowired
    ProductOrderTranslator productOrderTranslator;

    public PlaceOrderResponseDto placeOrder(PlaceOrderRequestDto placeOrderRequestDto){
        QuoteSlip quoteSlip = quoteSlipTranslator.dtoToQuoteSlip(placeOrderRequestDto);
        try {
            ProductOrder productOrder = placeOrderService.placeOrder(quoteSlip);
            PlaceOrderResponseDto placeOrderResponseDto = productOrderTranslator.productOrderToDto(productOrder);
            return placeOrderResponseDto;
        }catch (Exception e){
            return null;
        }
    }
}
