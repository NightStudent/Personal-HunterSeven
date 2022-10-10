import java.util.Scanner;
import java.util.Random;

public class BattleV2 {
	
	public class battleV2 extends fighter{
	
		 public static void display() {
		//displays the values
	    System.out.println(" actions points is: " + actionPoints);
	    System.out.println(" hp is: " + health);
	    System.out.println(" mana is: " + mana);

	    
		 return;
		 }
		

	public static void main(String[] args) {
		
		actionPoints = 2;
		health = 100;
		mana = 200;
		//gives the inherited varibes their values
		display();
	
		
		
		
}
 }
  }
