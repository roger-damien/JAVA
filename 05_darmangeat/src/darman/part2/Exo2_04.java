package darman.part2;

import java.util.Scanner;

public class Exo2_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Affiche "Entrez le prix hors taxes"
		System.out.println("Entrez le prix hors taxes : ");

		// Lit l'entier écrit par l'utilisateur et l'affecte à la variable
		float prixHorsTaxes = scanner.nextInt();

		// Affiche "Entrez le nombre d’articles"
		System.out.println("Entrez le nombre d’articles : ");

		// Lit l'entier écrit par l'utilisateur et l'affecte à la variable
		int nombreArticles = scanner.nextInt();

		// Affiche "Entrez le taux de tva"
		System.out.println("Entrez le taux de TVA : ");

		// Lit l'entier écrit par l'utilisateur et l'affecte à la variable
		float tauxTva = scanner.nextInt();

		float prixTtc = ((prixHorsTaxes * nombreArticles) * (1 + (tauxTva / 100)));

		// Affiche
		System.out.printf("Le prix toutes taxes est :  " + "%.2f", prixTtc);

	}
}

//
//Variables nb, pht, ttva, pttc en Numérique
//Début
//Ecrire "Entrez le prix hors taxes :"
//Lire pht
//Ecrire "Entrez le nombre d’articles :"
//Lire nb
//Ecrire "Entrez le taux de TVA :"
//Lire ttva
//pttc ← nb * pht * (1 + ttva)
//Ecrire "Le prix toutes taxes est : ", pttc
//Fin

// on pourrait squeezer une variable et une ligne en écrivant directement : 
//Ecrire "Le prix toutes taxes est : ", nb * pht * (1 + ttva)