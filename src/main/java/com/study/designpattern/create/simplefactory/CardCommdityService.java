package com.study.designpattern.create.simplefactory;

import com.alibaba.fastjson.JSON;
import com.study.designpattern.common.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


/**
 * Create by zhangz on 2020/12/10
 */
@Service
public class CardCommdityService implements  Comodity {
    private Logger logger = LoggerFactory.getLogger(CardCommdityService.class);

    private CardService cardService = new CardService();

    @Override
    public void senCommdity(String userId, String commdityId, String businessId, Map<Object, Object> extMap) throws Exception {
        Result result = cardService.senCommdity(userId, commdityId, businessId, extMap);
        logger.info("优惠卡发送 === 请求参数: => userId : {} ,commdityId : {} ,bussinessId : {} ,extMap {}",userId,commdityId,businessId,JSON.toJSON(extMap));
        logger.info("发送结果 === {}",JSON.toJSON(result));

    }
}
