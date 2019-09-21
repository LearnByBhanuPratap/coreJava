package exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Example6 {

	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new FileReader(new File("")));
		rd.readLine();
	}
}
