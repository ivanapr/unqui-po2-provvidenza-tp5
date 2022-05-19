package mercado2;

/**
 * Clase que modela un producto del mercado.
 * Sabe su precio.
 * @author ivanapr
 *
 */

public class Producto implements Concepto {
	/**
	 * Precio base del producto.
	 */
	double precio;
	Stock stock;

	/**
	 * Constructor del Producto.
	 * @param precio: El precio base del producto.
	 */
	public Producto(double precio) {
		this.setPrecio(precio);
	}
	@Override
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
	@Override
	/**
	 * Registra la compra de un producto si
	 * hay stock. Si no informa que no hay.
	 * @return
	 */
	public boolean registrar() {
		boolean bool = stock.hayStock(this);
		if(bool){
			stock.setCantidad(this, -1);
		}else {
			System.out.println("No hay stock del producto.");
		}
		return bool;
	}

}