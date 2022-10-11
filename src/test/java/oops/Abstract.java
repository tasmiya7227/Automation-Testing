package oops;

//creating abstract class
	abstract class Abc
	{
		//abstract method
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
	//Definition of abstract method bird
	void Birds() {
		System.out.println("There are n number of Birds");
	}

}


