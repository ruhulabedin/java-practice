package com.java.search;
import java.util.ArrayList;
import java.math.BigInteger;
public class ProjectEuler25 {
  public static void main(String [] args) {
    long start = System.nanoTime();
    ArrayList<BigInteger> fibonacciNumbers = new ArrayList<BigInteger>();
    boolean validNo = true;
    int x = 2;
    BigInteger tempAns = null;
    fibonacciNumbers.add(BigInteger.valueOf(1));
    fibonacciNumbers.add(BigInteger.valueOf(1));
    do {
        tempAns = fibonacciNumbers.get(x-1).add(fibonacciNumbers.get(x-2));
        fibonacciNumbers.add(tempAns);
        x++;
        if(tempAns.toString().length() >= 1000) {
            validNo = false;
        }
    } while (validNo == true);
    Long stop = System.nanoTime();
    System.out.println("The first term in the Fibonacci sequence to contain 1,000 digits is term: " + fibonacciNumbers.size());
    System.out.println("Execution time: " + ((stop - start) / 1e+6) + " ms");
  }
}