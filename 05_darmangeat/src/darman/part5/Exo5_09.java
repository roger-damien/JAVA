package darman.part5;

import java.util.Scanner;

public class Exo5_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nombre;
		int pg = 0;
		int position = 0;
		int i = 1;

		do {
			System.out.println("Entrez un nombre : ");
			nombre = scanner.nextInt();
			if (nombre > pg) {
				pg = nombre;
				position = i;
			}
			i++;
		} while (nombre != 0);

		System.out.println("Le nombre le plus grand était " + pg + " et a été saisi en position numéro " + position);
	}

}
//
//Variables N, i, PG, IPG en Entier
//Debut
//N ← 1
//i ← 0
//PG ← 0
//TantQue N <> 0
//  Ecrire "Entrez un nombre : "
//  Lire N
//  i ← i + 1
//  Si i = 1 ou N > PG Alors
//    PG ← N
//    IPG ← i
//  FinSi
//FinTantQue
//Ecrire "Le nombre le plus grand était : ", PG
//Ecrire "Il a été saisi en position numéro ", IPG
//Fin