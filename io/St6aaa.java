import java.io.*;
public class St6aaa{
	
  public static void main(String arg[]) throws Exception{
  	FileOutputStream fos=new FileOutputStream("Molyn.txt");
  	OutputStreamWriter osw=new OutputStreamWriter(fos);
  	BufferedWriter bw=new BufferedWriter(osw);
  	bw.write("Joyu loves Molyn..");
  	bw.close();
  	
  	FileInputStream fis=new FileInputStream("Molyn.txt");
  	InputStreamReader isr=new InputStreamReader(fis);
  	BufferedReader br=new BufferedReader(isr);
  	System.out.println(br.readLine());
  	br.close();
  	
    InputStreamReader fis1=new InputStreamReader(System.in);
  	BufferedReader br1=new BufferedReader(fis1);
  	System.out.println(br1.readLine());
  	br1.close();
  }
}
