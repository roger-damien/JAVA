package darman.part3;

import java.util.Scanner;

public class Exo3_04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double nbre;
		System.out.printf("Entre un nombre : ");
        nbre=sc.nextDouble();
        
        if(nbre>0) {
        	System.out.printf("Le nombre est positif");
        }
        else if(nbre<0) {
        	System.out.printf("Le nombre est negatif");
        }
        else {
        	System.out.printf("Le nombre est zero");
        }
        
        sc.close();
	}
	
}

