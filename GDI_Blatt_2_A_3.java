package nachhilfe;

import java.util.Random;

public class GDI_Blatt_2_A_3 {
	
	public static char[] chars = {'a', 'b', 'c', 'd'};

	
	public static char[] create() {
		char[] result = new char[10];
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			int res = r.nextInt(4);
			result[i] = chars[res];

		}
		return result;
	}
	
	public static boolean isPalindrome(char[] in) {
		for(int i = 0; i < in.length / 2; i++) {
			if(in[i] != in[in.length - i - 1]) {
				return false;
			}
		}
		return true;
	}
	
	public static int complete() {
		int ret = 0;
		for(int i = 0; i < 10000; i++) {
			char[] a = create();
			if(isPalindrome(a)) {
				ret++;
			}
		}
		return ret;
	}
	
	public static void main(String args[]) {
		System.out.println(complete());
	}
}
