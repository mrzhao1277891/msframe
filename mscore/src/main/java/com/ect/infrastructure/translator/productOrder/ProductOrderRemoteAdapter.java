package com.ect.infrastructure.translator.productOrder;

import com.ect.domain.remoteServices.ProductOrderRemoteService;
import com.ect.domain.model.productOrder.ProductOrder;
import com.ect.infrastructure.client.htttpClient.geckoClient.UnderWrittingClient;
import com.ect.infrastructure.client.htttpClient.geckoClient.dto.UnderWrittingRequestDto;
import com.ect.infrastructure.client.htttpClient.geckoClient.dto.UnderWrittingResponseDto;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunrun on 2018/4/20.
 */
public class ProductOrderRemoteAdapter implements ProductOrderRemoteService {
    @Autowired
    UnderWrittingClient underWrittingClient;

    public ProductOrder underWritting(ProductOrder productOrder) throws Exception{
        UnderWrittingRequestDto underWrittingRequestDto = ProductOrderTranslator.translateToDto(productOrder);
        UnderWrittingResponseDto underWrittingResponseDto = underWrittingClient.underWrittingGec(underWrittingRequestDto);
        productOrder = ProductOrderTranslator.translateToProductOrder(productOrder, underWrittingResponseDto);

        return productOrder;
    }
}
