package com.varchenko.java8Exercise;

import org.junit.jupiter.api.Test;

class N8_RandomNumberTest {

    @Test
    void randomNumber() {
        N8_RandomNumber n8_randomNumber = new N8_RandomNumber();
        for (int i = 0; i <= 10; i++) {
            int num = n8_randomNumber.randomNumber();
            System.out.println(num);
        }
    }
}