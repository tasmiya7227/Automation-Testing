package oops;

public class PublicAccessModifier {
    // public variable
    public int legCount;

    // public method
    public void display() {
        System.out.println("Cat is an animal.");
        System.out.println("Cat have " + legCount + " legs.");
    }





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// accessing the public class
		PublicAccessModifier obj = new PublicAccessModifier();

        // accessing the public variable
        obj.legCount = 4;
        // accessing the public method
        obj.display();
		
		
	}
}
