/*
*********************************************************

CPT 236 Decimal Round Method

Author: Andrew Bailey
Date: 6/16/15

*********************************************************
*/


import java.util.Scanner;

public class CPT236DecimalRoundMethod {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Please input a decimal value: ");
         double decimal = input.nextDouble();
      
      System.out.println("Initial value input is " + decimal); 
      System.out.println("Rounded vaule is " + decimalRound(decimal, 2));
   } 
   public static double decimalRound(double decimal, int round){
       
      decimal += 5.0 / Math.pow(10, round + 1);
      decimal *= Math.pow(10, round);
      long decimal_value = (long) decimal;
      double roundDecimal_Value = (double)decimal_value / Math.pow(10,round);
         
         return roundDecimal_Value;
   }      
}
