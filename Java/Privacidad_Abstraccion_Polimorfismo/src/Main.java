
public class Main {

	public static void main(String[] args) {
		/*
		Para practicar la encapsulación:
			Crear clase Persona.
			Crear variables las privadas edad, nombre y telefono de la clase Persona.
			Crear gets y sets de cada propiedad.
			Crear un objeto persona en el main.
			Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
			*/
		
		Persona persona=new Persona();
		
		// Sets
		persona.setEdad(18);
		persona.setNombre("Marco Esteban");
		persona.setTelefono("+51 958747256");
		//Gets
		System.out.println("Edad :"+ persona.getEdad());
		System.out.println("Nombre :"+ persona.getNombre());
		System.out.println("Telefono :"+ persona.getTelefono());
		
		// Persona.ToString -> ARRAY 
		System.out.println(persona.toString());
		
		
	}

}
