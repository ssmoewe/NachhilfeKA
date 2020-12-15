package nachhilfe;

import java.util.Random;

public class Lotto {

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
			ziehung[i] = rand.nextInt(49) + 1;		
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
	
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			tippAusgabe(zieheSchein());
		}

	}

}
