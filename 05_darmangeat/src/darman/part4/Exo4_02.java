package darman.part4;

import java.util.Scanner;

public class Exo4_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez les heures : ");
		int heures = scanner.nextInt();
		System.out.println("Entrez les minutes : ");
		int minutes = scanner.nextInt();

		if (minutes + 1 >= 60) {
			if (heures >= 23) {
				String minuit = "00";
				System.out.println("Dans une minute il sera " + (minuit) + " heure(s)");
			} else {
				System.out.println("Dans une minute il sera " + (heures + 1) + " heure(s)");
			}
		} else {
			System.out.println("Dans une minute il sera " + heures + " heure(s) " + (minutes + 1) + "minute(s)");
		}
	}

}

//Variables h, m en Numérique
//Début
//Ecrire "Entrez les heures, puis les minutes : "
//Lire h, m
//m ← m + 1
//Si m = 60 Alors
//  m ← 0
//  h ← h + 1
//FinSi
//Si h = 24 Alors
//  h ← 0
//FinSi
//Ecrire "Dans une minute il sera ", h, "heure(s) ", m, "minute(s)"
//Fin