package Heart;

public class StaticAndVariables {
	String name;// Instance variables
	String address;
	static String city="Hyderabad";//Class variables , static variables are independent to objects, they are class level dependent
	static int i=1;//or can use below for better optimization of code
	/*static {
		city="Hyderabad";
		i=1;
	}*/
	StaticAndVariables(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	public void getAddress()
	{
		System.out.println(name+" "+address+" "+city);
	}
	public static void getCity()
	{
		System.out.println(city);//static methods will only accept static variables, it means object creation is not required to call variables.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticAndVariables sav = new StaticAndVariables("Harsha","Manikonda");
		StaticAndVariables sav1 = new StaticAndVariables("Venkat","Neknampur");
		sav.getAddress();
		sav1.getAddress();
		StaticAndVariables.getCity();//for static, object creation is not required to call variables/methods, simply we can call by class name.
		StaticAndVariables.city="Vijaywada";
		sav.address="tadepally";
	}

}
