package com.example.bean.init;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * A
 *
 * @author anchao
 * @since 1.0
 */
@Slf4j
@Service
public class AService {

    @PostConstruct
    public void init (){
        log.info("init AService..");
    }
}
