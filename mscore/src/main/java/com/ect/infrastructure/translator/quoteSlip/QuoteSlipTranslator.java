package com.ect.infrastructure.translator.quoteSlip;

import com.ect.domain.model.QuoteSlip.QuoteSlip;
import com.ect.infrastructure.facade.rpcService.dto.PlaceOrderRequestDto;

/**
 * Created by sunrun on 2018/4/22.
 */
public class QuoteSlipTranslator {
    public QuoteSlip dtoToQuoteSlip(PlaceOrderRequestDto placeOrderRequestDto){
        return new QuoteSlip();
    }
}
