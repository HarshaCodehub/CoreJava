package Heart;

public class Constructor {

		public Constructor()
		{
			System.out.println("I am constructor");//automatically executes
		}
		public void building()
		{
			System.out.println("I need constructor");//need to manually execute method
		}
		public Constructor(String s)
		{
			System.out.println("I am a striing parameterized constructor");
		}
		public Constructor(int a, int b)
		{
			int c=a+b;
			System.out.println("I am a integer parameterized constructor sum=  "+ c);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor con=new Constructor();
		Constructor c=new Constructor("sum");//need parameters to execute
		Constructor co=new Constructor(5,5);//need parameters to execute
		con.building();//need manual execution
	}

}
