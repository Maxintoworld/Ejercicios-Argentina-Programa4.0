/*
 1. Implemente usted mismo para un “carrito de compras”:
 una clase Producto (que pueda tener hasta 3 items),
  otra ItemCarrito, otra Carrito y otra Descuento.
2. En un programa main,
 pida ingresar los datos y arme los objetos correspondientes
  y con el método de carrito “precio”, retorne el resultado.
   Por ejemplo:
   cant precioUnitario producto
	1 40  jabón en polvo 
	2 100  chocolates
	3 10  esponjas
carrito.precio() == 270
 */

import java.util.Scanner;

// Clase Producto
class Producto {
    String nombre;
    double precio;

    // Constructor de la clase Producto
    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}

// Clase ItemCarrito
class ItemCarrito {
    Producto producto;
    int cantidad;

    // Constructor de la clase ItemCarrito
    ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Método que calcula el subtotal del item en función de la cantidad y el precio
    // del producto
    double total() {
        return this.producto.precio * this.cantidad;
    }
}

// Clase Carrito
class Carrito {
    ItemCarrito[] items;

    // Constructor de la clase Carrito
    Carrito(ItemCarrito[] items) {
        this.items = items;
    }

    // Método que calcula el subtotal del carrito sumando los subtotales de cada
    // item
    double total() {
        double total = 0;
        for (ItemCarrito item : this.items) {
            total += item.total();
        }
        return total;
    }

    // Método que calcula el total del carrito aplicando un posible descuento
    double total(Descuento descuento) {
        if (descuento != null) {
            return this.total() * (1 - descuento.porcentaje);
        } else {
            return this.total();
        }
    }
}

// Clase Descuento
class Descuento {
    double porcentaje;

    // Constructor de la clase Descuento
    Descuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }
}

public class Supermercado {

    public static void main(String[] args) {

        // Creamos instancias de Producto
        Producto[] productos = {
                new Producto("Jabon en polvo", 40),
                new Producto("Chocolates", 100),
                new Producto("Esponjas", 10)
        };

        // Pedimos al usuario que seleccione la cantidad de cada producto
        Scanner teclado = new Scanner(System.in);
        int[] cantidades = new int[3];
        for (int i = 0; i < productos.length; i++) {
            System.out.print("Ingrese la cantidad de " + productos[i].nombre + ": ");
            cantidades[i] = teclado.nextInt();
        }


        teclado.close();
        // Creamos instancias de ItemCarrito a partir de los productos seleccionados por
        // el usuario
        ItemCarrito[] items = {
                new ItemCarrito(productos[0], cantidades[0]),
                new ItemCarrito(productos[1], cantidades[1]),
                new ItemCarrito(productos[2], cantidades[2])
        };

        // Creamos una instancia de Carrito
        Carrito carrito = new Carrito(items);

        // Imprimimos los detalles del carrito
        for (int i = 0; i < items.length; i++) {
            System.out.println((cantidades[i]) + " " + productos[i].precio + " " + productos[i].nombre);
        }

        // Imprimimos el total
        System.out.println("total: " + carrito.total());

       
    }
}