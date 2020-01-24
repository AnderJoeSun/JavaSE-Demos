import java.io.*;
class St2{
	public static void main(String arg[]) throws Exception{
		FileOutputStream fos=new FileOutputStream("Joyu\\Jun.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		bos.write("ÀÏ°å³Ô°ü×Ó".getBytes());
		bos.close();
		
		FileInputStream fis=new FileInputStream("Joyu\\Jun.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		byte[] b=new byte[100];
		int len=bis.read(b);
		System.out.println(new String(b,0,len));
		bis.close();
	}
}
		
		