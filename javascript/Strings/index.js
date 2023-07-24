// Enunciado del ejercicio:
// Crea un archivo JS que contenga las siguientes líneas
// - Una cadena de texto con tu Nombre
// - Otra cadena de texto con tu Apellido
// - Una cadena de texto que se llame "estudiante" concatenando tu Nombre y tu Apellido con un espacio entre medias
// - Una cadena de texto que se llame "estudianteMayus" que contenga la cadena estudiante pero todo en mayúsculas
// - Una cadena de texto que se llame "estudianteMinus" que contenga la cadena estudiante pero todo en minúsculas
// - Una variable que contenga el número de letras de la cadena "estudiante" contando los espacios
// - Una variable que contenga la primera letra del Nombre
// - Otra variable que contenga la última letra del Apellido
// - Una cadena de texto que elimine los espacios de la variable "estudiante"
// - Una variable booleana que diga si el Nombre está contenido en la variable "estudiante"

let nombre="Antoni";

let apeliido ="Escalante";

let estudiante= nombre.concat(" ",apeliido);
console.log(`estudiante: ${estudiante}`);

let estudianteMayus= estudiante.toUpperCase();
console.log(estudianteMayus);

let estudianteMinus=estudiante.toLowerCase();
console.log(estudianteMinus);

let nroLetras= estudiante.length;
console.log(nroLetras);

let firstLetter= nombre.charAt(0);
console.log(firstLetter);

let endLetter= apeliido.slice(-1)
console.log(endLetter);

let notSpace= estudiante.trim().replace(/ /,"");
console.log(notSpace);


let isExists= estudiante.includes(nombre);
console.log(isExists);
