package com.practice.collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractive {
	
	public static void main(String args[])
	{
		LinkedList<Integer> intList = new LinkedList<Integer>();
		for(int i=0;i<5;i++)
		{
			intList.add(i);
		}
		
		if(intList.contains(4))
			System.out.println("found");
		intList.add(3, 50);
		System.out.println(intList.size());
		for(int j:intList)
		{
			System.out.println(j);
		}
		Iterator<Integer> iterator = intList.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			System.out.println(intList);
		}
	}

}
