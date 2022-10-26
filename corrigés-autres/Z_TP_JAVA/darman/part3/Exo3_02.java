package darman.part3;

import java.util.Scanner;

public class Exo3_02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double nbre1,nbre2;
		System.out.printf("Entre un premier nombre : ");
        nbre1=sc.nextDouble();
        System.out.printf("Entre un deuxieme nombre : ");
        nbre2=sc.nextDouble();
        
        if((nbre1>0 && nbre2>0)||(nbre1<0 && nbre2<0)) {
        	System.out.printf("Le produit de ces nombres est positif");
        }
        else {
        	System.out.printf("Le produit de ces nombres est negatif");
        }
        
        sc.close();
	}
	
}
