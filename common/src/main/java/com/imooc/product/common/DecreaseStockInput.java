package com.imooc.product.common;

import lombok.Data;

@Data
public class DecreaseStockInput {

    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    /**
     * 因为重写了构造器，所以会造成序列化与反序列化的问题
     * 需要引入无参构造器
     */
    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
