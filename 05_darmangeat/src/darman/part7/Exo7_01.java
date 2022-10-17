package darman.part7;

import java.util.Scanner;

public class Exo7_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez le nombre de valeurs :");
		int Nb = scanner.nextInt();
		int [] t = new int [Nb];
		for (int i=0; i <= Nb; i++) {
			System.out.println("Entrez le nombre n° " + i);
			t[i] = scanner.nextInt();
			boolean Flag = true;
			
			for (i=1; i<Nb-1;i++) {
				if (! (T[i] == (T[i]-1 +1)) ) {
					Flag = false;
				}
				
			}
		}
		

	}

}

//
//Variables Nb, i en Entier
//Variable Flag en Booleen
//Tableau T[] en Entier
//Debut
//Ecrire "Entrez le nombre de valeurs :"
//Lire Nb
//Redim T[Nb-1]
//Pour i ← 0 à Nb - 1
//  Ecrire "Entrez le nombre n° ", i + 1
//  Lire T[i]
//i Suivant
//Flag ← Vrai
//Pour i ← 1 à Nb - 1
//  Si T[i] <> T[i – 1] + 1 Alors
//    Flag ← Faux
//  FinSi
//i Suivant
//Si Flag Alors
//  Ecrire "Les nombres sont consécutifs"
//Sinon
//  Ecrire "Les nombres ne sont pas consécutifs"
//FinSi
//Fin