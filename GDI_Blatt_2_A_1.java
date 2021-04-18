package nachhilfe;

import util.ReadUtil;

public class GDI_Blatt_2_A_1 {
	
	public static void BmiInchPound() {
		double inch = ReadUtil.nextDouble("Height in inches  = ");
		double pound = ReadUtil.nextDouble("Weight in pounds  = ");
		double out =  (pound / (inch * inch)) * 703;
		System.out.printf("%.2f Height (inches), %.2f Weight (pounds) calculates to a BMI of %.2f\n", inch, pound, out );
	}
	
	public static void BmiMetresKg() {
		double metres = ReadUtil.nextDouble("Height in metres  = ");
		double kg = ReadUtil.nextDouble("Weight in kg  = ");
		double out =  (kg / (metres * metres));
		System.out.printf("%.2f Height (metres), %.2f Weight (Kg) calculates to a BMI of %.2f\n", metres, kg, out );
	}

	public static void main(String[] args) {
		int auswahl = menuAuswahl();
		switch (auswahl) {
			case 1: BmiInchPound();
			break;
			case 2: BmiMetresKg();
			break;
			default:
				System.exit(0); // Das Programm wird hiermit terminiert! 0 wird weitergegeben an das OS
		}
	}

	private static int menuAuswahl() {
		System.out.println("============================");
		System.out.println("1) BMI via Inch and Pound");
		System.out.println("2) BMI via Metres and Kg");
		System.out.println("3) Cancel");
		System.out.println("============================");
		int auswahl = ReadUtil.nextInt("Please choose", 1, 3);
		return auswahl;
	}
	
}
