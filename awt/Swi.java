import javax.swing.*;
class Swi{
	public static void main(String arg[]){
		JFrame jf=new JFrame("Joyu kiss Molyn");
		jf.setSize(600,400);
		jf.setLocation(200,100);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton jb=new JButton("b1");
		jf.add(jb,"West");//�̳��������ַ������У����ã��У�
		//jf.addContentPane().add(jb);//�̳��������ַ����У����ã����У�
		
		jf.show();
	}
}