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
public class TreeInorderTraversal {

    public static void main(String[] args) {

    }

    private static void Inorder(Node root) {
        if (root != null) {
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
    }
}
