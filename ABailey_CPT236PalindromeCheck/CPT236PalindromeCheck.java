/*
*********************************************************

CPT 236 Palindrome Check

Author: Andrew Bailey
Date: 6/9/15

*********************************************************
*/

import java.util.Scanner;

public class CPT236PalindromeCheck {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a string: ");
      String s = input.nextLine();
  
      int low = 0;
      int high = s.length() - 1;
      
      String a= s.replaceAll("[^a-zA-Z0-9\\W]+","").toLowerCase();
      //This string makes it so the code ignores
      //case, punctuation, and spacing.  The \\W
      //is  is the regular expression character 
      //class of all non word character.
      
      boolean isPalindrome = true;
       
      while (low < high) {
         if (a.charAt(low) != a.charAt(high)) {
            isPalindrome = false;
            break;
         }
         low++;
         high--;
     }
     
     if (isPalindrome)
      System.out.println(s + " is a palindrome");
     else
      System.out.println(s + " is not a palindrome");
   }
}   