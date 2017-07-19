/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.tutorial.thirtydaysofcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class Day23BSTLevelOrderTraversal {
    public static NodeBT insert(NodeBT root,int data){
        if(root==null){
            return new NodeBT(data);
        }
        else{
            NodeBT cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            NodeBT root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	

    private static void levelOrder(NodeBT root) {
        Queue<NodeBT> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            NodeBT curr = q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }
}
