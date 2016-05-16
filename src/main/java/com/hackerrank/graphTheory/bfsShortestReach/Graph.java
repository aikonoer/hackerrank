package com.hackerrank.graphTheory.bfsShortestReach;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * Created by brianmomongan on 17/05/16.
 */
public class Graph {

    private Map<Integer, Vertex> vertices = new HashMap<>();

    public void add(int data) {
        vertices.put(data, new Vertex(data));
    }

    public Map<Integer, Vertex> getVertices() {
        return vertices;
    }

    public Map<Integer, Integer> findShortest(Integer current, Map<Integer, Integer> list, Queue<Integer> queue) {
        list.put(current, 0);
        queue.add(current);
        return fsLoop(queue.peek(), list, queue);
    }

    private Map<Integer, Integer> fsLoop(Integer current, Map<Integer, Integer> list, Queue<Integer> queue) {
        queue.remove();
        vertices
                .get(current)
                .getNeighbors()
                .stream()
                .forEach(vertex -> {
                    if (!list.containsKey(vertex.getData())) {
                        list.put(vertex.getData(), list.get(current) + 6);
                        queue.add(vertex.getData());
                    }
                });
        if (!queue.isEmpty()) fsLoop(queue.peek(), list, queue);
        return list;
    }
}
