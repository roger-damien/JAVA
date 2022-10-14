package darman.part5;

import java.util.Scanner;

public class Exo5_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez un nombre : ");
		int nombre = scanner.nextInt();
		int F = 1;
		int i;

		for (i = 1; i <= nombre; i++) {
			System.out.println(i);
			F = F * i;
		}

		System.out.println("La factorielle est : " + F);

	}

}

//Variables N, i, F en Entier
//Debut
//Ecrire "Entrez un nombre : "
//Lire N
//F ← 1
//Pour i ← 2 à N
//  F ← F * i
//i Suivant
//Ecrire "La factorielle est : ", F
//Fin