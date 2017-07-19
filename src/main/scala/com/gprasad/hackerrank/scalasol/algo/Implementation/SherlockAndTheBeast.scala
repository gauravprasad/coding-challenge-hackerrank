package com.gprasad.hackerrank.scalasol.algo.Implementation

/**
 * @author gq6pras
 */
object SherlockAndTheBeast {
  def main(args:Array[String])
  {
    val t = io.StdIn.readInt()
    for(_<-1 to t)
    {
      println(decentNumber(io.StdIn.readInt()))
      
    }
  }
  def decentNumber(num:Int):String=
  {
    var count3=0
    var count5=0
    while(count3<=num)
    {
      count5 = num-count3
      if(count5%3==0) return "5"*count5+"3"*count3
      count3+=5
    }
    "-1"
  }
}