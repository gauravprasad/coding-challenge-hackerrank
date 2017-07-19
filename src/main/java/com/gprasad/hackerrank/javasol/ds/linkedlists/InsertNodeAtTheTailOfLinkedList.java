/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.ds.linkedlists;

/**
 *
 * @author gq6pras
 */
public class InsertNodeAtTheTailOfLinkedList {

    public static void main(String[] args) {
        Node head = null;
        for (int i = 0; i < 10; i++) {
            head = insert(head,i);
            System.out.println(head);
        }

    }

    private static Node insert(Node head, int data) {
        Node node = head;
        if (head != null) {
            System.out.println(head.getData());
            return insert(head.getNext(), data);
        } else {
            head = new Node();
            head.setData(data);
        }
        return node;
    }
}
