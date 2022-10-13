import java.lang.Math;
import java.util.Scanner;

public class MonApp {
public static void main(String[] args) {

	java.util.Scanner sc = new Scanner( System.in );
		

// Affiche "Ecrire un nombre: "
	System.out.print("Ecrire un nombre maxi: ");
	
		
	//Lit l'entier écrit par l'utilisateur et l'affecte 
        // à  la variable nombre du programme
        int nombre = sc.nextInt();

int i=0;
int i2=0;
double i3=0;

		for (i=1;i < nombre;i++)
			
		{

i2 = (int) Math.pow(i,2);
i3 = (double) Math.sqrt(i);
			System.out.println("resultat  :" + i + " | " + i2 + " | " + i3);
		}
	
}
}