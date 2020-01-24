import java.io.*;
class St3{
	public static void main(String arg[]) throws Exception{
		FileOutputStream fos=new FileOutputStream("Joyu\\Jun.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(bos);
		dos.write("ÀÏ°å³Ô°ü×Ó".getBytes());
		dos.close();
		
		FileInputStream fis=new FileInputStream("Joyu\\Jun.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		DataInputStream dis=new DataInputStream(bis);
		byte[] b=new byte[100];
		int len=dis.read(b);
		System.out.println(new String(b,0,len));
		bis.close();
	}
}
		
		