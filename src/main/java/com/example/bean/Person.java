package com.example.bean;

import java.io.Serializable;

/**
 * @author anchao
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 4748423899551137607L;
    private Long id;

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
