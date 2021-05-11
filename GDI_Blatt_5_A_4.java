package nachhilfe;

import java.util.HashSet;
import java.util.Set;

public class GDI_Blatt_5_A_4 {
	
	public static <T> Set<T> symmDiff(Set<T> A, Set<T> B) {
		Set<T> ret = new HashSet<>();
		Set<T> ret2 = new HashSet<>();
		ret.addAll(A);
		ret2.addAll(B);
		ret.removeAll(B);
		ret2.removeAll(A);
		ret.addAll(ret2);
		return ret;
	}

	public static void main(String[] args) {
		Set<Integer> ret1 = new HashSet<>();
		Set<Integer> ret2 = new HashSet<>();
		for(int i = 0; i < 20; i++) {
			ret1.add(i);
			ret2.add(i+10);
		}
		System.out.println(ret1.toString());
		System.out.println(ret2.toString());
		System.out.println(symmDiff(ret1, ret2).toString());
	}

}
