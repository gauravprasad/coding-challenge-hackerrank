package com.gprasad.hackerrank.scalasol.algo.warmup

/**
 * @author gq6pras
 */
object Staircase {
  def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        (1 to n).foreach{i=>println(stair(i,n-i))}
    }
    def stair(i:Int,n:Int)=" "*(n)+"#"*i
}