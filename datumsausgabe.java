package nachhilfe;



public class datumsausgabe {
	private static String[] monthsUS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	private static String[] monthsDE = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};


	public static void datumsausgabe(int day, int month, int year, Datumsformat format, boolean length) {
		if(format == Datumsformat.US) {
			if(length) {
				System.out.println(monthsUS[month - 1] + " " + day + ", " + year);
			} else {
				System.out.println(month + ". " + day  + ". " + year);
			}
		} else {
			if(length) {
				System.out.println(day + ". " + monthsDE[month - 1] + " " + year);
			} else {
				System.out.println(month + ". " + day  + ". " + year);
			}
		}
	}

}

