package com.study.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Create by zhangz on 2021/1/5
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true,jsr250Enabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter  {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        /**
//         * 1.需要把loginPage,loginProcessingUrl放开 permiAll，否则会进入无限循环重定向
//         * 2.antMatchers("/doLogin", "/touch","/error404").permitAll()的顺序不重要
//         * 3.无需要配置 scanBasePackages
//         */
//        http
//                .formLogin()
//                .loginPage("/login")
//                .loginProcessingUrl("/touch")
//                .and()
//                .authorizeRequests()
//                .antMatchers("/login", "/touch").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .csrf().disable();
//    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        auth.inMemoryAuthentication()
                 .passwordEncoder(bCryptPasswordEncoder)
                 .withUser("root")
                 .password(bCryptPasswordEncoder.encode("root"))
                 .roles("ROOT");
    }
}
