package com.hackerrank.implementation;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by brianmomongan on 5/06/16.
 */
public class ExtraLongFactorials {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Integer number = Integer.valueOf(scanner.nextLine());
        System.out.println(factorials(BigInteger.valueOf(number)));
    }

    private static BigInteger factorials(BigInteger number) {
        if (number.equals(BigInteger.ONE)) return BigInteger.ONE;
        return number.multiply(factorials(number.subtract(BigInteger.ONE)));
    }
}
