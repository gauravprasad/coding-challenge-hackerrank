/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.algo.graphtheory;

/**
 *
 * @author gq6pras
 */
public class Edge {
    private final Vertex destination;
    private final int weight;

    public Edge(Vertex destination, int weight) {
         this.destination = destination;
        this.weight = weight;
    }
    public Vertex getDestination() {
        return destination;
    }


    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return destination + " " + weight;
    }
}

