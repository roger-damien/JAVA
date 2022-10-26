package exercice_04;

import java.util.Scanner;

public class Item_01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double change=0.97,dollars;
		
		System.out.printf("Saisir le montant a convertir : ");
		double euros=sc.nextDouble();
		dollars=euros*change;
		
		if(dollars>1e6)System.out.printf("$%.0f million dollars",dollars/1e6);
		else if(dollars>1e3)System.out.printf("$%.0fK",dollars/1e3);
		else System.out.printf("$%.2f",dollars);
		
		sc.close();
	}

}
