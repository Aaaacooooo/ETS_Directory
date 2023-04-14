package Persona;

public class Persona {
	
	private int edad;
	
	public Persona (int edad) {
		this.edad = edad;
	}
	public boolean isMAyorEdad () {
		assert edad >= 0;
		return edad >=18; 
	}
	
}
