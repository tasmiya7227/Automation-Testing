package oops;

//Electonics class
	class Electronics
	{  
		void deviceType()
		{
			System.out.println("Device Type: Electronics");
		}  
	}  
//grinder inherits electronics class
	class Grinder extends Electronics
	{  
		void category()
		{
			System.out.println("Category: Grinder");
		}  
	} 
	
//Wetgrinder class inherits grinder class
	class WetGrinder extends Grinder
	{  
		void grinding_tech()
		{
			System.out.println("Grinding Technology - WetGrinder");
		}  
	}  
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WetGrinder d= new WetGrinder();
		d.deviceType();
		d.category();
		d.grinding_tech();
	}

}
