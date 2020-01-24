import java.awt.*;
import javax.swing.*;
class Swi1{
	public static void main(String arg[]){
		JFrame jf=new JFrame("Joyu and Molyn");
		jf.setSize(600,400);
		jf.setLocation(200,100);
		JButton jb=new JButton("Lover");
		jf.add(jb,"West");
		jf.show();
	}
}