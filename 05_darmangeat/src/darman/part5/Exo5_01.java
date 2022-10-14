package darman.part5;

import java.util.Scanner;

public class Exo5_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nombre;

		do {

			System.out.println("Entrez un nombre entre 1 et 3 :");
			nombre = scanner.nextInt();
		}

		while (nombre >= 1 && nombre <= 3);

		System.out.println("Saisie erronée. Recommencez !");
	}

}

//Variable N en Entier
//Debut
//N ← 0
//Ecrire "Entrez un nombre entre 1 et 3"
//TantQue N < 1 ou N > 3
//  Lire N
//    Si N < 1 ou N > 3 Alors
//      Ecrire "Saisie erronée. Recommencez”
//    FinSi
//  FinTantQue
//Fin