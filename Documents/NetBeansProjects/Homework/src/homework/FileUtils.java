package homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.*;


public class FileUtils {
	
	public static String readFileAsString(String name) throws IOException {
		return new String(Files.readAllBytes(Paths.get(name)));
	}
	public static void appendStringToFile( String line) throws IOException {	
                File file = new File("hi.txt");
                file.createNewFile();
		FileWriter fw = new FileWriter(file, true);
		fw.write(line );
                fw.write("\n");
		fw.close();
	}

}
