/*
 1.d. 
Utilizando la sentencia 
for, hacer lo mismo que en (b) pero que el valor a imprimir por 
pantalla, sea el doble.
 */

public class Ejercicio1d {
  public static void main(String args[]) {
    int num = 0;
    for (int i = 1; i <= 100; i++) {
      num = i * 2;
      System.out.println(num);
    }
  }
}