/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.tutorial.thirtydaysofcode;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class Day22BinarySearchTrees {

    public static NodeBT insert(NodeBT root, int data) {
        if (root == null) {
            return new NodeBT(data);
        } else {
            NodeBT cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        NodeBT root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }

    private static int getHeight(NodeBT root) {
        if (root == null) {
            return -1;
        } else {
            return (Math.max(getHeight(root.left), getHeight(root.right)) + 1);
        }
    }
}
