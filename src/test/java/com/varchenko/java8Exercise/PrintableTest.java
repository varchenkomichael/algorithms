package com.varchenko.java8Exercise;

import org.junit.jupiter.api.Test;

class PrintableTest implements Printable{

    @Test
    void print() {
        Printable printer = System.out::println;
        printer.print("Hello");
    }

    @Override
    public void print(String s) {

    }
}