package exercice_10;

import java.util.Scanner;

public class Item3a {
	
	static private double[] tab=new double[10];
	static private int size=0;
	
	public Item3a() {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Saisis entre 1 et 10 notes\n(jusqu'à 2 chiffres après la virgule - un nombre negatif arrête la saisie)\n");
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
		sc.close();
	}
	
	public static void main(String[] args) {
		new Item3a();
		if(size>0)
			System.out.printf("\nNote la plus basse : %.2f\nNote la plus haute : %.2f\nMoyenne : %.2f\nNote mediane : %.2f",min(),max(),moy(),med());
		else
			System.out.printf("\nTu n'as pas saisi de note");
	}
	
	static private void triTableau(double[] tab) {
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
	}
	
	static public double min() {
		double[] temp=tab.clone();
		triTableau(temp);
		return temp[0];
	}
	
	static public double max() {
		double[] temp=tab.clone();
		triTableau(temp);
		return temp[size-1];
	}
	
	static public double moy() {
		double sum=0;
		for(double d : tab)sum+=d;
		return sum/size;
	}
	
	static public double med() {
		double[] temp=tab.clone();
		triTableau(temp);
		return temp[(int)Math.round((double)(size-1)/2)];
	}
	
}
