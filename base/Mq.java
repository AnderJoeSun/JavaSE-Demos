		
import java.util.*;
class Mq{
	static LinkedList ll=new LinkedList();
	static void add(java.lang.Object o){
		ll.addLast(o);
	}
	static java.lang.Object pop(){
		return ll.removeFirst();
	}
	static java.lang.Object peek(){
		return ll.getFirst();
	}
	static boolean emp(){
		return ll.isEmpty();
	}
	
	public static void main(String arg[]){
		add("one");
		add("two");
		add("three");
		add("four");
		System.out.println("Pop:"+pop());
		System.out.println("Pop:"+peek());
		System.out.println("Pop:"+pop());
		System.out.println("Pop:"+peek());
		System.out.println("Pop:"+pop());
		System.out.println("Pop:"+peek());
		System.out.println("Pop:"+pop());
		System.out.println(emp());
		
	}
}
	