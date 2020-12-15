package com.study.designpattern.create.builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by zhangz on 2020/12/15
 */
public class DecorationPackageMenu implements  IMenu{

   private List<Module> modules = new ArrayList<>();
   private BigDecimal priceTop =BigDecimal.ZERO;

   public DecorationPackageMenu(BigDecimal priceTop){
       this.priceTop = priceTop;
   }

    @Override
    public IMenu apendHost(Module module) {
        modules.add(module);
        return this;
    }

    @Override
    public IMenu apendDisplayer(Module module) {
        modules.add(module);
        return this;
    }

    @Override
    public IMenu apendMouse(Module module) {
        modules.add(module);
        return this;
    }

    @Override
    public String getDetails() {
        StringBuilder detail = new StringBuilder("\r\n-------------------------------------------------------\r\n" +
                "配件清单：\r\n");

        for (Module matter: modules) {
            detail.append(matter.name()).append("：").append(matter.description()).append("、").append(matter.model()).append(matter.brand()).append(" \n");
        }

        return detail.toString();
    }


}
