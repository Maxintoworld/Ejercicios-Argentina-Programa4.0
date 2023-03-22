/*
1.- Crear un método que muestre los datos  (nombre, apellido y la edad) de un usuario, ingresado 
por teclado. 
2.- Diseñe un método que imprima los datos de una persona ingresados por teclado e indicar si es 
mayor o menor de edad. 
 */

import java.util.Scanner; // se importa la utilidad scanner

public class Ejercicios1y2 {
     public static void main(String[] args) {
          //se le asigna una variable a la utilidad
          Scanner teclado = new Scanner(System.in);
          {
               //se le indica al usuario que datos ingresar teniendo en cuenta su tipo
               System.out.println("Ingrese su nombre");
               String nombre = teclado.next();
               System.out.println("ingrese su apellido");
               String apellido = teclado.next();
               System.out.println("Ingrese su nacionalidad");
               String nacionalidad = teclado.next();
               System.out.println("Ingrese su edad");
               int edad = teclado.nextInt();
               //IMPORTANTE se cierra la variable de la utilidad 
               teclado.close();

               //Se muestra en pantalla los datos obtenidos del usuario
               System.out.print("Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nNacionalidad: "
                         + nacionalidad);
                         //se aplica la concicion if para saber si el usuario es mayor
                         if(edad>17){System.out.println("\n\nUsted es mayor de edad");
                    }    //caso contrario se indica que es menor
                    else{
                         System.out.println("\n\nUsted es menor de edad");
                    }

          }

     }
}