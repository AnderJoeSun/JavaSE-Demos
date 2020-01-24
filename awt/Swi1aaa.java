import javax.swing.*;

public class Swi1aaa{
	public static void main(String arg[]){
		JFrame jf=new JFrame("Joyu");
		jf.setSize(600,400);
		jf.setLocation(100,100);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton jb=new JButton("Molyn");
		jf.add(jb,"West");
		jf.show();
	}
}