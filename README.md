# [Hacker Rank](https://www.hackerrank.com/)

## Tutorials

### 30 Days of Code
        
#### [Day 6: Let's Review](https://www.hackerrank.com/challenges/30-review-loop/problem)
##### [*Solution*](https://github.com/gauravprasad/coding-challenge-hackerrank/blob/master/src/main/java/com/gprasad/hackerrank/javasol/tutorial/thirtydaysofcode/Day6LetsReview.java)
       Explanation: This is a simple problem. It asks to create 2 string one containing all the character at the even position and the other containing all the character at the odd position. 
      Just iterate through the string till the last character and keep finding the index mod 2 for each position. if the mod is 0 add the character at the position to the even string and if the mod is 1 add the character to the odd string. 
      Here index is the position of each character in the string. I have used substrings to to create the string in java code. There should be a similar way in all the other programming language.
     
#### [Day 10: Binary Numbers](https://www.hackerrank.com/challenges/30-binary-numbers/problem)
##### [*Solution*](https://github.com/gauravprasad/coding-challenge-hackerrank/blob/master/src/main/java/com/gprasad/hackerrank/javasol/tutorial/thirtydaysofcode/Day10BinaryNumbers.java)
        Explanation: Take two integer variable. One storing the max and the second one storing the count of consecutive 1's. Now the input in the problem is a decimal number (number with base 10). 
      Here we need to think first how to convert the decimal to binary. and then count 1's. But doing this in two step will increase the execution time. So we have to do it in one step. If we go back to the school days we can get the answer.
      Execute a while loop till the number is greater then zero. Inside the loop number mod 2 result is the last digit of the binary. Then re assign the number value dividing the number by 2 (n=n/2). Now in the for loop the number value is changed so aging repeat the same step get the mod but this time time the result of mode is the second last digit of binary.
      As i mentioned the while loop should be running till the number is greater then 0 and the every time diving the number keep decreasing its value. This logic fetch the binary equivalent to decimal. But the core problem is still there.find the consecutive one.
      That should be easy now . Till the time mode consecutively returns 1 keep increasing the value of count variable by one. as soon as you get zero compare the count with the  max and if count is greater then max. Copy the count to max and initialize the max to zero again.
      even if the count is not greater then max just don copy the count to max but initialize it to zero. One thing to note. There will be situation where loop will terminate and the count is not compared with max. so every time before returning the result compare count and the max. 
    
#### [Day 11: 2D Arrays](https://www.hackerrank.com/challenges/30-2d-arrays/problem)
##### [*Solution*](https://github.com/gauravprasad/coding-challenge-hackerrank/blob/master/src/main/java/com/gprasad/hackerrank/javasol/tutorial/thirtydaysofcode/Day112DArrays.java)

#### [Day 18: Queues and Stacks](https://www.hackerrank.com/challenges/30-queues-stacks/problem)
##### [*Solution*](https://github.com/gauravprasad/coding-challenge-hackerrank/blob/master/src/main/java/com/gprasad/hackerrank/javasol/tutorial/thirtydaysofcode/Day18QueuesandStacks.java) 

#### [Day 20: Sorting](https://www.hackerrank.com/challenges/30-sorting/problem)
##### [*Solution*](https://github.com/gauravprasad/coding-challenge-hackerrank/blob/master/src/main/java/com/gprasad/hackerrank/javasol/tutorial/thirtydaysofcode/Day18QueuesandStacks.java)

#### [Day 22: Binary Search Trees](https://www.hackerrank.com/challenges/30-binary-search-trees/problem)
##### [*Solution*](https://github.com/gauravprasad/coding-challenge-hackerrank/blob/master/src/main/java/com/gprasad/hackerrank/javasol/tutorial/thirtydaysofcode/Day22BinarySearchTrees.java)

#### [Day 23: BST Level-Order Traversal](https://www.hackerrank.com/challenges/30-binary-trees/problem)
##### [*Solution*](https://github.com/gauravprasad/coding-challenge-hackerrank/blob/master/src/main/java/com/gprasad/hackerrank/javasol/tutorial/thirtydaysofcode/Day23BSTLevelOrderTraversal.java)

#### [Day 24: More Linked Lists](https://www.hackerrank.com/challenges/30-linked-list-deletion/problem)
##### [*Solution*](https://github.com/gauravprasad/coding-challenge-hackerrank/blob/master/src/main/java/com/gprasad/hackerrank/javasol/tutorial/thirtydaysofcode/Day24MoreLinkedLists.java)

#### [Day 25: Running Time and Complexity](https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem)
##### [*Solution*](https://github.com/gauravprasad/coding-challenge-hackerrank/blob/master/src/main/java/com/gprasad/hackerrank/javasol/tutorial/thirtydaysofcode/Day25RunningTimeAndComplexity.java)

#### [Day 26: Nested Logic](https://www.hackerrank.com/challenges/30-nested-logic/problem)
##### [*Solution*](https://github.com/gauravprasad/coding-challenge-hackerrank/blob/master/src/main/java/com/gprasad/hackerrank/javasol/tutorial/thirtydaysofcode/Day26NestedLogic.java)

#### [Day 28: RegEx, Patterns, and Intro to Databases](https://www.hackerrank.com/challenges/30-regex-patterns/problem)
##### [*Solution*](https://github.com/gauravprasad/coding-challenge-hackerrank/blob/master/src/main/java/com/gprasad/hackerrank/javasol/tutorial/thirtydaysofcode/Day28RegExPatternsAndIntroToDatabases.java)

#### [Day 29: Bitwise AND](https://www.hackerrank.com/challenges/30-bitwise-and/problem)
##### [*Solution*](https://github.com/gauravprasad/coding-challenge-hackerrank/blob/master/src/main/java/com/gprasad/hackerrank/javasol/tutorial/thirtydaysofcode/Day29BitwiseAND.java)


## Algorithms

### [Warmup](https://www.hackerrank.com/domains/algorithms/warmup)

#### [Simple Array Sum](https://www.hackerrank.com/challenges/simple-array-sum)
##### [*Java Solution*](https://github.com/gauravprasad/coding-challenge-hackerrank/blob/master/src/main/java/com/gprasad/hackerrank/javasol/algo/warmup/SimpleArraySum.java)
##### [*Scala Solution*](https://github.com/gauravprasad/coding-challenge-hackerrank/blob/master/src/main/scala/com/gprasad/hackerrank/scalasol/algo/warmup/SimpleArraySum.scala)
##### [*Python Solution*](https://github.com/gauravprasad/coding-challenge-hackerrank/blob/master/src/main/python/com/gprasad/hackerrank/py/algo/warmup/SimpleArraySum.py)
       EXPLANATION :
       Sum all the elments of the Array.

### [Implementation](https://www.hackerrank.com/domains/algorithms/implementation)
### [Strings](https://www.hackerrank.com/domains/algorithms/strings)
### [Sorting](https://www.hackerrank.com/domains/algorithms/arrays-and-sorting)
### [Search](https://www.hackerrank.com/domains/algorithms/search)
### [Graph Theory](https://www.hackerrank.com/domains/algorithms/graph-theory)
### [Greedy](https://www.hackerrank.com/domains/algorithms/greedy)
### [Dynamic Programming](https://www.hackerrank.com/domains/algorithms/dynamic-programming)
### [Constructive Algorithms](https://www.hackerrank.com/domains/algorithms/constructive-algorithms)
### [Bit Manipulation](https://www.hackerrank.com/domains/algorithms/bit-manipulation)
### [Recursion](https://www.hackerrank.com/domains/algorithms/recursion)
### [Game Theory](https://www.hackerrank.com/domains/algorithms/game-theory)
### [NP Complete](https://www.hackerrank.com/domains/algorithms/np-complete-problems)
