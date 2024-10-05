import java.util.*;
public class RandNumbGuess 
{
    static int guess, randx, win = 0, attempts = 5;
    static char choice = 'N';

    public void numbgen() 
{ 
        int min = 1, max = 100;
        Random rd = new Random();
        randx = rd.nextInt(max - min + 1) + min;  //generate a random number between 1 and 100
 }

    public void input_check() 
{
        Scanner in = new Scanner(System.in);
        System.out.println("You have " + attempts + " attempts left!");
        System.out.print("Choose a number between 1 and 100: ");
        guess = in.nextInt();
        if (guess > randx) {
            System.out.println("Too High!");
        } else if (guess < randx) {
            System.out.println("Too Low!");
        } else if (guess == randx) {
            win++;
            System.out.println("Congratulations, you guessed the correct number!");
            attempts = 0; // To stop after a win
        }
    }

    public static void main(String[] args)
{
        Scanner in = new Scanner(System.in);
        RandNumbGuess rand = new RandNumbGuess();
        System.out.println("Welcome to the Guessing Game!");
        do {
            rand.numbgen();  // Generate a random number
            attempts = 5;    // Reset attempts for a new round  
            while (attempts > 0) {
                rand.input_check();
                if (guess == randx) break;  // Stop guessing if user wins
                attempts--;
            }
            if (guess != randx) {
                System.out.println("Sorry, you lose! The correct number was " + randx);
            }
            System.out.print("Do you want to play again? (Y/N): ");
            choice = in.next().charAt(0);  
        } while (choice == 'Y' || choice == 'y'); 
        System.out.println("Game Over! You won " + win + " times!");
        in.close();
    }
}

