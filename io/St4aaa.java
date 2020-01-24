import java.io.*;

public class St4aaa{
	public static void main(String[] arg) throws Exception{
		FileOutputStream fos=new FileOutputStream("Saiyu.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(bos);
		byte a=21;
		int b=3234;
		long c=3232084l;
		float d=23.342f;
		double e=23.1344;
		char f='s';
		dos.writeByte(a);
		dos.writeInt(b);
		dos.writeLong(c);
		dos.writeFloat(d);
		dos.writeDouble(e);
		dos.writeChar(f);
		dos.close();
		
		FileInputStream fis=new FileInputStream("Saiyu.txt");
		DataInputStream dis=new DataInputStream(fis);
		System.out.println(dis.read());
		System.out.println(dis.read());
		System.out.println(dis.read());
		System.out.println(dis.read());
		System.out.println(dis.read());
		System.out.println(dis.read());
		dis.close();
	}
}
