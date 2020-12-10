package com.study.designpattern.create.simplefactory;

/**
 * Create by zhangz on 2020/12/10
 */
public class StoreFactory {
    public Comodity getCommdity(Integer commdityType) {
        if ( null == commdityType){
            return null;
        }
        if (1 == commdityType){
            // card
          return   new CardCommdityService();
        }
        if (2 == commdityType){
            //goods
           return new GoodsCommdityService();
        }
        throw new RuntimeException("commdity is not exist !");
    }
}
