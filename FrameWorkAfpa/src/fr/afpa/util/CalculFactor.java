package fr.afpa.util;

import java.util.Scanner;

import javax.swing.RepaintManager;

import static fr.afpa.math.Math.factorielFor;
import static fr.afpa.math.Math.factoriel;

public class CalculFactor {

	static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		String rep2;
		do { 
			System.out.println("Ecrivez le nombre dont on veut calculer la factorielle :");
			long nbr = clavier.nextLong();
			//long var = factorielFor(nbr);
			long var = factoriel(nbr);
			clavier.nextLine();// corriger bugg
			
			if (var == -1) {
				System.out.println("Il n'y a pas de factorielle pour les négatifs !");
			}
			else if (var == -2) {
				System.out.println("Le paramètre est trop grand !");
			}
			else {
				System.out.println(var);
			}
			rep2 = reload();
			
		}
		while (rep2.equals ("o"));
	}
	
	
	static String reload() {
		String rep;
		do {
			System.out.println("Recommencez (o/n) :");
			rep = clavier.nextLine().toLowerCase();
		}
		while (!rep.equals ("o") && !rep.equals ("n") );
		return rep;
		
	}
	
}
