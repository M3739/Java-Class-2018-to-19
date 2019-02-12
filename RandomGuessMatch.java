package java_Class;
import javax.swing.JOptionPane;
public class RandomGuessMatch
{
   public static void main(String[] args)
   {
	  //Had to search up some logic and more stuff, more specifically the If logic. The internet is a wonderful place.
      int RN = 1+(int)(Math.random()*5);
     String numberguess = JOptionPane.showInputDialog("Please input a number between 1 and 5: ");
     int UserGuess= Integer.parseInt(numberguess);
     System.out.println(UserGuess);
     if (UserGuess == RN) {
    	 JOptionPane.showMessageDialog(null, Your guess was on point!);
     }
   }
}