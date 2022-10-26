package darman.part5;

import java.util.Scanner;

public class Exo5_01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		
		do {
			System.out.printf("Entre un entier entre 1 et 3 : ");
			n=sc.nextInt();
		}
		while(!(n>=1&&n<=3));
			
		System.out.printf("\nTon entier est le %d",n);
		
		sc.close();
	}
	
}
