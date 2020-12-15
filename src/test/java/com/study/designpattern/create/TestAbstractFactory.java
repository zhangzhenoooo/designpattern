package com.study.designpattern.create;

import com.study.designpattern.create.abstractfactory.AdapterFactory;
import com.study.designpattern.create.abstractfactory.ICatchAdapter;
import org.junit.jupiter.api.Test;

/**
 * Create by zhangz on 2020/12/10
 */
public class TestAbstractFactory {
    @Test
    private void  test (){
        ICatchAdapter BCatch = AdapterFactory.getHandler("BCatchAdapter");
        BCatch.del("del");
    }
}
