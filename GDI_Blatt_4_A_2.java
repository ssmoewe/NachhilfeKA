package nachhilfe;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GDI_Blatt_4_A_2 {
	
	public static String winner(int n, int m) {
		Random r = new Random();
		List<String> a = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			a.add("Nr-" + i);
		}
		while(a.size() != 1) {
			int rand = r.nextInt(m);
			a.remove(rand % a.size());
		}
		return a.get(0);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("erste zahl");
		int n = in.nextInt();
		System.out.println("zweite zahl");
		int m = in.nextInt();

		String s = winner(n, m);
		System.out.println(s);
		in.close();
	}

}
