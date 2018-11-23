package com.wechat.sell.service;

import com.wechat.sell.dataobject.ProductInfo;
import com.wechat.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author: chenchen
 * @Date: 2018/11/21 20:48
 */
public interface ProductService {
    ProductInfo findOne(String produceId);

    /**
     * 查询在架商品 ---用户端
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询所有商品 ---后台
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    // 加库存
    void increaceStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);

}
