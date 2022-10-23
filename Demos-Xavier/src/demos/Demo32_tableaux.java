package demos;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Demo32_tableaux {
	/**
	 * Test sur le tableau de dimension 1 contenant des OBJETS String et
	 * StringBuffer Ces essais sont liés aux slides sur les tableaux Les objets
	 * String sont non-mutables (pour leur contenu) Les objets StringBuffer sont des
	 * chaines mutables
	 * 
	 * @author afpa
	 */

	public static void main1(String... args) throws CloneNotSupportedException {

		System.out.println();
		System.out.println("//////////////////////////////////////////////////////");
		System.out.println("/*tableau de dimension 1 contenant des objets String */");
		System.out.println("//////////////////////////////////////////////////////");
		System.out.println();

		//////////////////////////////////////////////////////
		// Curiosité: Tableau anonyme comme paramètre de méthode ???????
		String message = new String(new char[] { 'H', 'e', 'l', 'l', 'o' });

		//////////////////////////////////////////////////////
		// tableau de dimension 1 contenant des objets String */
		// Les objets String ne sont pas mutable (non-mutables) pour leur contenu
		// au tableau, voir schéma du graphe d'objets !!!!
		//////////////////////////////////////////////////////
		String[] t4 = { "Bonjour", new String(new char[] { 'H', 'e', 'l', 'l', 'o' }), new String("Gutten-Morgen") };

		// Remarque: si on a "null" dans un l'initialisateur{} => pas d'objet mais la
		// case est prévue
		// String[] t4 = { "Bonjour", "Hello", "Guten-Morgen", null};
		// Pour afficher, on essaye le toString()
		System.out.println("NOK le toString() de t4 :" + t4.toString()); // non satisfaisant //toString mal développé?
		System.out.println();

		System.out.println("OK affichage avec Arrays.toString");
		System.out.println("tableau t4 :" + Arrays.toString(t4));
		// bonne idée de mettre le tableau sur une ligne

		System.out.println();

		// Utiliser les indices, si j'ai besoin du no d'ordre dans une liste ordonnée
		// affichée
		// Liste ordonnée
		System.out.println("Liste des éléments de t4 avec leur no d'ordre:\t");
		for (int k = 0; k < t4.length; k++) {
			System.out.println("\tNo d'ordre :" + (k + 1) + "     " + t4[k]);
			// System.out.println("No d'ordre :" + (k+1) + " valeur :" + t1[k]);
			// System.out.println("indice de l'élément :" + k + " valeur :" + t1[k]);
		}

		System.out.println();
		System.out.println("OK affichage sur une ligne avec le foreach");
		// foreach
		System.out.print("t4:\t");
		for (String s : t4) {
			// traitement
			System.out.print("  " + s);
		}
		System.out.println();

		System.out.println();
		// exemple de traitement : on concatène les chaînes
		System.out.println("Voici la concaténation des chaînes de t4 dans une autre chaine");
		String texte = "";
		for (String s : t4) {
			texte = texte + " " + s; // texte += s;
		}
		System.out.println("texte:\t" + texte);

		//////////////////////////////////////////////////////
		// Aparté: programmation fonctionnelle de Java 8
		System.out.println("//////////////////////////////////////////////////////");
		System.out.println("//Java 8: programmation fonctionnelle ");
		System.out.println();

		// somme = java.util.stream.Stream<Integer>(t5).length;
		// (t5).sum();
		// System.out.println("Voici la somme des valeurs de t5 :" + somme);

		System.out.println("//Java 8: affichage de t4 avec l'API Stream Java8");
		System.out.println();
		// List<Integer> list = Arrays.asList(t5);
		Arrays.asList(t4).forEach((e) -> System.out.print("  " + e));
		System.out.println();
		// listes.forEach( System.out::println );//avec référence de méthode !
		Arrays.asList(t4).forEach(System.out::println);
		System.out.println();

		System.out.println();
		/////////////////////////////////////////////////////////////////
		// Le tri (par défaut (croissant (ascendant)))
		/////////////////////////////////////////////////////////////////
		// VOIR LES SLIDES SUR LA NOTION DE TRI
		// Dans Darmangeat, vous devez les tris de manière algorithmique
		/////////////////////////////////////////////////////////////////
		// Remarque: Arrays.sort() vérifie si les éléments de la collection
		// sont Comparable (opérateur "instanceof") car alors il est sûr qu'il
		// y a la méthode compareTo()
		Arrays.sort(t4);

		System.out.println("Tri avec la méthode Arrays.sort");
		System.out.println("tableau t4 :" + Arrays.toString(t4));
		System.out.println();

		System.out.print("t4:\t");
		for (String s : t4) {
			System.out.print("  " + s);
		}

		System.out.println();
		System.out.println("//////////////////////////////////////////////////////////");
		System.out.println("//tableau de dimension 1 contenant des objets StringBuffer");
		System.out.println("//     objets mutables !!!!");
		System.out.println("//////////////////////////////////////////////////////////");
		//////////////////////////////////////////////////////
		/* tableau de dimension 1 contenant des objets StringBuffer */
		/* Les objets StringBuffer sont mutables */
		//////////////////////////////////////////////////////
		/*
		 * StringBuffer[] t11 = { new StringBuffer("Bonjour"), new
		 * StringBuffer("Hello"), new StringBuffer("Guten-Morgen")};
		 */
		StringBuffer[] t11 = { new StringBuffer("Bonjour"),
				// null,
				new StringBuffer("Hello"), new StringBuffer("Guten-Morgen") };

		// Pour afficher, on essaye le toString()
		System.out.println("NOK le toString() de t11 :" + t11.toString()); // non satisfaisant //toString mal développé?
		System.out.println();

		System.out.println("OK affichage avec Arrays.toString");
		System.out.println("tableau t11 :" + Arrays.toString(t11));
		// bonne idée de mettre le tableau sur une ligne

		System.out.println();
		// foreach
		System.out.println();
		System.out.println("OK affichage avec le foreach");
		System.out.print("t11:\t");
		for (StringBuffer s : t11) {
			// traitement
			System.out.print("  " + s);
		}
		System.out.println();

		System.out.println();

		// exemple de traitement : on concatène les chaînes
		texte = "";
		System.out.println();
		for (StringBuffer s : t11) {
			if (s == null)
				s = new StringBuffer("null");
			else
				texte = texte + " " + s; // texte += s;
		}
		System.out.println("Voici la concaténation des chaînes de t11 dans une autre chaine");
		System.out.println("texte:\t" + texte);

		System.out.println();
		/////////////////////////////////////////////////////////////////
		// Le tri (par défaut (croissant (ascendant)))
		/////////////////////////////////////////////////////////////////
		// VOIR LES SLIDES SUR LA NOTION DE TRI
		// Dans Darmangeat, vous devez les tris de manière algorithmique
		/////////////////////////////////////////////////////////////////
		// Remarque: Arrays.sort() vérifie si les éléments de la collection
		// sont Comparable (opérateur "instanceof") car alors il est sûr qu'il
		// y a la méthode compareTo()
		/////////////////////////////////////////////////////////////////////
		// StringBuffer est bien Comparable
		// tri sur le critère par défaut et tri ascendant
		/////////////////////////////////////////////////////////////////////
		Arrays.sort(t11);

		// Remarque: Arrays.sort() vérifie si les éléments de la collection
		// sont Comparable (opérateur "instanceof") car alors il est sûr qu'il
		// y a la méthode compareTo()
		System.out.print("t11:\t");
		for (StringBuffer s : t11) {
			System.out.print("  " + s);
			// traitement
		}
		System.out.println();
		// clonage
		//////////////////////////////////////////////

		System.out.println("//////////////////////////////////////////////////////");
		System.out.println("//clonage ... en surface ou clonage en profondeur ?");
		System.out.println("//shallow copy or deep copy ?");

		StringBuffer[] t12 = t11.clone();

		System.out.println();
		System.out.println(" Avec t12, fabrication d'un clone de t11");
		System.out.print("t12:\t");
		for (StringBuffer s : t12) {
			System.out.print("  " + s);
		}
		System.out.println();
		System.out.println();
		System.out.println(" modification de t11 pour voir si impact sur t12");

		t11[0].append(" les CDA");

		System.out.print("t11:\t");
		for (StringBuffer s : t11) {
			System.out.print("  " + s);
		}
		System.out.println();
		System.out.print("t12:\t");
		for (StringBuffer s : t12) {
			System.out.print("  " + s);
		}
		System.out.println();
		System.out.println("Shallow copy or deep copy ? :  ...............");
		/////////////////////////////////////////////////////////////////////////////
		// Rappel: Le clonage fonctionnait pour un tableau dim1 de primitifs
		// Conclusion: Pour les tableaux d'objets StringBuffer dim1,
		// le clonage n'est qu'un clonage en "surface" (pas en profondeur)
		// Shallow copy or deep copy
		/////////////////////////////////////////////////////////////////////////////

	}

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
