import java.io.*;
class St9{
	public static void main(String[] arg) throws Exception{
		Stu s1=new Stu(1,"Joyu",83.88);
		Stu s2=new Stu(29,"Molyn",82.88);
		Stu s3=new Stu(30,"Xue",81);
		Stu s4=new Stu(29,"Jun",93.83);
		FileOutputStream fos=new FileOutputStream("Joyu.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.writeObject(s3);
		oos.writeObject(s4);
		oos.close();
		
		FileInputStream fis=new FileInputStream("Joyu.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Stu s;
		for(int i=0;i<4;i++){
			s=(Stu)ois.readObject();
			System.out.println(s.hao+","+s.name+","+s.fen);
		}
		ois.close();	
	}
}

class Stu implements Serializable{
	int hao;
	String name;
	double fen;
	transient Thread t=new Thread();//t是一个不可序列化的对象！
	Stu(int hao,String name,double fen){
		this.hao=hao;
		this.name=name;
		this.fen=fen;
	}
  private void writeObject(ObjectOutputStream oos) throws Exception{
//private void readObject(ObjectInputStream ois) 与
//private void writeObject(ObjectOutputStream oos)是私有的，但它们
//是一个特例，它能被其它类调用！而且它们不属于任何类，只是有这么两个特
//殊的方法，只是对象序列化时才用到，它们是通过oos.writeObject(s1)调用的！
//即在写s1这个对象的时侯只写了s1.hao与s1.name这两个成员！
  	oos.writeInt(hao);
  	oos.writeUTF(name);
  	System.out.println("Write object!");
  }
  private void readObject(ObjectInputStream ois) throws Exception{
  	ois.readInt();
  	ois.readUTF();
  	System.out.println("Read Object");
  }
}