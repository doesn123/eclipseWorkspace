import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class writeToFile {

	public static void main(String[] args) throws Exception {
		System.out.println("Type the text you'd like in the file");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		writeToFileOhYeah(text);
		System.out.println("df");
	}

	public static void writeToFileOhYeah(String s) throws IOException {

		
	  	File f = new File("output.txt");
		FileWriter fw = new FileWriter(f,false);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(s);
		pw.close();
		
	}
}
