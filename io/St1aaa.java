import java.io.*;

public class St1aaa{
	public static void main(String arg[]) throws Exception{
	  FileOutputStream fos=new FileOutputStream("Molyn.txt");
	  fos.write("Joyu loves Molyn...".getBytes());
	  fos.close();
	  
	  FileInputStream fis=new FileInputStream("Molyn.txt");
	  byte[] b=new byte[100];
	  int len=fis.read(b);
	  System.out.println(new String(b,0,len));
	}
}