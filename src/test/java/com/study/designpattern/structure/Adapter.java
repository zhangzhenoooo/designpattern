package com.study.designpattern.structure;

import com.alibaba.fastjson.JSON;
import com.study.designpattern.structure.adapter.design.MQAdapter;
import com.study.designpattern.structure.adapter.design.RebateInfo;
import com.study.designpattern.structure.adapter.mq.CreateAccountMQ;
import com.study.designpattern.structure.adapter.mq.OrderMQ;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * Create by zhangz on 2020/12/18
 */
public class Adapter {
    @Test
    public void test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, ParseException, InstantiationException, ClassNotFoundException {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = s.parse("2020-06-01 23:20:16");

        CreateAccountMQ create_account = new CreateAccountMQ();
        create_account.setNumber("ca_100001");
        create_account.setAddress("河北省.廊坊市.广阳区.大学里职业技术学院");
        create_account.setAccountDate(new Date());
        create_account.setDesc("在校开户");

        HashMap<String, String> link01 = new HashMap();
        link01.put("userId", "number");
        link01.put("bizId", "number");
        link01.put("bizTime", "accountDate");
        link01.put("desc", "desc");
        RebateInfo rebateInfo01 = MQAdapter.filter(create_account.toString(), link01);
        System.out.println("nmq.create_account(适配前)" + create_account.toString());
        System.out.println("mq.create_account(适配后)" + JSON.toJSONString(rebateInfo01));

        OrderMQ orderMQ = new OrderMQ();
        orderMQ.setCreateOrderTime(new Date());
        orderMQ.setOrderId("or_000001");
        orderMQ.setSku("business_0001");
        orderMQ.setUid("user-001");


        HashMap<String, String> link02 = new HashMap();
        link02.put("userId", "uid");
        link02.put("bizId", "sku");
        link02.put("bizTime", "createOrderTime");
        link01.put("desc", "createOrderTime");

        RebateInfo rebateInfo02 = MQAdapter.filter(orderMQ.toString(),link02);
        System.out.println("orderMQ(适配前)" + orderMQ.toString());
        System.out.println("orderMQ(适配后)" + JSON.toJSONString(rebateInfo02));
    }
}
