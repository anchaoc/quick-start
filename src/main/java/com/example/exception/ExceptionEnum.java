package com.example.exception;

/**
 * @author anchao
 */
public enum ExceptionEnum {
    /**
     * 本地缓存加载异常
     */
    FAIL(501,"local cache loading exception");

    private final int code;
    private final String msg;

    ExceptionEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
