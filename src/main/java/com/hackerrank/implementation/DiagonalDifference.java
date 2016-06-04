package com.hackerrank.implementation;

import java.util.Scanner;

/**
 * Created by brianmomongan on 5/06/16.
 */
public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Integer len = Integer.valueOf(scanner.nextLine());
        int left = 0;
        int right = 0;
        for (int i = 0; i < len; i++) {
            final String[] arr = scanner.nextLine().split(" ");
            left += Integer.valueOf(arr[i]);
            right += Integer.valueOf(arr[len - i - 1]);
        }
        System.out.println(Math.abs(left - right));
    }
}

