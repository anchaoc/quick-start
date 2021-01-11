package com.example.exception;

import lombok.Getter;

/**
 * @author anchao
 */
@Getter
public class CaffeineException extends BaseException{

    private final ExceptionEnum exceptionEnum;

    public CaffeineException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getCode(), exceptionEnum.getMsg());
        this.exceptionEnum=exceptionEnum;
    }

}
