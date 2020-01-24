import java.io.*;
class F2{
	public static void main(String arg[]) throws Exception{
		for(int i=0;i<5;i++){
			File f=File.createTempFile("JoyuTemp",".tmp");
			f.deleteOnExit();
		}
		Thread.sleep(3000);
	}
}