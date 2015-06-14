/*
*********************************************************

CPT 236 Decimal Round

Author: Andrew Bailey
Date: 5/29/15

*********************************************************
*/

// Tells Java to use the Scanner class in this program
import java.util.Scanner;
   // Declares the name of the class and program
   public class CPT236DecimalRound {
      // Creates the method of the class
      public static void main(String[] args) {
         //Creates a scanner object
         Scanner input = new Scanner(System.in);
         //Request the input of the decimal value
         System.out.print("Please input a decimal value: ");
            //Declares the input as a decimal
            double decimal = input.nextDouble();
            //Rounds the decimal up, the times it by 100
            double decimal_value = (decimal + 0.005)* 100;
         //Prints the initial value, then prints the decimal rounded up to two places
         System.out.println("Initial value input is " + decimal); 
         System.out.println("Rounded vaule is " + (int)(decimal_value) / 100.00);
    } 
}

/*
**********************************************************

End of program

I took way to long on this one, but was very fun :D

**********************************************************
*/