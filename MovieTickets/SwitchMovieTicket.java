
/**
 * Write a description of class SwitchMovieTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner; 
import java.text.NumberFormat;
public class SwitchMovieTicket
{

    public static void main(String[] args) {
        final double REGULAR_PRICE = 12.50;
        final double DISCOUNT_PRICE = 8.00;
        final double IMAX_SURCHARGE = 5.00;
        final double IMAX_70MM_SURCHARGE = 8.00;
        
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println("---Movie Ticket Calculator---");
        System.out.println("Select Movie Format:");
        System.out.println("1 - Standard Formar");
        System.out.println("2 - IMAX");
        System.out.println("3 - IMAX 70mm (As Nolan Intended)");
        System.out.println("Enter choice (1-3): ");
        int format = scan.nextInt();
        
        
        System.out.print("Enter customer's age: ");
        int age = scan.nextInt();
        
        //Seet matinee to true if the user enters "y"
        System.out.print("Is this a matinee showtime? (y/n): ");
        String isMatinee = scan.next();
        boolean matinee = false;
        
        if (isMatinee.toLowerCase().equals("y")){
            matinee = true;
        }
            //Set pass to true if the user enters y
        
        System.out.print("Does the customer have a pass? (y/n): ");
        String hasPass = scan.next();
        boolean pass = hasPass.toLowerCase().equals("y");
        
        double ticketPrice;
        
        //if (format == 1) {
         switch (format) {
        
            case 1: 
                
                if (age < 13 || age>= 65 || matinee && pass) {
                ticketPrice = DISCOUNT_PRICE;
                System.out.println("Status: Discount Applied!");
                
            
                } else{
                ticketPrice = REGULAR_PRICE;
                System.out.println("Status: Regular Rate Applied.");
                
                
                }
                break;
            
            case 2:
                ticketPrice = REGULAR_PRICE + IMAX_SURCHARGE;
                System.out.println("Status: IMAX Surcharge Applied.");
                break;
            
            case 3: 
                ticketPrice = REGULAR_PRICE + IMAX_70MM_SURCHARGE;
                System.out.println("Status: IMAX 70mm Surcharge Applied.");
                break;
                
            
            default:
                ticketPrice = REGULAR_PRICE + IMAX_70MM_SURCHARGE;
                System.out.println("Status: Incorrect entry. Regular Price Applied.");
                break;
                
        }
        System.out.println("Total Due: " + money.format(ticketPrice));
    }    
        
}        
        
        



