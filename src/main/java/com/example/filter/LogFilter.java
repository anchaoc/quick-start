package com.example.filter;

import ch.qos.logback.classic.helpers.MDCInsertingServletFilter;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author anchao
 */
@Slf4j
public class LogFilter extends MDCInsertingServletFilter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        MDC.put("userId", "10010");
        try {
            super.doFilter(request,response,chain);
        } finally {
            try {
                MDC.remove("userId");
            } catch (IllegalArgumentException illegalArgumentException) {
                log.warn("LogFilter MDC remove userId warn :",illegalArgumentException);
            }
        }
    }

}
