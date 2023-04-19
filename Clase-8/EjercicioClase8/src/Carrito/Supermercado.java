package Carrito;

/*
1. Modifique el ejercicio del carrito de la clase 5-7. 
2. Agregue excepciones al ingreso de datos:
a. que no se pueda ingresar en el campo texto, un número.
b. que no se pueda ingresar en el campo número, una letra.
c. Verifique que todos los ingresos sean correctos.
d. Si ocurre alguna de esas situación de excepción, mostrar por pantalla un mensaje,
   informándole del mismo.
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
class ItemCarrito extends Producto {
	int cantidad;

	// Constructor de la clase ItemCarrito
	ItemCarrito(String nombre, double precio, int cantidad) {
		super(nombre, precio);
		this.cantidad = cantidad;
	}

	// Método que calcula el subtotal del item en función de la cantidad y el precio
	// del producto
	double total() {
		return this.precio * this.cantidad;
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

// creamos una excepcion para las letras
class PalabraInvalidaException extends Exception {
	public PalabraInvalidaException(String mensaje) {
		super(mensaje);
	}

}

public class Supermercado {

	public static void main(String[] args) {

		// Creamos instancias de Producto
		Producto[] productos = {
				new Producto("", 40),
				new Producto("", 100),
				new Producto("", 10)
		};

		// Pedimos al usuario el producto y la cantidad

		Scanner teclado = new Scanner(System.in);
		int[] cantidades = new int[3];
		boolean err = false;

		for (int i = 0; i < productos.length; i++) {
			int contador = 0;

			try {
				System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
				String nombreProducto = teclado.nextLine();
				contador++;

				if (!nombreProducto.matches("[a-zA-Z]+")) {
					throw new PalabraInvalidaException("Debe ingresar una palabra que solo contenga letras ");
				}

				nombreProducto = productos[i].nombre;

			} catch (PalabraInvalidaException e) {
				System.out.println(e.getMessage());
				i--;
				contador--;
				err = true;
				continue;
			}

			try {
				System.out.print("Ingrese la cantidad de " + productos[i].nombre + ": ");
				cantidades[i] = teclado.nextInt();
				contador++;

				if (cantidades[i] < 0) {
					throw new Exception("Debe ingresar una cantidad positiva");
				}

				teclado.nextLine();

			} catch (Exception e) {
				System.out.println("Debe ingresar un numero para indicar la cantidad");
				err = true;
				i--;
				contador--;
				continue;
			}

			if (contador == 3) {
				break;
			}
		}

		if (err) {
			System.out.println("Se produjo un error en la carga de los productos");
		} else {
			System.out.println("Carga de productos realizada correctamente");
		}

		teclado.close();
		// Creamos instancias de ItemCarrito a partir de los productos seleccionados por
		// el usuario
		ItemCarrito[] items = {
				new ItemCarrito(productos[0].nombre, productos[0].precio, cantidades[0]),
				new ItemCarrito(productos[1].nombre, productos[1].precio, cantidades[1]),
				new ItemCarrito(productos[2].nombre, productos[2].precio, cantidades[2])
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
