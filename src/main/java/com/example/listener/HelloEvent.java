package com.example.listener;

import org.springframework.context.ApplicationEvent;

public class HelloEvent extends ApplicationEvent {

    private String msg;
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public HelloEvent(Object source) {
        super(source);
    }

    public HelloEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "HelloEvent{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
