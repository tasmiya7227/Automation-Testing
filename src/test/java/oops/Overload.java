package oops;

public class Overload {
	//using one int parameter
	 void display(int a){
        System.out.println("Arguments: " + a);
    }

	 //using int two parameters
    void display1(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }

       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Default main");
		Overload obj= new Overload();
		
		obj.display(1);
        obj.display1(1, 4);
	}

}
