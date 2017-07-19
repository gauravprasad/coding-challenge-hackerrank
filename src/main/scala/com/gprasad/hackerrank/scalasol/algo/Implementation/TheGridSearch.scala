package com.gprasad.hackerrank.scalasol.algo.Implementation

/**
 * @author gq6pras
 */
object TheGridSearch {
  def main(args:Array[String])
  {
    val testCase = io.StdIn.readInt()
    for(_<-1 to testCase)
    {
      val Array(rp,cp) = io.StdIn.readLine().split(" ").map(_.toInt)
      var probArr = Array.ofDim[String](rp)
      for(index<-0 until rp)
      {
        probArr(index)=io.StdIn.readLine()
      }
      val Array(rs,cs) = io.StdIn.readLine().split(" ").map(_.toInt)
      var solArr = Array.ofDim[String](rs)
      for(index<-0 until rs)
      {
        solArr(index)=io.StdIn.readLine()
      }
      println(if(doPatternExist(rp, cp, probArr, rs, cs, solArr))"YES" else "NO")
    }
  }
  
  def doPatternExist(R:Int,C:Int,probArr:Array[String],r:Int,c:Int,solArr:Array[String]):Boolean={
    for(indexR <- 0 until R-r+1; indexC <-0 until C-c+1 if probArr(indexR).charAt(indexC)==solArr(0).charAt(0) if isMatchingSubArray(indexR, indexC ,probArr,r,c,solArr))
    {
      return true
    }
    false
  }
  def isMatchingSubArray(R:Int,C:Int,probArr:Array[String],r:Int,c:Int,solArr:Array[String]):Boolean={
    for(indexr<-0 until r; indexc<-0 until c if solArr(indexr).charAt(indexc)!=probArr(indexr+R).charAt(indexc+C))
    {
      return false
    }
    true
  }
}