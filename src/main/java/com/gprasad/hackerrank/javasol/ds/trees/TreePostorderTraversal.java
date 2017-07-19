/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.ds.trees;

/**
 *
 * @author gq6pras
 */
public class TreePostorderTraversal {

    public static void main(String[] args) {

    }

    private static void Postorder(Node root) {
        if (root != null) {
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
}
