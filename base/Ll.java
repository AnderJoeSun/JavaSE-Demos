import java.util.*;
class Ll{
	LinkedList ll=new LinkedList();
	public void add(java.lang.Object o){
		ll.addLast(o);
	}
	public java.lang.Object rm(){
		return ll.removeFirst();
	}
	/*public Object get(){
		return ll.getFirst();
	}*/
	public boolean emp(){
		return ll.isEmpty();
	}
	public static void main(String a[]){
		Ll q=new Ll();
		q.add("one");
	  q.add("two");
		q.add("three");
		q.add("fore");
		q.rm();
		System.out.println(q.rm());
		System.out.println(q.rm());
		System.out.println(q.rm());
		System.out.println(q.emp());
	}
}