package nachhilfe;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GDI_Blatt_6_A_1 {
	
	 private static final int N = 10;
	 private static List<Integer> toList(int[] h) {
	        List<Integer> ret = new ArrayList<>(h.length);
	        for (int e : h) {
	        	ret.add(e);
	        }
	        return ret;
	 	}
	
	public static BigInteger fiboRekursiv(int n, int[] h) {
		h[n]++;
		if(n == 1) {
			return BigInteger.valueOf(1);
		} else if(n == 2) {
			return BigInteger.valueOf(2);
		} else {
			return fiboRekursiv(n-1, h).add(fiboRekursiv(n-2, h));
		}
	}
	
	public static void main(String[] args){
		int[] h = new int[N + 1];
		System.out.println(fiboRekursiv(N, h));
		String[] label = new String[h.length];
		for (int i = 0; i < label.length; i++) {
			label[i] = "" + i;
		}
//		haeufigkeitAusgeben(label, h);
		System.out.println(Arrays.toString(h));
		for (int i = 0; i < h.length; i++) {
			System.out.println(i + ": " + h[i]);
		}
	}

}
