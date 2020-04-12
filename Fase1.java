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
	String nom, cognom1, cognom2;
	
	dia=16;
	mes=12;
	any=1971;
	
	nom="Ester";
	cognom1 ="Mesa";
	cognom2="Pareja";
	
	System.out.println(cognom1 + " " + cognom2 + ", " + nom);	
	System.out.println(dia +"/"+ mes +"/" + any);

	}
	
}
