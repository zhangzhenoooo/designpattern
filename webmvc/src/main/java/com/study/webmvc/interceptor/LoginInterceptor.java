package com.study.webmvc.interceptor;

import com.alibaba.fastjson.JSON;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Create by zhangz on 2021/1/4
 */
public class LoginInterceptor implements HandlerInterceptor {
    /**
     *  调用controller之前
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("===========================preHandle=====================");
        // TODO 登录验证
///        System.out.println(request.getContextPath() + "申请调用,handler="+ JSON.toJSON(handler));
        return true;
    }
    /**
     * 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
       System.out.println("===========================postHandle=====================");
//        System.out.println(request.getContextPath() + "申请调用,handler="+ JSON.toJSON(handler));
    }

    /**
     * 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("===========================afterCompletion=====================");
    }
}
