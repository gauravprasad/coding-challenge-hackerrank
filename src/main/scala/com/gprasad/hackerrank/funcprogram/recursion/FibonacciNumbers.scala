package com.gprasad.hackerrank.funcprogram.recursion

/**
 * @author gq6pras
 */
object FibonacciNumbers {
  def main(args:Array[String])
  {
    println(fibonacci(io.StdIn.readInt()))
  }
  def fibonacci(n:Int):Int={
     if (n==0) 0 else if(n==1) 1 else calFibonacciNum(0,1,n-2)
  }
  
  def calFibonacciNum(prev:Int,current:Int,count:Int):Int={
    if(count<1) current else calFibonacciNum(current, prev+current, count-1)
  }
}