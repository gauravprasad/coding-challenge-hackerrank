package com.gprasad.hackerrank.funcprogram.recursion

/**
 * @author gq6pras
 */
object PascalTriangle {
  def main(args:Array[String])
  {
    val k = io.StdIn.readInt()
    for(row <- 0 until   k)
    {
      for(col<-0 to row)
        {
          print(pascal(row,col) + " ")
        }
      println()
    }
  }

  def pascal(row:Int, col:Int):Int={
    if(col==0 || col==row) 1 else pascal(row-1, col-1)+pascal(row-1,col)
  }
}