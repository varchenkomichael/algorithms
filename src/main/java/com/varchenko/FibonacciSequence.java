package com.varchenko;

public class FibonacciSequence {
    public static int fib(int n) {
        if (n <= 1) return n;
        else if (n >= 100) throw new RuntimeException();//todo check the real number of argument
        else return fib(n - 1) + fib(n - 2);
    }
}

