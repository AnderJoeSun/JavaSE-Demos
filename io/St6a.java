import java.io.*;
class St6a{
	public static void main(String arg[]) throws Exception{
		FileOutputStream fos=new FileOutputStream("Joyu.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos);
		BufferedWriter bw=new BufferedWriter(osw);
		bw.write("Joyu loves Molyn......Can you!");
		bw.close();
		
		FileInputStream fis=new FileInputStream("Joyu.txt");
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(isr);
		System.out.println(br.readLine());
		br.close();
		
		InputStreamReader i=new InputStreamReader(System.in);
	  BufferedReader r=new BufferedReader(i);
	  String str;
	  while((str=r.readLine())!=null){
	  	System.out.println(str);
	  }
	  r.close();
	}
}
		