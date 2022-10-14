package darman.part5;

import java.util.Scanner;

public class Exo5_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez un nombre :");
		int nombre = scanner.nextInt();
		int i;

		for (i = nombre + 1; i <= nombre + 10; i++) {
			System.out.println(i);
		}

	}

}

//Variables N, i en Entier
//Debut
//Ecrire "Entrez un nombre : "
//Lire N
//Ecrire "Les 10 nombres suivants sont : "
//Pour i ← N + 1 à N + 10
//  Ecrire i
//i Suivant
//Fin

//Ou bien :

//Variables N, i en Entier
//Debut
//Ecrire "Entrez un nombre : "
//Lire N
//Ecrire "Les 10 nombres suivants sont : "
//Pour i ← 1 à 10
//  Ecrire N + i
//i Suivant
//Fin