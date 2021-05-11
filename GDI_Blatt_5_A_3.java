package nachhilfe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class GDI_Blatt_5_A_3 {
	
	public static Map<String,String> komposition(Map<String,String> a, Map<String, String> b) {
		Map<String,String> ret = new HashMap<>();
		Iterator<Entry<String, String>> itA = a.entrySet().iterator();
		while(itA.hasNext()) {
			Entry<String, String> elemA = itA.next();
			Iterator<Entry<String, String>> itB = b.entrySet().iterator();
			while(itB.hasNext()) {
				Entry<String, String> elemB = itB.next();
				if(elemA.getValue().equals(elemB.getKey())) {
					ret.put(elemA.getKey(), elemB.getValue());
				}
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		String alp = "abcdefghijklmnopqrstuvwxyz";
		Map<String,String> a = new HashMap<>();
		Map<String,String> b = new HashMap<>();
		for(int i = 0; i < 12; i++) {
			a.put(alp.charAt(i) + "", alp.charAt(i+5) + "");
			b.put(alp.charAt(i+3) + "", alp.charAt(i+9) + "");
		}
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(komposition(a,b).toString());
	}

}
