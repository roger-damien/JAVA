package exercice_10;

import java.util.Scanner;
import java.util.ArrayList;

public class Item3c {
	
	static private ArrayList<Double> tab = new ArrayList<Double>();
	
	public Item3c() {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Saisis entre 1 et 10 notes\n(jusqu'à 2 chiffres après la virgule - un nombre negatif arrêtera la saisie)\n");
		int i=1;
		double val;
		do {
			System.out.printf("%d%s note : ",i,(i==1?"ere":"eme"));
			val=Math.round(sc.nextDouble()*100);
			if(val>=0) {
				tab.add(val/100);
				i++;
			}
		}
		while(i<11&&val>=0);
		sc.close();
	}
	
	public static void main(String[] args) {
		new Item3c();
		if(tab.size()>0)
			System.out.printf("\nNote la plus basse : %.2f\nNote la plus haute : %.2f\nMoyenne des notes  : %.2f\nNote mediane       : %.2f",min(),max(),moy(),med());
		else {
			System.out.printf("\nTu n'as pas saisi de note");
		}
	}
	
	static private void triTableau(ArrayList<Double> tab) {
		boolean flag=true;
		while(flag) {
			flag=false;
			for(int i=0;i<tab.size()-1;i++) {
				if(tab.get(i)>tab.get(i+1)) {
					double temp=tab.get(i);
					tab.set(i,tab.get(i+1));
					tab.set(i+1,temp);
					flag=true;
				}
			}
		}
	}
	
	static public double min() {
		//return tab.stream().mapToDouble(a->a).min().getAsDouble();
		ArrayList<Double> temp=(ArrayList<Double>) tab.clone();
		triTableau(temp);
		return temp.get(0);
	}
	
	static public double max() {
		//return tab.stream().mapToDouble(a->a).max().getAsDouble();
		ArrayList<Double> temp=(ArrayList<Double>) tab.clone();
		triTableau(temp);
		return temp.get(temp.size()-1);
	}
	
	static public double moy() {
		return tab.stream().mapToDouble(a->a).sum()/tab.size();
	}
	
	static public double med() {
		ArrayList<Double> temp=(ArrayList<Double>) tab.clone();
		//temp.sort(null);
		triTableau(temp);
		return temp.get((int)Math.round((double)(temp.size()-1)/2));
	}

}
