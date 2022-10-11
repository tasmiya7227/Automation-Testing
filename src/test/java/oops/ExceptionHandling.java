package oops;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//exception handling using try cath finally
		try 
		{
		    int[] myNumbers = {1, 2, 3};
		    System.out.println(myNumbers[10]);
		} 
		catch (Exception e) 
		{
		      System.out.println("Something went wrong.");
		 } 
		finally 
		{
		      System.out.println("The 'try catch' is finished.");
		 }
	}

}
