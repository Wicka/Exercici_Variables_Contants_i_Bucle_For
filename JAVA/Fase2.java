/*
 * FASE 2  
Sabent que l’any 1948 es un any de traspàs:
●	Creeu una constant amb el valor de l’any (1948).
●	Creeu una variable que guardi cada quan hi ha un any de traspàs.
●	Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor resultant en una variable.
●	Mostreu per pantalla el resultat del càlcul.
 */

public class Fase2 {

	public static void main(String[] args) {
		
		final int anyTraspas=1948;
		int periodo=4;
		int anyNaixament=1971;
		int resultado;
		resultado =(anyNaixament-anyTraspas)/periodo;
		
		System.out.println("Entre el any del teu naixement " + anyNaixament+ " i l'any "+ anyTraspas+" hi han "+resultado+" anys.");
		
		
		
	}

}
