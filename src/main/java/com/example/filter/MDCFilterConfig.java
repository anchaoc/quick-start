package com.example.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

/**
 * MDC 在日志上下文中插入业务需要参数打印
 * @author anchao
 */
@Configuration
public class MDCFilterConfig {
    @Bean
    public FilterRegistrationBean<LogFilter> registration() {
        LogFilter filter = new LogFilter();
        FilterRegistrationBean<LogFilter> registration = new FilterRegistrationBean<LogFilter>(filter);
        registration.setUrlPatterns(Collections.singletonList("/*"));
        registration.setOrder(1);
        return registration;
    }
}
