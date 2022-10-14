package darman.part5;

import java.util.Scanner;

public class Exo5_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez un nombre :");
		int nombre = scanner.nextInt();
		int i;
		System.out.println("Table de " + nombre);

		for (i = 1; i <= 10; i++) {
			System.out.println(nombre + " x " + i + " = " + nombre * i);
		}

	}
}

//Variables N, i en Entier
//Debut
//Ecrire "Entrez un nombre : "
//Lire N
//Ecrire "La table de multiplication de ce nombre est : "
//Pour i ← 1 à 10
//  Ecrire N, " x ", i, " = ", n*i
//i Suivant
//Fin