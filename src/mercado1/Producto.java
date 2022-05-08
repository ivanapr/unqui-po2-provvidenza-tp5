package mercado1;

/**
 * Clase que modela un producto del mercado.
 * Sabe su precio.
 * @author ivanapr
 *
 */

public class Producto {
	/**
	 * Precio base del producto.
	 */
	double precio;

	/**
	 * Constructor del Producto.
	 * @param precio: El precio base del producto.
	 */
	public Producto(double precio) {
		this.setPrecio(precio);
	}

	/**
	 * Devuelve el precio final del producto.
	 * @return
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Modifica el precio final del producto.
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
