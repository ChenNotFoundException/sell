package com.wechat.sell.repository;

import com.wechat.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: chenchen
 * @Date: 2018/11/23 19:15
 * @Descriptor:
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
    List<OrderDetail> findByOrderId(String orderID);
}
