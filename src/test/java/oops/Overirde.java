package oops;

//Superclass
class Bank{
	public void displayinfo()
	{
		
		System.out.println("Bank has different departments");
	}
}
//subclass
class Deposit extends Bank
{
	//@Override
	public void displayinfo()
	{
		
		System.out.println("Customer able to deposit the money");
	}
}
// subclass of deposit class
class Withdraw extends Deposit
{
	//@Override
	public void displayinfo()
	{
		
		System.out.println("Customer able to withdraw money");
	}
}

public class Overirde {
//main class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Withdraw obj = new Withdraw();
		obj.displayinfo();
	}

}
