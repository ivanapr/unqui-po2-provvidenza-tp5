package mercado1;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase que modela el stock de un producto del mercado.
 * 
 * @author ivanapr
 *
 */
public class Stock {
	/**
	 * Multiset que representa el stock de productos.
	 * Se representa con un hashmap.
	 * La key es el producto.
	 * El value la cantidad.
	 * Si el value es 0 entonces se remueve la key.
	 */
	Map <Producto, Integer> stock;
	
	/**
	 * Constructor. Crea una instancia de stock.
	 */
	public Stock () {
		stock = new HashMap<Producto, Integer>();
	}
	
	/**
	 * Retorna si hay stock del producto dado.
	 * @param producto: El producto.
	 * @return
	 */
	public boolean hayStock(Producto producto) {
		return stock.containsKey(producto);
	}
	
	/**
	 * Devuelve la cantidad del producto en stock.
	 * @return
	 */
	public int getCantidad(Producto producto) {
		return stock.getOrDefault(producto, 0);
	}
	
	/**
	 * Modifica el stock de un producto en el valor dado.
	 * Si el producto no esta lo agrega.
	 * Si n es negativo disminuye la cantidad de stock.
	 * Si el stock resultante es negativo o 0 se remueve
	 * el producto.
	 * @param producto El producto.
	 * @param numero La cantidad a aumentar.
	 */
	public Stock setCantidad(Producto producto, int numero) {
		stock.put(producto, this.getCantidad(producto) + numero);
		if(stock.get(producto) <= 0) {
			stock.remove(producto);
		}
		return this;
	}
}
