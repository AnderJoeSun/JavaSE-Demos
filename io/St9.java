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
	transient Thread t=new Thread();//t��һ���������л��Ķ���
	Stu(int hao,String name,double fen){
		this.hao=hao;
		this.name=name;
		this.fen=fen;
	}
  private void writeObject(ObjectOutputStream oos) throws Exception{
//private void readObject(ObjectInputStream ois) ��
//private void writeObject(ObjectOutputStream oos)��˽�еģ�������
//��һ�����������ܱ���������ã��������ǲ������κ��ֻ࣬������ô������
//��ķ�����ֻ�Ƕ������л�ʱ���õ���������ͨ��oos.writeObject(s1)���õģ�
//����дs1��������ʱ��ֻд��s1.hao��s1.name��������Ա��
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