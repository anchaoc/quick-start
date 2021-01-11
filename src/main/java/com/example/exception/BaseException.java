package com.example.exception;

/**
 * @author anchao
 */
public class BaseException extends RuntimeException {
    /**
     * code码
     */
    private final int code;
    /**
     * msg提示
     */
    private final String msg;

    public BaseException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

}
