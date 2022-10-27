package fr.afpa.math;

import static fr.afpa.math.Math.factorielFor;
import static fr.afpa.math.Math.factoriel;

public class TestMath {
	
	public static void main(String[] args) {
		factorielTestZero ();
		factorielTestUN ();
		factorielTestVingt ();
		factorielTestVingtEtUn ();
		factorielTestMoinsUn ();
		factorielTestQuaranteCinq ();
	}
	
	
	static public void factorielTestZero () {
		
		if (factoriel (0) == 1) {
			System.out.println("Test ok !");
		}
		else {
			System.err.println("Test Nok : La factorielle de 0 est 1 !");
		}
	}
	
	
	static public void factorielTestUN () {
		
		if (factoriel (1) == 1) {
			System.out.println("Test ok !");
		}
		else {
			System.err.println("Test Nok : La factorielle de 1 est 1 !");
		}
	}
	
	
	static public void factorielTestVingt () {
		
		if (factoriel (20) == 2432902008176640000L ) {
			System.out.println("Test ok !");
		}
		else {
			System.err.println("Test Nok : La factorielle de 20 est 2432902008176640000 !");
		}
	}
	
	
	static public void factorielTestVingtEtUn () {
		
		if (factoriel (21) == -2) {
			System.out.println("Test ok !");
		}
		else {
			System.err.println("Test Nok : Le nombre 21 est trop grand  !");
		}
	}
	
	
	static public void factorielTestMoinsUn () {
		
		if (factoriel (-1) == -1) {
			System.out.println("Test ok !");
		}
		else {
			System.err.println("Test Nok : Le nombre est négatif !");
		}
	}
	
	
	static public void factorielTestQuaranteCinq () {
		
		if (factoriel (45) == -2) {
			System.out.println("Test ok !");
		}
		else {
			System.err.println("Test Nok : Le nombre 45 est trop grand !");
		}
	}
	

}
