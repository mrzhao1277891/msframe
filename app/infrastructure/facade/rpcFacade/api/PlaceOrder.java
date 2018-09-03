package com.ect.infrastructure.facade.rpcService.facade;

import com.ect.infrastructure.facade.rpcService.dto.PlaceOrderRequestDto;
import com.ect.infrastructure.facade.rpcService.dto.PlaceOrderResponseDto;

/**
 * Created by sunrun on 2018/4/20.
 */
public interface PlaceOrder {

    PlaceOrderResponseDto placeOrder(PlaceOrderRequestDto placeOrderRequestDto);
}
