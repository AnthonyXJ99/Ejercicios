// Enunciado del ejercicio:
// Crea los siguientes archivos JS:
//     - factorial-for.js -> Este archivo debe calcular el factorial de 10 utilizando un solo bucle for
//     - factorial-while.js -> Este archivo debe calcular el factorial de 10 utilizando un bucle while
//     - factorial-break.js -> Este archivo debe calcular el factorial de 10 utilizando un bucle while, una bifurcación if y una sentencia break

var factorial=10;
var result=1;

// Facorial con FOR
for (let i = factorial; i >0; i--) {
    result*=i;
}
console.log(` factorial con FOR: ${result}`) 



// factorial con WHILE
result=1;

while(factorial>0){
    result*=factorial;
    factorial--;
}
console.log(`Factorial con WHILE ${result}`)


// factorial con BREAK
factorial=10;
result=1;

while(true){
    if(factorial<=0)
        break;

    result*=factorial;
    factorial--;
}
console.log(`Factorial con BREAK ${result}`)
