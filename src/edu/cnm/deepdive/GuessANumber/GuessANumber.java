package edu.cnm.deepdive.GuessANumber;
import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

  private static Random random = new Random();
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int secret;
    int guess;
    String userSaysYes;

    do {
      secret = random.nextInt(100) + 1;
      System.out.println(
          "Please enter a number between 1 and 100. Or enter 0 to quit.");

      do {
        guess = input.nextInt();
        if (guess == 0) {
          System.out.println("See you later.");
        }
        else if (guess > secret) {
          System.out.println("Your guess is too high!");
        }
        else if (guess < secret) {
          System.out.println("Your guess is too low.");
        } else {
          System.out.println("Your guess was correct!");
        }
      } while (guess != secret);

      System.out.println("Would you like to play again?");
      input.nextLine();
      userSaysYes = input.nextLine();
    } while (userSaysYes.toLowerCase().charAt(0) == 'y');

  }
}

