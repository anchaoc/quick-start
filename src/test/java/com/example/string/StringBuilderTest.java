package com.example.string;

import lombok.extern.slf4j.Slf4j;

/**
 * TODO
 *
 * @author anchao
 * @since 1.0
 */
@Slf4j
public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("abcdefg");
        StringBuilder reverse = stringBuilder.reverse();
        log.info("reverse:{}",reverse);
    }
}
