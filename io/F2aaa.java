import java.io.*;

public class F2aaa{
  public static void main(String arg[]){
    try{
    	for(int i=0;i<3;i++){
    		File f=new File("d:\\javali\\io\\Molyn"+i+".txt");
    		f.createNewFile();
    	  f.deleteOnExit();
    	}
    	Thread.sleep(3000);
    	
    }catch(Exception e){
  	
  	  e.printStackTrace();
    }
  
  }
}



	