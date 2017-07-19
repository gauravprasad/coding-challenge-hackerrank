/*
 Tries: Contacts (HackerRank Java Solution)



Check out the resources on the page's right side to learn more about tries. The video tutorial is by Gayle Laakmann McDowell, author of the best-selling interview book Cracking the Coding Interview.

We're going to make our own Contacts application! The application must perform two types of operations:

    add name, where is a string denoting a contact name. This must store as a new contact in the application.
    find partial, where is a string denoting a partial name to search the application for. It must count the number of contacts starting with and print the count on a new line.

Given sequential add and find operations, perform each operation in order.

Input Format

The first line contains a single integer, , denoting the number of operations to perform.
Each line of the subsequent lines contains an operation in one of the two forms defined above.

Constraints

    It is guaranteed that and contain lowercase English letters only.
    The input doesn't have any duplicate for the operation.

Output Format

For each find partial operation, print the number of contact names starting with on a new line.

Sample Input

4
add hack
add hackerrank
find hac
find hak

Sample Output

2
0

Explanation

We perform the following sequence of operations:

    Add a contact named hack.
    Add a contact named hackerrank.
    Find and print the number of contact names beginning with hac. There are currently two contact names in the application and both of them start with hac, so we print on a new line.
    Find and print the number of contact names beginning with hak. There are currently two contact names in the application but neither of them start with hak, so we print on a new line.



 */
package com.gprasad.hackerrank.javasol.tutorial.crackingcodinginterview.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 *
 * @author gprasad
 */
public class TriesContacts {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Character,List<String>> contacts = new HashMap<>();
        while (n-- > n) {
            String op = in.next();
            String contact = in.next();
            if(op.equalsIgnoreCase("add"))
            {
                if(contacts.containsKey(contact.charAt(0)))
                {
                    contacts.get(contact.charAt(0)).add(contact);
                }
                else
                {
                    List<String> names = new ArrayList<>();
                    names.add(contact);
                    contacts.put(contact.charAt(0), names);
                }
            }
            if(op.equalsIgnoreCase("find"))
            {
                Predicate<String> predicate = s->s.startsWith(contact);
                if(contacts.containsKey(contact.charAt(0)))
                {
                System.out.println(contacts.get(contact.charAt(0)).stream().filter(predicate).count());
                }
                else
                {
                    System.out.println(0);
                }
            }

        }
    }
}
