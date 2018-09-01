package com.ect.domain.model.product;

/**
 * Created by zhaojun on 2018/2/24.
 */
public class Product {
    public String productId;
    public String productName;

    public Product(String productId, String productName) throws Exception{
        //守卫验证
        if(productId == "" || productId == null){
            throw new Exception("产品编号不能为空");
        }
        if(productName == "" || productName == null){
            throw new Exception("产品名称不能为空");
        }
        this.productId = productId;
        this.productName = productName;
    }
}
