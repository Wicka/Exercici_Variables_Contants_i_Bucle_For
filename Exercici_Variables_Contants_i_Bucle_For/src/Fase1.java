import java.util.*;

import javax.swing.JOptionPane;

/*
 * FASE 1 
●	Crea tres variables string e inicialitzales amb les dades pertinents (nom, cognom1, cognom2).
●	Crea tres variables int e inicialitzales amb les dades pertinents (dia, mes, any).
●	Mostra per pantalla les variables string concatenant-les en aquest ordre (cognom1 + cognom2, + nom).
●	Mostra per pantalla les variables int concatenant-les amb “/” entre cada una d’elles.
*/

public class Fase1 {
	
	public static void main(String args[]) {	
		
	int dia, mes, any;	
	String nom, cognom1, cognom2, texto;	
	
	// INTRODUCIR DATOS CUADRO EMERGENTE
	
	nom=JOptionPane.showInputDialog("Dime tu nombre : ");
	cognom1=JOptionPane.showInputDialog("Dime tu Primer apellido : ");
	cognom2=JOptionPane.showInputDialog("Dime tu Segundo apellido : ");
	
	texto=JOptionPane.showInputDialog("Dime tu dia nacimiento : ");
	dia=Integer.parseInt(texto);
	
	texto=JOptionPane.showInputDialog("Dime tu mes nacimientto : ");
	mes=Integer.parseInt(texto);
	
	texto=JOptionPane.showInputDialog("Dime tu año nacimiento : ");
	any=Integer.parseInt(texto);	
	
	System.out.println(cognom1 + " " + cognom2 + ", " + nom);	
	System.out.println(dia +"/"+ mes +"/" + any);
	
	/*
	 *  INTRODUCIR DATOS POR CONSOLA
	 *  
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Introduce tu dia de nacimiento : ");
	dia=entrada.nextInt();
	
	System.out.println("Introduce tu mes de nacimiento : ");
	mes=entrada.nextInt();
		
	System.out.println("Introduce tu año de nacimiento : ");
	any=entrada.nextInt();
	
	System.out.println("Introduce tu Nombre: ");
	nom=entrada.nextLine();
	
	System.out.println("Introduce tu Primer Apellido: ");
	cognom1=entrada.nextLine();
	
	System.out.println("Introduce tu Segundo Apellido: ");
	cognom2=entrada.nextLine();
	
	System.out.println(cognom1 + " " + cognom2 + ", " + nom);	
	System.out.println(dia +"/"+ mes +"/" + any);
	*/
	}	
}

