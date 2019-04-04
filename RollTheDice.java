package RollTheDice;

public class RollTheDice {

/*  This program simulates rolling three (3) dice.
    The number that comes up on each die is output,
    followed by the total of the three dice.
*/	
	
	public static void main(String[] args) {
		int die1;   // The number on the first die.
        int die2;   // The number on the second die.
        int die3;   // The number on the third die.
        int roll;   // The total roll (sum of the three dice).
        
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        die3 = (int)(Math.random()*6) + 1;
        roll = die1 + die2 + die3;
        
        System.out.println("The first die comes up " + die1);
        System.out.println("The second die comes up " + die2);
        System.out.println("The third die comes up " + die3);
        System.out.println("Your total roll is " + roll);

    }  // end main()
 
}  // end class

