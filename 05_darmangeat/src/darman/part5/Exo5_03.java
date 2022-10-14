package darman.part5;

import java.util.Scanner;

public class Exo5_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez un nombre :");
		int nombre = scanner.nextInt();
		int nombrePlusDix = nombre + 10;

		do {
			System.out.println(nombre += 1);
		} while (nombre < nombrePlusDix);

	}
}
//Variables N, i en Entier
//Debut
//Ecrire "Entrez un nombre : "
//Lire N
//Stop ← N+10
//Ecrire "Les 10 nombres suivants sont : "
//TantQue N < Stop
//   N ← N+1
//   Ecrire N
//FinTantQue
//Fin

//ou
//
//Variables N, i en Entier
//Debut
//Ecrire "Entrez un nombre : "
//Lire N
//i ← 0
//Ecrire "Les 10 nombres suivants sont : "
//TantQue i < 10
//   i ← i + 1
//   Ecrire N + i
//FinTantQue
//Fin