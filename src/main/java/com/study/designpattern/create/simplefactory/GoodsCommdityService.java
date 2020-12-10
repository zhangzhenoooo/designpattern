package com.study.designpattern.create.simplefactory;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


/**
 * Create by zhangz on 2020/12/10
 */
@Service

public class GoodsCommdityService implements  Comodity {
    private Logger logger = LoggerFactory.getLogger(CardCommdityService.class);

    @Override
    public void senCommdity(String userId, String commdityId, String businessId, Map<Object, Object> extMap) {
        logger.info("请求参数: => userId : {} ,commdityId : {} ,bussinessId : {} ,extMap {}",userId,commdityId,businessId,JSON.toJSON(extMap));

    }
}
