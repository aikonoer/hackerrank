package com.hackerrank.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by brianmomongan on 5/06/16.
 */

public class Gemstones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Integer linesOfStrings = Integer.valueOf(scanner.nextLine());
        Map<Character, Integer> storage = new HashMap<>();
        int result = 0;
        for (int i = 0; i < linesOfStrings; i++) {
            final String string = scanner.nextLine();

            storage = storageChar(0, string.length(), string, storage, new HashSet<>());
            if (i == linesOfStrings - 1)
                result = findGemElement(0, string, storage, 0, linesOfStrings, new HashSet<>());
        }

        System.out.println(result);
    }

    private static int findGemElement(int loop, String string, Map<Character, Integer> storage, int count, int linesOfStrings, HashSet<Character> chars) {
        if (loop == string.length()) return count;
        if (storage.get(string.charAt(loop)) == linesOfStrings && chars.add(string.charAt(loop))) ++count;
        return findGemElement(++loop, string, storage, count, linesOfStrings, chars);
    }

    private static Map<Character, Integer> storageChar(int loop, int length, String string, Map<Character, Integer> storage, HashSet<Character> chars) {
        if (loop == length) return storage;
        final char charAt = string.charAt(loop);
        if (chars.add(charAt)) {
            if (storage.containsKey(charAt)) storage.put(charAt, storage.get(charAt) + 1);
            else storage.put(charAt, 1);
        }
        return storageChar(++loop, length, string, storage, chars);
    }
}
