package com.study.designpattern.create.builder.host;

import com.study.designpattern.create.builder.Module;

/**
 * Create by zhangz on 2020/12/15
 */
public class HostMac implements Module {
    @Override
    public String name() {
        return "Mac主机";
    }

    @Override
    public String model() {
        return "CCCCCCCCC";
    }

    @Override
    public String description() {
        return "这个是Mac的主机";
    }

    @Override
    public String brand() {
        return "Mac";
    }
}
