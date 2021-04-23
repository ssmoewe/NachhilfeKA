package nachhilfe;

import java.util.Arrays;

public class GDI_Blatt_3_A_3 {

	public static void fillWithZeros(int[][] a, int i0, int j0) {
		boolean isZero = (a[i0][j0] == 0);
		if(isZero) {
			for (int i = 0; i < a[i0].length; i++) {
				a[i0][i] = 0;
			}
			for (int i = 0; i < a.length; i++) {
				a[i][j0] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] a = new int[][] {{1,2,3,4},{5,6,7,8},{9,0,4,4},{3,4,5,1}};
		fillWithZeros(a, 2, 1);
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
}
