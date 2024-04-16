package filehandlingdemo;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo{

	public static void main(String[] args) throws IOException{
		
		FileWriter fw = new FileWriter("rest.txt");
		fw.write(100);
		fw.write("urga\n SoftwareSolutions");
		fw.write('\n');
		char[] ch = {'a','b','c'};
		fw.write(ch);
		fw.write('\n');
		fw.flush();
		fw.close();
		
	}
}
