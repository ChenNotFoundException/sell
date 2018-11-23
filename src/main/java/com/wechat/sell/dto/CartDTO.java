package com.wechat.sell.dto;

import lombok.Data;

/**
 * @Author: chenchen
 * @Descriptor:
 * @Date: 2018/11/23 22:27
 * @Version 1.0
 */
@Data
public class CartDTO {
    private String productId;
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
