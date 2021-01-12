package com.example.filter;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author anchao
 */
@Slf4j
@Component
public class LogFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        MDC.put("userId", "10010");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        try {
            MDC.clear();
        } catch (Exception e) {
            log.error("MDC ERROR:", e);
        }
    }
}
