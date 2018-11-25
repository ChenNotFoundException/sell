package com.wechat.sell.service;

import com.wechat.sell.dto.OrderDTO;

/**
 * @Author: chenchen
 * @Date: 2018/11/25 16:07
 * @Descriptor:
 */
public interface BuyerService {
    // 查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
