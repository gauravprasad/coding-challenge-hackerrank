package com.gprasad.hackerrank.scalasol.algo.Implementation

/**
 * @author gq6pras
 */
object SherlockAndSquare {
  def main(args:Array[String])
  {
    val t = io.StdIn.readInt()
    for(_<- 1 to t)
    {
      val Array(start, end) = io.StdIn.readLine().split(" ").map(_.toInt)
      println(getWholeSquareCout(start, end))
    }
  }
  
  def getWholeSquareCout(start:Int , end:Int):Int=
  {
    (Math.floor(Math.sqrt(end))-Math.ceil(Math.sqrt(start))+1).toInt
  }
}