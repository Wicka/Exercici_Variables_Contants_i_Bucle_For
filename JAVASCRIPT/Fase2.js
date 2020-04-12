/*
 * FASE 2  EN JAVASCRIPT
Sabent que l’any 1948 es un any de traspàs:
●	Creeu una constant amb el valor de l’any (1948).
●	Creeu una variable que guardi cada quan hi ha un any de traspàs.
●	Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor resultant en una variable.
●	Mostreu per pantalla el resultat del càlcul.
 */

function Fase2() {   
		
		const anyTraspas=1948;
		var periodo=4;
		var anyNaixament=1971;
		var resultado;
		resultado =parseInt((anyNaixament-anyTraspas)/periodo);		
		console.log("Entre el any del teu naixement " + anyNaixament+ " i l'any "+ anyTraspas+" hi han "+resultado+" anys.");
	}
