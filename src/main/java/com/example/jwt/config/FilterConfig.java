package com.example.jwt.config;

import com.example.jwt.filter.MyFilter1;
import com.example.jwt.filter.MyFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<MyFilter1> filter1() {
        FilterRegistrationBean<MyFilter1> bean = new FilterRegistrationBean<>(new MyFilter1());
        bean.addUrlPatterns("/*"); // 모든 요청에 필터 적용
        bean.setOrder(1); // 필터 우선순위. 번호가 낮을수록 우선순위가 높음
        return bean;
    }

    @Bean
    public FilterRegistrationBean<MyFilter2> filter2() {
        FilterRegistrationBean<MyFilter2> bean = new FilterRegistrationBean<>(new MyFilter2());
        bean.addUrlPatterns("/*"); // 모든 요청에 필터 적용
        bean.setOrder(0); // 필터 우선순위. 번호가 낮을수록 우선순위가 높음
        return bean;
    }
}
