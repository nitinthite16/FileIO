package filehandlingdemo;
import java.io.File;

public class FileHandling {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\Admin");
		int count = 0;
		String[] s = f.list();
		for(String s1:s) {
			//count++;
			//System.out.println(s1);
			File f1 = new File(f, s1);
			//if(f1.isFile())
			if(f1.isDirectory()){
				count++;
				System.out.println(s1);
			}
		}
		//files+directory=44
		//files=9
		//directory=35
		System.out.println("the total numberof files: "+count);//9
	}
}
