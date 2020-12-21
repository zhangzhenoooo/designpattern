package com.study.designpattern.bridging.modle;

/**
 * Create by zhangz on 2020/12/21
 */
public class PayFingerprintMode implements IPayMode {
    @Override
    public boolean security(String uId) {
        System.out.println("指纹支付 security check :" + uId);

        return true;
    }
}
