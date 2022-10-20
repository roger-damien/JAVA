package darman.part7;

import java.util.Arrays;
import java.util.Scanner;

public class Exo7_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] tab = { 12, 8, 4, 45, 64, 9, 2 };
		System.out.printf("Tableau initial\n tab=%s\n", Arrays.toString(tab));

		System.out.printf("\n Rang de la valeur à supprimer ?", tab.length - 1);
		int indice = sc.nextInt();

		int[] newTab = new int[tab.length - 1];
		for (int i = 0; i < tab.length - 1; i++) {
			newTab[i] = i < indice ? tab[i] : tab[i + 1];
		}
		System.out.printf("Nouveau tableau\n newTab=%s\n", Arrays.toString(newTab));
		sc.close();
	}

}

//Ecrire "Rang de la valeur à supprimer ?"
//Lire S
//Pour i ← S à N-2
//  T[i] ← T[i+1]
//i suivant
//Redim T[N–1]
//Fin