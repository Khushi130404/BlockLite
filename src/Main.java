import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Hash = Digital Signature
// Block = List of Transactions
// Block contains 3 components = { List of Transactions + Prev Hash -> Current Hash  }

public class Main
{
    public static void main(String[] args)
    {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Scanner scan = new Scanner(System.in);
        ArrayList<Block> blockchain = new ArrayList<>();
        int count = 0;
        String tran = "";
        int prevHash = 0;
        while(true)
        {
            count++;
            System.out.println("\nNew Block..."+count);
            ArrayList<String> tranList = new ArrayList<>();
            if(tran.equalsIgnoreCase("Quit")) break;
            while (true)
            {
                System.out.print("Enter Transaction : ");
                tran = scan.nextLine().trim();
                if(tran.equalsIgnoreCase("New") || tran.equalsIgnoreCase("Quit")) break;
                tranList.add(tran);
            }
            if(tran.equalsIgnoreCase("New") || tran.equalsIgnoreCase("Quit"))
            {
                String tranArr[] = new String[tranList.size()];
                int idx = 0;
                for(String tr : tranList)
                {
                    tranArr[idx++] = tr;
                }
                Block genesisBlock = new Block(prevHash,tranArr);
                prevHash = genesisBlock.getBlockHash();
                blockchain.add(genesisBlock);
            }
            if(tran.equalsIgnoreCase("Quit")) break;
        }
        int idxB = 1;
        for(Block b : blockchain)
        {
            System.out.println("\nBlock..."+idxB++);
            String tranB[] = b.getTransactions();
            System.out.println("Transactions...");
            for(String tb : tranB)
            {
                System.out.println(tb);
            }
            System.out.println("Block Hash : "+b.getBlockHash());
        }
    }
}