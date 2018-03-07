package com.gprasad.hackerrank.scalasol.algo.warmup

import scala.io.StdIn

object CompareTheTriplets {


  def main(args: Array[String]): Unit = {

    val intList = (ratingStr : String) => ratingStr.split(" +").map(_.toInt)
    val outPut = (aliceRating: String, bobRating:String) => {
      val aliceRatings = intList(aliceRating)
      val bobRatings = intList(bobRating)
      val diffRatingPair = aliceRatings.zip(bobRatings).filter(pair => pair._1 != pair._2)
      (diffRatingPair.count(pair => pair._1 > pair._2), diffRatingPair.count(pair => pair._1 < pair._2))
    }
    val aliceRating = StdIn.readLine
    val bobRating = StdIn.readLine

    val (aliceScore,bobScore) = outPut(aliceRating,bobRating)
    println(aliceScore +" "+bobScore)
  }

}