package com.wechat.sell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wechat.sell.Exception.SellException;
import com.wechat.sell.dataobject.OrderDetail;
import com.wechat.sell.dto.OrderDTO;
import com.wechat.sell.enums.ResultEnum;
import com.wechat.sell.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @Author: chenchen
 * @Descriptor:
 * @Date: 2018/11/25 14:28
 * @Version 1.0
 */
@Slf4j
public class OrderForm2OrderDTOConverter {
    public static OrderDTO converter(OrderForm orderForm) {
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        List<OrderDetail> orderDetailList;
        try {
            orderDetailList =
                    gson.fromJson(
                            orderForm.getItems(), new TypeToken<List<OrderDetail>>() {
                            }.getType());

        } catch (Exception e) {
            log.error("[对象转换错误】 string={}", orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);
        return orderDTO;
    }
}
