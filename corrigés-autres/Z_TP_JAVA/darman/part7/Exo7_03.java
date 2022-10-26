package darman.part7;

import java.util.Arrays;

public class Exo7_03 {

	public static void main(String[] args) {
		int[] tab= {12,87,3,17,62,43,23,-2,98,9,33};
		System.out.printf("Tableau initial\ntab=%s\n",Arrays.toString(tab));
		
		for(int i=0;i<Math.floor(tab.length/2);i++) {
			int temp=tab[i];
			tab[i]=tab[tab.length-1-i];
			tab[tab.length-1-i]=temp;
		}
		System.out.printf("Tableau inverse\ntab=%s\n",Arrays.toString(tab));
	}

}
