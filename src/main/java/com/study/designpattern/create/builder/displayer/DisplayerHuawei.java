package com.study.designpattern.create.builder.displayer;

import com.study.designpattern.create.builder.Module;

/**
 * Create by zhangz on 2020/12/15
 */
public class DisplayerHuawei implements Module {
    @Override
    public String name() {
        return "华为显示器";
    }

    @Override
    public String model() {
        return "独显";
    }

    @Override
    public String description() {
        return "支持国产，就要用华为显示器";
    }

    @Override
    public String brand() {
        return "huawei";
    }
}
