import java.util.Scanner;
import java.util.Random;

class numberGuess {
    public static void main(String args[])
    {
       int mnum;
       Random random  = new Random();
       Scanner sc = new Scanner(System.in); 
	   
       System.out.println("Welcome to the Number Guessing Game \n This game consists of 2 levels \n Level 1 has 3 Guesses \n Level 2 has 1 Guess");
       
	   int L1 = 3;
       boolean flag = false;
	   
       for(int level = 1; level<=2; level++)
       {
           flag = false;
           System.out.println("LEVEL " + level);
           mnum = random.nextInt(101);
           System.out.println("Random number is:" + mnum);
		   
           int guessno;
           int choice = 1;
           for(int guess = 1; guess<=L1; guess++)
           {
           System.out.println("Attempt" + choice + " \n GUESS THE NUMBER ");  
           guessno = sc.nextInt();
		   
           if(guessno >100 || guessno<0)
           {
            System.out.println("Oops! Number not in range!"); 
           }
           else if(mnum>guessno)
           {
             System.out.println("Your Guess is LOW");
           }
           else if(mnum<guessno)
           {
            System.out.println("Your Guess is HIGH");
           }
           else if(mnum==guessno)
           {
            System.out.println("Guessing is Correct");
            
            if(level != 2)
            {   System.out.println("You've qualified to the next level. " + "\n");    
            }
            
			flag = true;
			break;
           }
           choice++;
		   
        }
        L1= 1;
        if(flag)
        {
         continue;
        }
        else{
            System.out.println("You Lost");
            break;
        }
       }
       System.out.println("Play Again");
    } 
}