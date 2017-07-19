/*
 

Problem Statement

Given a time in AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock and 12:00:00 on a 24-hour clock.

Input Format

A time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM), where 01≤hh≤12.

Output Format

Convert and print the given time in 24-hour format, where 00≤hh≤23.

Sample Input

07:05:45PM

Sample Output

19:05:45

Explanation

7 PM is after noon, so you need to add 12 hours to it during conversion. 12 + 7 = 19. Minutes and seconds do not change in 12-24 hour time conversions, so the answer is 19:05:45.

 */
package com.gprasad.hackerrank.javasol.algo.warmup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class TimeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println(convertTo24Hr(input.next()));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
    public static String convertTo24Hr(String dateStr) throws ParseException
    {
       SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
       SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
       Date date = parseFormat.parse(dateStr);
       dateStr = displayFormat.format(date);
       return dateStr;
    }
}
