import java.util.ArrayList;
import java.util.Arrays;

// Hash = Digital Signature
// Block = List of Transactions
// Block contains 3 components = { List of Transactions + Prev Hash -> Current Hash  }

public class Main
{
    ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args)
    {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        String transactions[] = {"1000Rs Deposite, 200Rs Withdraw", "Deposite Failed for 2000Rs"} ;
        Block genesisBlock = new Block(0,transactions);
        System.out.println(genesisBlock.getBlockHash());
    }
}