class Excep{
	public static void main(String a[]) throws Exception{
		Ex d=new Ex();
		//System.out.println(d.div(Integer.parseInt(a[0]),Integer.parseInt(a[1])));
		try{
			System.out.println(d.f1(5,0));
			
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}catch(Exc e){
			System.out.println(e.getMessage());
		}
		try{
			System.out.println(d.f1(5,-1));
			}catch(Exc e){
			System.out.println(e.getMessage());
			return;
			//throw new Exception("δ֪���쳣");
		}catch(ArithmeticException e){
			e.printStackTrace();
			
		}
	finally{
			System.out.println("Finally, It is all over!");
		}
		//ע�⣺finally������return��throw new Exception("")���еģ�return��throw new Exception("")���еĽ�����ǰѳ��򶪽�̨������ζ�Ž���main����������Ҳ�ͽ������������򣡹ʲ�����ִ��main������δִ�е�����ˣ�
		System.out.println("finish");
	}
}
class Ex{
	int div(int x,int y) throws ArithmeticException,Exc /*Exception*/{
		//try{
		  if(y<0){
			//return x/y;
			throw new Exc("you fu chu Excepion!");
		}
		  else if(y==0){
		  	//return x/y;
		  	throw new ArithmeticException("you ting chu Exception!");
		  }
		/*}catch(ArithmeticException e){
			System.out.println(e.toString());*/
			return x/y;
			//return 0;
			/*throw new ArithmeticException("Divied by 0,and wrong!");
		}*/
		
	}
	int f1(int x,int y) throws ArithmeticException,Exc /*Exception*/ {
		return div(x,y);
	}
}
class Exc extends Exception{
	
	Exc(String str){
		super(str);
	}
}
	
	

	