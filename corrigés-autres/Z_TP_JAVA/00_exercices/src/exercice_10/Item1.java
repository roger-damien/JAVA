package exercice_10;

import java.util.Arrays;

public class Item1 {

	public static void main(String[] args) {
		int[] tab1= {12,45,3,76,-4,0,76,100,-36,62};
		
		System.out.printf("Initialisation et copie de tab1 dans tab2x\n");
		int[] tab2a=tab1;
		
		int[] tab2b=tab1.clone();
		
		int[] tab2c=new int[10];
		for(int i=0;i<tab1.length;i++)
			tab2c[i]=tab1[i];
		int[] tab2d=new int[10];
		System.arraycopy(tab1,0,tab2d,0,tab1.length);
		int[] tab2e=Arrays.copyOf(tab1,tab1.length);
		
		// AFFICHAGE DES TABLEAUX AVEC LEURS VALEURS INITIALES
		System.out.printf("tab1 =%s\ntab2a=%s\ntab2b=%s\ntab2c=%s\ntab2d=%s\ntab2e=%s\n",Arrays.toString(tab1),Arrays.toString(tab2a),Arrays.toString(tab2b),Arrays.toString(tab2c),Arrays.toString(tab2d),Arrays.toString(tab2e));
		
		// TAB + 10 SUR TOUTES LES CELLULES
		System.out.printf("\n+ 10 pour chaque entier contenu dans tab1\n");
		for(int i=0;i<tab1.length;i++)
			tab1[i]+=10;
		// AFFICHAGE DES TABLEAUX APRES LES ADDITIONS FAITES SUR tab1
		System.out.printf("tab1 =%s\ntab2a=%s\ntab2b=%s\ntab2c=%s\ntab2d=%s\ntab2e=%s\n",Arrays.toString(tab1),Arrays.toString(tab2a),Arrays.toString(tab2b),Arrays.toString(tab2c),Arrays.toString(tab2d),Arrays.toString(tab2e));
		
		// TRI DE tab1
		System.out.printf("\nTri du tableau (avec Arrays.sort... pour de l'algo voir darman.part7\n");
		Arrays.sort(tab1);
		System.out.printf("tab1 =%s\n",Arrays.toString(tab1));
	}

}
