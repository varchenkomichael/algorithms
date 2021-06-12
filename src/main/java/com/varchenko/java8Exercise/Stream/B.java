package com.varchenko.java8Exercise.Stream;

import java.util.ArrayList;
import java.util.List;

public class B {
    private List<A> child = new ArrayList<>();
    private final int value;

    public B(int value) {
        this.value = value;
    }

    public B add(A a) {
        child.add(a);
        return this;
    }
    public List<A> getChild(){
       return new ArrayList<>(child);
    }

    @Override
    public String toString() {
        return "B" + value + " " + child;
    }
}
