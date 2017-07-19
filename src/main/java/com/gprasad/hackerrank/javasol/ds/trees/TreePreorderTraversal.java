/*

Tree: Preorder Traversal (Hackerrank Java solution)

 You are given a pointer to the root of a binary tree; print the values in preorder traversal.

You only have to complete the function.

Input Format
You are given a function,

void Preorder(node *root) {

}

Output Format
Print the values on a single line separated by space.

Sample Input

     3
   /   \
  5     2
 / \    /
1   4  6

Sample Output

3 5 1 4 2 6

 */
package com.gprasad.hackerrank.javasol.ds.trees;

/**
 *
 * @author gq6pras
 */
public class TreePreorderTraversal {

    public static void main(String[] args) {

    }

    private static void Preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            Preorder(root.left);
            Preorder(root.right);
        }
    }
}