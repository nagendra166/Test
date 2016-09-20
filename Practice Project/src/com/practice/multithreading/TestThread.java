package com.practice.multithreading;


	public class TestThread {
		   public static void main(String args[]) {
		   
		      MultiThreading T1 = new MultiThreading( "Thread-1");
		      T1.start();
		      
		      MultiThreading T2 = new MultiThreading( "Thread-2");
		      T2.start();
		   }   
		}

