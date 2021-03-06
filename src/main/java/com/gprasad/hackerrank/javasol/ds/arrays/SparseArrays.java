/*
 
Sparse Arrays (hackerrank java solution)



There are NN strings. Each string's length is no more than 2020 characters. There are also QQ queries. For each query, you are given a string, and you need to find out how many times this string occurred previously.

Input Format

The first line contains NN, the number of strings.
The next NN lines each contain a string.
The N+2N+2nd line contains QQ, the number of queries.
The following QQ lines each contain a query string.

Constraints

1≤N≤10001≤N≤1000
1≤Q≤10001≤Q≤1000
1≤1≤ lengthlength ofof anyany string≤20string≤20

Sample Input

4
aba
baba
aba
xzxb
3
aba
xzxb
ab

Sample Output

2
1
0

Explanation

Here, "aba" occurs twice, in the first and third string. The string "xzxb" occurs once in the fourth string, and "ab" does not occur at all.


 */
package com.gprasad.hackerrank.javasol.ds.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author GAURAV PRASAD
 */
public class SparseArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Map<String,Integer> strIntMap = new HashMap<>();
        for(int i = 0;i<N;i++)
        {
            String str = input.next();
            if(strIntMap.containsKey(str))
            {
                strIntMap.put(str,strIntMap.get(str)+1);
            }
            else
            {
                strIntMap.put(str,1);
            }
        }
        int Q = input.nextInt();
        for(int i=0;i<Q;i++)
        {
            String qString = input.next();
            //System.out.println(strIntMap.get(qString)!=null?strIntMap.get(qString):0);
        }
    }
}
