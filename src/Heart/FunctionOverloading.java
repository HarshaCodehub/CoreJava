package Heart;

public class FunctionOverloading {
	public void load(int l)
	{
		System.out.println(l);
	}
	public void load(String l)
	{
		System.out.println(l);
	}
	public void load(float l)
	{
		System.out.println(l);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverloading fl=new FunctionOverloading();
		fl.load(100);
		fl.load("Loaded");
		fl.load(90 +" utilized");
	}

}
