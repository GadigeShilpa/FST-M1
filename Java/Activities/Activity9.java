package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		//Create an array list
		List<String> myList = new ArrayList<>();
		//ArrayList<DataType> arrlist = new ArrayList();
		
		// Add 5 names to the list
		myList.add("Apple");
		myList.add("Mango");
		myList.add("Pinapple");
		myList.add(2,"Pappaya");
		myList.add(3, "WaterMelon");
		
		//Print all elements using a loop
		for(String name : myList) {
			System.out.println(name);
		}
		//Print the third element
		System.out.println(" The third element in the list is: "+myList.get(2));
		
		//Search for a specific name in the list
		System.out.println("Is tomato in the list?: "+myList.contains("Tomato"));
		System.out.println("Is WaterMelon in the list?: "+myList.contains("WaterMelon"));
		
		//Print the size of the list before remove
		System.out.println("No of elements in the list before remove:" +myList.size());
		
		//remove an element by index
		myList.remove(1);
		//remove an element by name
		
		myList.remove("Pappaya");
		
		//Print the size of the list after remove
		System.out.println("No of elements in the list after remove:" +myList.size());
	}
}
