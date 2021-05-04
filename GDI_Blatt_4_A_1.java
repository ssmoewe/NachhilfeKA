package nachhilfe;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GDI_Blatt_4_A_1 {
	
	public static List<Integer> toList(boolean[] a) {
		List<Integer> ret = new LinkedList<>();
		for (int i = 0; i < a.length; i++) {
			if(a[i]) {
				ret.add(i);
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		boolean[] a = new boolean[] {true, true, false, true, false, false, true};
		List<Integer> b = toList(a);
		System.out.println(Arrays.toString(b.toArray()));
		for(Object elem : b.toArray()) {
			System.out.println(elem.toString());
		}

	}

}
