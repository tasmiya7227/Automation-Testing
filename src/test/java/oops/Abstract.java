package oops;

	abstract class Abc
	{
		abstract void Birds();
		void Peacock() 
		{
			System.out.println("Peacock can dance");
		}
	}
public class Abstract extends Abc{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract obj = new Abstract();
		obj.Birds();
		obj.Peacock();
	}
	void Birds() {
		System.out.println("There are n number of Birds");
	}

}


