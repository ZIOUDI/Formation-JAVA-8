package Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.stream.Collectors;

public class D_ManipulationQueue {

	public static void main(String[] args) {


	 	 

		///////////////////////////////////////////////////////////////////////
		////////////// Creating a New Queue Instance      //////////////////
		///////////////////////////////////////////////////////////////////////
		
		System.out.println("------    Creating a New Queue Instance    -------------");
		List<String> listNames = Arrays.asList("Alice", "Bob", "Cole", "Dale", "Eric", "Frank");
		Queue<String> queueNames = new LinkedList<>(listNames);
		System.out.println(queueNames);
		
	 
		
		///////////////////////////////////////////////////////////////////////
		//////////////  2.Adding New Elements to the Queue  //////////////////
		//////////////////////////////////////////////////////////////////////

		System.out.println("------    Creating a New Queue Instance    -------------");
		Queue<String> queueNames21 = new LinkedList<>();
		queueNames21.add("Mary");
		queueNames21.add("John");
	     
	     
		Queue<Integer> queueNumbers22 = new ArrayBlockingQueue<>(3);
		queueNumbers22.add(1);
		queueNumbers22.add(2);
		queueNumbers22.add(3);
		//queueNumbers22.add(4); // this line throws exception : IllegalStateException: Queue full
	    

		Queue<Integer> queueNumbers = new ArrayBlockingQueue<>(3);
		 
		System.out.println(queueNumbers.offer(1)); // true
		System.out.println(queueNumbers.offer(2)); // true
		System.out.println(queueNumbers.offer(3)); // true
		System.out.println(queueNumbers.offer(4)); // false // we are safe when using the offer()
	
		
		Deque<String> queueNames24 = new ArrayDeque<>();
		 
		queueNames24.offer("Katherine");
		queueNames24.offer("Bob");
		 
		queueNames24.addFirst("Jim");
		queueNames24.addLast("Tom");
		 
		System.out.println(queueNames);
		
		
		BlockingQueue<Integer> queueNumbers25 = new ArrayBlockingQueue<>(100);
		 
		try {
		    queueNumbers25.put(2000);
		} catch (InterruptedException ie) {
		    ie.printStackTrace();
		}
	    
		///////////////////////////////////////////////////////////////////////
		//////////    3. Removing the Head of the Queue           ///////////////
		///////////////////////////////////////////////////////////////////////
		System.out.println("------     3. Removing the Head of the Queue    -------------");

		Queue<String> queueCustomers = new LinkedList<>();
		queueCustomers.offer("Jack");
		 
		String next = queueCustomers.remove();
		System.out.println("Next customer is: "+ next);
		 
		//next = queueCustomers.remove(); // throws exception : NoSuchElementException
         
		
		Queue<String> queueCustomers32 = new LinkedList<>();
		queueCustomers32.offer("Jack");
		 
		System.out.println("1.poll(): " + queueCustomers32.poll());
		System.out.println("2.poll(): " + queueCustomers32.poll());   // returns null
	     
        
		Deque<String> queueCustomers33 = new ArrayDeque<>();
		 
		queueCustomers33.offer("Bill");
		queueCustomers33.offer("Kim");
		queueCustomers33.offer("Lee");
		queueCustomers33.offer("Peter");
		queueCustomers33.offer("Sam");
		 
		System.out.println("Queue before: " + queueCustomers33);
		System.out.println("pollFirst(): " + queueCustomers33.pollFirst());
		System.out.println("pollLast(): " + queueCustomers33.pollLast());
		System.out.println("Queue after: " + queueCustomers33);
	    
		/*
		BlockingQueue<String> queueCustomers34 = new ArrayBlockingQueue<>(100);		 
		queueCustomers.offer("Kathe");		 
		try {
		    String nextCustomer = queueCustomers34.take();
		} catch (InterruptedException ie) {
		    ie.printStackTrace();
		} */
		
		///////////////////////////////////////////////////////////////////////
		////////////// 4. Examining the Head of the Queue   ///////////////
		///////////////////////////////////////////////////////////////////////
		
	    System.out.println("-------    element()  and  peek() --------------");

		Queue<String> queueCustomers41 = new PriorityQueue<>();
		 
		queueCustomers41.offer("Jack");
		 
		System.out.println("who's next: " + queueCustomers41.poll());
		 
		// this returns null in case the queue is empty
		System.out.println("who's next: " + queueCustomers41.peek());
		 
		// this throws exception in case the queue is empty
		System.out.println("who's next: " + queueCustomers41.element());
    
	    System.out.println("-------  getFirst() or peekFirst()  and getLast() or peekLast()   --------------");

		Deque<Integer> queueNumbers42 = new ArrayDeque<>();
		 
		queueNumbers42.add(10);
		queueNumbers42.add(20);
		queueNumbers42.add(30);
		queueNumbers42.add(40);
		 
		System.out.println("first: " + queueNumbers42.getFirst());
		System.out.println("last: " + queueNumbers42.peekLast());
	    
	     
		/////////////////////////////////////////////////////////////////////////////
		/////////////////  5. Iterating over Elements in the Queue    ///////////////
		/////////////////////////////////////////////////////////////////////////////
		
	    System.out.println("-------   forEach()  Queue - LinkedList --------------");

		Queue<String> queueNames51 = new LinkedList<>();
		 
		queueNames.add("Dale");
		queueNames.add("Bob");
		queueNames.add("Frank");
		queueNames.add("Alice");
		queueNames.add("Eric");
		queueNames.add("Cole");
		queueNames.add("John");
		 
		 
		for (String name : queueNames51) {
		    System.out.println(name);
		}		
		/*  == */
		queueNames.forEach(name -> System.out.println(name));
		
		
	    System.out.println("-------   forEach() Queue - PriorityQueue  --------------");
	    
	    Queue<String> queueNames52 = new PriorityQueue<>();
	    
	    queueNames52.add("Dale");
	    queueNames52.add("Bob");
	    queueNames52.add("Frank");
	    queueNames52.add("Alice");
	    queueNames52.add("Eric");
	    queueNames52.add("Cole");
	    queueNames52.add("John");
	     
	    queueNames52.forEach(name -> System.out.println(name));


	}
}
