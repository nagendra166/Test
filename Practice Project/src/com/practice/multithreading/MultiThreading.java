package com.practice.multithreading;

public class MultiThreading extends Thread{

		   private Thread t;
		   private String threadName;
		   
		   MultiThreading( String name){
		       threadName = name;
		       System.out.println("Creating " +  threadName );
		   }
		   public void run() {
		      System.out.println("Running " +  threadName );
		      try {
		         for(int i = 20; i > 0; i--) {
		            System.out.println("Thread: " + threadName + ", " + i);
		            // Let the thread sleep for a while.
		            Thread.sleep(10);
		            if(t.getName().equals("Thread-2"));
		            {
		            	t.interrupt();
		            	
		            }
		         }
		     } catch (InterruptedException e) {
		         System.out.println("Thread " +  threadName + " interrupted.");
		     }
		     System.out.println("Thread " +  threadName + " exiting.");
		   }
		   
		   public void start ()
		   {
		      System.out.println("Starting " +  threadName );
		      if (t == null)
		      {
		         t = new Thread (this, threadName);
		         t.start ();
		      }
		   }

		}

		

