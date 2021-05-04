package nachhilfe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GDI_Blatt_4_A_3 {
		
	public static List<Integer> sortAscending(List<Integer> a) {
		List<Integer> copy = new LinkedList<>(a);
		List<Integer> out = new LinkedList<>();
		while(!copy.isEmpty()) {
			int min = Integer.MAX_VALUE;
			int pos = -1;
			for(int i = 0; i < copy.size(); i++) {
				if(copy.get(i) < min) {
					min = copy.get(i);
					pos = i;
				}
			}
			out.add(min);
			copy.remove(pos);
		}

		return out;
	}
	
	public static List<Integer> sortDescending(List<Integer> a) {
		List<Integer> copy = new LinkedList<>(a);
		List<Integer> out = new LinkedList<>();
		while(!copy.isEmpty()) {
			int max = Integer.MIN_VALUE;
			int pos = -1;
			for(int i = 0; i < copy.size(); i++) {
				if(copy.get(i) > max) {
					max = copy.get(i);
					pos = i;
				}
			}
			out.add(max);
			copy.remove(pos);
		}

		return out;
	}
	
	public static void main(String[] args) {
	    List<Integer> a = new LinkedList<>();
		try {
		    System.out.println("enter file path");
		    Scanner readFilePath = new Scanner(System.in);
		    String path = readFilePath.next();
		    readFilePath.close();
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
		
		System.out.println(Arrays.toString(sortAscending(a).toArray()));
		System.out.println(Arrays.toString(sortDescending(a).toArray()));
	}

}
