package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {
    int[] input1 = {2,2,1};
    int expected1 = 1;
    int[] input2 = {4,1,2,1,2};
    int expected2 = 4;
    int[] input3 = {1};
    int expected3 = 1;

    @Test
    void singleNumber() {
        SingleNumber singleNumber = new SingleNumber();
        singleNumber.singleNumber(input1);
        singleNumber.singleNumber(input2);
        singleNumber.singleNumber(input3);
        Assertions.assertEquals(1, expected1);;
        Assertions.assertEquals(4, expected2);;
        Assertions.assertEquals(1, expected3);;
    }
}