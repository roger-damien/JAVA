package darman.part5;

import java.util.Scanner;

public class Exo5_09 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Entrer 0 terminera la saisie\n\n");
		
		int max=0,pos=0,i=1,n;
		do {
			System.out.printf("Entre un entier (%d): ",i);
			if((n=sc.nextInt())>max) {
				max=n;
				pos=i;
			}
			i++;
		}
		while(n!=0);
		System.out.printf("\nLe plus grand entier est %d, c'etait ta saisie numero %d",max,pos);
		
		sc.close();
	}
	
}
