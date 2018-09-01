package com.ect.domain.remoteServices;

import com.ect.domain.model.productOrder.ProductOrder;
import org.springframework.stereotype.Service;

/**
 * Created by zhaojun on 2018/2/23.
 * 从其他上下文获取对象调用接口
 */
@Service
public interface ProductOrderRemoteService {
    ProductOrder underWritting(ProductOrder productOrder) throws Exception;
}
