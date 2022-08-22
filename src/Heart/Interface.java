package Heart;

public class Interface implements InterfaceExample,AnotherInterface {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		InterfaceExample i = new Interface();
		i.green();
		i.red();
		i.yellow();
		Interface a= new Interface();
		AnotherInterface b=new Interface();
		//a.wait();
		b.another();
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("green implementation");
	}
	
	public void walk()
	{
		System.out.println("now walk");
	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("red implementation");
	}

	@Override
	public void yellow() {
		// TODO Auto-generated method stub
		System.out.println("yellow implementation");
	}

	@Override
	public void another() {
		// TODO Auto-generated method stub
		System.out.println("I'm next");
	}

}
