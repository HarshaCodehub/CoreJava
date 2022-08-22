package Heart;

public class ChildAirlines extends ParentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAirlines air= new ChildAirlines();
		air.engine();
		air.safetyGuidelines();
		air.bodyColor();
		//ParentAirCraft p = new ParentAirCraft();//we can't do it, this is called abstraction
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("yellow");
	}

}
