package exercice_10;

import java.util.Arrays;

public class Item2 {

	public static void main(String[] args) {
		StringBuffer[] tab1={
				new StringBuffer("coucou"),
				new StringBuffer("salut"),
				new StringBuffer("hello"),
				new StringBuffer("bye"),
				new StringBuffer("ohayo"),
				new StringBuffer("sayonara"),
				new StringBuffer("ola"),
				new StringBuffer("hi"),
				new StringBuffer("guten tag"),
				new StringBuffer("ciao")
			};
		
		System.out.printf("Initialisation et copie de tab1 dans tab2x\n");
		StringBuffer[] tab2a=tab1;
		
		StringBuffer[] tab2b=tab1.clone();
		
		StringBuffer[] tab2c=new StringBuffer[10];
		for(int i=0;i<tab1.length;i++)
			tab2c[i]=tab1[i];
		StringBuffer[] tab2d=new StringBuffer[10];
		System.arraycopy(tab1,0,tab2d,0,tab1.length);
		StringBuffer[] tab2e=Arrays.copyOf(tab1,tab1.length);

		// AFFICHAGE DES TABLEAUX AVEC LEURS VALEURS INITIALES
		System.out.printf("tab1 =%s\ntab2a=%s\ntab2b=%s\ntab2c=%s\ntab2d=%s\ntab2e=%s\n",Arrays.toString(tab1),Arrays.toString(tab2a),Arrays.toString(tab2b),Arrays.toString(tab2c),Arrays.toString(tab2d),Arrays.toString(tab2e));
		
		// MODIFICATION DE LA PREMIERE LETTRE DE CHAQUE CHAINE CONTENU DANS tab1
		System.out.printf("\nModification de la 1ere lettre de chaque element de tab1\n");
		for(StringBuffer s : tab1){
			s.setCharAt(0,s.toString().toUpperCase().charAt(0));
		}
		System.out.printf("tab1 =%s\ntab2a=%s\ntab2b=%s\ntab2c=%s\ntab2d=%s\ntab2e=%s\n",Arrays.toString(tab1),Arrays.toString(tab2a),Arrays.toString(tab2b),Arrays.toString(tab2c),Arrays.toString(tab2d),Arrays.toString(tab2e));
	}

}
