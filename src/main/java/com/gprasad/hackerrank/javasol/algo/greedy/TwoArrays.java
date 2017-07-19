/*
 
Two arrays(Hackerrank Java solution)

You are given two integer arrays, A and B, each containing N integers. The size of the array is less than or equal to 1000. You are free to permute the order of the elements in the arrays.

Now here's the real question: Is there an permutation A', B' possible of A and B, such that, A'i+B'i ≥ K for all i, where A'i denotes the ith element in the array A' and B'i denotes ith element in the array B'.


Input Format
The first line contains an integer, T, the number of test-cases. T test cases follow. Each test case has the following format:

The first line contains two integers, N and K. The second line contains N space separated integers, denoting array A. The third line describes array B in a same format.

Output Format
For each test case, if such an arrangement exists, output "YES", otherwise "NO" (without quotes).


Constraints
1 <= T <= 10
1 <= N <= 1000
1 <= K <= 109
0 <= Ai, Bi ≤ 109


Sample Input

2
3 10
2 1 3
7 8 9
4 5
1 2 2 1
3 3 3 4


Sample Output

YES
NO

Explanation

The first input has 3 elements in Array A and Array B, we see that the one of the arrangements, 3 2 1 and 7 8 9 has each pair of elements (3+7, 2 + 8 and 9 + 1) summing upto 10 and hence the answer is "YES".

The second input has array B with three 3s. So, we need at least three numbers in A that are greater than 1. As this is not the case, the answer is "NO". 

 */
package com.gprasad.hackerrank.javasol.algo.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class TwoArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        for(int t=0;t<testCase;t++)
        {
            int n= input.nextInt();
            int k= input.nextInt();
            List<Integer> list1 = getListFromUser(n,input);
            List<Integer> list2 = getListFromUser(n,input);
            Collections.sort(list1);
            Collections.sort(list2,Collections.reverseOrder());
            System.out.println(ifSumOfCommonIndexAvailable(list1,list2,k,n)?"YES":"NO");
        }
    }

    private static List<Integer> getListFromUser(int n, Scanner input) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(input.nextInt());
        }
        return list;
    }

    private static boolean ifSumOfCommonIndexAvailable(List<Integer> list1, List<Integer> list2, int k, int n) {
        boolean isSumAvailable = true;
        for(int i=0;i<n;i++)
        {
            if((list1.get(i)+list2.get(i))<k)
            {
                isSumAvailable = false;
                break;
            }
        }
        return isSumAvailable;
    }
}
