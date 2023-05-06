package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticException {

    @Test
    public void testException() {
        assertThrows(java.lang.ArithmeticException.class, () -> {
            divideTwoNumbers(10, 0);
        });

    }

    @Test
    public void testDivideTwoNumbersReturnsCorrectResult() {
        assertEquals(3, divideTwoNumbers(18, 6));
    }

    private int divideTwoNumbers(int dividend, int divisor) {
        return dividend / divisor;
    }

    //EX.3

    @Test
    public void positiveTestWithMassive() {
        int[] myArray = {1, 2, 3, 4, 5} ;
        int arrayElement = myArray[3];
        Assertions.assertEquals(arrayElement, 4);
    }

    @Test
    public void negativeTestWithMassiveException(){
        int[] myArray = {1, 2, 3, 4, 5};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int arrayElement = myArray[10];
            System.out.println("Array index out of massive");
        });
    }


    }







