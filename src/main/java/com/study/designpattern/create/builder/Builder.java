package com.study.designpattern.create.builder;

import com.study.designpattern.create.builder.displayer.DisplayerHuawei;
import com.study.designpattern.create.builder.displayer.DisplayerSung;
import com.study.designpattern.create.builder.host.HostMac;
import com.study.designpattern.create.builder.host.HostThinkPad;
import com.study.designpattern.create.builder.mouse.MouseKing;

import java.math.BigDecimal;

/**
 * Create by zhangz on 2020/12/15
 */
public class Builder {
    public IMenu firstComputer(){
        return new DecorationPackageMenu(new BigDecimal(1)).apendHost(new HostMac())
                .apendDisplayer(new DisplayerHuawei())
                .apendMouse(new MouseKing());
    }

    public IMenu secondComputer(){
        return new DecorationPackageMenu(new BigDecimal(1)).apendHost(new HostThinkPad())
                .apendDisplayer(new DisplayerSung())
                .apendMouse(new MouseKing());
    }
}
