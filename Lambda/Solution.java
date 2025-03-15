import java.io.*;
import java.util.*;

interface PerformOperation
{
    boolean check(int a);
}

class MyMath
{
    public static PerformOperation isOdd()
    {
        return n -> n % 2 != 0;
    }

    public static PerformOperation isPrime()
    {
        return n ->
        {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++)
            {
                if (n % i == 0) return false;
            }
            return true;
        };
    }

    public static PerformOperation isPalindrome()
    {
        return n ->
        {
            String str = String.valueOf(n);
            return str.equals(new StringBuilder(str).reverse().toString());
        };
    }
}

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0)
        {
            String[] input = br.readLine().split(" ");
            int choice = Integer.parseInt(input[0]);
            int num = Integer.parseInt(input[1]);

            PerformOperation op;
            String result;

            if (choice == 1)
            {
                op = MyMath.isOdd();
                result = op.check(num) ? "ODD" : "EVEN";
            }
            else if (choice == 2)
            {
                op = MyMath.isPrime();
                result = op.check(num) ? "PRIME" : "COMPOSITE";
            }
            else
            {
                op = MyMath.isPalindrome();
                result = op.check(num) ? "PALINDROME" : "NOT PALINDROME";
            }
            System.out.println(result);
        }
    }
}
