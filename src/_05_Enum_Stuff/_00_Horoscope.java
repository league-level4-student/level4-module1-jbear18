package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.
	public static void zodiac(Zodiac z) {

//		 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
//	    a different horoscope based on the Zodiac's state.

		switch (z) {
		case ARIES:
			JOptionPane.showMessageDialog(null,"You are correct to think that today is a great day to start a new project, but try to pace yourself.");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null," Foreign influences can have a very positive impact on your life right now, so it's a great time to reach out and explore a different culture. ");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null,"Try to take good care of your money with better budgeting and investing.");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null,"An opportunity you thought was no longer available to you could be still ripe for the picking. ");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null," Creating your own happiness is easier when you're with people who are fun to be around. ");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null,"Try to fit some culture into your day.");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null,"Looking good is important, but if you focus too much on the aesthetic aspect of people, you'll lose sight of who they really are deep down inside. ");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null,"Things have been going so smoothly lately.");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null,"When a friend asks you about your hopes and wishes, don't just give them the perfunctory answer you always give. ");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null," Today is perfectly suited for doing some work on your career. ");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null,"Your mood is great today, in part because you're feeling inspired by a recent win or success. ");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null,"Distract yourself from any financial worries. ");
			break;
		default:
			JOptionPane.showMessageDialog(null,"Something went wrong :(");

		}
	}
//	 3. Make a main method to test your method

	public static void main(String[] args) {
zodiac(Zodiac.ARIES);
	}

}
