package com.ect.infrastructure.iRemoteService;

import com.ect.domain.iDomainServices.UnderWrittingService;
import com.ect.domain.model.productOrder.ProductOrder;
import com.ect.infrastructure.client.htttpClient.geckoClient.UnderWrittingClient;
import com.ect.infrastructure.client.htttpClient.geckoClient.dto.UnderWrittingRequestDto;
import com.ect.infrastructure.client.htttpClient.geckoClient.dto.UnderWrittingResponseDto;
import com.ect.infrastructure.translator.productOrder.ProductOrderTranslator;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhaojun on 2018/4/6.
 */
public class UnderWrittingServiceImpl implements UnderWrittingService{
    @Autowired
    UnderWrittingClient underWrittingClient;
    @Autowired
    ProductOrderTranslator productOrderTranslator;

    public ProductOrder underWritting(ProductOrder productOrder) throws Exception{
        UnderWrittingRequestDto underWrittingRequestDto = new UnderWrittingRequestDto();

        UnderWrittingResponseDto underWrittingResponseDto = underWrittingClient.underWrittingGec(underWrittingRequestDto);
        productOrder = productOrderTranslator.translateToProductOrder(productOrder, underWrittingResponseDto);

        return productOrder;
    }
    
}
