package darman.part2;

import java.util.Scanner;

public class Exo2_04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double ht,tva,ttc;
		int qte;
		
		System.out.printf("Prix HT de l'article\t: ");
        ht=sc.nextDouble();
        System.out.printf("Quantite achetee\t\t: ");
        qte=sc.nextInt();
        System.out.printf("Taux de TVA\t\t: ");
        tva=sc.nextDouble();

        ttc=qte*ht*(1+tva/100);
        System.out.printf("\nLa facture ttc est %.2f €",ttc);

        sc.close();
	}
}
