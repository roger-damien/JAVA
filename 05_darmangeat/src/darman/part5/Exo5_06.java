package darman.part5;

import java.util.Scanner;

public class Exo5_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez un nombre : ");
		int nombre = scanner.nextInt();
		int som = 0;
		int i;

		for (i = 1; i <= nombre; i++) {
			System.out.println(i);
			som += i;
		}

		System.out.println("La somme est : " + som);

	}

}

//Variables N, i, Som en Entier
//Debut
//Ecrire "Entrez un nombre : "
//Lire N
//Som ← 0
//Pour i ← 1 à N
//  Som ← Som + i
//i Suivant
//Ecrire "La somme est : ", Som
//Fin