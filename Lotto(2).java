package nachhilfe;

import java.util.Random;

public class Lotto {
	public static int[] my = {1, 2, 3, 4, 5, 6};

	public static int[] zieheKaestchen() {
		int [] ziehung = new int [6];
		Random rand = new Random();
		
		for(int i = 0; i < ziehung.length; i++) {
			ziehung[i] = rand.nextInt(49) + 1;		
		}
		return ziehung;
	}
	
	public static int[] zieheKaestchen1() {
		int [] ziehung = new int [6];
		Random rand = new Random();
		
		for(int i = 0; i < ziehung.length; i++) {
			int zahl = rand.nextInt(49) + 1;
			while(schonVorhanden(ziehung, zahl)) {
				zahl = rand.nextInt(49) + 1;
			}
			ziehung[i] = zahl;		
		}
		return ziehung;
	}
	
	public static boolean schonVorhanden(int[] ziehung, int tipp) {
		boolean out = false;
		for(int i = 0; i < ziehung.length; i++) {
			if(ziehung[i] == tipp) {
				out = true;
			}
		}
		return out;
	}
	
	public static void tippAusgabe(int[] ziehung) {
		for(int i = 0; i < ziehung.length - 1; i++) {
			System.out.print(ziehung[i] + " - ");
		}
		System.out.println(ziehung[ziehung.length - 1]);
	}
	
	public static int[][] zieheSchein() {
		int[][] schein = new int[12][6];
		for(int i = 0; i < schein.length; i++) {
			int[] ziehung = zieheKaestchen1();
			for(int j = 0; j < schein[i].length; j++) {
				schein[i][j] = ziehung[j];
			}
		}
		return schein;
	}
	
	public static void tippAusgabe(int[][] lottoschein) {
		for(int i = 0; i < lottoschein.length; i++) {
			tippAusgabe(lottoschein[i]);
		}
		System.out.println("-------------------------------");
	}
	
	public static int richtige(int[] ziehung, int[] tipp) {
		int anzahl = 0;
		for(int i = 0; i < ziehung.length; i++) {
			for(int j = 0; j < tipp.length; j++) {
				if(ziehung[i] == tipp[j]) {
					anzahl++;
					break;
				}
			}
		}
		return anzahl;
	}
	
	public static void simulator(int[] tipp) {
		int[] result = new int[7];
		int lastResult = -1;
		int[] control = new int[6];
		while( lastResult != 6) {
			control = zieheKaestchen1();
			lastResult = richtige(control, tipp);
			result[lastResult]++;
		}
		tippAusgabe(control);
		for(int i = 1; i < result.length; i++) {
			System.out.println(i + " Richtige: " + result[i]);
		}
		long out = 0;
		for(int i = 0; i < result.length; i++) {
			out += (long)result[i];
		}
		System.out.println("Teuer: " + (double)out * 1.25 + " €");
		
	}
	
	public static void main(String[] args) {
		
		simulator(my);

	}

}
