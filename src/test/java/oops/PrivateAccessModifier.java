package oops;

//Private Access modifiers
public class PrivateAccessModifier {
	private String name;

    // getter method
    public String getName() 
    {
        return this.name;
    }
    
    // setter method
    public void setName(String name) 
    {
        this.name= name;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateAccessModifier d = new PrivateAccessModifier();
		d.name = "Automation Testing";
		System.out.println(d.getName());
	}

}


