package Lab.unit11;

import java.io.File;

public class FileRename11_2 {

	public static void main(String[] args) {
		
		
		for(int i=0;i<args.length;i++)
		{
			File f=new File("c:\\java", args[i]);
			File f1=new File("c:\\java\\renamefile");
			if(f.exists()) {
				System.out.println(f+"does exists..");
				System.out.println("Its size is "+f.length()+" bytes");
				f.renameTo(f1);
				System.out.println("renamed file name"+f1+(i+1));
				System.out.println("deleting the named file:"+f1+(i+1));
				System.out.println("=============================");
				f.delete();
				
			}
			else {
				System.out.println(f+"  does not exists");
			}
			
		}
	}

}
