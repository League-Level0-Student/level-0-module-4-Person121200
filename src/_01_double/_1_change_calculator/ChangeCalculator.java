package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String l = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int lAsint = Integer.parseInt(l);
		// Ask the user how many dimes they have, and convert their answer
		String a = JOptionPane.showInputDialog("How many dimes do you have?");
		int aAsint = Integer.parseInt(a);
		// Ask the user how many quarters they have, and convert their answer
		String s = JOptionPane.showInputDialog("How many quarters do you have?");
		int sAsint = Integer.parseInt(s);
		// Calculate how much money the user has.  Hint: Use a double variable 
		int nickels = lAsint*5;
		int dimes = aAsint*10;
		int quarters = sAsint*25;
		int total = nickels+dimes+quarters;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		int conversion = total / 100;
		JOptionPane.showMessageDialog(null, "$"+conversion);
		
	}
}

