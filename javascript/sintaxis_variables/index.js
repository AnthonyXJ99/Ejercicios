// Enunciado del ejercicio:

// Crea un nuevo archivo JS que contenga una lista con los siguientes elementos:
// - Tu nombre (string)
// - Tu edad (number)
// - ¿Eres desarrollador? (boolean)
// - Tu fecha de nacimiento (Date)
// - Tu libro favorito (Objeto con propiedades: titulo, autor, fecha, url)

var datos=[
    nombre="Antoni",
    edad= 24,
    isDeveloper= true,
    birthDate=new Date(1999,3,9),
    book={
        titulo: "El Feo",
        autor: "Carlos Cuauhtémoc Sánchez Dr.",
        fecha: new Date(2010,1),
        url: "https://www.amazon.com.mx/Feo-El-Carlos-Cuauhtemoc-Sanchez/dp/6079789736"
    }
];

console.log("Mi nombre: "+datos[0])
console.log("Mi edad: "+datos[1])
console.log("Mi fecha nacimiento: "+datos[3])
console.log("Mi libro: "+datos[4].titulo)