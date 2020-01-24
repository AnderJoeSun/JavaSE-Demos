import java.io.*;
class St6{
	public static void main(String arg[]) throws Exception{
		FileOutputStream fos=new FileOutputStream("Joyu\\Joyu.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos);
		BufferedWriter bw=new BufferedWriter(osw);
		bw.write("Hello,Joyu,Molyn loves you!");
		bw.close();
		
		FileInputStream fis=new FileInputStream("Joyu\\Joyu.txt");
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(isr);
		System.out.println(br.readLine());
		br.close();
		
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(i);
		String str;
		while((str=b.readLine())!=null){
			
			System.out.println(str);
		}
		b.close();
		
		 
	}
}
		