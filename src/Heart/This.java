package Heart;

public class This {
	
	int h=5;
	public void local()
	{
		int h=10;
		int a=h+this.h;
		System.out.println(h);
		System.out.println(this.h);//this keyword helps to get data from global level to local method
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This t=new This();
		t.local();
	}

}
