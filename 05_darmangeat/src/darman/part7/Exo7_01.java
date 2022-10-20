package darman.part7;

import java.util.Arrays;
import java.util.Scanner;

public class Exo7_01 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Entrez le nombre de valeurs :");
		int Nb = scanner.nextInt();

		int[] tab = new int[Nb];
		for (int i = 0; i <= tab.length - 1; i++) {
			tab[i] = scanner.nextInt();
			scanner.nextLine();
		}

		System.out.println(Arrays.toString(tab));

		int tab1 = tab[0];
		boolean Flag = true;

		for (int i = 0; i <= tab.length - 1; i++) {

			if (tab1 != tab[i]) {
				Flag = false;
				break;
			}
			tab1++;
		}
		if (Flag) {
			System.out.println("Les nombres sont consécutifs");
		} else {
			System.out.println("Les nombres ne sont pas consécutifs");
		}
	}

}

//Variables Nb, i en Entier
//Variable Flag en Booleen
//Tableau T[] en Entier
//Debut
//Ecrire "Entrez le nombre de valeurs :"
//Lire Nb
//Redim T[Nb-1]
//Pour i ← 0 à Nb - 1
//  Ecrire "Entrez le nombre n° ", i + 1
//  Lire T[i]
//i Suivant
//Flag ← Vrai
//Pour i ← 1 à Nb - 1
//  Si T[i] <> T[i – 1] + 1 Alors
//    Flag ← Faux
//  FinSi
//i Suivant
//Si Flag Alors
//  Ecrire "Les nombres sont consécutifs"
//Sinon
//  Ecrire "Les nombres ne sont pas consécutifs"
//FinSi
//Fin