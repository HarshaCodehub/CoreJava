package Heart;

import java.util.ArrayList;

public class Arraylist {
//ArrayList,LinkedList,Vector- Implementing List Interface
//Array have fixed size where as ArrayList can grow dynamically
//You can access and insert any value in any index
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("Harsha");
		a.add("Java");
		System.out.println(a);
		a.add(0, "Miriyala");
		System.out.println(a);
		//a.remove(1);
		//System.out.println(a);
		//a.removeAll(a);
		//System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.contains("Harsha"));
		System.out.println(a.indexOf("Harsha"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}

}
