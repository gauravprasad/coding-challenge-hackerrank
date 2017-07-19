/*

The Maximum Subarray (Hackerrank Java Soulution)


 Given an array A={a1,a2,…,aN}A={a1,a2,…,aN} of NN elements, find the maximum possible sum of a

    Contiguous subarray
    Non-contiguous (not necessarily contiguous) subarray.

Empty subarrays/subsequences should not be considered.

Input Format

First line of the input has an integer TT. TT cases follow.
Each test case begins with an integer NN. In the next line, NN integers follow representing the elements of array AA.

Constraints:

    1≤T≤101≤T≤10
    1≤N≤1051≤N≤105
    −104≤ai≤104−104≤ai≤104

The subarray and subsequences you consider should have at least one element.

Output Format

Two, space separated, integers denoting the maximum contiguous and non-contiguous subarray. At least one integer should be selected and put into the subarrays (this may be required in cases where all elements are negative).

Sample Input

2 
4 
1 2 3 4
6
2 -1 2 3 4 -5

Sample Output

10 10
10 11

Explanation

In the first case:
The max sum for both contiguous and non-contiguous elements is the sum of ALL the elements (as they are all positive).

In the second case:
[2 -1 2 3 4] --> This forms the contiguous sub-array with the maximum sum.
For the max sum of a not-necessarily-contiguous group of elements, simply add all the positive elements. 
 */
package com.gprasad.hackerrank.javasol.algo.dynamicprogramming;

import java.util.Scanner;

/**
 *
 * @author Gaurav Prasad
 */
public class TheMaximumSubarray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        for (int T = 0; T < testCase; T++) {
            int arrSize = input.nextInt();
            int[] arr = new int[arrSize];
            for(int i=0;i<arrSize;i++ )
            {
                
            }
            //System.out.println(maxSubArrSumContiguous(arr));
            //System.out.println(maxSubArrSumNonContiguous(arr));
            System.out.println(maxSubArrSumContiguousBF(arr));
           // System.out.println(maxSubArrSumNonContiguousBF(arr));
        }
    }

    private static int maxSubArrSumContiguous(int[] arr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int maxSubArrSumNonContiguous(int[] arr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int maxSubArrSumContiguousBF(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++)
        {
           for(int j=0;j<=i;j++)
           {
               
           }
        }
        return maxSum;
    }

    private static int maxSubArrSumNonContiguousBF(int[] arr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
