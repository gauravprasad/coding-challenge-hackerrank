/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.tutorial.thirtydaysofcode;

/**
 *
 * @author gq6pras
 */
public class NodeBT {

    NodeBT left;
    NodeBT right;
    int data;

    NodeBT(int data) {
        this.data = data;
        left = right = null;
    }
}
