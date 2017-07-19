package com.gprasad.hackerrank.scalasol.algo.warmup

/**
 * @author gq6pras
 */
object DiagonalDifference {
  def main(args: Array[String]) {
    val n = io.StdIn.readInt()
    val arr = Array.ofDim[Int](n, n)
    for (i <- 0 to n - 1) {
      for (j <- 0 to n - 1) {
        arr(i)(j) = io.StdIn.readInt()
      }
    }
    println(diagDiff(arr))
  }
  def diagDiff(arr: Array[Array[Int]]): Int =
    {
      var diag1 = 0
      var diag2 = 0
      for (i <- 0 to arr.size - 1) {
        println(arr(i)(i))
        println(arr(i)(arr.size - 1))
        diag1 = diag1 + arr(i)(i)
        diag2 = diag2 + arr(i)(arr.size - (i+1))
      }
      Math.abs(diag1 - diag2)
    }
}