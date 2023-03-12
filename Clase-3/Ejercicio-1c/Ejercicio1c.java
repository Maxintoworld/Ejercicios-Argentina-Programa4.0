
//1.c.Genere un array de 10 números, y a numero en la posición 6, dividir por 3. 

public class Ejercicio1c {
    public static void main(String[] args) {
        //generando el array de numeros
        int numeros[] = new int[] { 30, 36, 42, 48, 54, 60, 66, 72, 78, 84 };
        //creando ciclo para recorrer el arreglo
        for (int i = 0; i <= 10; i++) {
        //Si el numero del ciclo con el que recorro el array coincide con el numero fijado
            if (numeros[i] == numeros[6])
        //imprimo en pantalla el numero del array y su division por 3    
                System.out.println("El numero " + numeros[i] + " dividido 3 da como resultado " + numeros[i] / 3);
        }
    }
}
