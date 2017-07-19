package com.gprasad.hackerrank.scalasol.algo.dynamicprogramming

/**
 * @author gq6pras
 */
object StockMaximize {
	def main(arg: Array[String]):Unit= {
    val testCase = io.StdIn.readInt()
    for (_ <- 1 to testCase) {
      var days = io.StdIn.readInt()
      var priceArr = io.StdIn.readLine().split(" +").map(_.toLong)
      println(getProfit(priceArr, days))
    }
  }
  
  def getProfit(priceArr:Array[Long],days:Int):Long={
    var currMax = Long.MinValue
    var profit =0l
    for(i <- days to (1,-1)){
      if(currMax<priceArr(i-1)) currMax=priceArr(i-1)
      profit+=(currMax-priceArr(i-1))
    }
    profit
  }
   
}