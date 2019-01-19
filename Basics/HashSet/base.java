/*
	@Author - Sachin Kr. Shukla
	@Date - 19 Jan, 2019
	About - Implimenting HashSet
*/

import java.util.*;
public class base{

	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String>();
		name.add("A");
		name.add("B");
		name.add("C");
		name.add("D");

		Iterator<String> itr = name.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}