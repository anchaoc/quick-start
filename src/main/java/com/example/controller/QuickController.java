package com.example.controller;

import com.example.common.Result;
import com.example.exception.CaffeineException;
import com.example.exception.ExceptionEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anchao
 */
@RestController
@RequestMapping("quick")
public class QuickController {


    @GetMapping("get")
    public Result<String> get() {
        return Result.success("success");
    }

    @GetMapping("caffeineCache")
    public void testCaffeineCache() {
        throw new CaffeineException(ExceptionEnum.FAIL);
    }

}
