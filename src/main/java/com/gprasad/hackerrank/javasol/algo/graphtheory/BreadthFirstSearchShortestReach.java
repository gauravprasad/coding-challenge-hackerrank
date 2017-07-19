/*
Breadth First Search: Shortest Reach(Hackerrank Java Solution)

Given an undirected graph consisting of nodes (labelled 1 to N) where a specific given node represents the start position and an edge between any two nodes is of length units in the graph.

It is required to calculate the shortest distance from start position (Node S) to all of the other nodes in the graph.

Note 1: If a node is unreachable , the distance is assumed as .
Note 2: The length of each edge in the graph is units.

Input Format

The first line contains , denoting the number of test cases.
First line of each test case has two integers , denoting the number of nodes in the graph and , denoting the number of edges in the graph.
The next lines each consist of two space separated integers , where and denote the two nodes between which the edge exists.
The last line of a testcase has an integer , denoting the starting position.

Constraints



Output Format

For each of test cases, print a single line consisting of space-separated integers, denoting the shortest distances of the N-1 nodes from starting position . This will be done for all nodes same as in the order of input 1 to N.

For unreachable nodes, print .

Sample Input

2
4 2
1 2
1 3
1
3 1
2 3
2

Sample Output

6 6 -1
-1 6

Explanation

For test cases 1:

The graph given in the test case is shown as :

Graph

S denotes the node 1 in the test case and B,C and D denote 2,3 and 4. Since S is the starting node and the shortest distances from it are (1 edge, 1 edge, Infinity) to the nodes B,C and D (2,3 and 4) respectively.

Node D is unreachable, hence -1 is printed (not Infinity).

For test cases 2: There are only one edge (2, 3) in a graph with 3 nodes, so node 1 is unreachable from node 2, and node 3 has one edge from node 2, each edge has the length of 6 units. So we output -1 6. 

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
public class BreadthFirstSearchShortestReach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        for(int i=0; i<testCase;i++)
        {
            int nodesCount = input.nextInt();
            int edgesCount = input.nextInt();
            Map<Vertex, List<Vertex>> graph = new HashMap<>(nodesCount);
            int[] distances = new int[nodesCount+1];
            Arrays.fill(distances, Integer.MAX_VALUE);
            for(int e =0;e<edgesCount;e++)
            {
                Vertex v1 = new Vertex(input.nextInt());
                Vertex v2 = new Vertex(input.nextInt());
                if(graph.containsKey(v1))
                {
                    graph.get(v1).add(v2);
                }
                else
                {
                     graph.put(v1, new ArrayList<>());
                     graph.get(v1).add(v2);
                }
               if(graph.containsKey(v2))
                {
                    graph.get(v2).add(v1);
                }
                else
                {
                     graph.put(v2, new ArrayList<>());
                     graph.get(v2).add(v1);
                }
                
            }
            int startNodeData =input.nextInt();
            distances[startNodeData] = 0;
            Queue<Vertex> queue = new ArrayDeque<>();
            queue.add(new Vertex(startNodeData));
            while(!queue.isEmpty())
            {
                setDistance(queue.poll(),graph,distances,queue);
            }
            
            printDistance(distances,startNodeData);
        }
    }

    private static void setDistance(Vertex currentVertex, Map<Vertex, List<Vertex>> graph, int[] distances, Queue<Vertex> queue) {
        if(graph.containsKey(currentVertex))
        {
           List<Vertex> vertexes = graph.get(currentVertex);
           List<Vertex> filterVertexes = new ArrayList<>();
           for(Vertex vertex : vertexes)
           {
               if(distances[vertex.getData()]==Integer.MAX_VALUE && !vertex.getVisited())
               {
                   filterVertexes.add(vertex);
               }
           }
            for (Vertex vertexe : filterVertexes) {
                distances[vertexe.getData()] = 6+distances[currentVertex.getData()];
                queue.add(vertexe);
            }
        }
    }

    private static void printDistance(int[] distances, int start) {
        for(int i=1;i<distances.length;i++)
        {
            if(i==start)
            {
                continue;
            }
            System.out.print((distances[i]==Integer.MAX_VALUE? -1:distances[i])+" ");
        }
    }
    
    
}
