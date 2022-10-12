package darman.part2;

import java.util.Scanner;

public class Exo2_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Affiche "Ecrire un nombre: "
		System.out.println("Ecrire un nombre: ");

		// Lit l'entier écrit par l'utilisateur et l'affecte
		// à la variable nombre du programme
		int nombre = scanner.nextInt();
		double nombre2 = Math.sqrt(nombre);
		// Affiche le nombre saisit par l'utilisateur
		System.out.println("Le carré de " + nombre + " est " + nombre2);

	}

}

// Variables nb, carr en Entier
// Début
// Ecrire "Entrez un nombre :"
// Lire nb
// carr ← nb * nb
// Ecrire "Son carré est : ", carr
// Fin