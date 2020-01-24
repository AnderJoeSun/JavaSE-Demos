import java.util.*;

public class Ll1aaa{
	static LinkedList ll=new LinkedList();
	
	public static void add(String a){
		ll.add(a);
	}
	
	public static Object pop(){
		return ll.removeLast();
	}
	
	public static Object see(){
		return ll.getLast();
	}
	 
	public static void main(String arg[]){
		add("a");
		add("b");
		add("c");
		add("d");
		add("f");
		System.out.println("pop!:"+pop());
		System.out.println("see!:"+see());
		System.out.println("pop!:"+pop());
		System.out.println("see!:"+see());
		System.out.println("pop!:"+pop());
		System.out.println("see!:"+see());
		System.out.println("pop!:"+pop());
		System.out.println("see!:"+see());
		System.out.println("Empty? "+ll.isEmpty());
		
		
	}
}