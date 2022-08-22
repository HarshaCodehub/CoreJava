package Heart;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int b[]= {100,200,300,400,500};
		a[0]=1000;
		a[1]=2000;
		a[2]=3000;
		a[3]=4000;
		a[4]=5000;
		for(int i=0;i<b.length;i++)
		{
			//System.out.println("multiples of "+b[i]);
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==b[i]*10)
					//System.out.println(" is " +a[j]);
					System.out.println("multiples of "+b[i]+" is " +a[j]);
			}
		}
	}

}
