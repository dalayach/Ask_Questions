package com.dalayach.Ask_Questions;

import java.util.Scanner;


public class Ask_Questions
{

   private Scanner scan = new Scanner(System.in);

   void print(String message)
   {//this method will be a godsend when it comes time to upgrade to V2
    //at least, slightly so
   
      System.out.println(message);
   
   }
   
   String input()
   {
   
      return this.scan.next();
   
   }
   
   public boolean question(String prompt)
   {
   
      boolean result = true;
      boolean valid_response = false;
      String choice;
         
      do
      {
         
         print(prompt);
         choice = input();            
         
         switch (choice.toLowerCase())
         {
         
            case "y":
            case "yes":
               result = true;
               valid_response = true;
               break;
               
            case "n":
            case "no":
               result = false;
               valid_response = true;
               break;
               
            default:
               print("INVALID RESPONSE\nTry again.\n\n");
               break;
               
         
         }
      
      }while(valid_response == false);
   
            
      return result;
   
   }

}