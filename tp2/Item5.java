import java.lang.Math;

public class Item5 {
public static void main(String[] args) {

    int i;
    for (i=1;i<6;i++)
    {
        int a = 0 + (int)(Math.random() * ((10 - 0) + 1));
System.out.println("resultat du calcul : " + a);	
}

// afficher racine carrée de 4
double a = 4;
System.out.println("racine carrée de 4 :" + Math.sqrt(a));

// cosinus (pi/2)
System.out.println("cos de PI :" + Math.cos(Math.PI/2));
}
}