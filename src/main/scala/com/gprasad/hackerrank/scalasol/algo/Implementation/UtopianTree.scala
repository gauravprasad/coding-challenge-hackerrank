package com.gprasad.hackerrank.scalasol.algo.Implementation

/**
 * @author gq6pras
 */
object UtopianTree {
  def main(args:Array[String])
  {
    val t = io.StdIn.readInt()
    
    for(_<-1 to t)
    {
      println(getFinalLength(io.StdIn.readInt()))
    }
  }
  def getFinalLength(cycle:Int):Int={
    var length = 1
    for(i<-1 to cycle)
    {
      if(i%2!=0) length*=2
      else length+=1
    }
    length
  }
}