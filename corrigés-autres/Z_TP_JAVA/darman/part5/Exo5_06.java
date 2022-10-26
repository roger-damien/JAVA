package darman.part5;

import java.util.Scanner;

public class Exo5_06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Entre un entier > 0 : ");
		int n=sc.nextInt();
		
		int s=0;
		for(int i=1;i<=n;i++) {
			s+=i;
		}
		System.out.printf("Resultat de la somme : %d ",s);
		
		sc.close();
	}
	
}
