import java.io.*;
class F2a{
	public static void main(String arg[]) throws Exception{
		for(int i=0;i<5;i++){
			try{
			File f=File.createTempFile("Lover",".tmp");
			f.deleteOnExit();
	  	}catch(Exception e){
			e.printStackTrace();
		  }
	  }
	  Thread.sleep(3000);
	}  
}