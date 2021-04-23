package nachhilfe;

import java.util.Arrays;
import java.util.Random;

public class GDI_Blatt_3_A_1 {

	public static int[][] split(int[] a) {
		if(a == null) {
			return new int[][] {new int[0], new int[0]};
		}
		int even = 0;
		int odd = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 1) {
				odd++;
			} else {
				even++;
			}
		}
		int[] odds = new int[odd];
		int[] evens = new int[even];
		int oddcount = 0;
		int evencount = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 1) {
				odds[oddcount] = a[i];
				oddcount++;
			} else {
				evens[evencount] = a[i];
				evencount++;
			}
		}
		return new int[][] {evens, odds};
	}
	
	public static void main(String[] args) {
		int[] a = new int[100];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt();
		}
		
		System.out.println(Arrays.toString(a));
		
		int[][] b = split(a);
		System.out.println(Arrays.toString(b[0]));
		System.out.println(Arrays.toString(b[1]));
		System.out.println(b[0].length + b[1].length);
	}
}
