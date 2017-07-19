package com.gprasad.hackerrank.funcprogram.recursion

/**
 * @author gq6pras
 */
object ComputingTheGCD {
  def main(args:Array[String])
  {
    var Array(num1,num2) = io.StdIn.readLine().trim().split(" +").map(_.toInt)
    var small=math.min(num1, num2)
    var big=math.max(num1, num2)
    println(if(small==big) small else gcd(num1,num2))    
  }
  
  def gcd(small:Int,big:Int):Int={
     
   if(small==0) big else gcd(big%small ,small)
  }
}