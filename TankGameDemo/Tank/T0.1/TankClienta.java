import java.awt.*;

public class TankClienta extends Frame{
	
	public void lauchFrame(){
		this.setLocation(400,300);
		this.setSize(800,600);
		this.setVisible(true);
	}
	
	public static void main(String arg[]){
		TankClienta tc=new TankClienta();
		tc.lauchFrame();
	}
}
