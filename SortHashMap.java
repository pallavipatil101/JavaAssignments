package assignment.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMap {
//Write a program to sort HashMap by value.
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1, "Elizabeth");
		map.put(2, "Jane");
		map.put(3, "Fanny");
		map.put(3, "Emma");
		map.put(4, "Anne");
		map.put(5, "Jo");
		map.put(6, "Caroline");
		
		System.out.println(">>Original Map:");
		
		for(int i=1; i<=map.size(); i++) 
		{
		System.out.println(map.get(i));
		}
		
		System.out.println("----------------------------------------------");
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();		
		List<Entry<Integer, String>> list = new ArrayList<>(entrySet);
		
		Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		
		System.out.println(">>Sorted Map:");
		
		for(int i=1; i<=map.size(); i++) 
		{
		System.out.println(map.get(i));
		}
	}

}
