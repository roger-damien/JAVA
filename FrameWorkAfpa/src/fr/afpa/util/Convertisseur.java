package fr.afpa.util;


import fr.afpa.math.Math;
import java.math.BigDecimal;


import javax.swing.JOptionPane;

public class Convertisseur {
	
	public static String saisie;
	
	

	public static void main(String[] args) {
		
		String[] options = {"Euro To Dollar", "Dollar To Euro"};
		
		 int x = JOptionPane.showOptionDialog(null, "Choisissez votre monnaie à convertir :",
	                "Click a button",
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	        System.out.println(x);
		
	        if (x == 0) {
	        	
	        	saisie = JOptionPane.showInputDialog("Entrez en euros") ;
	    		
	    		BigDecimal bDecimal = new BigDecimal(saisie);
	    		
	    		JOptionPane.showMessageDialog(null, "Ca fait " + Math.euroToDollar(bDecimal) + " dollars" );
	        	
	        } else {
	        	
	        	saisie = JOptionPane.showInputDialog("Entrez en dollars") ;
	    		
	    		BigDecimal bDecimal = new BigDecimal(saisie);
	    		
	    		JOptionPane.showMessageDialog(null, "Ca fait " + Math.dollarToEuro(bDecimal) + " euros" );
	        	
	        }
	
		
//		
//		saisie = JOptionPane.showInputDialog("Entrez en euro") ;
//		
//		BigDecimal bDecimal = new BigDecimal(saisie);
//		
//		JOptionPane.showMessageDialog(null, Math.euroToDollar(bDecimal) );

	}

}
