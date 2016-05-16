package com.hackerrank.graphTheory.bfsShortestReach;

import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Integer loops = Integer.valueOf(scanner.nextLine());
        for (int x = 0; x < loops; x++) {
            final String[] cases = scanner.nextLine().split(" ");
            final Integer numNodes = Integer.valueOf(cases[0]);
            final Integer edges = Integer.valueOf(cases[1]);

            Graph graph = new Graph();
            for (int g = 0; g < numNodes; g++) {
                graph.add(g + 1);
            }

            for (int y = 0; y < edges; y++) {
                final String[] edge = scanner.nextLine().split(" ");
                final Integer from = Integer.valueOf(edge[0]);
                final Integer to = Integer.valueOf(edge[1]);
                final Map<Integer, Vertex> vertices = graph.getVertices();
                final Vertex fromVertex = vertices.get(from);
                final Vertex toVertex = vertices.get(to);
                fromVertex.getNeighbors().add(toVertex);
                toVertex.getNeighbors().add(fromVertex);
            }

            final Integer find = Integer.valueOf(scanner.nextLine().trim());
            final Map<Integer, Integer> shortest = graph.findShortest(find, new HashMap<>(), new LinkedList<>());

            StringBuilder builder = new StringBuilder();
            for (int k = 0; k < numNodes; k++) {
                Integer key = k + 1;
                if (key.compareTo(find) != 0) {
                    if (shortest.containsKey(key)) builder.append(" ").append(shortest.get(key));
                    else builder.append(" ").append("-1");
                }
            }
            System.out.println(builder.toString().trim());
        }
    }

}