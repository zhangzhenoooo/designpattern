package com.study.designpattern.create.builder;

/**
 * Create by zhangz on 2020/12/15
 */
public interface IMenu {
    IMenu apendHost(Module module);
    IMenu apendDisplayer(Module module);
    IMenu apendMouse(Module module);
    String getDetails();

}
