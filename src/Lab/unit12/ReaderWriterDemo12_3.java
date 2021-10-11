package Lab.unit12;

import java.io.*;

public class ReaderWriterDemo12_3 {

	public static void main(String[] args) {
		try {
			FileReader f=new FileReader(args[0]);
			BufferedReader br=new BufferedReader(f);
			String line,s1=new String();
			while((line=br.readLine())!=null) {
				s1=s1+line+"\n";
			}
			br.close();
			
			InputStreamReader in=new InputStreamReader(System.in);
			BufferedReader stdin=new BufferedReader(in);
			System.out.println("Enter line:");
			System.out.println("Usage of bufferedreader and InputStreamreader");
			System.out.println(stdin.readLine());
			
			StringReader in2=new StringReader(s1);
			int c;
			System.out.println("printing individual characters of the file:"+args[0]);
			
			while((c=in2.read())!=-1) {
				System.out.println((char)c);
			}
			BufferedReader in4=new BufferedReader(new StringReader(s1));
			PrintWriter p=new PrintWriter(new BufferedWriter(new FileWriter("Resource/demo.txt")));
			
			while((line=in4.readLine())!=null) {
				p.println("output:"+line);
			}
			
			p.close();
			
		}catch(Exception e) {
			
		}

	}

}
