/*
 * FASE 3  
●	Partint de l’any 1948 heu de fer un bucle for i mostrar els anys de traspàs fins arriba al vostre any de naixement. 
	ATENCIO! Haureu de canviar el tipus de variable de l’any 1948 per poder modificar-la. 
●	Creeu una variable bool que sera certa si l’any de naixement és de traspàs o falsa si no ho és.(0,75 punts)
●	En cas de que la variable bool sigui certa, heu de mostrar per consola una frase on ho digui, 
	en cas de ser falsa mostrareu la frase pertinent. 
	Creeu dues variables string per guardar les frases. (1,5 punts)
 */

function Fase3() {

	var anyInici=1948;
	var anyNaixement=1971;		
	var traspas=true;		
	var Cert, Fals;
		
	Cert="El teu any de Naixement SI va ser un any de traspàs";
	Fals="El teu any de Naixement NO va ser un any de traspàs";		
		
	for (anyInici=1948+1; anyInici <= anyNaixement; anyInici++) {
					
		if ((anyInici % 4 == 0) && ((anyInici % 100 != 0) || (anyInici % 400 == 0))) { 
			console.log("L'any " + anyInici + " es un any de traspàs");
			traspas=true;
		}else {
			traspas=false;					
		}	
	}			
	if(traspas==true) {
		console.log(Cert);
	}else {
		console.log(Fals);
	}
}