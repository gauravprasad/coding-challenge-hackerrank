/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.tutorial.crackingcodinginterview.ds;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class HeapsFindRunningMedian {
    private static Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    private static Queue<Integer> minHeap = new PriorityQueue<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int a_i = 0; a_i < n; a_i++) {
            addNum(in.nextInt());
            System.out.println(getMedian());
        }
    }

    private static float getMedian() {
        if (maxHeap.size()==minHeap.size()) {
            return ((float)maxHeap.peek()+(float)minHeap.peek())/2;
        }
        return (float)maxHeap.peek();
    }
    
    private static void addNum(int num)
    {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
        if(maxHeap.size()<minHeap.size())
        {
            maxHeap.offer(minHeap.poll());
        }
    }
}
