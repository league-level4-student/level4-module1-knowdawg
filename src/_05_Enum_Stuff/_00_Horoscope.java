package _05_Enum_Stuff;

import java.util.Random;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	public static void pickHoroscope() {
		Random picker = new Random();
		int state = picker.nextInt(12);
		
		switch(state){
		case 0:
			JOptionPane.showMessageDialog(null, Zodiac.ARIES);
			break;
		case 1: 
			JOptionPane.showMessageDialog(null, Zodiac.TAURUS);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, Zodiac.GEMINI);
			break;
		case 3:
			JOptionPane.showMessageDialog(null, Zodiac.CANCER);
			break;
		case 4: 
			JOptionPane.showMessageDialog(null, Zodiac.LEO);
			break;
		case 5:
			JOptionPane.showMessageDialog(null, Zodiac.VIRGO);
			break;
		case 6:
			JOptionPane.showMessageDialog(null, Zodiac.LIBRA);
			break;
		case 7:
			JOptionPane.showMessageDialog(null, Zodiac.SCORPIO);
			break;
		case 8:
			JOptionPane.showMessageDialog(null, Zodiac.SAGITTARIUS);
			break;
		case 9:
			JOptionPane.showMessageDialog(null, Zodiac.CAPRICORN);
			break;
		case 10:
			JOptionPane.showMessageDialog(null, Zodiac.AQUARIUS);
			break;
		case 11:
			JOptionPane.showMessageDialog(null, Zodiac.PISCES);
			break;
			
		}
		
		
	}
		

	// 3. Make a main method to test your method
	public static void main(String[] args) {
		pickHoroscope();
	}
	
	
}
