import java.io.*;
class St2a{
	public static void main(String arg[]) throws Exception{
		FileOutputStream fos=new FileOutputStream("Joyu.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		bos.write("¿œ∞Â≤ª≥‘Œ√◊”".getBytes());
		bos.close();
		
		FileInputStream fis=new FileInputStream("Joyu.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		byte[] b=new byte[100];
		int len=bis.read(b);
		System.out.println(new String(b,0,len));
		bis.close();
	}
}
