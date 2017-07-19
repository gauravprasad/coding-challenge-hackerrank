/*

Area Under Curves and Volume of Revolving a Curve (Scala HackerRank solution)

Definite Integrals via Numerical Methods

This relates to definite integration via numerical methods.

Consider the algebraic expression given by:

For the purpose of numerical computation, the area under the curve between the limits and can be computed by the Limit Definition of a Definite Integral.

Here is some background about areas and volume computation.

Using equal subintervals of length , you need to:

    Evaluate the area bounded by a given polynomial function of the kind described above, between the given limits of and .

    Evaluate the volume of the solid obtained by revolving this polynomial curve around the -axis.

An absolute error margin of will be tolerated.

Input Format

The first line contains integers separated by spaces, which are the values of .
The second line contains integers separated by spaces, which are the values of .
The third line contains two space separated integers, and , the lower and upper range limits in which the integration needs to be performed, respectively.

Constraints



Output Format

The first line should contain the area between the curve and the -axis, bound between the specified limits.
The second line should contain the volume of the solid obtained by rotating the curve around the -axis, between the specified limits.

Sample Input

1 2 3 4 5
6 7 8 9 10
1 4

Explanation

The algebraic expression represented by:

We need to find the area of the curve enclosed under this curve, between the limits and . We also need to find the volume of the solid formed by revolving this curve around the -axis between the limits and .

Sample Output

2435300.3
26172951168940.8

Scoring

All test cases are weighted equally. You need to clear all the tests in a test case.
 */

package com.gprasad.hackerrank.funcprogram.intro

object AreaUnderCurvesVolumeRevolvingCurve {
  // This function will be used while invoking "Summation" to compute
  // The area under the curve.
  def f(coefficients: List[Int], powers: List[Int], x: Double): Double = {
    //Fill Up this function body
    // To compute the value of the function
    // For the given coefficients, powers and value of x
  }

  // This function will be used while invoking "Summation" to compute
  // The Volume of revolution of the curve around the X-Axis
  // The 'Area' referred to here is the area of the circle obtained
  // By rotating the point on the curve (x,f(x)) around the X-Axis
  def area(coefficients: List[Int], powers: List[Int], x: Double): Double = {
    //Fill Up this function body
    // To compute the area of the circle on revolving the point
    // (x,f(x)) around the X-Axis
    // For the given coefficients, powers and value of x
  }

  // This is the part where the series is summed up
  // This function is invoked once with func = f to compute the area         // under the curve
  // Then it is invoked again with func = area to compute the volume
  // of revolution of the curve
  def summation(func: (List[Int], List[Int], Double) => Double, upperLimit: Int, lowerLimit: Int, coefficients: List[Int], powers: List[Int]): Double = {
    // Fill up this function
  }


  // The Input-Output functions will be handled by us. You only need to concentrate your effort on the function bodies above.
}
