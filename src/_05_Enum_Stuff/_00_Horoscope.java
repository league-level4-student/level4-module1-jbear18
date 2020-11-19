package _05_Enum_Stuff;

import javax.swing.JOptionPane;




public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	public static void zodiac(Zodiac z) {
	

		switch (z) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "You are correct to think that today is a great day to start a new project, but try to pace yourself.");
//			System.out.println(" You are correct to think that today is a great day to start a new project, but try to pace yourself.");
			break;
		case TAURUS:
			System.out.println(" Foreign influences can have a very positive impact on your life right now, so it's a great time to reach out and explore a different culture. ");
			break;
		case GEMINI:
			System.out.println("Try to take good care of your money with better budgeting and investing.");
			break;
		case CANCER:
			System.out.println("An opportunity you thought was no longer available to you could be still ripe for the picking. ");
			break;
		case LEO:
			System.out.println(" Creating your own happiness is easier when you're with people who are fun to be around. ");
			break;
		case VIRGO:
			System.out.println("Try to fit some culture into your day.");
			break;
		case LIBRA:
			System.out.println("Looking good is important, but if you focus too much on the aesthetic aspect of people, you'll lose sight of who they really are deep down inside. ");
			break;
		case SCORPIO:
			System.out.println("Things have been going so smoothly lately.");
			break;
		case SAGITTARIUS:
			System.out.println("When a friend asks you about your hopes and wishes, don't just give them the perfunctory answer you always give. ");
			break;
		case CAPRICORN:
			System.out.println(" Today is perfectly suited for doing some work on your career. ");
			break;
		case AQUARIUS:
			System.out.println("Your mood is great today, in part because you're feeling inspired by a recent win or success. ");
			break;
		case PISCES:
			System.out.println("Distract yourself from any financial worries. ");
			break;
		default:
			System.out.println("Something went wrong :(");

		}
	}
//	 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
//	    a different horoscope based on the Zodiac's state.
//	@Test
//	public void simpleEnumExampleOutsideClassTest(){
//Zodiac aqua = Zodiac.ARIES;
//	System.out.println("Days enum is set a value: "+aqua);
//	assertEquals(Zodiac.valueOf("\"You are correct to think that today is a great day to start a new project, but try to pace yourself.\""), aqua);
//	}

	public static void main(String[] args) {
	Zodiac aqua= Zodiac.ARIES;	
		if(Zodiac.ARIES==Zodiac.valueOf("You are correct to think that today is a great day to start a new project, but try to pace yourself.")) {
			JOptionPane.showMessageDialog(null, "true");
		}
		
//		Zodiac aries= Zodiac.ARIES;
//		if(aries==Zodiac.ARIES) {
//			JOptionPane.showMessageDialog(null, "You are correct to think that today is a great day to start a new project, but try to pace yourself.");
//		}
	}

	
//	 3. Make a main method to test your method
	
}

