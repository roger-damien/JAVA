package darman.part2;

import java.util.Scanner;

public class Exo2_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Affiche "Quel est votre prénom"
		System.out.println("Quel est votre prénom ? : ");

		// Lit la chaine écrite par l'utilisateur et l'affecte
		// à la variable prenom
		String prenom = scanner.nextLine();

		// Affiche
		System.out.println("Bonjour, " + prenom);

	}
}

//
// Variable prenom en Caractere
// Début
// Ecrire "Quel est votre prenom ?"
// Lire Prenom
// Ecrire "Bonjour ", Prenom, " !" Fin
///