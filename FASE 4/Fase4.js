/*
 * FASE 4   
●	Creeu una variable on juntareu el nom i els cognoms (tot en una variable) 
	i un altre on juntareu la data de naixement separada per “/” (tot en una variable). 
	Mostreu per consola les variables del nom complet, 
	la data de naixement i si l’any de naixement es de traspàs o no.
	Exemple de sortida per consola:
	El meu nom és Juan Perez Gonzalez
	Vaig néixer el 01/01/1979
	El meu any de naixement és de traspàs.
 */

function Fase4 () {
	
	var dia=16, mes=12, any=1971;	

	var nom="Ester", cognom1 ="Mesa", cognom2="Pareja", 
		cert="El meu any de naixement és de traspàs.",
		fals="El meu any de naixement té 365 i no es de traspàs.";
		
	var data,nomSenser;
		
	nomSenser= cognom1 + " " + cognom2 + ", " + nom;
	data = dia +"/"+ mes +"/" + any;
		
	console.log("El meu nom és " + nomSenser);	
	console.log("Vaig néixer el " + data);

	if ((any % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0))) { 
		console.log(cert);
	}else {
		console.log(fals);					
	}
}