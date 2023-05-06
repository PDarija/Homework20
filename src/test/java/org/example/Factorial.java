package org.example;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) throws Exception {
        Scanner scanner = null;
        try {
            System.out.print("Enter an integer: ");
            scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            BigInteger factorial = BigInteger.valueOf(1);
            for (int i = 2; i <= n; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }

            System.out.println("Result: " + n + "! " + " = " + factorial.toString());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: Negative number!");

        } catch (InputMismatchException e) {
            System.out.println("Error: Should be only numbers! ");

        } finally {
            scanner.close();

        }
    }



}


