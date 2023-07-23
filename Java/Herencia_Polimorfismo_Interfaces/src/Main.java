
public class Main {

	public static void main(String[] args) {
		/*
		Crea una clase Persona con las siguientes variables:
			La edad
			El nombre
			El teléfono
			
			1.- Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
			Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas 
			por pantalla.
			
			2.- Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
		*/
		
		
		/// 1.
		Cliente cliente=new Cliente(19, "Javier Pardo", "+51 95871854", 505.45);
		System.out.println(cliente.toString());
		
		/// 2.
		Trabajador trabajador=new Trabajador(25, "Percy Samuel", "+51 97584241", 1500.00);
		System.out.println(trabajador.toString());
		
	}

}
