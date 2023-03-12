
/*
 1.b.Al punto anterior, el valor del resultado debe incrementarse en 5.
 */

public class Ejercicio1b {

    public static void main(String args[]) {
        int arrayDeNumeros[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int i = 0;
        while (i <= 15) {
//sumandole cinco al resultado al momento de mostrarlo en pantalla            
            System.out.println(arrayDeNumeros[i + 5]);
            i++;
        }
    }

}