
// Enunciado del ejercicio:
// Crea un archivo JS que contenga las siguientes líneas
// - Una variable que contenga tu altura en centímetros (entero)
// - Una variable que contenga tu altura en metros (número de coma flotante)
// - Una variable que contenga tu peso en kilogramos (número de coma flotante)
// - Una variable que contenga tu altura en metros redondeada hacia arriba
// - Una variable que contenga tu peso en kilogramos redondeado hacia abajo
// - Una variable que contenga si "el máximo valor que se puede obtener en Javascript + 1" es igual al máximo valor que se puede obtener en Javascript

let altura= 171;

let alturametros= 1.71;

let peso= 65.5;

let alturaM= Math.round(alturametros);
console.log(alturaM);

let pesoK= Math.floor(peso);
console.log(pesoK);

let max= Number.MAX_VALUE+1===Number.MAX_VALUE;
console.log(max);


