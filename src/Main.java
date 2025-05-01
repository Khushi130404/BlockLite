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
            System.out.println("New Block..."+count);
            ArrayList<String> tranList = new ArrayList<>();
            if(tran.equalsIgnoreCase("Quite")) break;
            while (true)
            {
                System.out.println("Enter Transaction : ");
                tran = scan.nextLine().trim();
                if(tran.equalsIgnoreCase("New") || tran.equalsIgnoreCase("Quite")) break;
                tranList.add(tran);
            }
            if(tran.equalsIgnoreCase("New"))
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
            if(tran.equalsIgnoreCase("Quite")) break;
        }
        for(Block b : blockchain)
        {
            System.out.println(b.getTransactions());
            System.out.println(b.getBlockHash());
        }
    }
}