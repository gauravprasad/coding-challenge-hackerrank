package com.gprasad.hackerrank.javasol.interviewprepkit.warmup;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RepeatedString {
  // Complete the repeatedString function below.
  static long repeatedString(String s, long n) {
      Integer intLength = s.length();
      Long rep = n/Long.valueOf(intLength);
      Long bal = n%Long.valueOf(intLength);
      return (getACount(s)*rep)+ getACount(s.substring(0,bal.intValue()));
  }

  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    long n = input.nextLong();
    System.out.println(repeatedString(s, n));
    input.close();
  }

  private static Long getACount(String s){
      Map<Character, Integer> freq = s.chars().boxed().collect(Collectors.toMap(
              k->Character.valueOf((char) k.intValue()),
              v -> 1,
              Integer::sum
      ));
      return freq.containsKey('a')?Long.valueOf(freq.get('a')):0l;
  }
}
