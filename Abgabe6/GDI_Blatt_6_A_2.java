package nachhilfe;

import java.util.HashSet;
import java.util.Set;

public class GDI_Blatt_6_A_2 {
	
	public static <T> double Jaccard_koeff(Set<T> A, Set<T> B) {
		Set<T> common = new HashSet<>(A);
		common.retainAll(B);
		Set<T> sum = new HashSet<>(A);
		sum.addAll(B);
		return (double)common.size() / (double)sum.size();
	}
	
	
	public static <T> double cosinus(Set<T> A, Set<T> B) {
		Set<T> common = new HashSet<>(A);
		common.retainAll(B);
		return common.size() / (Math.sqrt(A.size()) * Math.sqrt(B.size()));
	}

	public static void main(String[] args) {
		Set<Integer> ret1 = new HashSet<>();
		Set<Integer> ret2 = new HashSet<>();
		for(int i = 0; i < 20; i++) {
			ret1.add(i);
		}
		for(int i = 0; i < 10; i++) {
			ret2.add(i+14);
		}
		System.out.println(ret1.toString());
		System.out.println(ret2.toString());
		System.out.println(Jaccard_koeff(ret1, ret2));
		System.out.println(cosinus(ret1, ret2));


	}

}
