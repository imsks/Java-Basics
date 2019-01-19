/*
	@Author - Sachin Kr. Shukla
	@Date - 19 Jan, 2019
	About - Implimenting ArrayList + ListIterator
*/

import java.util.*;
public class base{


	public static void main(String[] args) {
		/*
		int anArray[] = new int[5]; // For numbers like {1, 2, 3, 4, 5}
		ArrayList<Integer> myList = new ArrayList<Integer>(5);
		// Adding numbers to ArrayList
		myList.add(1);
		myList.add(6);
		myList.add(7);
		*/
		//System.out.println(myList);

		// Print using for loop
		/*
		for(Integer x : myList){
			System.out.println(x);
		}
		System.out.println("Size " + myList.size());
		*/

		// Removing values
		/*
		myList.remove(2);
		System.out.println(myList);
		System.out.println("Size " + myList.size());
		*/

		// Changing values in ArrayList
		/*
		myList.set(0, 12);
		System.out.println(myList);
		*/


		// --------------- List Iterators
		ArrayList<String> names = new ArrayList<String>();
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("D");
		names.add("E");

		ListIterator<String> itr = names.listIterator();
		// Using While loop
		/*
		// Next
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("");
		System.out.println("");
		// Previous
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
		*/

	}
}