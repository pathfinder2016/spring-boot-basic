package com.example.demo.domain;

public class Fib {
    public int queryValueByIndex(int index) {
        if (index <= 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        if (index == 2) {
            return 1;
        }
        return queryValueByIndex(index - 1) + queryValueByIndex(index - 2);
    }
}
