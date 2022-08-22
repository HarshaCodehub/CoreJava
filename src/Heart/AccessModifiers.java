package Heart;

public class AccessModifiers {
//public,private,protected,default
//default-if we don't provide any public,private,protected or anything just starting with void main,then it is considered as default access modifier	
	void harsha()
	{
		//can be accessed anywhere in the current package only and when you try to import this package in another package then it won't be accessed
		System.out.println("I'm Default Access Modifier");
	}
//public- any variable/method if attached with public, can be accessed anywhere in the current/another package. import and use it in another package
	public void supriya()
	{
		System.out.println("I'm Public Access Modifier");
	}
//private-any variable/method if attached with private, can be accessed only inside the current class.
	private void mom()
	{
		System.out.println("I'm Private Access Modifier");
	}
//Protected-any variable/method if attached with protected, can be accessed only in subclass created in another 'package', only when inherited using extends keyword
	protected void dad()
	{
		//protected=default access modifier + subclass access in another package using extends 
		System.out.println("I'm Protected Access Modifier");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers am=new AccessModifiers();
		am.harsha();
		am.supriya();
		am.mom();
		am.dad();
	}
	
}