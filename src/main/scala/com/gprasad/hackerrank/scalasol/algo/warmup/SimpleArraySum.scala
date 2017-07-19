package com.gprasad.hackerrank.scalasol.algo.warmup

/**
  * @author gq6pras
  */
object SimpleArraySum {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var arr = new Array[Int](n);
    for (arr_i <- 0 to n - 1) {
      arr(arr_i) = sc.nextInt();
    }
    var i = 0
    var sum = 0
    while (i < n) {
      sum += arr(i)
      i += 1
    }
    println(sum)
  }
}
