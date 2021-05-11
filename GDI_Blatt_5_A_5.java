package nachhilfe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class GDI_Blatt_5_A_5 {
	
	public static Map<Integer, String> slice(Map<Integer, String> m, int min, int max) {
		Map<Integer, String> ret = new HashMap<>();
		Iterator<Entry<Integer, String>> it = m.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer, String> elem = it.next();
			if(elem.getKey() >= min && elem.getKey() <= max) {
				ret.put(elem.getKey(), elem.getValue());
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		Map<Integer, String> ret = new HashMap<>();
		for(int i = 0; i < 100; i++) {
			ret.put(i, i + "");
		}
		System.out.println(slice(ret, 30, 70).toString());
		System.out.println(slice(ret, 30, 70).size());

	}

}
