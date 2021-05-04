package nachhilfe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GDI_Blatt_4_A_3 {
	
	public static Comparator<Integer> descending = (s1, s2) -> { return s1 < s2 ? 1 : -1; };
	public static Comparator<Integer> ascending = (s1, s2) -> { return s1 > s2 ? 1 : -1; };
	public static Comparator<Integer> comp3 = (s1, s2) -> { return s1 % 2 == 0 ? (s2 % 2 == 0 ? (s1 > s2 ? 1 : -1) : -1) : (s2 % 2 == 1 ? (s1 > s2 ? 1 : -1) : 1); };

	
	public static void main(String[] args) {
	    List<Integer> a = new LinkedList<>();
		try {
		    System.out.println("enter file path");
		    Scanner readFilePath = new Scanner(System.in);
		    String path = readFilePath.next();
		    readFilePath.close();
		    path = "C:\\Users\\Luenz\\file.txt";
			File myObj = new File(path);
			Scanner in = new Scanner(myObj);		      
			while (in.hasNextLine()) {
				int b = in.nextInt();
				if(!a.contains(b)) {
					a.add(b);
				}
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		
		Collections.sort(a, ascending);
		System.out.println(Arrays.toString(a.toArray()));
		Collections.sort(a, descending);
		System.out.println(Arrays.toString(a.toArray()));
		Collections.sort(a, comp3);
		System.out.println(Arrays.toString(a.toArray()));
	}

}