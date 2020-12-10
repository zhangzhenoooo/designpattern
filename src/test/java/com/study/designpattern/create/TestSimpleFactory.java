package com.study.designpattern.create;

import com.study.designpattern.create.simplefactory.Comodity;
import com.study.designpattern.create.simplefactory.StoreFactory;
import org.junit.jupiter.api.Test;
import org.omg.CORBA.OBJ_ADAPTER;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by zhangz on 2020/12/10
 */
public class TestSimpleFactory {

    @Test
    public void senCommdity() throws Exception {
        StoreFactory storeFactory = new StoreFactory();
        Comodity comodity1 = storeFactory.getCommdity(1);
        Comodity comodity2 = storeFactory.getCommdity(2);
        Map<Object, Object> map2 = new HashMap<>();
        map2.put("address","127.0.0.1");
        comodity1.senCommdity("zhangz","c","card",null);
        comodity2.senCommdity("zhangzhen","g","goods",map2);

    }
}
