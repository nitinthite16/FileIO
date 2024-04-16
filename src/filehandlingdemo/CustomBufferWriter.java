package filehandlingdemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CustomBufferWriter {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("java 8.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);//d
		bw.newLine();
		char[] ch1 = { 'a', 'b', 'c', 'd' };
		bw.write(ch1);
		bw.newLine();
		bw.write("nitin");
		bw.newLine();
		bw.write("Software Developer");
		bw.flush();
		bw.close();

	}
}
