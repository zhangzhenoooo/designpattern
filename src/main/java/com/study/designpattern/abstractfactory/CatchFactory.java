package com.study.designpattern.abstractfactory;

import java.util.HashMap;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CatchFactory {

    private final static HashMap<String, ICatchAdapter> HANDLERS = new HashMap<String, ICatchAdapter>();

    public static ICatchAdapter getHandler(String handlerClass) {
        handlerClass = handlerClass.trim();
        ICatchAdapter ICatchAdapter = HANDLERS.get(handlerClass);
        if (ICatchAdapter == null) {
            try {
                ICatchAdapter = (ICatchAdapter) Class.forName(handlerClass).newInstance();//注意此字符串必须是真实路径，就是带包名的类路径，包名.类名
//                HandlerService handlerService = SpringUtils.getBean(HandlerServiceImpl.class);
//                ICatchAdapter.setHandlerService(handlerService);
                HANDLERS.put(handlerClass, ICatchAdapter);
            } catch (Exception e) {
                log.error(e.getMessage(), e);
//                throw new ServiceException("处理类无法实例化", e);
            }
        }
//        HandlerService handlerService = ICatchAdapter.getHandlerService();
//        if (handlerService == null) {
//            ICatchAdapter.setHandlerService(SpringUtils.getBean(HandlerServiceImpl.class));
//        }
        return ICatchAdapter;
    }
}
