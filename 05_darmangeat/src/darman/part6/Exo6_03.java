package darman.part6;

import java.util.Scanner;

public class Exo6_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner var = new Scanner(System.in);
		int[] monTab = new int[9];

		for (int i = 0; i <= monTab.length - 1; i++) {
			System.out.println("Entrez la valeur pour monTab [" + i + "]");
			monTab[i] = var.nextInt();
		}
		var.close();
	}

}
