
/*Implemente una clase “Calculadora” que tenga cuatro métodos, uno por cada operación aritmética
básica (suma, resta, multiplicación y división), respetando las siguientes firmas:
● double sumar(double unNumero, double otroNumero);
● double restar(double unNumero, double otroNumero);
● double multiplicar(double unNumero, double otroNumero);
● double dividir(double unNumero, double otroNumero); 
*/

package calculadora;
import java.util.Scanner; // Importamos la clase Scanner de Java para leer la entrada del usuario desde la consola
import java.util.InputMismatchException;// Importamos la clase InputMismatchException de Java para manejar errores de entrada

public class Calculadora {
	
	
	
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);// Creamos un objeto Scanner para leer la entrada del usuario desde la consola
		
		double unNumero= 0;
		double otroNumero= 0;
		int operacion= 0;
		
		
		
		try { // Utilizamos una estructura try-catch para manejar errores de entrada del usuario
	
		System.out.println("Que operacion desea realizar: ");// Mostramos un mensaje solicitando la operación que desea realizar el usuario
		
		// Mostramos las opciones disponibles
		
		System.out.println("1. suma");
		System.out.println("2. resta");
		System.out.println("3. multiplicacion");
		System.out.println("4. division");
		
		operacion =teclado.nextInt();// Leemos el valor ingresado por el usuario y lo almacenamos en la variable operacion
		}
		
		
		
		catch(InputMismatchException ex) { // Capturamos una excepción InputMismatchException si el usuario ingresa un valor que no es un número
		System.out.println("Error debe ingresar un numero pera seleccionar la operacion");
		System.out.println("Ejecute el programa nuevamente");
		System.exit(0);
		}
		
		if(operacion<1||operacion>4) { // Verificamos que la operación ingresada por el usuario esté dentro del rango de opciones disponibles
			System.out.println("Error debe ingresar un numero del 1 al 4");
			System.out.println("Inicie el programa nuevamente");
			System.exit(0); // Cerramos el programa
		}
		
		
		try { // Utilizamos otra estructura try-catch para manejar errores de entrada del usuario
		System.out.println("Ingrese el primer numero con el que desee operar");
		 unNumero = teclado.nextDouble() ; // Leemos el valor ingresado por el usuario y lo almacenamos en la variable unNumero
		System.out.println("Ingrese el segundo numero con el que desee operar");
		otroNumero = teclado.nextDouble();// Leemos el valor ingresado por el usuario y lo almacenamos en la variable otroNumero
		}
		
		catch(InputMismatchException ex) {
			System.out.println("Error debe ingresar un numero pera poder operar");
			System.out.println("Inicie el programa nuevamente");
			System.exit(0); // Cerramos el programa
		}
		
		
		
		teclado.close();
		
		double  sumar = unNumero + otroNumero;
		double restar = unNumero - otroNumero;
		double multiplicar = unNumero * otroNumero;
		double dividir = unNumero / otroNumero;
		double resultado;
		
		switch(operacion) {
		case 1:
			resultado= sumar;
			System.out.println("El resultado de la suma es: " + resultado);
			break;
			
		case 2: 
			resultado= restar;
			System.out.println("El resultado de la resta es: " + resultado);
			break;
		case 3: 
			resultado= multiplicar;
			System.out.println("El resultado de la multiplicacion es: " + resultado);
			break;
		case 4:
			resultado= dividir;
			if(unNumero==0 || otroNumero==0) {
				System.out.println("No se puede dividir el 0");
				System.exit(0); // Cerramos el programa
			}else {
				 
					System.out.println("El resultado de la division es: " + resultado);
			}
			
			
			break;
		default: System.out.println("Error, inicie nuevamente para continuar.");
		}
		
		
		
	}
	
}

