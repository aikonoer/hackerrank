package com.hackerrank.implementation.serviceLane;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceLaneApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Integer cases = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < cases; i++) {
            final Integer stones = Integer.valueOf(scanner.nextLine());
            final Integer aDiff = Integer.valueOf(scanner.nextLine());
            final Integer bDiff = Integer.valueOf(scanner.nextLine());

            final ArrayList<Integer> arr = new ArrayList<>();
            List<Integer> list;
            if (aDiff > bDiff) {
                arr.add(bDiff * (stones - 1));
                list = lastStones(bDiff * (stones - 1), aDiff * (stones - 1), aDiff - bDiff, arr);
            } else {
                arr.add(aDiff * (stones - 1));
                list = lastStones(aDiff * (stones - 1), bDiff * (stones - 1), bDiff - aDiff, arr);
            }


            StringBuilder builder = new StringBuilder();
            for (Integer integer : list) {
                builder.append(" ").append(integer);
            }
            System.out.println(builder.toString().trim());
        }
    }

    private static List<Integer> lastStones(int start, int end, int diff, List<Integer> list) {
        if (start >= end) return list;
        final int next = start + diff;
        list.add(next);
        return lastStones(next, end, diff, list);
    }
}