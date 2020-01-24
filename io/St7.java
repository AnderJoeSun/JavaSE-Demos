import java.io.*;
class St7{
	public static void main(String arg[]) throws Exception{
		RandomAccessFile raf=new RandomAccessFile("Joyu\\Joyu.txt","rw");
		Stu s1=new Stu(1,"Joyu",83.88);
		Stu s2=new Stu(29,"Molyn",82.88);
		Stu s3=new Stu(30,"Xue",81);
		Stu s4=new Stu(29,"Jun",93.83);
		s1.w(raf);
		s2.w(raf);
		s3.w(raf);	
		s4.w(raf);
		//raf.close();
		raf.seek(0);
		for(long i=0;i<raf.length();i=raf.getFilePointer()){
			s1.r(raf);
			System.out.println(s1.hao+","+s1.name+","+s1.fen);
//一个对象产生一条记录，于是FilePointer就好理解了。
		}
	}
}
class Stu{
	int hao;
	String name;
	double fen;
	Stu(int hao,String name,double fen){
		this.hao=hao;
		this.name=name;
		this.fen=fen;
	}
	
	public void w(RandomAccessFile raf) throws Exception{
		raf.writeInt(hao);
		raf.writeUTF(name);
		raf.writeDouble(fen);
	}
	public void r(RandomAccessFile raf) throws Exception{
		System.out.println(hao=raf.readInt());
		System.out.println(name=raf.readUTF());
		System.out.println(fen=raf.readDouble());
	}
}