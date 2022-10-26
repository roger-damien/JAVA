package darman.part5;

import java.util.Scanner;

public class Exo5_08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int max=0,pos=0,n;
		for(int i=1;i<=20;i++) {
			System.out.printf("Entre un entier (%d): ",i);
			if((n=sc.nextInt())>max) {
				max=n;
				pos=i;
			}
		}
		System.out.printf("\nLe plus grand entier est %d, c'etait ta saisie numero %d",max,pos);
		
		sc.close();
	}
	
}
