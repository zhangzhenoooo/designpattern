package com.study.designpattern.bridging.cannel;

import com.study.designpattern.bridging.modle.IPayMode;

import java.math.BigDecimal;

/**
 * Create by zhangz on 2020/12/21
 */
public class WxPay extends Pay {


    public WxPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        // 支付业务逻辑
        boolean security = payMode.security(uId); // 安全验证
        System.out.println("weichat pay" + " {uId:"+uId + ",tradeId:"+tradeId+",amount:"+amount + "}");
        return null;
    }
}
