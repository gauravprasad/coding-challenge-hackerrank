/*
 
String Reduction (Hackerrank Java solution)

Given a string consisting of letters, a, b and c, we can perform the following operation: Take any two adjacent distinct characters and replace them with the third character. For example, if 'a' and 'c' are adjacent, they can replaced by 'b'. Find the smallest string which we can obtain by applying this operation repeatedly?

Input:
The first line contains the number of test cases T. T test cases follow. Each test case contains the string you start with.

Output:
Output T lines, one for each test case, containing the smallest length of the resultant string after applying the operations optimally.

Constraints:
1 <= T <= 100
The string will have at most 100 characters.

Sample Input:
3
cab
bcab
ccccc

Sample Output:
2
1
5

Explanation:
For the first case, you can either get cab -> cc or cab -> bb, resulting in a string of length 2.
For the second case, one optimal solution is: bcab -> aab -> ac -> b. No more operations can be applied and the resultant string has length 1.
For the third case, no operations can be performed. So the answer is 5.

 */
package com.gprasad.hackerrank.javasol.algo.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author gq6pras
 */
public class StringReduction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        for (int t = 0; t < testCase; t++) {
            String givenStr = input.next();
            System.out.println(reduceStringLogically(givenStr));
        }
    }
    
    private static int reductionByLetterCount(String givenStr)
    {
        int reducedString = 0;
        int countA = 0;
        int countB = 0;
        int countC = 0;
        for (int i = 0; i < givenStr.length(); i++) {
            char c = givenStr.charAt(i);
            if (c == 'a') {
                countA++;
            }
            if (c == 'b') {
                countB++;
            }
            if (c == 'c') {
                countC++;
            }
        }
        if((countA==0 && countB==0) || (countB==0 && countC==0) || (countC==0 && countA==0))
        {
            
        }
       return reducedString; 
    }

    private static int reduceStringLogically(String givenStr) {
        int countA = 0;
        int countB = 0;
        int countC = 0;
        for (int i = 0; i < givenStr.length(); i++) {
            char c = givenStr.charAt(i);
            if (c == 'a') {
                countA++;
            }
            if (c == 'b') {
                countB++;
            }
            if (c == 'c') {
                countC++;
            }
        }
        boolean reduce = true;
        while (reduce) {
            if (countA == 0 && countB == 0) {
                reduce = false;
            } else if (countA == 0 && countC == 0) {
                reduce = false;
            } else if (countB == 0 && countC == 0) {
                reduce = false;
            }
            if (countA >= countB && countB >= countC) {
                countA--;
                countB--;
                countC++;
            } else if (countB >= countC && countC >= countA) {
                countA++;
                countB--;
                countC--;
            } else if (countC >= countA && countA >= countB) {
                countA--;
                countB++;
                countC--;
            } else if (countA >= countB && countC >= countB) {
                countA--;
                countB++;
                countC--;
            } else if (countB >= countC && countA >= countC) {
                countA--;
                countB--;
                countC++;
            } else if (countC >= countA && countB >= countA) {
                countA++;
                countB--;
                countC--;
            }
        }
        return countA + countB + countC + 1;
    }

    private static int getReducedString(String givenStr) {
        String revStr = new StringBuilder(givenStr).reverse().toString();
        Stack<Character> stackOfChar = new Stack<>();
        Stack<Character> stackOfCharRev = new Stack<>();
        for (int i = 0; i < givenStr.length(); i++) {
            char right = givenStr.charAt(i);
            while (!stackOfChar.empty() && stackOfChar.peek() != right) {
                char left = stackOfChar.pop();
                right = getTheThirdChar(left, right);
            }
            stackOfChar.push(right);
            char rightRev = revStr.charAt(i);
            while (!stackOfCharRev.empty() && stackOfCharRev.peek() != rightRev) {
                char left = stackOfCharRev.pop();
                rightRev = getTheThirdChar(left, rightRev);
            }
            stackOfCharRev.push(rightRev);
        }

        return Math.min(stackOfChar.size(), stackOfCharRev.size());
    }

    private static char getTheThirdChar(char left, char right) {
        Map<Integer, Character> alterCharMap = new HashMap<>();
        alterCharMap.put('a' + 'b', 'c');
        alterCharMap.put('a' + 'c', 'b');
        alterCharMap.put('b' + 'c', 'a');
        return alterCharMap.get(left + right);
    }
}
