import java.util.Scanner;
import java.util.Random;

public class ShootingAtTheSquare
{
    public static void main(String[] args)
    {
        int size = 5;
        char[][] field = new char[size][size];

        // Initialize the field
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                field[i][j] = '-';
            }
        }

        // Generate a random target
        Random random = new Random();
        int targetRow = random.nextInt(size);
        int targetCol = random.nextInt(size);

        System.out.println("All set. Get ready to rumble!");
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            int row = getValidInput(sc, "Enter row (1-5): ", size) - 1;
            int col = getValidInput(sc, "Enter col (1-5): ", size) - 1;

            if (row == targetRow && col == targetCol)
            {
                field[row][col] = 'x';
                printField(field);
                System.out.println("You have won!");
                break;
            }
            else
            {
                if (field[row][col] == '*')
                {
                    System.out.println("You have already shot here!");
                }
                else
                {
                    field[row][col] = '*';
                }
            }
            printField(field);
        }

        sc.close();
    }

    private static int getValidInput(Scanner scanner, String prompt, int size)
    {
        int input;
        while (true)
        {
            System.out.print(prompt);
            if (scanner.hasNextInt())
            {
                input = scanner.nextInt();
                if (input >= 1 && input <= size)
                {
                    return input;
                }
            }
            else
            {
                scanner.next(); // Discard invalid input
            }
            System.out.println("Invalid input. Please enter a number between 1 and " + size + ".");
        }
    }

    private static void printField(char[][] field)
    {
        System.out.println("\n0 | 1 | 2 | 3 | 4 | 5 |");
        for (int i = 0; i < field.length; i++)
        {
            System.out.print((i + 1) + " |");
            for (int j = 0; j < field[i].length; j++)
            {
                System.out.print(" " + field[i][j] + " |");
            }
            System.out.println();
        }
    }
}
