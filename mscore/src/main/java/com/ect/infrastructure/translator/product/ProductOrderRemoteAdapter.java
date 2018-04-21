package com.ect.infrastructure.translator.product;

import com.ect.domain.remoteServices.ProductOrderRemoteService;
import com.ect.domain.model.productOrder.ProductOrder;

/**
 * Created by zhaojun on 2018/2/23.
 * 从其他上下文获取对象调用接口实现。
 * ProductOrderRemoteAdapter、UserAdapter分别负责请求订单上下文和用户上下文并取得原始结果
 */
public class ProductOrderRemoteAdapter implements ProductOrderRemoteService {

    public ProductOrder underWritting(ProductOrder productOrder) throws Exception{
        try {
            //根据productId向商品上下文请求product对象。
            return new ProductOrder();
        }catch (Exception e){
            throw e;
        }
    }

}
