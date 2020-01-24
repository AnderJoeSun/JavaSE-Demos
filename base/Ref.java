import java.lang.reflect.*;
class Ref{
	public static void main(String arg[]){
		if(arg.length!=1){
			return;
		}
		try{
			Class c=Class.forName(arg[0]);
			Constructor[] cons=c.getDeclaredConstructors();
			/*for(int i=0;i<cons.length;i++){
				System.out.println(cons[i]);
			}
			Method[] mt=c.getDeclaredMethods();
			for(int i=0;i<mt.length;i++){
				System.out.println(mt[i]);
			}*/
			Class[] param=cons[0].getParameterTypes();
			Object[] paramValue=new Object[param.length];//一一对映地放param们的值。
			for(int i=0;i<param.length;i++){
				if(param[i].isPrimitive()){
					paramValue[i]=new Integer(i+3);
				}
			}
			Object o=cons[0].newInstance(paramValue);
			Method[] mt=c.getDeclaredMethods();
			mt[0].invoke(o,null);
			
			
			
		}catch(Exception e){
			e.printStackTrace();
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
	public void op(){
		System.out.println("x:"+x+",y:"+y);
	}
}