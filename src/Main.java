import java.util.Arrays;

public class Main
{
    // Hash = Digital Signature
    // Block = List of Transactions
    // Block contains 3 components = { List of Transactions + Prev Hash -> Current Hash  }

    public static void main(String[] args)
    {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        String st[] = {"ab","cb","ac","ca"};
        int hashCode = Arrays.hashCode(st);
        System.out.println(hashCode);
    }
}