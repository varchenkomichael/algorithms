package com.varchenko.java8Exercise;

import java.util.function.Supplier;

public class N8_RandomNumber {
    public int randomNumber () {
        Supplier<Integer> random = () -> (int)Math.floor(Math.random() * (10 + 1) + 0);
        return random.get();
    }
}
