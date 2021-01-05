package com.study.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Create by zhangz on 2021/1/5
 */
@Configuration
public class MyConfig implements WebMvcConfigurer {
    /**
     *  静态资源
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/apps-api/**")
        .addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/temples/**")
                .addResourceLocations("classpath:/resources/temples/");
    }
}
