package com.ect.infrastructure.translator.product;

/**
 * Created by zhaojun on 2018/2/23.
 * ProductTranslator、UserTranslator则是通过解析原始结果，转换为我方上下文中需要的领域模型概念
 */

@Service
public class ProductTranslator {

    public ProductOrder translateRstToProduct(ProductOrder productOrder, String result){
        return new ProductOrder();
    }

}
