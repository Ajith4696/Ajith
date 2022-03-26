package org.sam;

import java.util.ArrayList;
import java.util.List;

public class Details {
public static void main(String[] args) {
	
	List<Integer>l=new ArrayList<>();
	
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	l.add(60);
	l.add(70);
	l.add(80);
	l.add(90);
	l.add(100);
	
	int j=l.size();
	System.out.println("list size= "+j);
	
	int k=l.lastIndexOf(10);
	System.out.println("Last Index(10)= "+k);
	
	System.out.println("\nLast 5 Value");
	
	for (int i = 4; i < l.size(); i++) {
		System.out.println(l.get(i));
		
	}
	System.out.println("First 5 Value");
	
	for (int i = 0; i < l.size(); i++) {
		
		if (i<5) {
			System.out.println(l.get(i));
		}
	}
	System.out.println(("For Loop"));
	for (int i = 0; i < l.size(); i++) {
		System.out.println(l.get(i));
		
	}
			
		System.out.println("For Each");	
			
		for (Integer integer:l) {
			System.out.println(integer);
		}
			
		System.out.println("Alternate Number");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
			
		}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
	}
	


