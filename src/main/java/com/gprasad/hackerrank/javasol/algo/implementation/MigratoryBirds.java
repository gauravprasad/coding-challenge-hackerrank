package com.gprasad.hackerrank.javasol.algo.implementation;

/*

Migratory Birds (Hackerrank Java solution)


You have been asked to help study the population of birds migrating across the continent. Each type of bird you are interested in will be identified by an integer value. Each time a particular kind of bird is spotted, its id number will be added to your array of sightings. You would like to be able to find out which type of bird is most common given a list of sightings.If two or more types of birds are equally common, choose the type with the smallest ID number.

Function Description

Complete the migratoryBirds function described below to return the most common birds sighted.


migratoryBirds( integer: n, integer: ar_size, integer array: ar)
Parameters:
ar_size: number of elements (sightings) in array
ar: array of integer id's of birds sighted
Returns: integer id of most common bird sightings

Constraints

5 <= n <= 2*10^5
It is guaranteed that each type is 1, 2, 3, 4, or 5.

Raw Input Format

The first line contains an integer denoting n, the number of birds sighted and reported in the array ar.
The second line describes ar as n space-separated integers representing the type numbers of each bird sighted.

Sample Input 0

6
1 4 4 4 5 3
Sample Output 0

4
Explanation 0

The different types of birds occur in the following frequencies:

Type 1: 1 bird
Type 2: 0 birds
Type 3: 1 bird
Type 4: 3 birds
Type 5: 1 bird
The type number that occurs at the highest frequency is type 4, so we print 4 as our answer.
 */

import java.util.Scanner;

public class MigratoryBirds {

    static int migratoryBirds(int n, int[] ar) {
        int highest = 0;
        int result = 0;
        int[] count = new int[6];
        for(int i = 0;i<n;i++)
        {
            count[ar[i]]++;
        }
        for(int i = 1; i<count.length;i++)
        {
            if(count[i]>highest)
            {
                highest=count[i];
                result = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
