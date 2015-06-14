/*
*********************************************************

CPT 236 Random Swap

Author: Andrew Bailey
Date: 5/29/15

*********************************************************
*/

public class CPT236RandomSwap{
   public static void main(String[] args) {
      //Creates two random numbers between 1 and 100
      int x = (int) (Math.random() * 100);
      int y = (int) (Math.random() * 100);
      //This if statement swaps x with y if x is greater
      if (x > y) {
         int temp = y;
         y = x;
         x = temp;
      }
      System.out.println( x + " is less than " + y);
   }
}   