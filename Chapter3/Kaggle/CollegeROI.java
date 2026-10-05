
/**
 * Write a description of class CollegeROI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
public class CollegeROI
{
    public static void main(String [] args) throws FileNotFoundException{
        File dataFile = new File ("college_major_roi.txt");
        Scanner fileScan = new Scanner(dataFile);
        
        fileScan.useDelimiter(",");
        int count = 0;
        String userID = fileScan.next();
        while (count < 12) {
        System.out.println(userID);
        count++;
    }
    
    
        
        
        fileScan.close();
}
}
