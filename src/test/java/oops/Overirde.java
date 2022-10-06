package oops;

//Superclass
class Animal{
	public void displayinfo()
	{
		System.out.println("This is an Animal");
	}
}
//subclass
class Dog extends Animal
{
	//@Override
	public void displayinfo()
	{
		System.out.println("There is a dog");
	}
}


public class Overirde {
//main class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj = new Dog();
		obj.displayinfo();
	}

}
