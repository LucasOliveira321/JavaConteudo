import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;

public class TesteLeitura {

	public static void main(String[] args) throws IOException  {
		
		PrintStream ps = new PrintStream("texto4.txt");
		
		ps.println("sjdfhoasdkjhfokajfp");
		ps.println();
		ps.println();
		ps.println("final");

		ps.close();
	}

}
