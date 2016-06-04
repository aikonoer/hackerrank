package com.hackerrank.string;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by brianmomongan on 4/06/16.
 */
public class Pangrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String string = scanner.nextLine();
        final int length = string.length();
        final boolean result = isPangrams(0, string, length, new HashSet<>());
        System.out.println(result ? "pangram" : "not pangram");
    }

    private static boolean isPangrams(int loop, String string, int length, HashSet<Character> storage) {
        if (loop == length) return storage.size() == 26;
        final char charAt = string.charAt(loop);
        if (charAt <= 'z' && charAt >= 'a') storage.add(charAt);
        if (charAt <= 'Z' && charAt >= 'A') storage.add((char) (charAt + 32));
        return isPangrams(++loop, string, length, storage);
    }
}
