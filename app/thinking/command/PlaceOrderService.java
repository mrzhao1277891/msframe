package com.ect.biz.command;

import com.ect.domain.model.QuoteSlip.QuoteSlip;
import com.ect.domain.model.productOrder.ProductOrder;
import org.springframework.stereotype.Service;

/**
 * Created by zhaojun on 2018/4/17.
 * biz层接口入参，出参为领域对象，由integration层中的Assembler负责进行转换。
 * 但实际的对象创建过程属于domain层，facade层可直接调用domain层做领域对象的转换。
 */
@Service
public interface PlaceOrderService {

    ProductOrder placeOrder(QuoteSlip quoteSlip) throws Exception;
}
