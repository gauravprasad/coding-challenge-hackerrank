/*
 
Cavity Map(hackerrank java solution)

You are given a square map of size n×nn×n. Each cell of the map has a value denoting its depth. We will call a cell of the map a cavity if and only if this cell is not on the border of the map and each cell adjacent to it has strictly smaller depth. Two cells are adjacent if they have a common side (edge).

You need to find all the cavities on the map and depict them with the uppercase character X.

Input Format

The first line contains an integer, nn, denoting the size of the map. Each of the following nn lines contains nn positive digits without spaces. Each digit (1-9) denotes the depth of the appropriate area.

Constraints
1≤n≤1001≤n≤100

Output Format

Output nn lines, denoting the resulting map. Each cavity should be replaced with character X.

Sample Input

4
1112
1912
1892
1234

Sample Output

1112
1X12
18X2
1234

Explanation

The two cells with the depth of 9 fulfill all the conditions of the Cavity definition and have been replaced by X. 

 */
package com.gprasad.hackerrank.javasol.algo.implementation;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class CavityMap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = input.next();
        }
        strArr = getCavityMarked(strArr);
        for (String str : strArr) {
            System.out.println(str);
        }
    }

    private static String[] getCavityMarked(String[] strArr) {
        for (int i = 1; i < strArr.length - 1; i++) {
            for (int j = 1; j < strArr[i].length() - 1; j++) {
                if (strArr[i].charAt(j)>strArr[i-1].charAt(j)&& strArr[i].charAt(j)>strArr[i+1].charAt(j) && strArr[i].charAt(j)>strArr[i].charAt(j-1) && strArr[i].charAt(j)>strArr[i].charAt(j+1)) {
                    StringBuilder sb = new StringBuilder(strArr[i]);
                    sb.setCharAt(j,'X');
                    strArr[i]=sb.toString();
                }
            }
        }
        return strArr;
    }
}
