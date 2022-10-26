package exercice_04;

import java.util.Scanner;

public class Item_02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("1. Addition\n2. Soustraction\n3. Multiplication\n4. Division\nChoisis une operation :");
		int c=sc.nextInt();
		double a=0,b=0;
		
		if(c>=1&&c<=4) {
			System.out.printf("\n1er operande :");
			a=sc.nextDouble();
			System.out.printf("2e operande :");
			b=sc.nextDouble();
		}
		
		switch(c) {
			case 1:System.out.printf("\n%.2f + %.2f = %.2f",a,b,a+b);break;
			case 2:System.out.printf("\n%.2f - %.2f = %.2f",a,b,a-b);break;
			case 3:System.out.printf("\n%.2f x %.2f = %.2f",a,b,a*b);break;
			case 4:System.out.printf("\n%.2f / %.2f = %.2f",a,b,a/b);break;
			default:System.out.printf("\nJe n'ai pas compris ton choix");
		}
				
		sc.close();
	}

}
