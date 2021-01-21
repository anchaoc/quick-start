package com.example.controller;

import com.example.aspect.UnknownExResult;
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
    @UnknownExResult
    public Result<String> get() {
        //int a =1/0;
        return Result.success("success");
    }

    @GetMapping("caffeineCache")
    public void testCaffeineCache() {
        throw new CaffeineException(ExceptionEnum.FAIL);
    }

}
