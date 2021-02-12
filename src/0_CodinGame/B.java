import java.util.HashMap;
import java.util.Map;

public class B {

	public static void main(String[] args) {
		String art = AsciiArt.printChar('A');
		System.out.println(art);
		char c = B.scanChar(art);
		System.out.println(c);
	}

	/**
	 * Return the char that is represented by s
	 */
	public static char scanChar(String s) {
		Character key = null;
		Map<Character, String> mapping = new HashMap<>();
		for (char c = 'A'; c <= '?'; c++) {
			mapping.put(c, AsciiArt.printChar(c));
		}

		for (Map.Entry entry : mapping.entrySet()) {
			if (s.equals(entry.getValue())) {
				key = (char) entry.getKey();
				break;
			} else {
				key = '?';
			}
		}

		return key;

	}

}
//mapping.put('A',AsciiArt.printChar('A'));
//mapping.put('B',"\n##  \n# # \n##  \n# # \n##  ");
//mapping.put('C',"\n ## \n#   \n#   \n#   \n ## ");
//mapping.put('D',"\n##  \n# # \n# # \n# # \n##  ");
//mapping.put('E',"\n### \n#   \n##  \n#   \n### ");
//mapping.put('F',"\n### \n#   \n##  \n#   \n#   ");
//mapping.put('G',"\n ## \n#   \n# # \n# # \n ## ");
//mapping.put('H',"\n# # \n# # \n### \n# # \n# # ");
//mapping.put('I',"\n### \n #  \n #  \n #  \n### ");
//mapping.put('J',"\n ## \n  # \n  # \n# # \n #  ");
//mapping.put('K',"\n# # \n# # \n##  \n# # \n# # ");
//mapping.put('L',"\n#   \n#   \n#   \n#   \n### ");
//mapping.put('M',"\n# # \n### \n### \n# # \n# # ");
//mapping.put('N',"\n### \n# # \n# # \n# # \n# # ");
//mapping.put('O',"\n #  \n# # \n# # \n# # \n #  ");
//mapping.put('P',"\n##  \n# # \n##  \n#   \n#   ");
//mapping.put('Q',"\n #  \n# # \n# # \n ## \n  # ");
//mapping.put('R',"\n##  \n# # \n##  \n# # \n# # ");
//mapping.put('S',"\n ## \n#   \n #  \n  # \n##  ");
//mapping.put('T',"\n### \n #  \n #  \n #  \n #  ");
//mapping.put('U',"\n# # \n# # \n# # \n# # \n### ");
//mapping.put('V',"\n# # \n# # \n# # \n# # \n #  ");
//mapping.put('W',"\n# # \n# # \n### \n### \n# # ");
//mapping.put('X',"\n# # \n# # \n #  \n# # \n# # ");
//mapping.put('Y',"\n# # \n# # \n #  \n #  \n #  ");
//mapping.put('Z',"\n### \n  # \n #  \n#   \n### ");

class AsciiArt {
	static final char START_CHAR = 'a';
	static final char END_CHAR = 'z';
	static final char DELIMITER_CHAR = END_CHAR + 1;

	public static String printChar(char c) {
		int l = 5, w = 4, start = 0, end = 0;
		String v = "";
		c = Character.toLowerCase(c);

		String[] rowArray = new String[5];
		rowArray[0] = " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###";
		rowArray[1] = "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #";
		rowArray[2] = "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##";
		rowArray[3] = "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #      ";
		rowArray[4] = "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  # ";

		if (START_CHAR <= c && c <= END_CHAR) {
			start = (c - START_CHAR) * w;
			end = start + w;
		}

		else {
			start = 103;
			end = 107;

		}

		for (int i = 0; i < l; i++) {
			v = v + "\n" + rowArray[i].substring(start, end);
		}
		return v;

	}
}
