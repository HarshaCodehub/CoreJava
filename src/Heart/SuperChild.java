package Heart;

public class SuperChild extends SuperParent{
	
	String name= "Life";
	public SuperChild()
	{
		super();
		System.out.println("Child Constructor");
	}
	public void learning()
	{
		super.learning();//super keyword is used to extract data under similar method in parent class or desired extended class
		System.out.println(name);
		System.out.println(super.name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChild sc=new SuperChild();
		sc.learning();
	}

}
