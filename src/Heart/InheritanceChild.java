package Heart;

public class InheritanceChild extends InheritanceParent {
	
	public void engine()
	{
		System.out.println("modern engine");
	}
	public void colour()
	{
		System.out.println(color);
	}
	public void audioSystem()//function overiding - same name,method,parameters
	{
		System.out.println("new audio system");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceChild i=new InheritanceChild();
		i.audioSystem();
		i.colour();
		i.engine();
		
	}

}
