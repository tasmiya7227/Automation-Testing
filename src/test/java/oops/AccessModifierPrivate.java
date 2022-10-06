package oops;

//Private Access modifiers
public class AccessModifierPrivate {
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
		AccessModifierPrivate d = new AccessModifierPrivate();
		d.name = "Automation Testing";
		System.out.println(d.getName());
	}

}


