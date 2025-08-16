import java.util.*;

public class home{
    public static void main(String [] args){
        Scanner sim = new Scanner(System.in);
        Random num = new Random();

        int x;

        System.out.println("Enter a number between 1 and 100: ");
        x = sim.nextInt();
        int randomNumber = num.nextInt(100) + 1; // Generates a number between 1 and 100
        System.out.println("Random number generated: " + randomNumber);
        if (x < 1 || x > 100) {
            System.out.println("Please enter a valid number between 1 and 100.");
        } else {
            if (x == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
            } else {
                System.out.println("Sorry, the correct number was " + randomNumber + ".");
            }
        }
    }
}