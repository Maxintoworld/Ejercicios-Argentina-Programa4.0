//1.a.Genere un array de números (1 al 15) 

public class Ejercicio1a {

    public static void main(String[] args) {
        //Crenado el array de numeros 
        int arrayDeNumeros[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        //creando variable
        int i = 0;
        //Iterando dentro del array de numeros
        while (i <= 15) {
        //Imprimiendo en pantalla los elementos del array    
            System.out.println(arrayDeNumeros[i]);
        //sumando el valor de "i" para que no se repita y se vuelva un ciclo infinito    
            i++;
        }
    }

}