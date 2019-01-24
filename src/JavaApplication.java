import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int secret;
        int guess;
        boolean quit;
        
        secret = random.nextInt(100) + 1;
        System.out.println("Please enter a number between 1 and 100. Or enter 0 to quit.");
        if (quit == true) {
        }
        do {
            guess = input.nextInt();
            if (guess > secret) {
                System.out.println("Your guess is too high!");
            }
            if (guess < secret) {
                System.out.println("Your guess is too low.");
            }
        } while (guess != secret);
        System.out.println("Your guess was correct!");
    }
}
