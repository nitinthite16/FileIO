package filehandlingdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CustomBufferedReader {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("rest.txt");
		try {
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
		} catch (IOException ie) {
			System.out.println(ie);
		 }
	}//@componentScan({"package1name","package2name"});
}
