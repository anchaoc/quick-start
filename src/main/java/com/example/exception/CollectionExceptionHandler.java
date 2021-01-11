package com.example.exception;

import com.example.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author anchao
 */
@Slf4j
@RestControllerAdvice
public class CollectionExceptionHandler {

    @ExceptionHandler(value = CaffeineException.class)
    public Result<Object> caffeineException(CaffeineException caffeineException){
        log.warn("caffeineException",caffeineException);
        return Result.fail(caffeineException.getExceptionEnum(),null);
    }

}
