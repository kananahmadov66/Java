import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Numbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();
        int target = random.nextInt(101);
        int[] guesses = new int [100];
        int guesscount = 0;

        System.out.println("Let the game begin!");
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        while(true)
        {
            System.out.println("Enter your guess: ");
            int num = getValidNumber(scanner);

            guesses[guesscount++]=num;

            if (num == target)
            {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
            else if (num < target)
            {
                System.out.println("Your number is too small. Please, try again");
            }
            else
            {
                System.out.println("Your number is too large. Please, try again");
            }
        }
        System.out.println("Your numbers: ");
        int[] SortedGuesses = Arrays.copyOf(guesses, guesscount);
        Arrays.sort(SortedGuesses);
        for (int i = guesscount-1; i > -1; i--)
        {
            System.out.print(SortedGuesses[i] + " ");
        }
        scanner.close();
    }
    private static int getValidNumber(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }
}