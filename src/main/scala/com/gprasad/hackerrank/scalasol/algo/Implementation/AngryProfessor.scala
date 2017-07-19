package com.gprasad.hackerrank.scalasol.algo.Implementation

/**
 * @author gq6pras
 */
object AngryProfessor {
  def main(args:Array[String])
  {
    val t = io.StdIn.readInt()
    for(_<-1 to t)
    {
      var Array(n,k) = io.StdIn.readLine().split(" ").map(_.toInt)
      var timeArr = io.StdIn.readLine().split(" ").map(_.toInt)
      if(timeArr.filter(_<=0).size<k)println("YES")
      else println("NO")
    }
  }
}