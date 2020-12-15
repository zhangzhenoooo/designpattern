package com.study.designpattern.create;

import com.study.designpattern.abstractfactory.CatchFactory;
import com.study.designpattern.abstractfactory.ICatchAdapter;
import org.junit.jupiter.api.Test;

/**
 * Create by zhangz on 2020/12/10
 */
public class TestAbstractFactory {

    @Test
    public void senCommdity() throws Exception {
//        ICatchAdapter ACatch = (ICatchAdapter)  CatchFactory.getBean("ACatchAdapter");
//       ACatch.del("ddd");
        ICatchAdapter aCatchAdatper = CatchFactory.getHandler("com.study.designpattern.abstractfactory.ACatchAdapter");
        aCatchAdatper.set("zhangz","张震");
        aCatchAdatper.del("del");
        ICatchAdapter bCatchAdatper = CatchFactory.getHandler("com.study.designpattern.abstractfactory.BCatchAdapter");
        bCatchAdatper.get("zhangz");
        bCatchAdatper.set("lisi","李四");

    }
}
