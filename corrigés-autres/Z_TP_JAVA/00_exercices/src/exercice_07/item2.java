package exercice_07;

import java.util.Scanner;

public class item2 {

	private static final String Do = null;

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		char c;
		
		do {
	System.out.printf("Affiche un caractère : ");
	 c = clavier.next().charAt(0);
	 System.out.printf("Le caractère est : %C\n", c);
		}
		while (!(c == '1'));
	}

}
