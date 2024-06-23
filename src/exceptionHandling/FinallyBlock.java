package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) 
	{
		/*
		 * Finally block is used to keep special code
		 * Finally block not handled any exception
		 * To run special code,server stop,reports we use finally 
		 * Finally block always run with or without exception 
		 *
		 */
		
		try {
		System.out.println(9/3);
		System.out.println(9/0);
		}catch(Exception e)
		{
			System.out.println("Enter number other than 0");
		}		
		finally
		{
			System.out.println("Today is great day!");
		}
		

	}

}
