class Excep2a{
	public static void main(String arg[]) {
		try{
		  System.out.println("result:"+Chu.chu(5,3));
		}catch(Exception e){
			e.printStackTrace();
			return;
		}
		try{
			System.out.println("result:"+Chu.chu(5,-1));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

class Chu{
	
	static int chu(int a,int b) throws Exception{
		if(b<0)
		  throw new Exception("FuShu!");
		else if(b==0)
		  throw new Exception("Ling!");
		  return a/b;
		
		
	}
}
		
		
		