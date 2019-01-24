package edu.cnm.deepdive.GuessANumber;
import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

  private static Random random = new Random();
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

    String userSaysYes;

    do {
      userSaysYes = playOneRound();
    } while (userSaysYes.charAt(0) == 'y');

  } // end main()

  private static String playOneRound() {
    int secret;
    int guess;
    String userSaysYes;
    secret = random.nextInt(100) + 1;
    System.out.println(
        "Please enter a number between 1 and 100. Or enter 0 to quit.");

    do {
      guess = getGuess(secret);
    } while (guess != secret);

    System.out.println("Would you like to play again?");
    do {
      userSaysYes = input.nextLine().trim().toLowerCase();
    } while (userSaysYes.isEmpty());
    return userSaysYes;
  }

  private static int getGuess(int secret) {
    int guess;
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
    return guess;
  }
}

