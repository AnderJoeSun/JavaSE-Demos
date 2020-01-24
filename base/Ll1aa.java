import java.util.*;
class Ll1aa{
	static LinkedList ll=new LinkedList();
	public static void add(java.lang.Object o){
		ll.add(o);
	}
	public static java.lang.Object pop(){
		return ll.removeFirst();
  }
	public static java.lang.Object peek(){
		return ll.getFirst();
	}
	public static boolean emp(){
   	return ll.isEmpty();
	}
	public static void main(String arg[]){
		add("one");
		add("two");
		add("three");
		add("four");
		System.out.println("Pop:"+pop());
		System.out.println("See:"+peek());
		System.out.println("Pop:"+pop());
		System.out.println("See:"+peek());
		System.out.println("Pop:"+pop());
		System.out.println("See:"+peek());
		System.out.println("Pop:"+pop());
		System.out.println(emp());
		
	}
}
		
	  
			
			