
public class Main {

	public static void main(String[] args) {
		/*Enunciado del ejercicio:
			En este ejercicio practicarás las estructuras de control, para ello deberás crear:
			
			1.  Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
				Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
			
			2.  Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
				Incrementar el valor de la variable en uno cada vez que se ejecute.
				Mostrarlo por pantalla cada vez que se ejecute.
				
			3.  Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
		
			4.  Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, 
				se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
				
			5.  Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor 
				de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default
				para cuando el valor de la variable no sea una estación.
		*/
		
		// Ejercicio 1
		System.out.println("EJERCICIO 1:");
		int numeroIf=5;
		if(numeroIf>0) {
			System.out.println("Es positivo");
		}else if(numeroIf<0) {
			System.out.println("Es negativo");
		}else {
			System.out.println("Es 0");
		}
		
		// Ejercicio 2
		System.out.println("EJERCICIO 2:");
		int numeroWhile=-1;
		
		while (numeroWhile<3) {
			System.out.println("Numero: "+numeroWhile);
			numeroWhile++;
		}
		
		// Ejercicio 3
		System.out.println("EJERCICIO 3:");
		do {
			System.out.println("Numero: "+numeroWhile);
		} while (numeroWhile!=numeroWhile);
		
		// Ejercicio 4
		System.out.println("EJERCICIO 4:");
		int numeroFor=0;
		for (int i = 0; i <= 3; i++) {
			System.out.println("Numero: "+numeroFor);
			numeroFor++;
		}
		
		// Ejercicio 5
		System.out.println("EJERCICIO 5:");
		String estacion="PRIMAVERA";
		
		switch (estacion) {
			case "VENRANO": {
				System.out.println("Te encuentras en VERANO");
				break;
			}
			case "INVIERNO":{
				System.out.println("Te encuentras en INVIERNO");
				break;
			}
			case "OTOÑO":{
				System.out.println("Te encuentras en OTOÑO");
				break;
			}
			case "PRIMAVERA":{
				System.out.println("Te encuentras en PRIMAVERA");
				break;
			}
			default:
				break;
		}
	}

}
