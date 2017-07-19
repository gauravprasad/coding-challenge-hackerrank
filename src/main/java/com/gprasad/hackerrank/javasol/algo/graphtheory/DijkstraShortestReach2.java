/*


Dijkstra: Shortest Reach 2 (Hackerrank Java solution)

 Given a graph consisting nodes (labelled 1 to N) where a specific given node represents the starting position and an edge between two nodes is of a given length, which may or may not be equal to other lengths in the graph.

It is required to calculate the shortest distance from the start position (Node S) to all of the other nodes in the graph.

Note 1: If a node is unreachable , the distance is assumed as .

Input Format

The first line contains , denoting the number of test cases.
First line of each test case has two integers , denoting the number of nodes in the graph and , denoting the number of edges in the graph.

The next lines each consist of three space-separated integers , where and denote the two nodes between which the undirected edge exists, denotes the length of edge between these corresponding nodes.

The last line has an integer , denoting the starting position.

Constraints




If there are edges between the same pair of nodes with different weights, they are to be considered as is, like multiple edges.

Output Format

For each of the test cases, print a single line consisting space separated integers denoting the shortest distance of nodes from starting position .

For unreachable nodes, print .

Sample Input

1
4 4
1 2 24
1 4 20
3 1 3
4 3 12
1

Sample Output

24 3 15

Explanation

The graph given in the test case is shown as :

Graph

    The straight line is a weighted edge, denoting length of edge between the corresponding nodes.
    The nodes S,B,C and D denote the obvious node 1,2,3 and 4 in the test case.

The shortest paths followed for the three nodes B,C and D are as follows :

S->B - Shortest Path Value : 24

S->C - Shortest Path Value : 3

S->C->D - Shortest Path Value : 15
 */
package com.gprasad.hackerrank.javasol.algo.graphtheory;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class DijkstraShortestReach2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        for (int t = 0; t < testCase; t++) {
            int noOfNodes = input.nextInt();
            int noOfEdges = input.nextInt();
            Map<Vertex, List<Edge>> graph = new HashMap<>();
            for (int e = 0; e < noOfEdges; e++) {
                Vertex src = new Vertex(input.nextInt());
                Vertex dest = new Vertex(input.nextInt());
                int dist = input.nextInt();
                if (!graph.containsKey(src)) {
                    graph.put(src, new ArrayList<Edge>());
                }
                if (!graph.containsKey(dest)) {
                    graph.put(dest, new ArrayList<Edge>());
                }
                graph.get(src).add(new Edge(dest, dist));
                graph.get(dest).add(new Edge(src, dist));
            }
            int start = input.nextInt();
            Vertex startNode = new Vertex(start);
            int[] distance = new int[noOfNodes + 1];
            Arrays.fill(distance, Integer.MAX_VALUE);
            distance[start] = 0;
           Queue<Vertex> queue = new ArrayDeque<>();//new PriorityQueue<>(new Comparator<Vertex>() {
//                @Override
//                public int compare(Vertex o1, Vertex o2) {
//                    return Integer.compare(distance[o1.getData()], distance[o2.getData()]);
//                }
//            });
            queue.add(startNode);
            while (!queue.isEmpty()) {
                setDistance(distance, queue.poll(), graph, queue);
            }
            printDistnace(distance, start);
            System.out.println();
        }
    }

    private static void setDistance(int[] distance, Vertex startNode, Map<Vertex, List<Edge>> graph, Queue<Vertex> queue) {
        if (graph.containsKey(startNode)) {
            List<Edge> edges = graph.get(startNode);
            for (Edge edge : edges) {
                int neighborDistance = edge.getWeight() + distance[startNode.getData()];
                Vertex neibhor = edge.getDestination();
                if (distance[neibhor.getData()] > neighborDistance) {
                    distance[neibhor.getData()] = neighborDistance;
                }
                if (!neibhor.getVisited()) {
                    queue.add(neibhor);
                }
            }
        }
        startNode.setVisited(Boolean.TRUE);
    }

    private static void printDistnace(int[] distance, int startPoint) {
        for (int i = 1; i < distance.length; i++) {
            if (i == startPoint) {
                continue;
            }
            System.out.print((distance[i] == Integer.MAX_VALUE ? -1 : distance[i]) + " ");
        }
    }

}
