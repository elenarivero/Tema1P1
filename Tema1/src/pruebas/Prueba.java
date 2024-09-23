package pruebas;

import java.util.*;

public class Prueba {
	
	public static void main(String[] args) {		
		// Variable que almacena la edad
		int edad;
		
		// Variable para almacenar el nombre
		String name;
		
		Scanner lectura = new Scanner(System.in);
		
		System.out.println("Introduzca su edad");
		edad = lectura.nextInt();
		lectura.nextLine();
		
		System.out.println(edad);
		
		System.out.println("Dime tu nombre");
		
		name = lectura.nextLine();
		
		System.out.println("Tu nombre es " + name);
	}

}
