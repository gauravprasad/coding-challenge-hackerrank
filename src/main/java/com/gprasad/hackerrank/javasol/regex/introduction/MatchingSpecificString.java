/*

Matching Specific String (Hackerrank Java Solution)

Regular expression (or RegEx)

A regular expression is a sequence of characters that define a search pattern. It is mainly used for string pattern matching.

[ach01_.png]

Regular expressions are extremely useful in extracting information from text such as: code, log files, spreadsheets, documents, etc.

We can match a specific string in a test string by making our regex pattern . This is one of the simplest patterns. However, in the coming challenges, we'll see how well we can match more complex patterns and learn about their syntax.

Task

You have a test string . Your task is to match the string hackerrank. This is case sensitive.

Note

This is a regex only challenge. You are not required to write code.
You only have to fill in the regex pattern in the blank (_________). 

 */
package com.gprasad.hackerrank.javasol.regex.introduction;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author gq6pras
 */
public class MatchingSpecificString {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("hackerrank");

    }
}

class Regex_Test {

    public void checker(String Regex_Pattern) {

        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        int Count = 0;
        while (m.find()) {
            Count += 1;
        }
        System.out.format("Number of matches : %d", Count);
    }

}
