package nachhilfe;

import java.util.Random;

public class GDI_Blatt_2_A_2 {
	
	

	public static int[] draw() {
		int[] result = new int[49];
		Random r = new Random();
		for(int i = 0; i < 100000; i++) {
			for(int j = 0; j < 6; j++) {
				int res = r.nextInt(49);
				result[res]++;
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		int j = 1;
		for(int i : draw()) {
			System.out.println(j++ + " : " + i);
		}
	}
	
}
