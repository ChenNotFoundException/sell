package com.wechat.sell.service;

import com.wechat.sell.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {
    public ProductCategory fingOne(Integer category);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
