package Heart;

public class Exceptions {
	//try catch mechanism
	//one try can be followed by multiple catch blocks, but interruption between them is not allowed
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=0;
		try//this try word handles exceptions to avoid errors to show up, tries the code and sends to catch if fails
		{
			int s=a/b;
		System.out.println(s);
		}
		catch(Exception e)//this catch word is used to move on though there is an error found, it helps to continue execution
		{
			//catch handles lot of exceptions, if we want to specifically handle particular exception then include that in syntax
			//for instance: catch(ArithmeticException a), now it only handles arithmetic errors
			//catch(IndexOutOfBoundsException e)
			System.out.println("Its an Arithmetic exception error");
		}
		try
		{
			int arr[]=new int[5];
			System.out.println(arr[7]);
		}
		catch(IndexOutOfBoundsException ioe)
		{
			System.out.println("adhi avvadhamma");
		}
		finally//irrespective of pass or fail it gets executes. unless if forcibly stop JVM by clicking terminate execution.
		{
			//this block is executed irrespective of exceptions/errors/successful execution of program
			//though there is an error in the program code, it just comes down to finally block and executes the statements in finally block
			System.out.println("delete cookies");
		}
	}

}
