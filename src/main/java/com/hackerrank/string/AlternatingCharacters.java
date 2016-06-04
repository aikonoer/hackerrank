package com.hackerrank.string;

import java.util.Scanner;

/**
 * Created by brianmomongan on 4/06/16.
 */
public class AlternatingCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Integer cases = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < cases; i++) {
            final String string = scanner.nextLine();
            System.out.println(countDeletions(1, string.length(), string.charAt(0), 0, string));
        }
    }

    private static int countDeletions(int loop, int length, char pastChar, int count, String string) {
        if (loop == length) return count;

        final char currentChar = string.charAt(loop);
        if (pastChar == currentChar) ++count;
        return countDeletions(++loop, length, currentChar, count, string);
    }
}
