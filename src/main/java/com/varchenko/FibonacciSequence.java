package com.varchenko;

import java.math.BigInteger;

import static java.math.BigInteger.*;

public class FibonacciSequence {
    private static final BigInteger FIRST_FIBO_NUMBER = ZERO;
    private static final BigInteger SECOND_FIBO_NUMBER = ONE;


    public BigInteger generalMethod(int amountOfElements) {
        if (amountOfElements < 0 || amountOfElements > 100)
            throw new IllegalArgumentException("Should be less than 100 or positive");
        if (amountOfElements == 0) return ZERO;
            BigInteger grandPreviousResult = FIRST_FIBO_NUMBER;
            BigInteger previousTmpResult = SECOND_FIBO_NUMBER;
            BigInteger tmpResult = grandPreviousResult.add(previousTmpResult);

            for (int i = 0; i < amountOfElements - 2; i++) {
                grandPreviousResult = previousTmpResult;
                previousTmpResult = tmpResult;
                tmpResult = grandPreviousResult.add(previousTmpResult);

            }return tmpResult;
        }
}
