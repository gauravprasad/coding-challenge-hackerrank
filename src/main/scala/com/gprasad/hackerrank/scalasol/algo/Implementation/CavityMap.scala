package com.gprasad.hackerrank.scalasol.algo.Implementation


/**
 * @author gq6pras
 */
object CavityMap {
  def main(args: Array[String]) {
    val n = io.StdIn.readInt()
    var strArr = Array.ofDim[String](n)
    var maxchar = '\0'
    for (i <- 0 until n) {
      strArr(i) = io.StdIn.readLine()
    }
    getCavityMarked(strArr).foreach(println)
    
  }
  
  def getCavityMarked(strArr:Array[String]):Array[String] ={
    for(i<- 1 until strArr.length-1;j<- 1 until strArr(i).length()-1 if strArr(i).charAt(j) > strArr(i - 1).charAt(j) && strArr(i).charAt(j) > strArr(i + 1).charAt(j) && strArr(i).charAt(j) > strArr(i).charAt(j - 1) && strArr(i).charAt(j) > strArr(i).charAt(j + 1)){
      var charArr = strArr(i).toCharArray()
      charArr(j)='X'
      strArr(i)=new String(charArr)
    }
    strArr
  }
  
}