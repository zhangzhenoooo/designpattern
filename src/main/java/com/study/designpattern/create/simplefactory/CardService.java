package com.study.designpattern.create.simplefactory;

import com.study.designpattern.common.Result;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Create by zhangz on 2020/12/10
 */
@Component
public class CardService   {


    public Result senCommdity(String userId, String commdityId, String businessId, Map<Object, Object> extMap) throws Exception {
        // TODO 发送优惠券
        return Result.succeed("已发送一个优惠卡");
    }
}
