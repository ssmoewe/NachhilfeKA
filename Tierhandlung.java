package nachhilfe;

public class Tierhandlung {
	
	public static double value(int s, int h, int m) {
		return (double)s * 15 + (double)h  * 2 + (double)m * 0.5;
	}
	
	public static int[] bruteForce(int amount, double price) {
		int[] out = new int[3];
		for(int s = 1; s < amount; s++) {
			for(int h = 1; h < amount; h++ ) {
				if(s + h > amount) {
					break;
				}
				for(int m = 1; m < amount; m++) {
					if(s+h+m > amount) {
						break;
					}
					if(value(s, h, m) == price && amount == s+h+m) {
						out[0] = s; out[1] = h; out[2] = m;
					}
				}
			}
		}
		return out;
	}

	public static void main(String[] args) {
		// Hier Anzahl an benötigten Tieren und verfügbares Geld eingeben.
		int[] test = bruteForce(100, 100.0);
		for(int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
		System.out.println("€ spent: " + value(test[0], test[1], test[2]));
		System.out.println("# bought: " + (test[0] + test[1] + test[2]));
	}

}
