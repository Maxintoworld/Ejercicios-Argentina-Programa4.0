/* 
1.d.Genere un array, mostrando n productos de una tienda deportiva con sus 
respectivos precios.
*/
public class Ejercicio1d {

    public static void main(String[] args) {
        /*Creando los array de productos y precios (Se utiliza el tipo double porque los
         precios contienen numeros con coma)
         */
        String productos[] = { "Botines ", "Pelota ", "Medias ", "Remera ", "Raqueta ", "Palo de hockey " };
        double precios[] = new double[] { 1720.25, 699.99, 429.5, 1249.9, 8799.9, 5599.99 };

        //Se recorre el array de precios ya que contiene los mismos elementos que el de productos
        for (int i = 0; i < precios.length; i++) {
            //Se imprime los elementos de los array productos y precios sumandole un texto y el caracter $
            System.out.println("Precio de: " + productos[i] + '$' + precios[i]);
        }
    }
}