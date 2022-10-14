package darman.part5;

import java.util.Scanner;

public class Exo5_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int pg = 0;
		int position = 0;

		for (int i = 1; i <= 20; i++) {
			System.out.println("Entrez un nombre : ");
			int nombre = scanner.nextInt();
			if (nombre > pg) {
				pg = nombre;
				position = i;

			}
		}
		System.out.println("Le nombre le plus grand était " + pg + " et a été saisi en position numéro " + position);
	}

}

//Variables N, i, PG en Entier
//Debut
//PG ← 0
//Pour i ← 1 à 20
//  Ecrire "Entrez un nombre : "
//  Lire N
//  Si i = 1 ou N > PG Alors
//    PG ← N
//  FinSi
//i Suivant
//Ecrire "Le nombre le plus grand était : ", PG
//Fin

//En ligne 3, on peut mettre n’importe quoi dans PG, il suffit que cette variable soit affectée pour que le premier passage en ligne 7 ne provoque pas d'erreur.

//Pour la version améliorée, cela donne :

//Variables N, i, PG, IPG en Entier
//Debut
//PG ← 0
//Pour i ← 1 à 20
//  Ecrire "Entrez un nombre : "
//  Lire N
//  Si i = 1 ou N > PG Alors
//    PG ← N
//    IPG ← i
//  FinSi
//i Suivant
//Ecrire "Le nombre le plus grand était : ", PG
//Ecrire "Il a été saisi en position numéro ", IPG
//Fin