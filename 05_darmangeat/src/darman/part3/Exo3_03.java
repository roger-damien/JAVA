package darman.part3;

import java.util.Scanner;

public class Exo3_03 {

	String nom1, nom2, nom3;
	char premierCaractereNom1, premierCaractereNom2, premierCaractereNom3;

	public static void main(String[] args) {

		// varaiables
//		String nom1, nom2, nom3;
//		int compare1, compare2;

		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Affiche "Ecrire un nomb2re: "
		System.out.println("Ecrire un premier nom : ");
		String nom1 = scanner.nextLine();
		System.out.println("Ecrire un second nom : ");
		String nom2 = scanner.nextLine();
		System.out.println("Ecrire un troisieme nom : ");
		String nom3 = scanner.nextLine();
//
//		compare1 = nom1.compareToIgnoreCase(nom2);
//		compare2 = nom2.compareToIgnoreCase(nom3);

		if (nom1.compareToIgnoreCase(nom2) < 0 && nom2.compareToIgnoreCase(nom3) < 0) {

			System.out.println("Ces noms sont classés alphabétiquement ");

		} else {
			System.out.println("Ces noms ne sont pas classés ");
		}

//		System.out.println("compare1 : " + compare1 + ": compare2 : " + compare2);
	}
}

// Variables a, b, c en Caractère
// Début
// Ecrire "Entrez successivement trois noms : "
// Lire a, b, c
// Si a < b ET b < c Alors
// Ecrire "Ces noms sont classés alphabétiquement"
// Sinon
// Ecrire "Ces noms ne sont pas classés"
// Finsi
// Fin