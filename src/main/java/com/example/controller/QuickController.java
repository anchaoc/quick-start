package com.example.controller;

import com.example.caffeine.CaffeineCache;
import com.example.exception.CaffeineException;
import com.example.exception.ExceptionEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anchao
 */
@RestController
@RequestMapping("quick")
public class QuickController {

    @Autowired
    CaffeineCache caffeineCache;

    @GetMapping("caffeineCache")
    public void testCaffeineCache(){
        throw new CaffeineException(ExceptionEnum.FAIL);
    }

}
