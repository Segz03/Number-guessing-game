/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguessinggame;

/**
 *
 * @author fjsegarra
 */

import java.util.*;

public class NumberGuessingGame 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Scanner for user input
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Pick a number to be your MAX!!!: ");
        int max = kb.nextInt();
        
        System.out.print("Pick a positive num under your max: ");
        int num = kb.nextInt();
        
        System.out.println("\nif your number is greater use: 'greater' and for less use: 'less' .");
        
        int min = 0;
        int guess = (max + min) / 2;
        boolean done = false;
        
        
        while(!done && guess != num)
        {

          
            System.out.println("Is you number greater or less than " + guess + "?");
            String hint = kb.next();
            
            
            if (hint.equals("greater"))
            {
                min = guess;
                int newGuess = (max + min) / 2;
                guess = newGuess;
                
                
            } 

            else if (hint.equals("less"))
            {
                max = guess;
                int newGuess = (max + min) / 2;
                guess = newGuess;
            }
           
        } // end while
        
        System.out.println("Your number is "+ guess + "!!!");
        
    } // end main
    
} // end class