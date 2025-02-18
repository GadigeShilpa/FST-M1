package activities;

import java.util.HashMap;

public class Activity11 {
	
	public static void main(String[] args) {
		HashMap<Integer , String> hashMap = new HashMap<>();
		hashMap.put(1 , "Red");
		hashMap.put(2 , "Green");
		hashMap.put(3 , "Blue");		
		hashMap.put(4 , "White");
		hashMap.put(5 , "Black");
		hashMap.put(4 , "Brown");
		
		//Print the map
		System.out.println("The original map:" +hashMap);
		
		//Remove one colour
		hashMap.remove(4);
		
		//Map after removing a colour
		System.out.println("After removeing Brown which relaced White: " +hashMap);
		
	}

}
