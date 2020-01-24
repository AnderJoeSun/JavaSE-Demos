import java.io.*;


public class St7aaa{
	public static void main(String arg[]) throws Exception{
		RandomAccessFile raf=new RandomAccessFile("Saiyu.txt","rw");
		Stu s=new Stu(1,"Molyn",88.88);
		s.w(raf);
		new Stu(2,"Saiyu",99.88).w(raf);
		new Stu(29,"Joyu",33.55).w(raf);
		raf.seek(0);
		for(long i=0;i<raf.length();i=raf.getFilePointer()){
			s.r(raf);
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
		System.out.println(raf.readInt()+","+raf.readUTF()+","+raf.readDouble());
		
	}
	
}