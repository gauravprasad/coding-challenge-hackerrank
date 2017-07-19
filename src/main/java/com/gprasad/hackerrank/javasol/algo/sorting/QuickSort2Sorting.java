/*
 
Quicksort 2 - Sorting (Hacker rank Java solution)


In the previous challenge, you wrote a partition method to split an array into two sub-arrays, one containing smaller elements and one containing larger elements than a given number. This means you 'sorted' half the array with respect to the other half. Can you repeatedly use partition to sort an entire array?

Guideline
In Insertion Sort, you simply went through each element in order and inserted it into a sorted sub-array. In this challenge, you cannot focus on one element at a time, but instead must deal with whole sub-arrays, with a strategy known as "divide and conquer".

When partition is called on an array, two parts of the array get 'sorted' with respect to each other. If partition is then called on each sub-array, the array will now be split into four parts. This process can be repeated until the sub-arrays are small. Notice that when partition is called on just one numbers, they end up being sorted.

Can you repeatedly call partition so that the entire array ends up sorted?

Print Sub-Arrays
In this challenge, print your array every time your partitioning method finishes, i.e. whenever two subarrays, along with the pivot, is merged together.

    The first element in a sub-array should be used as a pivot.
    Partition the left side before partitioning the right side.
    The pivot should be placed between sub-arrays while merging them.
    Array of length 11 or less will be considered sorted, and there is no need to sort or to print them.

Note
Please maintain the original order of the elements in the left and right partitions while partitioning around a pivot element.

For example: Partition about the first element for the array A[]={5, 8, 1, 3, 7, 9, 2} will be {1, 3, 2, 5, 8, 7, 9}

Input Format
There will be two lines of input:

    nn - the size of the array
    arar - the n numbers of the array

Output Format
Print every partitioned sub-array on a new line.

Constraints
1≤n≤10001≤n≤1000
−1000≤x≤1000,x∈ar−1000≤x≤1000,x∈ar
Each number is unique.

Sample Input

7
5 8 1 3 7 9 2

Sample Output

2 3
1 2 3
7 8 9
1 2 3 5 7 8 9

Explanation
This is a diagram of Quicksort operating on the sample array:

quick-sort diagram

Task
The method quickSort takes in a parameter, arar, an unsorted array. Use the Quicksort algorithm to sort the entire array.

 */
package com.gprasad.hackerrank.javasol.algo.sorting;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class QuickSort2Sorting {

    private static void quickSort(int[] ar, int start, int end) {
        if (start < end) {
            int pivotIndex = getPartition(ar, start, end);
            quickSort(ar, start, pivotIndex - 1);
            quickSort(ar, pivotIndex + 1, end);
            printBetweenArr(ar, start, end);
        }
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
      //  quickSort(ar, 0, n - 1);
        mergeSort(ar, 0, n-1);
        printArray(ar);
    }

    private static int getPartition(int[] ar, int start, int end) {
        int pivotIndex = start;
        int pivotElement = ar[end];
        for (int i = start; i < end; i++) {
            if (ar[i] <= pivotElement) {
                int temp = ar[i];
                ar[i] = ar[pivotIndex];
                ar[pivotIndex] = temp;
                pivotIndex++;
            }

        }
        ar[end] = ar[pivotIndex];
        ar[pivotIndex] = pivotElement;
        return pivotIndex;
    }

    private static void printBetweenArr(int[] arr, int lo, int hi) {
        for (int i = lo; i <= hi; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    private static void mergeSort(int[] arr, int lo, int hi) {
        if (lo < hi) {
            int mid = lo + (hi-lo) / 2;
            mergeSort(arr, lo, mid);
            mergeSort(arr, mid + 1, hi);
            merge(arr, lo, mid, hi);
        }
    }

    private static void merge(int[] arr, int lo, int mid, int hi) {
        int[] temArr = new int[hi - lo + 1];
        int i = lo;
        int j = mid+1;
        int k = 0;
        while (i <= mid || j <= hi) {
            if (i > mid) {
                temArr[k] = arr[j];
                k++;
                j++;
            }
            else if(j>hi)
            {
                temArr[k]=arr[i];
                k++;
                i++;
            }
            else if(arr[i]<=arr[j])
            {
                temArr[k]=arr[i];
                k++;
                i++;
            }
            else{
                temArr[k]=arr[j];
                k++;
                j++;
            }
        }
        for(int l=0;l<temArr.length;l++)
        {
            arr[lo+l]=temArr[l];
        }
        printArray(temArr);
    }
}
