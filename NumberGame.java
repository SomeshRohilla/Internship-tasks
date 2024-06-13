import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Number Game");
        System.out.println("----------------------");
        System.out.println("Guess the number between 1 to 100");
        int Total_Rounds = 3;
        int Max_attempts = 3;
        int Score = 0;

        //Logic
        for(int round = 1;round <= Total_Rounds; round++){
            
            int attempts = 0;
            boolean CorrectGuess = false;
            
            //Generating Random Number
            Random rn = new Random();
            int RandomNumber = rn.nextInt(100);

            System.out.println("Round : "+round+" of "+Total_Rounds);
            
            while(attempts<Max_attempts && !CorrectGuess){
            
            System.out.println("Enter Your Guess: ");
           
            int guess  = sc.nextInt();
            attempts++;

            if (guess < RandomNumber){
                System.out.println("Your Guess is to low");
                System.out.println("Try Again!");
            }
            else if (guess > RandomNumber){
                System.out.println("Your Guess is to high");
                System.out.println("Try Again!");
            }
            else{
                System.out.println("Congratulation Your Guess is Correct");
                CorrectGuess = true;
                Score++;
            }
            }
            if(!CorrectGuess){
               System.out.println("Sorry you have used all : "+Max_attempts+" attempts");
               System.out.println("The Correct Answer was : "+RandomNumber);
               
            }
        
        }
        System.out.println("Game Over!");
        System.out.println("Your Score : "+Score);
        sc.close();
    }
}