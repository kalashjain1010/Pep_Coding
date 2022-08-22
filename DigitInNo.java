/*1. You've to count the number of digits in a number.
2. Take as input "n", the number for which the digits has to be counted.
3. Print the digits in that number. */

import java.util.*;
  
public class DigitInNo{
  public static void main(String[] args) {
    
    Scanner scn = new Scanner(System.in);
  
       // write ur code here
       int n=scn.nextInt();//to take
       int sum=0;
       while (n!=0) {
        n=n/10;
        sum++;
       }
       System.out.println(sum);

  }    
}
