package oops;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrList=new ArrayList<>();

	    //adding few elements
	    arrList.add("Cricket"); 
	    arrList.add("Hockey");
	    
	    //inserting element at first position, index 0
	    arrList.add(0, "BasketBall"); //list: ["BasketBall", "Cricket", "Hockey"]


	    System.out.println("ArrayList Elements: ");
	    //Traversing ArrayList using enhanced for loop
	    for(String str:arrList)
	     System.out.println(str);
	}

}
