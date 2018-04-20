package com.ect.infrastructure.translator.product;

import com.ect.domain.iRemoteServices.ProductService;
import com.ect.domain.model.product.Product;

/**
 * Created by zhaojun on 2018/2/23.
 * 从其他上下文获取对象调用接口实现。
 * ProductAdapter、UserAdapter分别负责请求商品上下文和用户上下文并取得原始结果
 */
public class ProductAdapter implements ProductService {

    public Product getProduct(String productId) throws Exception{
        try {
            //根据productId向商品上下文请求product对象。
            String productName = "";
            Product product = new Product(productId, productName);
            return product;
        }catch (Exception e){
            throw e;
        }
    }

}
