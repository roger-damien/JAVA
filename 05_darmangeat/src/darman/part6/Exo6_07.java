package darman.part6;

import java.util.Scanner;

public class Exo6_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var = new Scanner(System.in);
		int[] monTab = new int[9];
		int s = 0;

		for (int i = 0; i <= monTab.length - 1; i++) {
			System.out.println("Entrez la valeur pour monTab [" + i + "]");
			monTab[i] = var.nextInt();
			s = s + monTab[i];
		}

		var.close();

		int m = s / monTab.length;
		System.out.println(" La moyenne des " + monTab.length + " notes est " + m);
	}

}
//
//Variable S en Numérique
//Tableau Notes[8] en Numérique
//Debut
//s ← 0
//Pour i ← 0 à 8
//  Ecrire "Entrez la note n° ", i + 1
//  Lire Notes[i]
//  s ← s + Notes[i]
//i Suivant
//Ecrire "Moyenne :", s/9
//Fin