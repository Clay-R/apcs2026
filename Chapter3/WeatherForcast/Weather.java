
/**
 * Write a description of class Weather here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Weather
{
    //Define an enum for fixed weather categories
    public enum WeatherType{
        Sunny, 
        Cloudy,
        Rainy,
        Foggy,
        Windy,
        Snowy
    }
    public static void main(String[] args)
    {
        // Create a counter variable to count the number of rainy days
        int rainyDays = 0;
        
        // Array of all possible enum values
        WeatherType[] options = WeatherType.values();
        
        
        //Header Parts:
        //Initializer (int day = 1)
        //Conditon (day <= 7)
        //Mutator (day++)
        for (int day = 1; day <= 7; day++){
            // Pick a random index from 0 to the length of our enum
            int rndIndex = (int) (Math.random() * options.length);
            WeatherType today = options[rndIndex];
            
            System.out.println("Day "+day+": "+today);
            
            // Enums are comparing using == because they are ints
            if (today == WeatherType.Rainy) {
               rainyDays++;
            }
        }
            System.out.println("There are "+rainyDays+" days of rain on the forecast.");
            System.out.println("All supported weather types: ");
            for (WeatherType w: WeatherType.values()){
                System.out.println("Category: " + w);
                
            }
            
        for (int day = 3 ; day >= 3 || day <= 99;){
            if (day%3 == 0){
                System.out.println(day);
            }
            day++;
            
        }
    }
}
