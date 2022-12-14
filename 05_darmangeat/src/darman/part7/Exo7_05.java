package darman.part7;

import java.util.Scanner;

public class Exo7_05 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String[] dico = { "abys", "amer", "berge", "carre", "design", "digne" };

		System.out.println("Entrez le mot à vérifier");
		String lemot = scanner.nextLine();

		boolean fini = false;
		for (int i = 0; i <= dico.length - 1; i++) {
			if (lemot.equals(dico[i])) {
				System.out.println("le mot existe");
				fini = true;
				break;
			}

		}
		if (!fini) {
			System.out.println("Il n'existe pase");
		}

	}
}

//
//N est le nombre d'éléments du tableau Dico[], contenant les mots du dictionnaire, tableau préalablement rempli.
//Variables Sup, Inf, Comp en Entier
//Variables Fini en Booléen
//Début
//Ecrire "Entrez le mot à vérifier"
//Lire Mot
//On définit les bornes de la partie du tableau à considérer
//Sup ← N - 1
//Inf ← 0
//Fini ← Faux
//TantQue Non Fini
//Comp désigne l'indice de l'élément à comparer. En bonne rigueur, il faudra veiller à ce que Comp soit bien un nombre entier, ce qui pourra s'effectuer de différentes manières selon les langages.
//  Comp ← [Sup + Inf]/2
//Si le mot se situe avant le point de comparaison, alors la borne supérieure change, la borne inférieure ne bouge pas.
//  Si Mot < Dico[Comp] Alors
//    Sup ← Comp - 1
//Sinon, c'est l'inverse
//  Sinon
//    Inf ← Comp + 1
//  FinSi
//  Fini ← Mot = Dico[Comp] ou Sup < Inf
//FinTantQue
//Si Mot = Dico[Comp] Alors
//  Ecrire "le mot existe"
//Sinon
//  Ecrire "Il n'existe pas"
//Finsi
//Fin