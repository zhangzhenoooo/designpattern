package com.study.designpattern.create.builder.mouse;

import com.study.designpattern.create.builder.Module;

/**
 * Create by zhangz on 2020/12/15
 */
public class MouseKing implements Module {
    @Override
    public String name() {
        return "King鼠标";
    }

    @Override
    public String model() {
        return "无线、静音";
    }

    @Override
    public String description() {
        return "玩游戏，选鼠标，就选King，无延迟";
    }

    @Override
    public String brand() {
        return "King";
    }
}
