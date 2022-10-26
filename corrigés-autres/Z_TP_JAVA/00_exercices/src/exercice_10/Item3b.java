package exercice_10;

import java.util.Scanner;

public class Item3b {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[] tab=new double[10];
		
		System.out.printf("Saisis entre 1 et 10 notes\n(jusqu'à 2 chiffres après la virgule - un nombre negatif arrête la saisie)\n");
		int size=0;
		double val;
		do {
			System.out.printf("%d%s note : ",size+1,(size==0?"ere":"eme"));
			val=Math.round(sc.nextDouble()*100);
			if(val>=0) {
				tab[size]=val/100;
				size++;
			}
		}
		while(size<11&&val>=0);
		
		if(size>0) {
			boolean flag=true;
			while(flag) {
				flag=false;
				for(int i=0;i<size-1;i++) {
					if(tab[i]>tab[i+1]) {
						double temp=tab[i];
						tab[i]=tab[i+1];
						tab[i+1]=temp;
						flag=true;
					}
				}
			}
			
			double med=tab[(int)Math.round((double)(size-1)/2)],sum=0;
			for(double d : tab)sum+=d;
			
			System.out.printf("\nNote la plus basse : %.2f\nNote la plus haute : %.2f\nMoyenne : %.2f\nNote mediane : %.2f",tab[0],tab[size-1],sum/size,med);
		}
		else
			System.out.printf("\nTu n'as pas saisi de note");
		
		sc.close();
	}

}
