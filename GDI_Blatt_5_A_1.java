package nachhilfe;

import java.util.LinkedList;
import java.util.List;

public class GDI_Blatt_5_A_1 {
	
	public static List<Integer> toAlternatingList(int[] a) {
		List<Integer> even = new LinkedList<>();
		List<Integer> odd = new LinkedList<>();
		List<Integer> ret = new LinkedList<>();
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				even.add(a[i]);
			} else {
				odd.add(a[i]);
			}
		}
		if(odd.size() == 0 || even.size() == 0) {
			for (int i = 0; i < a.length; i++) {
				ret.add(a[i]);
			}
		} else {
			while(odd.size() != 0 && even.size() != 0) {
				ret.add(even.get(0));
				ret.add(odd.get(0));
				even.remove(0);
				odd.remove(0);
			}
			if(odd.size() != 0) {
				ret.addAll(odd);
			} else if(even.size() != 0) {
				ret.addAll(even);
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		int[] a = new int[] {2,4,6};
		int[] b = new int[] {1,2,3,6,4,6,8,7,4,2};
		int[] c = new int[] {1,3,3,7,4,6,8,7,4,2};
		
		System.out.println(toAlternatingList(a).toString());
		System.out.println(toAlternatingList(b).toString());
		System.out.println(toAlternatingList(c).toString());
	}

}
