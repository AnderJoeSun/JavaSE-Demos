import java.io.*;
class St7a{
	public static void main(String arg[]) throws Exception{
		RandomAccessFile raf=new RandomAccessFile("Joyu.txt","rw");
		Stu s=new Stu(2,"Joyu",34.33);
		s.w(raf);
		new Stu(1,"Molyn",100).w(raf);
		new Stu(3,"Xue",82).w(raf);
		raf.seek(0);
		for(long i=0;i<raf.length();i=raf.getFilePointer()){
			s.r(raf);
			System.out.println(s.name+","+s.hao+","+s.fen);
		}
		raf.close();
		
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