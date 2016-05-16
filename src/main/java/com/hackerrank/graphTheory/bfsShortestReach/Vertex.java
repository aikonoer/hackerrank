package com.hackerrank.graphTheory.bfsShortestReach;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brianmomongan on 17/05/16.
 */
public class Vertex {

    private List<Vertex> neighbors = new ArrayList<>();
    private int data;

    public Vertex(int data) {
        this.data = data;
    }

    public List<Vertex> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Vertex> neighbors) {
        this.neighbors = neighbors;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
