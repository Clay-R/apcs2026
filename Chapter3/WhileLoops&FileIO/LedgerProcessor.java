
/**
 * Write a description of class LedgerProcessor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
public class LedgerProcessor 
{
    public static void main(String[] args) throws FileNotFoundException{
        File dataFile = new File ("transactions.txt");
        Scanner fileScan = new Scanner(dataFile);
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        int count = 0;
        double totalSales = 0.0;
        System.out.println("=== Daily Transactions Ledger ===");
        
        while (fileScan.hasNextLine()) {
            String line = fileScan.nextLine();
            double price = Double.parseDouble(line);
            
            count ++;
            totalSales += price;
            System.out.println("Transaction #"+count+": "+money.format(price));
            
            
            
            
        }
        fileScan.close();
        
        double averageSales = totalSales / count;
        System.out.println("Total items sold: "+count);
        System.out.println("Total Revenue: "+money.format(totalSales));
        System.out.println("Average Transaction: "+money.format(averageSales));
        
        
    }
}
