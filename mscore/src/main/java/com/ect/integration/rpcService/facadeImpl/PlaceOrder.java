package com.ect.integration.rpcService.facadeImpl;

import com.ect.biz.command.PlaceOrderService;
import com.ect.domain.model.QuoteSlip.QuoteSlip;
import com.ect.domain.model.productOrder.ProductOrder;
import com.ect.integration.rpcService.Assembler.PlaceOrderAssembler;
import com.ect.integration.rpcService.dto.PlaceOrderRequestDto;
import com.ect.integration.rpcService.dto.PlaceOrderResponseDto;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunrun on 2018/4/20.
 */
public class PlaceOrder {
    @Autowired
    PlaceOrderService placeOrderService;
    @Autowired
    PlaceOrderAssembler placeOrderAssembler;

    public PlaceOrderResponseDto placeOrder(PlaceOrderRequestDto placeOrderRequestDto){
        QuoteSlip quoteSlip = placeOrderAssembler.dtoToQuoteSlip(placeOrderRequestDto);
        try {
            ProductOrder productOrder = placeOrderService.placeOrder(quoteSlip);
            PlaceOrderResponseDto placeOrderResponseDto = placeOrderAssembler.productOrderToDto(productOrder);
            return placeOrderResponseDto;
        }catch (Exception e){
            return null;
        }
    }
}
