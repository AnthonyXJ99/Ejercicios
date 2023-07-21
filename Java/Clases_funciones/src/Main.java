
public class Main {

	public static void main(String[] args) {
		
		/**
		 * Primera parte:
		 * Crear una función con tres parámetros que sean números que se suman entre sí.
		 * Llamar a la función en el main y darle valores.
		 */
		 suma(12,5,8);
		
		/**
		 * Segunda parte:
		 * Crear una clase coche.
		 * Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene
		 * Una función que incremente el número de puertas que tiene el coche.
		 * Crear un objeto miCoche en el main y añadirle una puerta.
		 * Mostrar el número de puertas que tiene el objeto.
		 */
		 
		 Coche miCoche= new Coche();
		 miCoche.intPuertas(4);
		 
		 System.out.println("Nor de Puertas del Coche: "+miCoche.getNPuertas());
		
		
		
	}
	
	
	 // Primera parte:
	 public static void suma (int a, int b, int c)
	  {
	    int result = a + b + c;
	    System.out.println ("Resultado: "+result);
	  }

}
