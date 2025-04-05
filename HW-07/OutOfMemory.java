import java.util.ArrayList;
import java.util.List;

public class OutOfMemory
{
    public static void main(String[] args)
    {
        List<int[]> memoryHog = new ArrayList<>();
        try
        {
            System.out.println("Filling up memory...");
            while (true)
            {
                memoryHog.add(new int[10_000_000]);
            }
        }
        catch (OutOfMemoryError e)
        {
            System.out.println("Caught an OutOfMemoryError!");
            System.out.println("Error message: " + e);
        }

        System.out.println("Program continues after handling the error.");
    }
}
