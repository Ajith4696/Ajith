package org.sam;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ajith {
	public static void main(String[] args) {
		List<Integer>l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		System.out.println(l);
		
		Set<Integer> s =new TreeSet<>();
		s.addAll(l);
		System.out.println("\n"+s);
		
	}
}
	


	
