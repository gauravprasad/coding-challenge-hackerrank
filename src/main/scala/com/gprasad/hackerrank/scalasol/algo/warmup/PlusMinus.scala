package com.gprasad.hackerrank.scalasol.algo.warmup

/**
 * @author gq6pras
 */
object PlusMinus {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var arr = new Array[Int](n);
    for (arr_i <- 0 to n - 1) {
      arr(arr_i) = sc.nextInt();
    }
    getFraction(arr)
  }
  def getFraction(arr: Array[Int]) {
   
    println(arr.filter(x=>x>0).size.toDouble/arr.size.toDouble)
    println(arr.filter(x=>x<0).size.toDouble / arr.size.toDouble)
    println(arr.filter(x=>x==0).size.toDouble / arr.size.toDouble)
  }
}