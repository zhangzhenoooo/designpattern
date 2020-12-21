package com.study.designpattern.bridging.modle;

/**
 * Create by zhangz on 2020/12/21
 */
public class PayFaceMode implements IPayMode {
    @Override
    public boolean security(String uId) {
        System.out.println("人脸识别支付 security check :" + uId);
        return true;
    }
}
