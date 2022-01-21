package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> fruits=new LinkedList<>();

		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Strawberry");
		fruits.add("blueberry");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Pear");
		System.out.println("peek first element: "+fruits.peek());
        System.out.println("print first element: "+fruits.element());

		System.out.println("remove an element "+fruits.remove("Mango"));
		fruits.poll();
		System.out.println("after first poll :"+fruits);
		System.out.println("check if Queue contains Apple: "+fruits.contains("Apple"));
		System.out.println("using for loop: ");
		fruits.poll();
		for (String fruit:fruits){
			System.out.println(fruit);
		}
		System.out.println("Using Iterator:");
		Iterator<String> it=fruits.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}


	}

}
