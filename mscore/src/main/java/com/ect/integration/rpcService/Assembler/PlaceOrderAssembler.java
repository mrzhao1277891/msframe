package com.ect.integration.rpcService.Assembler;

import com.ect.domain.model.QuoteSlip.QuoteSlip;
import com.ect.domain.model.productOrder.ProductOrder;
import com.ect.integration.rpcService.dto.PlaceOrderRequestDto;
import com.ect.integration.rpcService.dto.PlaceOrderResponseDto;
import org.springframework.stereotype.Service;

/**
 * Created by sunrun on 2018/4/20.
 */
@Service
public class PlaceOrderAssembler {

    public QuoteSlip dtoToQuoteSlip(PlaceOrderRequestDto placeOrderRequestDto){
        return new QuoteSlip();
    }

    public PlaceOrderResponseDto productOrderToDto(ProductOrder productOrder){
        return new PlaceOrderResponseDto();
    }
}
