package com.gprasad.hackerrank.funcprogram.recursion

/**
  * @author gq6pras
  */
object ComputingTheGCD {
  def gcd(x: Int, y: Int): Int = x.compare(y) match {
    case -1 => gcd(x, y - x)
    case 1 => gcd(y, x - y)
    case 0 => x

  }


  /** This part handles the input/output. Do not change or modify it **/
  def acceptInputAndComputeGCD(pair: List[Int]) = {
    println(gcd(pair.head, pair.reverse.head))
  }

  def main(args: Array[String]) {
    /** The part relates to the input/output. Do not change or modify it **/
    acceptInputAndComputeGCD(readLine().trim().split(" ").map(x => x.toInt).toList)

  }
}