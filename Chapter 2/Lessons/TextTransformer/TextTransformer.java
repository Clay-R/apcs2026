
/**
 * Transform a String
 *
 * @Clay Riddell
 * @8/31/2026
 */
import java.util.Scanner;
public class TextTransformer
{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to text Transformer");
        System.out.println("===========================");
        
        System.out.println("Enter a motivational quote: ");
        String phrase = scan.nextLine();
        // The length method returns the number of characters in the string
        int phraseLength = phrase.length();
        System.out.println("Total Characters (Including Spaces): " + phraseLength);
        //Does NOT mofidy the orignal string, just creates a new one
        String securePhrase = phrase.replace('e', '3');
        securePhrase = securePhrase.replace('a', '@');
        
        System.out.println("Modified Phrase: " + securePhrase);
        System.out.println("Original Phrase: " + phrase);
        
        //substring returns a string from 
        //first number is included, second number isnt
        String prefix = phrase.substring(0, 5);
        System.out.println("First 5 Characters: " + prefix);
        
        //returns a string from the given index (inclusive)
        //to the end of the original string
        String remainder = phrase.substring(5);
        
        
    }
}
