package com.hackerrank.string;

import java.util.Scanner;

/**
 * Created by brianmomongan on 5/06/16.
 */
public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Integer cases = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < cases; i++) {
            final String string = scanner.nextLine();
            System.out.println(countOpsToPalindrome(0, string.length() / 2, string.length() - 1, 0, string));
        }
    }

    private static int countOpsToPalindrome(int loop, int mid, int len, int count, String string) {
        if (loop == mid) return count;
        final char leftChar = string.charAt(loop);
        final char rightChar = string.charAt(len - loop);
        if (leftChar > rightChar) count += leftChar - rightChar;
        else count += rightChar - leftChar;
        return countOpsToPalindrome(++loop, mid, len, count, string);
    }
}
