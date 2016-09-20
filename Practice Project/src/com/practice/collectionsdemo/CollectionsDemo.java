package com.practice.collectionsdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class CollectionsDemo {
	
	public static void main(String argp[])
	{
		List l1=new ArrayList();
		l1.add("Shubham");
		l1.add("Jyoti");
		l1.add("Shourya");
		l1.add(1, "Mogembo");
		System.out.println(l1);
		
		
		List l2 = new LinkedList();
		l2.add("Shubham");
		l2.add("Jyoti");
		l2.add("Shourya");
		l2.add(6);
		l2.add("Jyoti");
		System.out.println(l2);
		
		
		
		
		Set s1 = new HashSet();
		s1.add("Shubham");
		s1.add("Jyoti");
		s1.add("Shourya");
		s1.add("Jyoti");
		s1.add(5);
		System.out.println(s1);
		
		
		Map m1 = new HashMap();
		m1.put("Shubham", 1);
		m1.put("Jyoti", 3);
		m1.put("shourya", 2);
		m1.put("Jyoti", 3);
		System.out.println(m1);
		
	}

}
