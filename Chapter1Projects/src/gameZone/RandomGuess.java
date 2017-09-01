package gameZone;

import javax.swing.JOptionPane;

public class RandomGuess {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
JOptionPane.showMessageDialog(null, "think of a number between 1 & 10");		
		
JOptionPane.showMessageDialog(null, "the number is" + (1 + (int)(Math.random() * 10)));
	}

}
