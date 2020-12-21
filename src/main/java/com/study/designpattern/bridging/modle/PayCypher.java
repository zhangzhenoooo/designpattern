package com.study.designpattern.bridging.modle;

/**
 * Create by zhangz on 2020/12/21
 */
public class PayCypher implements IPayMode {
    @Override
    public boolean security(String uId) {
        // 安全验证
        System.out.println("密码支付 security check :" + uId);
        return true;
    }
}
