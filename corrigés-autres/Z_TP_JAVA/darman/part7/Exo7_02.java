package darman.part7;

import java.util.Arrays;

public class Exo7_02 {

	public static void main(String[] args) {
		System.out.printf("Tri par selection\n");
		int[] tab= {12,87,3,17,43,23,-2,98,9,33};
		System.out.printf("tab=%s\n",Arrays.toString(tab));
		for(int i=0;i<tab.length-1;i++) {
			for(int j=i+1;j<tab.length;j++) {
				if(tab[j]>tab[i]) {
					int temp=tab[j];
					tab[j]=tab[i];
					tab[i]=temp;
				}
			}
		}
		System.out.printf("tab=%s\n",Arrays.toString(tab));
		
		System.out.printf("\nTri a bulles\n");
		int[] tab1= {12,87,3,17,43,23,-2,98,9,33};
		System.out.printf("tab=%s\n",Arrays.toString(tab1));
		boolean flag=true;
		while(flag) {
			flag=false;
			for(int i=0;i<tab1.length-1;i++) {
				if(tab1[i]<tab1[i+1]) {
					int temp=tab1[i];
					tab1[i]=tab1[i+1];
					tab1[i+1]=temp;
					flag=true;
				}
			}
		}
		System.out.printf("tab=%s\n",Arrays.toString(tab1));
	}

}
