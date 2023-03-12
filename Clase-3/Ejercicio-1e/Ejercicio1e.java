/* 
1.e.Genere un array con 3 cursos y luego mostrar el promedio de notas de tres 
cursos.
*/
public class Ejercicio1e {

    public static void main(String[] args) {
        /*se crean los array y se suman los elementos del array notas dividiendolos por 3
         guardandolo en la variable promedio*/
        String[] cursos = new String[] { "contabilidad", "matematicas", "economia" };
        int[] notas = new int[] { 9, 8, 10 };
        int promedio = ((notas[0] + notas[1] + notas[2]) / 3);

        //se imprime en pantalla el encabezado
        System.out.println("Cursos ----- Notas");

        //se crea un ciclo para iterar hasta el dos 0,1,2
        for (int i = 0; i <= 2; i++) {
        //se imprime en pantalla los elementos recorridos cursos y notas
            System.out.println(cursos[i] + " --- " + notas[i]);
        /*si el numero del elemento recorrido es igual a 2 (el ultimo elemento de los array)
        se imprimira en pantalla el promedio.
        Este if es para que no se repita el promedio todas las veces que se recorra un elemento
        */    
            if (i == 2) {
                System.out.println("El promedio de notas de los tres cursos es: " + promedio);
            }
        }

    }
}