package com.study.designpattern.structure;

import com.study.designpattern.bridging.cannel.WxPay;
import com.study.designpattern.bridging.cannel.ZfbPay;
import com.study.designpattern.bridging.modle.PayCypher;
import com.study.designpattern.bridging.modle.PayFaceMode;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * Create by zhangz on 2020/12/21
 */
public class bridging {

    @Test
    public void test(){
        System.out.println("测试微信人脸支付");
        WxPay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("zhangz","zweichat",new BigDecimal(100));
        System.out.println("测试微信密码支付");
        WxPay wxPayCypher = new WxPay(new PayCypher());
        wxPay.transfer("zhangz","zweichat",new BigDecimal(100));

        System.out.println("测试支付宝人脸支付");
        ZfbPay zfbPay = new ZfbPay(new PayFaceMode());
        zfbPay.transfer("zhnangzhen","zfb",new BigDecimal(10000));
    }
}
