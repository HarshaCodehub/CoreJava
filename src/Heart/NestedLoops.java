package Heart;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int k=1;
		for(int i=0;i<4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
		}*/
		
		/*int k=1;
		for(int i=0;i<4;i++)
		{
			for(int j=4;j>=4-i;j--)//(int j=1;j<=i;j++);
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
		}*/
		
		/*int k=1;
		for(int i=0;i<5;i++)
		{
			//System.out.print(k);
			
			
			for(int j=1;j<=i;j++)//(int j=1;j<=i;j++);
			{
				System.out.print(j);
				System.out.print("\t");
				
				
			}
			System.out.println();
		}*/
		
		
		int k=3;
		for(int i=0;i<5;i++)
		{
			//System.out.print(k);
			
			
			for(int j=1;j<=i;j++)//(int j=1;j<=i;j++);
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
				k++;
				k++;
				
				
			}
			System.out.println();
		}
	}

}
