package oops;
interface  inter1
{
	void chocolate();
}
interface inter2 extends inter1
{
	void dairymilk();
	
}
public class Interface implements inter1, inter2
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface obj = new Interface();
		obj.chocolate();
		obj.dairymilk();
	}
	public void chocolate()
	{
		System.out.println("There are different varities of chocolate");
	}
	public void dairymilk()
	{
		System.out.println("Dairy milk is from cadbury's");
	}
}
