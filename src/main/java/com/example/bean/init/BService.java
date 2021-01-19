package com.example.bean.init;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * B
 *
 * @author anchao
 * @since 1.0
 */
@Slf4j
@Service
public class BService implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("BService init..");
    }
}
