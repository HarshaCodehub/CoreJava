package Heart;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(0, "Hyderabad");
		hm.put(1, "Vijayawada");
		hm.put(2, "Tirupati");
		hm.put(3, "palamaner");
		System.out.println(hm.get(0));
		System.out.println(hm.get(4));
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			//System.out.println(i.next());
			Map.Entry mp=(Map.Entry)i.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}

}
