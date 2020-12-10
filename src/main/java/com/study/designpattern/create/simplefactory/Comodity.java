package com.study.designpattern.create.simplefactory;

import java.util.Map;

/**
 * Create by zhangz on 2020/12/10
 */
public interface Comodity {
    /**
     * 发放奖品接口 create by zahngz on 2020年12月10日
     * @param userId 用户id
     * @param commdityId 奖品id
     * @param businessId 业务id
     * @param extMap 额外字段
     * @throws Exception
     */
    void senCommdity(String userId, String commdityId, String businessId, Map<Object,Object> extMap) throws  Exception;
}
