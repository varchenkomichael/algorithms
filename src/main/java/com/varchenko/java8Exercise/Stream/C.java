package com.varchenko.java8Exercise.Stream;

import java.util.ArrayList;
import java.util.List;

public class C {
    private final List<B> children = new ArrayList<>();
    private final int value;

    public C(int value) {
        this.value = value;
    }

    public C add(B b) {
        children.add(b);
        return this;
    }
    public List<B> getChildren(){
        return new ArrayList<>(children);
    }

    @Override
    public String toString() {
        return "C" + value + " " + children;
    }
}
