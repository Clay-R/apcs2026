
/**
 * Generate a random cash prize
 *
 * Clay Riddell
 * 8/26/2026
 */

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Random;
public class PrizeGenerator
{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println("Welcome to the APCSA Prize Simulator");                                                                 
        System.out.println("-------------------------------------------------");
        System.out.print("Name: ");
        String name = scan.nextLine();
        
        System.out.print("How much money do you have? $");
        double startBalance = scan.nextDouble();
        
        //math.random generates a number between between 0(inclusive) and and 1(exclusive)
        //(Math.random() * 91); generates a number between 0 and 90.99999
        int prizeAmount = 10 + (int)(Math.random() * 91);
        
        //generate a random fee between $1 and $5
        int fee = 1 + (int)(Math.random() * 5) + 1;
        
        double finalBalance = startBalance + prizeAmount - fee;
        System.out.println("\n Congratulations " + name + "! Here is your statement!");
        System.out.println("=================================================");
        
        
        System.out.printf("%-25s %s%n", "Starting Balance", money.format(startBalance));
        System.out.printf("%-25s %s%n", "Prize Money", money.format(prizeAmount));
        System.out.printf("%-25s %s%n", "Processing Fee", money.format(fee));
        System.out.println("-------------------------------------------------");
        System.out.printf("%-25s %s%n", "Final Balance", money.format(finalBalance));
        System.out.println("=================================================");
        
        
    }
}