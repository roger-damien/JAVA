package darman.part5;

import java.util.Scanner;

public class Exo5_02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		
		do {
			System.out.printf("Entre un entier entre 10 et 20 : ");
			n=sc.nextInt();
			if(n<10)
				System.out.printf("Plus grand\n");
			else if(n>20)
				System.out.printf("Plus petit\n");
		}
		while(!(n>=10&&n<=20));
			
		System.out.printf("\nTon entier est le %d",n);
		
		sc.close();
	}
	
}
