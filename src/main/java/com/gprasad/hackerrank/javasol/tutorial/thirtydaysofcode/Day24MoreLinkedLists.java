/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.tutorial.thirtydaysofcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class Day24MoreLinkedLists {

    public static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null) {
            head = p;
        } else if (head.next == null) {
            head.next = p;
        } else {
            Node start = head;
            while (start.next != null) {
                start = start.next;
            }
            start.next = p;

        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }

    private static Node removeDuplicates(Node head) {
        List<Integer> checkList = new ArrayList<>();
        if (head != null) {
            Node prevNode = head;
            Node currNode = head.next;
            checkList.add(prevNode.data);
            while (currNode != null) {
                if(checkList.contains(currNode.data))
                {
                   prevNode.next =  currNode.next;
                   currNode = currNode.next;
                }
                else
                {
                    checkList.add(currNode.data);
                    prevNode = currNode;
                    currNode = currNode.next;
                }
            }

        }
        return head;

    }
}
