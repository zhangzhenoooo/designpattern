package com.study.designpattern.abstractfactory;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

/**
 * Create by zhangz on 2020/12/10
 */
@Slf4j
public class AdapterFactory {
    private final static HashMap<String, ICatchAdapter> HANDLERS = new HashMap<String, ICatchAdapter>();

    public static ICatchAdapter getHandler(String handlerClass) {
        handlerClass = handlerClass.trim();
        ICatchAdapter baseHandler = HANDLERS.get(handlerClass);
        if (baseHandler == null) {
            try {
                baseHandler = (ICatchAdapter) Class.forName(handlerClass).newInstance();//注意此字符串必须是真实路径，就是带包名的类路径，包名.类名
//                HandlerService handlerService = SpringUtils.getBean(HandlerServiceImpl.class);
//                baseHandler.setHandlerService(handlerService);
                HANDLERS.put(handlerClass, baseHandler);
            } catch (Exception e) {
                log.error(e.getMessage(), e);
//                throw new ServiceException("处理类无法实例化", e);
            }
        }
        return baseHandler;
    }
}
