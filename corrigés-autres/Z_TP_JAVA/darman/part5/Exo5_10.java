package darman.part5;

import java.util.Scanner;

public class Exo5_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Entrer 0 terminera la saisie\n\n");
		
		int tot=0,n;
		do {
			System.out.printf("Prix de l'article (entier) : ");
			tot+=(n=sc.nextInt());
		}
		while(n!=0);
		System.out.printf("La facture s'élève à : %d €\n",tot);
		
		System.out.printf("Somme payée (entier) : ");
		int pay=sc.nextInt();
		
		int ten=0,five=0,one=0;
		if(tot==pay) {
			System.out.printf("Il n'y a pas de monnaie à rendre");
		}
		else if(tot>pay) {
			System.out.printf("Tu n'as pas donné assez");
		}
		else {
			while(tot<pay) {
				if(tot+10<=pay) {
					System.out.printf("10€\n");
					ten++;
					pay-=10;
				}
				else if(tot+5<=pay){
					System.out.printf("5€\n");
					five++;
					pay-=5;
				}
				else if(tot+1<=pay){
					System.out.printf("1€\n");
					one++;
					pay-=1;
				}
			}
		}
		System.out.printf("Monnaie : %d billets de 10€, %d billets de 5€ et %d pieces de 1€\nMerci et a bientot",ten,five,one);
		
		sc.close();
	}
	
}
