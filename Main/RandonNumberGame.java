package Main;

import java.util.Scanner;

public class RandonNumberGame {
    public static void main(String[] args) {
    
        int secretNumber;
        secretNumber = (int) (Math.random()* 100 + 1);

        System.out.println("You're secret Number is: " + secretNumber);

        try (//Scanner gueesNumber
        Scanner keyboard = new Scanner(System.in)) {
            int guess;

            do{
            guess = keyboard.nextInt();
            System.out.println("You're guess Number is: " + guess);

            //Cheking currect guessNumber
            if (guess == secretNumber)

                System.out.println("Your guess is correct. Congratulations!");

            else if (guess < secretNumber)

                System.out.println("Your guess is smaller than the secret number.");

            else if (guess > secretNumber)

                System.out.println("Your guess is greater than the secret number.");

            }while(guess != secretNumber);

            
        }
    }
}
