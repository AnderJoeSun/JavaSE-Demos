//用小程序放音乐
import java.awt.*;
import java.applet.*;

public class Ap11 extends Applet{
	AudioClip ac;
	public void init(){
		ac=getAudioClip(getDocumentBase(),"11.au");
	}
		
	public void start(){
		ac.loop();
	}
	
	public void stop(){
		ac.stop();
	}
}
		