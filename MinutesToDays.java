package java_Class;
import java.util.Scanner;
public class MinutesToDays
{
    @SuppressWarnings("resource")
	public static void main(String[] args)
    {
        double HoursInADay = 24;
        double MinutesInAHour = 60;
        int NumberOfMinutes;
        double NumberOfHours;
        Double NumberOfDays;
        
        Scanner kb = new Scanner (System.in);
        System.out.print("Please specify the number of minutes: ");
        NumberOfMinutes = kb.nextInt();
        
        NumberOfHours= NumberOfMinutes/MinutesInAHour;
        NumberOfDays= NumberOfHours/HoursInADay;
        System.out.println(NumberOfMinutes + " minutes is equivalent to " + NumberOfHours + " hours and " + NumberOfDays + " days.");
    }
}