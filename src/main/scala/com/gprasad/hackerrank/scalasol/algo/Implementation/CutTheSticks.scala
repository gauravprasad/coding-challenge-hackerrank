package com.gprasad.hackerrank.scalasol.algo.Implementation

import java.time.temporal.IsoFields.Unit

/**
 * @author gq6pras
 */
object CutTheSticks {
  def main(args: Array[String]) {
    val n = io.StdIn.readInt()
    val stickSizeArr = io.StdIn.readLine().split(" +").map(_.toInt)
    cutStickCount(stickSizeArr.sorted)
  }
  def cutStickCount(stickSizeArr: Array[Int]): Unit = {
    if (stickSizeArr.size > 0) {
      println(stickSizeArr.size)
      cutStickCount(stickSizeArr.map(x=>x-stickSizeArr(0)).filter(x=>x!=0))
    }
  }
}