package exercice_04;

import java.util.Scanner;

public class Item_03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("ax²+bx+c=0...\n");
		double a,b,c,d,x1,x2;
		
		do {
			System.out.printf("a : ");
			a=sc.nextDouble();
			if(a==0) {
				System.out.printf("a doit etre different de 0\n\n");
				continue;
			}
			
			System.out.printf("b : ");
			b=sc.nextDouble();
			System.out.printf("c : ");
			c=sc.nextDouble();
			
			d=Math.pow(b,2)-4*a*c;
			if(d>=0)break;
			System.out.printf("Il n'y a pas de solution a cette equation, recommençons avec d'autres valeurs\n");
		}
		while(true);
		
		if(d==0) {
			x1=-b/(2*a);
			System.out.printf("\nLe resultat de l'equation est x=%f",x1);
		}
		else {
			x1=(-b-Math.sqrt(d))/(2*a);
			x2=(-b+Math.sqrt(d))/(2*a);
			System.out.printf("Le resultat de l'equation est x1=%f et x2=%f",x1,x2);
		}
		
		sc.close();
	}

}
