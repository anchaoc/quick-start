package com.example.common;


import com.example.exception.ExceptionEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一包装返回
 * @param <T>
 * @author anchao
 */
@NoArgsConstructor
@Data
public class Result<T> {
    private static final String SUCCESS_MSG = "SUCCESS";
    private static final int SUCCESS_CODE = 200;

    private T data;
    private int code;
    private String msg;

    public static <T> Result<T> success(T data) {
        Result<T> tResult = new Result<>();
        tResult.setCode(Result.SUCCESS_CODE);
        tResult.setMsg(Result.SUCCESS_MSG);
        tResult.setData(data);
        return tResult;
    }

    public static Result<Object> fail(ExceptionEnum exceptionEnum,Object data) {
        Result<Object> tResult = new Result<>();
        tResult.setCode(exceptionEnum.getCode());
        tResult.setMsg(exceptionEnum.getMsg());
        tResult.setData(data);
        return tResult;
    }

}
