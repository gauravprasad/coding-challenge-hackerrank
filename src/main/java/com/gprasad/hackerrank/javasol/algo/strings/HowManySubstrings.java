package com.gprasad.hackerrank.javasol.algo.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class HowManySubstrings {

    public static Integer[] countSubstrings(String s, int[][] queries) {
       Integer[] counts = Arrays.stream(queries).map(arr -> {
           return countSubStr(s.substring(arr[0],arr[1]+1));
       }).toArray(Integer[]::new);
       return counts;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int q = input.nextInt();
        String s = input.next();
        int[][] queries = new int[q][2];
        IntStream.range(0,q).forEach(r -> {
            queries[r][0] = input.nextInt();
            queries[r][1] = input.nextInt();
        });
        Integer[] result = countSubstrings(s, queries);
        Arrays.stream(result).forEach(res -> System.out.println(res));
    }

    public static int countSubStr(String str){
        Set<String> subs = new HashSet<>();
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                subs.add(str.substring(i,j));
            }
        }
        return subs.size();
    }


}
