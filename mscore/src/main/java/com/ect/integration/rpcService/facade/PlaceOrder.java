package com.ect.integration.rpcService.facade;

import com.ect.integration.rpcService.dto.PlaceOrderRequestDto;
import com.ect.integration.rpcService.dto.PlaceOrderResponseDto;

/**
 * Created by sunrun on 2018/4/20.
 */
public interface PlaceOrder {

    PlaceOrderResponseDto placeOrder(PlaceOrderRequestDto placeOrderRequestDto);
}
