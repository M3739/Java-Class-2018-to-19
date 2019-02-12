package java_Class;
import java.util.Scanner;
public class Needthisforaclass 
{
	public static void main(String[] args)
	{
		int quartstogallon = 4;
		int quartsrequired;
		int gallonsrequired;
		int leftoverquarts;
		
		@SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Quarts Required: ");
		quartsrequired = kb.nextInt();
		
		gallonsrequired = quartsrequired/quartstogallon;
		leftoverquarts = quartsrequired%quartstogallon;
		System.out.println("A job that needs "+ quartsrequired +" quarts requires "+ gallonsrequired +" gallons plus "+ leftoverquarts +" quarts.");
	}
}