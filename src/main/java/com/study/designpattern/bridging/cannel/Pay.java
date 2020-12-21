package com.study.designpattern.bridging.cannel;

import com.study.designpattern.bridging.modle.IPayMode;

import java.math.BigDecimal;

/**
 * Create by zhangz on 2020/12/21
 * JDBC多种驱动程序的实现、同品牌类型的台式机和笔记本平板、业务实现中的多类接⼝同组过滤服务
 * 等。这些场景都⽐较适合使⽤桥接模式进⾏实现，因为在⼀些组合中如果有如果每⼀个类都实现不同的
 * 服务可能会出现笛卡尔积，⽽使⽤桥接模式就可以⾮常简单。
 */
public abstract class Pay {
    protected   IPayMode payMode;
    public Pay(IPayMode payMode){
        this.payMode = payMode;
    }
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
