package nachhilfe;

import java.util.Arrays;

public class GDI_Blatt_3_A_2 {

	public static int[] toArrayInSpiralOrder(int[][] a ) {
		int[] out = new int[a.length * a.length];
		for (int i = 0; i < a.length * a.length; i++) {
			out[i] = a[i / a.length][i % a.length];
		}
		return out;
	}
	
	public static void main(String[] args) {
		int[][] a = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println(Arrays.toString(toArrayInSpiralOrder(a)));
	}
}
