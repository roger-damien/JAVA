package demos;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Demo31_tableaux {
	/**
	 * Test sur le tableau de dimension 1 contenant des primitifs Ces essais sont
	 * liés aux slides sur les tableaux
	 * 
	 * @author afpa
	 */
	// public static void main(String[] args) throws CloneNotSupportedException
	public static void main(String... args) throws CloneNotSupportedException {
		///////////////////////////////////////////////////////////
		// Regarder les slides sur les tableaux
		///////////////////////////////////////////////////////////

		/////////////////////////////////////////////////
		/* tableau de dimension 1 contenant des primitifs */
		////////////////////////////////////////////////
		// étape 1
		int[] t1;// déclaration de la référence du tableau

		// étape 2
		t1 = new int[3];// instanciation de l'objet tableau et affectation à la référence t1

		// étape3 : remplissage
		t1[1] = 77;
		t1[0] = 42;
		// t1[3]= 89;//java.lang.ArrayIndexOutOfBoundsException

		///////////////////////////////////////
		// étape4 : utilisation
		///////////////////////////////////////
		System.out.println("Affichage des cases de t1 :");
		System.out.println("contenu case 1 :" + t1[0]);
		System.out.println("contenu case 2 :" + t1[1]);
		System.out.println("contenu case 3 :" + t1[2]);

		System.out.println("contenu de la dernière case  :" + t1[t1.length - 1]);
		// System.out.println("contenu case 4 :" +
		// t1[t1.length]);//ArrayIndexOutOfBoundsException

		System.out.println();
		System.out.println();

		// autre exemple de traitement
		// avec le while, on cumule les valeurs des cases
		int somme = 0;
		int n = 0;
		while (n < t1.length) {
			somme = somme + t1[n];// somme += t1[n]

			n = n + 1; // n += 1; n++; ++n;
		}
		System.out.println("While, voici la somme des valeurs de t1 :" + somme);
		System.out.println();

		System.out.println();
		// autre exemple de traitement
		// avec le for, on cumule les valeurs des cases
		somme = 0;
		for (int k = 0; k < t1.length; k++) {
			somme = somme + t1[k];
		}
		// System.out.println("valeur de k :" + k);
		System.out.println("for, voici la somme des valeurs de t1 :" + somme);
		System.out.println();

		/////////////////////////////////////////////////////
		System.out.println("///////////////////////////////////////////");
		System.out.println("//aparté sur les opérateurs ++ , --  et ! ");
		// voir aussi le site de Jean-Michel Doudoux
		/////////////////////////////////////////////////////
		System.out.println("valeur de n :" + n);
		System.out.println("valeur de n++ :" + n++);// post-incrémentation
		System.out.println("valeur de n :" + n);// post-incrémentation

		System.out.println("valeur de ++n :" + ++n);// pré-incrémentation
		System.out.println("valeur de n :" + n);// pré-incrémentation

		// aparté sur l'opérateur ! //voir site de J.M. Doudoux
		System.out.println("valeur de !!false :" + !!false);

		/////////////////////////////////////////////////////////////
		// Pour afficher le tableau entier, on essaye le toString()
		System.out.println("NOK le toString() de t1 :" + t1.toString()); // non satisfaisant //toString mal développé?
		System.out.println();

		System.out.println("////////////////////////////////////////////");
		System.out.println("Utilisation de Arrays.toString pour afficher :");
		System.out.println("tableau t1 :" + java.util.Arrays.toString(t1));// OK sur une ligne
		System.out.println();

		////////////////////////////////////////////////////////////
		// bonne idée de mettre l'affichage du tableau sur une ligne
		// avec print
		////////////////////////////////////////////////////////////
		System.out.println("Sur une ligne, affichage de qq éléments de t1:");
		System.out.print("\tprint  -->" + t1[0] + " " + t1[1] + " " + t1[2]);
		System.out.println();

		// System.out.printf("\t printf -->%d %d d%\n" , t1[0] , t1[1], t1[2]);

		System.out.println();
		System.out.print("Sur une ligne, éléments de t1 avec un for:\t");
		for (int k = 0; k < t1.length; k++) {
			System.out.print("  " + t1[k]);
			// System.out.println("indice de l'élément :" + k + " valeur :" + t1[k]);
		}
		System.out.println();

		// foreach, on parcourt la collection pour utiliser ou traiter les éléments
		System.out.println();
		System.out.print("Sur une ligne, éléments de t1 avec un foreach:\t");
		/* En C#, foreach( int f : t1){ } */
		/* En Java, for avec : */
		for (int f : t1) {
			// traitement
			System.out.print("  " + f);
		}
		System.out.println();
		System.out.println();

		// Pour afficher une liste ordonnée, je souhaite affiche le no d'ordre
		// D'où, j'ai besoin des indices. J'utilise le for classique
		System.out.println("Liste des éléments de t1 avec leur no d'ordre:\t");
		for (int k = 0; k < t1.length; k++) {
			System.out.println("\t" + (k + 1) + "   " + t1[k]);

			// System.out.println("No d'ordre :" + (k+1) + " valeur :" + t1[k]);
			// System.out.println("indice de l'élément :" + k + " valeur :" + t1[k]);
		}
		System.out.println();

		System.out.println("/////////////////////////////////////////////////////////");
		System.out.println("//exemple de traitement : on cumule les valeurs des cases");
		somme = 0;
		System.out.println();
		for (int f : t1) {
			somme = somme + f; // somme += f;
		}
		System.out.println("Voici la somme des valeurs de t1 :" + somme);
		System.out.println();

		//////////////////////////////////////////////////////
		// Aparté: programmation fonctionnelle de Java 8
		// l'API des stream (flux) package ava.util.stream.*
		// java 8 flux + lambda expression
		//////////////////////////////////////////////////////

		System.out.println("/////////////////////////////////////////");
		System.out.println("// Programmation fonctionnelle de Java 8");
		System.out.println("//Java 8: affichage des éléments de t1 avec l'API des stream + lambda");

		java.util.stream.IntStream.of(t1).forEach((e) -> System.out.print("  " + e));// Internal iteration
		System.out.println();

		System.out.println();
		System.out.println("////////////////////////////////////////////////");
		System.out.println("// Java 8: cumul des éléments de t1 avec l'API Stream");
		somme = IntStream.of(t1).sum();
		System.out.println("Voici la somme des valeurs de t1 :" + somme);

		System.out.println();

		////////////////////////////////////////////////
		// initialisateur {}
		////////////////////////////////////////////////
		System.out.print("\n//////////////////////////////////////////\n");
		System.out.print("// Utilisation d'un initialisateur pour t2:\t");
		// Les 3 phases précédentes sont réalisées
		int[] t2 = { 42, 77, 0 };
		// int[] t10 = {};//possible

		// foreach
		System.out.println();
		System.out.print("éléments de t2 avec un foreach:\t");
		System.out.print("t2:\t");
		for (int j : t2) {
			// traitement
			System.out.print("  " + j);
		}
		System.out.println();
		System.out.println();
		System.out.println();

		/////////////////////////////////////////////
		System.out.println("\n////////////////////////////");
		System.out.println("//tri  natural et ascendant");
		System.out.println("Arrays.sort ");
		System.out.println();
		// t2.sort() //ça ne marche pas

		Arrays.sort(t2);

		System.out.print("t2:\t");
		for (int j : t2) {
			System.out.print("  " + j);
		}
		System.out.println();

		System.out.println("\n////////////////////////////////////////");
		System.out.println("//Cas particulier du tableau de dimension 0");

		// tableau instancié mais avec length à 0
		// l'objet tableau existe mais il n'a aucune case
		int[] t10 = {};

		System.out.print("t10:\t");
		for (int j : t10) {
			System.out.print("  " + j);// utilisation
		}
		System.out.println("\n");

		//////////////////////////////////////////////
		// clonage
		//////////////////////////////////////////////
		System.out.println("\n//////////////////////////");
		System.out.println("clonage :");
		System.out.println("--------");
		int[] t3 = t1.clone();

		if (t1 == t3)
			System.out.println("les références sont égales");
		else
			System.out.println("les références sont différents");

		System.out.println();
		System.out.print("t3:\t");
		for (int j : t3) {
			// traitement
			System.out.print("  " + j);
		}
		System.out.println("\n");

		System.out.println("On change t1 en placant 66 ds la 2eme case");
		t1[1] = 66;

		System.out.println();
		System.out.print("t1:\t");
		for (int j : t3) {
			// traitement
			System.out.print("  " + j);
		}
		System.out.println();
		System.out.print("t3:\t");
		for (int j : t3) {
			// traitement
			System.out.print("  " + j);
		}
		System.out.println();
		/*
		 * Conclusion : Le clonage fonctionne bien pour un tableau de dim1 de primitifs
		 */

		//////////////////////////////////////////////////////
		// Travail à réaliser:
		// voir aussi les COPIER/COLLER PARTIEL de tableau
		// grâce aux méthodes statiques de java.util.Arrays et java.lang.System
		//////////////////////////////////////////////////////
		// Etudiez les méthodes static de la classe java.lang.Arrays
		// java.util.Arrays.copyOf(original, newLength);

		// passerelle vers les collections
		// java.util.Arrays.asList(t1);

		// Etudiez les méthodes static arraycopy de la classe System
		// java.lang.System.arraycopy(src, srcPos, dest, destPos, length)
	}
}
