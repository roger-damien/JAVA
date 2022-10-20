import java.util.Scanner;

public class Exo_06 {

	static final int CHAR_BY_LINE = 4;
	static final int LINE_BY_PAGE = 10;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int decChar = 0, decLine = 0;

		for (int i = 0; i < 128; i++) {
			char c = (char) i;

			if (Character.isJavaIdentifierPart(c)) {
				if (decChar % CHAR_BY_LINE != 0)
					System.out.printf("\t\t");
				System.out.printf("\'%c\'\t%s\t%d", c, Integer.toHexString(i), i);
				decChar++;
				if (decChar % CHAR_BY_LINE == 0) {
					System.out.printf("\n");
					if (++decLine >= LINE_BY_PAGE) {
						System.out.printf("Suite... (appuie sur ENTER)\n");
						decLine = 0;
						sc.nextLine();
					}
				}
			}
		}
		System.out.printf("\nTerminé");
		sc.close();
	}

}
