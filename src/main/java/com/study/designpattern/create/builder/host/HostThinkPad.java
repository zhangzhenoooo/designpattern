package com.study.designpattern.create.builder.host;

import com.study.designpattern.create.builder.Module;

/**
 * Create by zhangz on 2020/12/15
 */
public class HostThinkPad implements Module {
    @Override
    public String name() {
        return "联想主机";
    }

    @Override
    public String model() {
        return "Intel(R) Core(TM) i7-6500U CPU @ 2.50GHz 2.59 GHz";
    }

    @Override
    public String description() {
        return "很好的主机";
    }

    @Override
    public String brand() {
        return "联想";
    }
}
