package com.string;

public class Stringtest {
	public static void main(String args[])
	{
		String k = "hello";
		String s = "hello";
	
		String j = new String("hello");
		
		if(s==k)
		{
			System.out.println(true + j);
		}
		else
		{
			System.out.println(false + k);
		}
		
		if(j.equals(k))
		{
			System.out.println(true + j);
		}
		else
		{
			System.out.println(false + k);
		}
	
	
	}
	

}
