
/*3.- En un supermercado se hace un 20% de descuento a los clientes cuya compra supere los 1000$ 
en las áreas de frutas, verduras y gaseosas. ¿ Cual será el total que pagara una persona por su 
compra ?, se debe mostrar el nombre del cliente , producto, precio , cantidad , descuento y total a 
pagar.  
 */

import java.util.Scanner;

public class Ejercicio3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = input.next();

        System.out.println("En que seccion de productos ustes decea realizar si compra");
        System.out.println("Verduras");
        System.out.println("Frutas");
        System.out.println("Gaseosas");
        String seccion =input.next();
        

        System.out.println("Ingrese el producto a comprar");
        String producto = input.next();

        System.out.println("Ingrese la cantidad del producto");
        int cantidad = input.nextInt();

        System.out.println("Ingrese el valor del Producto");
        double precio = input.nextDouble();
        
        input.close();

        System.out.println("\n");
        System.out.println("\n");

        System.out.println(nombre);
        System.out.println("------------------------------------\n");
        System.out.println("Area de compra: " + seccion);
        System.out.println("Usted compro: " + cantidad + " " + producto);
        System.out.println("El precio de su compra es de: $" + precio * cantidad);

        if (precio * cantidad > 1000) {
            double descuento = (precio * cantidad) * 0.2;
            System.out.println("Descuento: $" + descuento);
            System.out.println("El total a abonar es de: $" + ((precio * cantidad) - descuento));
            System.out.println("------------------------------------");
            System.out.println("Gracias por su compra");
        } else {
            System.out.println("No se realizan descuentos");
            System.out.println("------------------------------------");
            System.out.println("Gracias por su compra");
        }

    }
}