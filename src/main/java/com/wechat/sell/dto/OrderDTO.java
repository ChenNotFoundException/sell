package com.wechat.sell.dto;

import com.wechat.sell.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author: chenchen
 * @Descriptor:
 * @Date: 2018/11/23 20:57
 * @Version 1.0
 */
@Data
public class OrderDTO {
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private BigDecimal orderAmount;
    private Integer orderStatus ;
    private Integer payStatus ;
    private Date createTime;

    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
