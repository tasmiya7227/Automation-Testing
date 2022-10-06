package oops;


class Stream {
    // protected method
    protected void display() 
    {
        System.out.println("I am in Automation Testing Stream");
    }
}
public class ProtectedAccessModifier extends Stream{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an object of Dog class
		ProtectedAccessModifier obj = new ProtectedAccessModifier();
         // access protected method
        obj.display();
	}

}
//We cannot declare classes or interfaces protected in Java.