import java.io.*;
class St4a{
	public static void main(String arg[]) throws Exception{
		FileOutputStream fos=new FileOutputStream("Joyu.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(bos);
		byte y=34;
		int a=3;
		long b=444l;
		String c="abc";
		float f=3.333f;
		double d=21.55;
		char r='a';
		dos.writeByte(y);
		dos.writeInt(a);
		dos.writeLong(b);
		dos.writeUTF(c);
		dos.writeFloat(f);
		dos.writeDouble(d);
		dos.writeChar(r);
		dos.close();
		
		FileInputStream fis=new FileInputStream("Joyu.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		DataInputStream dis=new DataInputStream(bis);
		System.out.println(dis.readByte());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readUTF());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		System.out.println(dis.readChar());
		dis.close();
	}
}