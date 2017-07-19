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
public class PrintElementsOfLinkedList {

    public static void main(String[] args) {
        
    }

    private static void print(Node head) {

        if (head != null) {
            System.out.println(head.getData());
            print(head.getNext());
        }
    }
}
