//这个程序会报错！是因为bos.flush()被注释，这样，
//就没有数据写入，也就不会有b这个数组！打印就会报错！

import java.io.*;

public class St3aaa{
	public static void main(String arg[]) throws Exception{
	  FileOutputStream fos=new FileOutputStream("Saiyu.txt");
	  BufferedOutputStream bos=new BufferedOutputStream(fos);
	  bos.write("Joyu loves Saiyu..".getBytes());
	  //bos.flush();
	  //bos.close();
	  
	  FileInputStream fis=new FileInputStream("Saiyu.txt");
	  BufferedInputStream bis=new BufferedInputStream(fis);
	  byte[] b=new byte[100];
	  int len=bis.read(b);
	  System.out.println(new String(b,0,len));
	  //bis.flush();
	  //bis.close();
	}
}
