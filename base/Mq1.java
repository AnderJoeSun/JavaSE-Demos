import java.util.*;

public class Mq1{
	
		static LinkedList ll=new LinkedList();
		static void add(String str){
			ll.addLast(str);
		}
		static Object pop(){
			return ll.removeFirst();
		}
		static boolean isEmp(){
			return ll.isEmpty();
		}
		
		public static void main(String arg[]){
			add("one");
			add("two");
			add("three");
			add("fore");
			System.out.println(pop());
			System.out.println(pop());
			System.out.println(pop());
			System.out.println(isEmp());
		}
	}
			