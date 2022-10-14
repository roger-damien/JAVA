package darman.part4;

import java.util.Scanner;

public class Exo4_03 {

	public static void main(String[] args) {

		int heures, minutes, secondes, secondesPlusUn;

		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez les heures, puis les minutes, puis les secondes :");

		heures = scanner.nextInt();
		minutes = scanner.nextInt();
		secondes = scanner.nextInt();
		secondesPlusUn = secondes + 1;

		if (secondesPlusUn >= 60) {
			secondesPlusUn = 0;
			minutes++;
		}
		if (minutes >= 60) {
			minutes = 0;
			heures++;
		}
		if (heures >= 23) {
			heures = 00;
		}
		System.out
				.println("Dans une seconde il sera " + heures + " h, " + minutes + " mn et " + (secondesPlusUn) + " s");

	}

}

//Variables h, m, s en Numérique
//Début
//Ecrire "Entrez les heures, puis les minutes, puis les secondes : "
//Lire h, m, s
//s ← s + 1
//Si s = 60 Alors
//  s ← 0
//  m ← m + 1
//FinSi
//Si m = 60 Alors
//  m ← 0
//  h ← h + 1
//FinSi
//Si h = 24 Alors
//  h ← 0
//FinSi
//Ecrire "Dans une seconde il sera ", h, "h", m, "m et ", s, "s"
//Fin