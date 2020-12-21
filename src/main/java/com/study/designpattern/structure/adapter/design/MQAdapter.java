package com.study.designpattern.structure.adapter.design;

import com.alibaba.fastjson.JSON;
import com.study.designpattern.structure.adapter.mq.OrderMQ;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Map;

/**
 * Create by zhangz on 2020/12/18
 *消息体适配类
 * 主要⽤于把不同类型MQ种的各种属性，映射成我们需要的属性并返
 * 回。就像⼀个属性中有 ⽤户ID;uId ，映射到我们需要的； userId ，做统⼀处理。
 * ⽽在这个处理过程中需要把映射管理传递给 Map<String, String> link ，也就是准确的描述
 * 了，当前MQ中某个属性名称，映射为我们的某个属性名称。
 * 最终因为我们接收到的 mq 消息基本都是 json 格式，可以转换为MAP结构。最后使⽤反射调⽤的
 * ⽅式给我们的类型赋值。
 */
public class MQAdapter {
    public static RebateInfo filter(String strJson, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        /**
         * Fastjson 将实体转map时将Date类型的属性转成时间戳处理
         */
        return filter(JSON.parseObject(strJson, Map.class), link);
    }

    public static RebateInfo filter(Map obj, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        RebateInfo rebateInfo = new RebateInfo();
        for (String key : link.keySet()) {
            Object val = obj.get(link.get(key));
            String functionName = "set" + key.substring(0, 1).toUpperCase() + key.substring(1);
//            Class[] methodParamTypes = getMethodParamTypes(RebateInfo.class.newInstance(), functionName);
            RebateInfo.class.getMethod(functionName,String.class).invoke(rebateInfo, val.toString());

        }
        return rebateInfo;
    }

    /**
     * 根据方法名称取得反射方法的参数类型(没有考虑同名重载方法使用时注意)
     * @param classInstance         类实例
     * @param methodName  方法名
     * @return
     * @throws ClassNotFoundException
     */
    private static Class[]  getMethodParamTypes(Object classInstance,
                                                String methodName) throws ClassNotFoundException{
        Class[] paramTypes = null;
        Method[]  methods = classInstance.getClass().getMethods();//全部方法
        for (int  i = 0;  i< methods.length; i++) {
            if(methodName.equals(methods[i].getName())){//和传入方法名匹配
                Class[] params = methods[i].getParameterTypes();
                paramTypes = new Class[ params.length] ;
                for (int j = 0; j < params.length; j++) {
                    paramTypes[j] = Class.forName(params[j].getName());
                }
                break;
            }
        }
        return paramTypes;
    }


    public static  RebateInfo adapter(OrderMQ orderMQ){
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        RebateInfo rebateInfo = new RebateInfo();
        rebateInfo.setBizId(orderMQ.getSku());
        rebateInfo.setBizTime(String.valueOf(s.parse(orderMQ.getCreateOrderTime().toString(),new ParsePosition(0)).getTime()/1000));
        rebateInfo.setUserId(orderMQ.getUid());

        return rebateInfo;
    }

}
