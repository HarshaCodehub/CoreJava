package Heart;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][3];
		a[0][0]=100;
		a[0][1]=200;
		a[0][2]=300;
		a[1][0]=400;
		a[1][1]=500;
		a[1][2]=600;
		int b[][]= {{1500,1600,1700},{1200,1300,1400},{1,0,5}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(b[i][j]==0)//for maximum number
					{
					int h=0;
					while(h<3)
					 {
						if(b[h][j]>1300)//for minimum number in selected coloumn 
							System.out.println(b[h][j]);
						break;
					 }
					}
				//System.out.print(b[i][j]);
				//System.out.print("\t");
			}
			System.out.println();
		}
		
	}

}
