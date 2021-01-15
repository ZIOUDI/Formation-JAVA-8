package File;

import java.io.IOException;
import java.lang.instrument.IllegalClassFormatException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesList {

	public static void main(String[] args) throws IOException, IllegalClassFormatException {
		// TODO Auto-generated method stub
 int i =1; int j= 1 ;
		// Java 8
		try (Stream<Path> filePathStream = Files.walk(Paths.get("C:/Users/Smile/workspace/BDN"))) {
			filePathStream.forEach(filePath -> {
				if (Files.isRegularFile(filePath)) {

					System.out.println(filePath);
				}
			});
		}

		// Before Java 8
		/*
		 * File folder = new File("C:/Users/Smile/workspace/BDN"); File[]
		 * listOfFiles = folder.listFiles();
		 * 
		 * for (int i = 0; i < listOfFiles.length; i++) { if
		 * (listOfFiles[i].isFile()) { System.out.println("File " +
		 * listOfFiles[i].getName()); } else if (listOfFiles[i].isDirectory()) {
		 * System.out.println("Directory " + listOfFiles[i].getName()); } }
		 */
	}

}
