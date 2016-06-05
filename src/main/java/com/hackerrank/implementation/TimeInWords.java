package com.hackerrank.implementation;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by brianmomongan on 5/06/16.
 */
public class TimeInWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Integer hour = Integer.valueOf(scanner.nextLine());
        final Integer minutes = Integer.valueOf(scanner.nextLine());
        final HashMap<Integer, String> storage = initializeWords(new HashMap<>());
        System.out.println(toWords(hour, minutes, storage));
    }

    private static HashMap<Integer, String> initializeWords(HashMap<Integer, String> map) {
        map.put(0, "o' clock");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(13, "thirteen");
        map.put(14, "fourteen");
        map.put(15, "quarter");
        map.put(16, "sixteen");
        map.put(17, "seventeen");
        map.put(18, "eighteen");
        map.put(19, "nineteen");
        map.put(20, "twenty");
        map.put(21, "twenty one");
        map.put(22, "twenty two");
        map.put(23, "twenty three");
        map.put(24, "twenty four");
        map.put(25, "twenty five");
        map.put(26, "twenty six");
        map.put(27, "twenty seven");
        map.put(28, "twenty eight");
        map.put(29, "twenty nine");
        map.put(30, "half");
        map.put(30, "quarter");
        return map;
    }

    private static String toWords(int hour, int minutes, HashMap<Integer, String> storage) {
        if (minutes == 0) return storage.get(hour) + " " + storage.get(0);
        else if (minutes == 1) return storage.get(minutes) + "minute past " + storage.get(hour);
        else if (minutes == 15) return storage.get(minutes) + " past " + storage.get(hour);
        else if (minutes > 1 && minutes < 30) return storage.get(minutes) + " minutes past " + storage.get(hour);
        else if (minutes == 30) return storage.get(30) + " past " + storage.get(hour);
        else if (minutes == 45) return storage.get(60 - minutes) + " to " + storage.get(hour + 1);
        else return storage.get(60 - minutes) + " minutes to " + storage.get(hour + 1);
    }
}

