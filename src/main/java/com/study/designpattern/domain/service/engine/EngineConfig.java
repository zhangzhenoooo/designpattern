package com.study.designpattern.domain.service.engine;


import com.study.designpattern.domain.service.logic.LogicFilter;
import com.study.designpattern.domain.service.logic.impl.UserAgeFilter;
import com.study.designpattern.domain.service.logic.impl.UserGenderFilter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 微信公众号：bugstack虫洞栈 | 专注原创技术专题案例
 * 论坛：http://bugstack.cn
 * Create by 小傅哥 on @2020
 */
public class EngineConfig {

    static Map<String, LogicFilter> logicFilterMap;

    /**
     * 在这⾥将可提供服务的决策节点配置到 map 结构中，对于这样的 map 结构可以抽取到数据库中，
     * 那么就可以⾮常⽅便的管理。
     */
        static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }

    public Map<String, LogicFilter> getLogicFilterMap() {
        return logicFilterMap;
    }

    public void setLogicFilterMap(Map<String, LogicFilter> logicFilterMap) {
        this.logicFilterMap = logicFilterMap;
    }

}
