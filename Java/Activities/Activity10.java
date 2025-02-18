package activities;

import java.util.HashSet;

public class Activity10 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		// Adding elements to HashSet
		hs.add("M");
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("M");
		hs.add("X");

		// Print HashSet
		System.out.println("Original HashSet is: " + hs);

		// print Size of Hashset

		System.out.println("Size of the HashSet is: " + hs.size());

		// Remove Element
		System.out.println("Removeing A from the HashSet: " + hs.remove("A"));

		// Remove element that is not present in the HashSet
		if (hs.remove("Y")) {
			System.out.println("Y is removed from the Hashset");

		} else {
			System.out.println("Y is not present in the HashSet");
		}
		// Search for element
		System.out.println("Checking if M is present:" + hs.contains("M"));
		// Print updateed HashSet
		System.out.println("Updated HashSet is:" + hs);
	}

}
