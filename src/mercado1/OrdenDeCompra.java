package mercado1;

import java.util.ArrayList;

/**
 * Clase que modela una orden de compra del mercado.
 * 
 * @author ivanapr
 *
 */
public class OrdenDeCompra {
	/**
	 * Lista de los productos que se compraron.
	 */
	ArrayList<Producto> comprados;
	
	/**
	 * Constructor de OrdenDeCompra.
	 */
	public OrdenDeCompra() {
		comprados = new ArrayList<Producto>();
	}
	
	/**
	 * Devuelve el precio total de la compra.
	 * @return
	 */
	public double getPrecioTotal() {
		double total = 0;
		for(Producto producto:comprados) {
			total += producto.getPrecio();
		}
		return total;
	}
	
	/**
	 * Agrega productos a la lista de productos comprados en la Orden de Compra.
	 */
	public void addProducto(Producto producto) {
		comprados.add(producto);
	}
}
