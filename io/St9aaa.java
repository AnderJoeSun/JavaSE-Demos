import java.io.*;

public class St9aaa{
  public static void main(String arg[]) throws Exception{
  	FileOutputStream fos=new FileOutputStream("Saiyu.txt");
  	ObjectOutputStream oos=new ObjectOutputStream(fos);
  	oos.writeObject(new Stu(1,"Molyn"));
  	oos.writeObject(new Stu(2,"Saiyu"));
  	oos.writeObject(new Stu(29,"Joyu"));
  	oos.close();
  	
  	FileInputStream fis=new FileInputStream("Saiyu.txt");
  	ObjectInputStream ois=new ObjectInputStream(fis);
  	for(int i=0;i<3;i++){
  		ois.readObject();
  	}
  	ois.close();
  	
	}
}

class Stu implements Serializable{
	int hao;
	String name;
	Stu(int hao,String name){
		this.hao=hao;
		this.name=name;
	}
	transient Thread th=new Thread();
	public String toString(){
		return hao+","+name;
	}
	
	private void writeObject(ObjectOutputStream oos) throws Exception{
		oos.writeUTF(name);
		System.out.println("Wite Object!");
	}
	
	private void readObject(ObjectInputStream ois) throws Exception{
		System.out.println(ois.readUTF());
		System.out.println("Read Object!");
	}
}