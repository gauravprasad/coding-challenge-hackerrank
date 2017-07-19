package com.gprasad.hackerrank.scalasol.algo.Implementation

/**
 * @author gq6pras
 */
object FindDigit {
  def main(args:Array[String])
  {
    val t = io.StdIn.readInt()
    for(_<-1 to t)
    {
      var num = io.StdIn.readLine()
      var mumericVal = num.toLong
      println(num.map(_.asDigit).filter(x=>x!=0 && mumericVal % x==0).size)
    }
  }
}