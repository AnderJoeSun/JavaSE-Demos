import java.io.*;
class St4{
	public static void main(String arg[]) throws Exception{
		FileOutputStream fos=new FileOutputStream("Joyu\\Jun.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(bos);
		byte a=3;
		int b=4;
		//String c="abc";
		long d=34434l;
		float e=3.444f;
		double f=3.22;
		dos.writeByte(a);
		dos.writeInt(b);
		//dos.writeString(c);
		dos.writeLong(d);
		dos.writeFloat(e);
		dos.writeDouble(f);
		dos.close();
		
		FileInputStream fis=new FileInputStream("Joyu\\Jun.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		DataInputStream dis=new DataInputStream(bis);
		System.out.println(dis.readByte());
		System.out.println(dis.readInt());
		//System.out.println(dis.read());
		System.out.println(dis.readLong());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		
		bis.close();
	}
}
		
