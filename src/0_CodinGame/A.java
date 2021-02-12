import java.io.File;

public class A {

	/**
	 * Locates the universe-formula​​​​​​​‌‌‌​​​​​​‌‌‌​​​‌​‌​​​​‌​ file.
	 */
	static String path = "C:/Users/Achref/Desktop/tmp/documents/";
	static String filename = "universe-formula.txt";

	static String locateUniverseFormula() {

		return findFile(filename, new File(path));
	}

	public static String findFile(String filename, File file) {
		File[] list = file.listFiles();
		if (list == null) {
			return null;
		}
		for (File f1 : list) {
			if (f1.isDirectory()) {
				String f2 = findFile(filename, f1);
				if (f2 != null)
					return f2;
			} else if (filename.equalsIgnoreCase(f1.getName())) {
				return f1.getAbsolutePath();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(A.locateUniverseFormula());
	}

}
// static String locateUniverseFormula() {
//
//
// File file = find(path, fileName);
// return file.getAbsolutePath();
// }
//
// public static File find (String path, String fileName){
//
// File f = new File(path);
// if (fileName.equalsIgnoreCase(f.getName()))
// return f;
// if (f.isDirectory()){
// for (String child : f.list()){
// File f2 = find(path+File.separator+child, fileName);
// if (f2!= null)
// return f2;
// }
// }
// return null;
// }
//
