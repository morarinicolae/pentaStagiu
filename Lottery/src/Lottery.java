/*
4.Create a lottery game application. Generate three random numbers (see at the end info),
each between 0 and 9. Allow the user to guess three numbers. Compare each of the user’s
guesses to the three random numbers and display a message 
that includes the user’s guess, the randomly determined three-digit number, and the 
amount of money the user has won as follows:
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class Lottery {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random ranNum = new Random();

        final int LIMIT = 9;
        final int TIMES = 3;

        int usersFirstGuess;
        int usersSecondGuess;
        int usersThirdGuess;
        List<Integer> guesses = new ArrayList<>();

        final int GenFirst = ranNum.nextInt(LIMIT);
        final int GenSecond = ranNum.nextInt(LIMIT);
        final int GenThird = ranNum.nextInt(LIMIT);

        System.out.println("Please enter your first guess: ");
        usersFirstGuess = userInput.nextInt();
        guesses.add(usersFirstGuess);
        System.out.println("Please enter your second guess: ");
        usersSecondGuess = userInput.nextInt();
        guesses.add(usersSecondGuess);
        System.out.println("Please enter your third and final guess: ");
        usersThirdGuess = userInput.nextInt();
        guesses.add(usersThirdGuess);

        final double WinTen = 10;
        final double WinHun = 100;
        final double WinThund = 1000;
        final double WinMillion = 1000000;
        final int WinZero = 0;

        System.out.println(GenFirst + " " + GenSecond + " " + GenThird);
        List<Integer> lottery = new ArrayList<>();
        lottery.add(GenFirst);
        lottery.add(GenSecond);
        lottery.add(GenThird);

        if (guesses.equals(lottery)) {
            System.out.println("You have won: $" + WinMillion);
        } else {
            int matchCount = 0;
            for (Integer guessValue : guesses) {
                if (lottery.contains(guessValue)) {
                    matchCount++;
                    lottery.remove(guessValue);
                }
            }
            switch (matchCount) {
                case 0:
                    System.out.println("You have won: $" + WinZero);
                    break;
                case 1:
                    System.out.println("You have won: $" + WinTen);
                    break;
                case 2:
                    System.out.println("You have won: $" + WinHun);
                    break;
                case 3:
                    System.out.println("You have won: $" + WinThund);
                    break;
            }
        }
    }
}
