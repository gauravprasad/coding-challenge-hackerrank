package com.gprasad.hackerrank.scalasol.contests

/*
Sell Statistics Query System (HackerRank Scala Solution)

Julia is actively buying and selling products on OLX. Now, after being an active user of OLX for more than six years, she decided to build a system to store information about sold products. The system should also be able to query the total number of products sold based on some criteria.

    The information of a sell is given in the following format:
   _
                      S d p_id[.c_id] s_id[.r_id]

    Here:
        --> d describes the day of the sell. The value of day is in the range 1 to 100 inclusive.
        --> p_id and c_id describe the product_id and category_id respectively. The value of product_id is in the range 1 to 10 inclusive, and the value of category_id is in the range 1 to 4 inclusive. The category_id is optional so it could be missing.
        --> s_id and r_id describe the state_id and region_id of the person who purchased the product respectively. The value of state_id is in the range 1 to 7 inclusive, and the value of region_id is in the range 1 to 25 inclusive. The region_id is optional so it could be missing.


    The query for the total number of products sold is given in the following format:


                      Q d_start[.d_end] p_id[.c_id] s_id[.r_id]

    Here:
        --> d_start and d_end describe the day range for the query. The value of d_start and d_end is in the range 1 to 100 inclusive. The value of d_end is optional so it could be missing.
        --> p_id and c_id describe the product_id and category_id respectively. The value of product_id is in the range 1 to 10 inclusive, and the value of category_id is in the range 1 to 4 inclusive. The category_id is optional so it could be missing. The value of product_id could also be -1 which means all the products, also in this case no category_id is provided.
        --> s_id and r_id describe the state_id and region_id respectively. The value of state_id is in the range 1 to 7 inclusive, and the value of region_id is in the range 1 to 25 inclusive. The region_id is optional so it could be missing. The value of state_id could also be -1 which means all the states, also in this case no region_id is provided.

The response for the query should be the total number of products sold between the days d_start and d_end and satisfying the constraints over product_id, category_id, state_id, and region_id given by p_id, c_id, s_id, and r_id respectively. If the value of d_end is missing then the response should be the total number of products sold on d_start only. Note that, to answer any query, the sell information provided before the query are considered only.

Input Format

The first line contains an integer T. Each of the next T lines describes either the sell information or products count query.

Constraints
    # 1 <= T <=10^5
    # 1 <= d <= 100
    # 1 <=d_start <= d_end <= 100
    # p_id = -1 or 1 <= p_id <= 10
    # 1 <= c_id <= 4
    # s_id = -1 or 1 <= s_id <= 7
    # 1 <= r_id <= 25

Output Format

For each of the products count queries, output the total number of products on a new line.

Sample Input 0

15
Q 1 1.2 2.5
S 1 1.3 2.5
S 1 1.2 2.6
Q 1 1.2 2.6
Q 1 1.2 2
S 2 2 3.5
Q 2 2.3 3.5
S 1 1.2 3.4
Q 1 1 -1
S 3 2.3 6.7
S 3 2.4 6.8
S 2 2 7.8
Q 3 2 6.7
Q 3 2 6
Q 1.3 2 -1

Sample Output 0

0
1
1
0
3
1
2
4

Explanation 0

  * Q 1 1.2 2.5
    The query is to find the products count sold on day 1, product_id =1 , category_id = 2 , state_id = 2, and region_id = 5 . We do not have enough sell information, to answer this query.

  * Q 1 1.2 2.6
    The query is to find the products count sold on day 1 , product_id = 1, category_id = 2 , state_id = 2, and region_id = 6. There is one such product: .

  * Q 1 1.2 2
    The query is to find the products count sold on day 1 , product_id = 1 , category_id = 2, state_id = 2 , and region_id could have any value. There is one such product: .

  * Q 2 2.3 3.5
    The query is to find the products count sold on day 2, product_id = 2, category_id = 3, state_id = 3, and region_id = 5. There are no such products.

  * Q 1 1 -1
    The query is to find the products count sold on day 1, product_id = 1 , category_id could have any value, state_id = -1 i.e., all the states are considered valid. There are three such products: (S 1 1.3 2.5), (S 1 1.2 2.6), and (S 1 1.2 3.4).

  * Q 3 2 6.7
    The query is to find the products count sold on day 3, product_id = 2, category_id could have any value, state_id = 6, and region_id = 7. There is one such product: (S 3 2.3 6.7).

  * Q 3 2 6
    The query is to find the products count sold on day 3, product_id = 2, category_id could have any value, state_id = 6, and region_id could have any value. There are two such products: (S 3 2.3 6.7)and (S 3 2.4 6.8).

  * Q 1.3 2 -1
    The query is to find the products count sold on days [1-3] inclusive, product_id = 2, category_id could have any value, state_id = -1 i.e., all the states are considered valid. There are four such products: (S 2 2 3.5), (S 3 2.3 6.7), (S 3 2.4 6.8), and (S 2 2 7.8).

Sample Input 1

11
S 1 1 2
S 2 1.1 2
S 2 2.3 1
S 1 2.2 1
Q 1 1 2
Q 1 2 1
Q 2 1 2
Q 2 2 1
Q 1.2 1 -1
Q 1.2 -1 2
Q 1.2 -1 -1

Sample Output 1

1
1
1
1
2
2
4


 */

object SellStatisticsQuerySystem {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
  }

}
