//�������ᱨ��������Ϊbos.flush()��ע�ͣ�������
//��û������д�룬Ҳ�Ͳ�����b������飡��ӡ�ͻᱨ����

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