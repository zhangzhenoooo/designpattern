package com.study.designpattern.structure.adapter.mq;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *  第三方订单mq
 */
@Data
public class POPOrderDelivered  implements Serializable {

 private String uId; // ⽤户ID
 private String orderId; // 订单号
 private Date orderTime; // 下单时间
 private Date sku; // 商品
 private Date skuName; // 商品名称
 private BigDecimal decimal; // ⾦额
 // ... get/set 
}