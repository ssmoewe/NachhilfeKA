package nachhilfe;

import java.util.LinkedList;
import java.util.List;

public class GDI_Blatt_5_A_2 {
	
	public static List<Integer> findLeaders(int[] a) {
		List<Integer> ret = new LinkedList<>();
		int max = a[a.length - 1];
		for (int i = a.length - 2; i >= 0; i--) {
			if(a[i] > max) {
				ret.add(0, a[i]);
				max = a[i];
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		int[] a = new int[] {1, 7, 4, 5, 2};
		int[] b = new int[] {1, 32, 3, 4, 6, 2, 3, 12, 10 ,9, 2, 6, 3 };
		System.out.println(findLeaders(a).toString());
		System.out.println(findLeaders(b).toString());
	}

}
