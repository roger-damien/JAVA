package darman.part6;

import java.util.Arrays;

public class Exo6_01 {

	public static void main(String[] args) {
		int[] tab=new int[7];
		System.out.printf("tab=%s\n",Arrays.toString(tab));
		
		for(int i=0;i<7;i++) {
			tab[i]=0;// Pour le TP mais inutile
			if(i==0)System.out.printf("Ou\ntab=[%d",tab[i]);
			else System.out.printf(", %d",tab[i]);
		}
		System.out.printf("]");
	}

}
