package com.ect.infrastructure.translator.productOrder;

import com.ect.domain.model.productOrder.ProductOrder;
import com.ect.infrastructure.client.htttpClient.geckoClient.dto.UnderWrittingRequestDto;
import com.ect.infrastructure.client.htttpClient.geckoClient.dto.UnderWrittingResponseDto;
import com.ect.infrastructure.facade.rpcService.dto.PlaceOrderResponseDto;
import org.springframework.stereotype.Service;

/**
 * Created by zhaojun on 2018/4/17.
 */
@Service
public class ProductOrderTranslator {

    public static UnderWrittingRequestDto translateToDto(ProductOrder productOrder){
        return new UnderWrittingRequestDto();
    }

    public static ProductOrder translateToProductOrder(ProductOrder productOrder, UnderWrittingResponseDto underWrittingResponseDto){

        return productOrder;
    }

    public PlaceOrderResponseDto productOrderToDto(ProductOrder productOrder){
        return new PlaceOrderResponseDto();
    }
}
