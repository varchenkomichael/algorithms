package com.varchenko.java8Exercise;

import java.util.function.Consumer;

public class N6_HeavyBox {
    public void heavyBox (Object heavyBox) {
        Consumer<String> stringConsumer = s -> System.out.print("ящик с весом " + s);
        stringConsumer.accept(heavyBox.toString());
    }
}
