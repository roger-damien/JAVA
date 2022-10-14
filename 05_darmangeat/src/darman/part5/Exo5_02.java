package darman.part5;

import java.util.Scanner;

public class Exo5_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nombre;

		do {
			System.out.println("Entrez un nombre entre 10 et 20 :");
			nombre = scanner.nextInt();

			if (nombre < 10) {
				System.out.println("Plus grand");
			} else if (nombre > 20) {
				System.out.println("Plus petit");
			}
		}

		while (nombre >= 10 && nombre <= 20);
		// System.out.println("OK");
	}
}

//Variable N en Entier
//Debut
//N ← 0
//Ecrire "Entrez un nombre entre 10 et 20"
//TantQue N < 10 ou N > 20
//  Lire N
//  Si N < 10 Alors
//    Ecrire "Plus grand !"
//  SinonSi N > 20 Alors
//    Ecrire "Plus petit !"
//  FinSi
//FinTantQue
//Fin