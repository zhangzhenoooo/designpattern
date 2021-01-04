package com.study.webmvc.config;

import com.study.webmvc.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Create by zhangz on 2021/1/4
 */
@Configuration
public class MyConfigurer implements WebMvcConfigurer {
    /**
     *  静态资源配置
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/app/**")
                .addResourceLocations("classpath:/static/app/");
    }


    /**
     * 请求拦截
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                // 默认拦截所有请求
                .addPathPatterns("/**")
                // 白名单
                .excludePathPatterns("/app/login","/app/dologin");
    }

    /**
     *  跨域请求
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                // 允许的域名
                .allowedOrigins("*")
                // 允许请求方式
                .allowedMethods("PUT , POST ,GET,DELETE ,OPTIONS " )
                // handler
                .allowedHeaders("*");
    }

    /**
     *  视图控制器配置
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");

    }
}
