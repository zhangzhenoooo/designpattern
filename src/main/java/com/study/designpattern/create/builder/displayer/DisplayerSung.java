package com.study.designpattern.create.builder.displayer;

import com.study.designpattern.create.builder.Module;

/**
 * Create by zhangz on 2020/12/15
 */
public class DisplayerSung implements Module {
    @Override
    public String name() {
        return "三星显示器";
    }

    @Override
    public String model() {
        return "4K";
    }

    @Override
    public String description() {
        return "三星显示器就是好";
    }

    @Override
    public String brand() {
        return "SanSung";
    }
}
