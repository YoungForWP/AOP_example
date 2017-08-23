package com.tw;

import org.springframework.stereotype.Component;

@Component
public class LogImplement implements Log {
    @Override
    public void log() {
        System.out.println("log");
    }
}
