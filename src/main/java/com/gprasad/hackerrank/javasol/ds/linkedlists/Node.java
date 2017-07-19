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
public class Node {
    Integer data;
    Node next;

    public Node(Integer data) {
        this.data = data;
    }

    public Node() {
    }
    

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + '}';
    }
    
}
