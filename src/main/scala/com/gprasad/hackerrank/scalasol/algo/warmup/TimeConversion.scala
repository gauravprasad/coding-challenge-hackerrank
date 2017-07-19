package com.gprasad.hackerrank.scalasol.algo.warmup

/**
 * @author gq6pras
 */
object TimeConversion {
   def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var time = sc.next();
        println(dateTimeConversion(time))
    }
   
   def dateTimeConversion(time:String):String=
   {
     val displayFormat = new java.text.SimpleDateFormat("HH:mm:ss");
     val parseFormat = new java.text.SimpleDateFormat("hh:mm:ssa");
     val date = parseFormat.parse(time);
     return displayFormat.format(date);
   }
}