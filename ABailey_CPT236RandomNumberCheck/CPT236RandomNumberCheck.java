/*
*********************************************************

CPT 236 Random Number Check

Author: Andrew Bailey
Date: 6/23/15

*********************************************************
*/

public class CPT236RandomNumberCheck
{
   public static void main(String[] args)
   {
      //create variables
      final int max = 1000000;
      final int maxRandom = 10;
      
      //create the array
      int[] count = new int[maxRandom];
      
      //generate random numbers
      for(int i=0; i < max; i++) 
      {
         count[(int) (Math.random() *maxRandom)]++;
      }
      
      //Print the numbers, occurences, and percentages
      for(int i = 0; i < count.length; i++) 
      {
         System.out.println("Number: " + i + " Occurs: " + count[i] +
         " Percentage: " + (double)count[i] / max * 100 + "%");
      }
   }
}