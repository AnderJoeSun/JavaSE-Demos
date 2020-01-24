import java.lang.reflect.*;

public class Ref1{
	public static void main(String arg[]) throws Exception{
		if(arg.length!=1)
		   return;
		   
		Class c=Class.forName(arg[0]);
		Constructor[] con=c.getDeclaredConstructors();
		for(int i=0;i<con.length;i++){
			System.out.println(con[i]);
		}
		
		Class[] param=con[0].getParameterTypes();
		for(int i=0;i<param.length;i++){
			System.out.println(param[i]);
		}
		
		Object[] parVa=new Object[param.length];
		for(int i=0;i<param.length;i++){
			if(param[i].isPrimitive()){
				parVa[i]=new Integer(i+7);
			}
		}
		
		Object o=con[0].newInstance(parVa);
		Method[] mt=c.getDeclaredMethods();
		for(int i=0;i<mt.length;i++){
			System.out.println(mt[i]);
			mt[i].invoke(o,null);
		}
	}
}

class P{
	int x;
	int y;
	P(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void print(){
		System.out.println("x is: "+x+";y is: "+y);
	}
}