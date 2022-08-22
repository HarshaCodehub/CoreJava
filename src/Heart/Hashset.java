package Heart;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashset,Treeset,LinkedHashset- implements set interface
		//does'nt accept duplicate values, and the elements are stored in random order
		HashSet<String> hs=new HashSet<String>();
		hs.add("India");
		hs.add("USA");
		hs.add("UK");
		hs.add("UK");
		hs.add("Lion");
		hs.add("Tiger");
		System.out.println(hs);
		//System.out.println(hs.remove("USA"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		Iterator<String>i=hs.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
		
	}

}
