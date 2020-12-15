package com.study.designpattern.create;

import com.alibaba.fastjson.JSON;
import com.study.designpattern.create.builder.Builder;
import com.study.designpattern.create.builder.IMenu;
import org.junit.jupiter.api.Test;

/**
 * Create by zhangz on 2020/12/15
 */

public class BuilderComputer {
    @Test
    public void test(){
        Builder builder = new Builder();
        IMenu firstComputer = builder.firstComputer();
        IMenu secondComputer = builder.secondComputer();
        System.out.println(firstComputer.getDetails());
//        System.out.println("/r/n--/r/n");
        System.out.println(JSON.toJSON(secondComputer.getDetails()));

    }
}
