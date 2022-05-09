package mercado1;

import java.util.ArrayList;

/**
 * Clase que modela la caja de un mercado.
 * 
 * @author ivanapr
 *
 */
public class Caja {
	/**
	 * Un stock de los productos de la tienda.
	 */
	Stock stock;

	/**
	 * Lista de las ordenes de compra facturadas por la caja.
	 */
	ArrayList <OrdenDeCompra> orden, facturadas;
	
	/**
	 * Constructor. Crea una instancia default de Caja.
	 * Con stock vacio.
	 */
	public Caja() {
		orden = new ArrayList <OrdenDeCompra>();
		stock = new Stock();
	}
	
	/**
	 * Constructor de Caja.
	 * Con un stock dado.
	 */
	public Caja(Stock s) {
		orden = new ArrayList <OrdenDeCompra>();
		facturadas = new ArrayList <OrdenDeCompra>();
		stock = s;
	}
	
	/**
	 * Registra la compra de un producto si
	 * hay stock. Si no informa que no hay.
	 * @param producto: El producto a registrar
	 * @param orden: La orden de compra donde se registra
	 */
	public void registrarProducto(Producto producto, OrdenDeCompra orden) {
		if (stock.hayStock(producto)) {
			orden.addProducto(producto);
			stock.setCantidad(producto, -1);
		} else {
			System.out.println("No hay stock del producto");
		}
	}
	
	/**
	 * Devuelve el monto a pagar
	 * de una orden determinada.
	 * @param orden: La orden consultada
	 * @return el valor total a pagar
	 */
	public double montoAPagar(OrdenDeCompra orden) {
		return orden.getPrecioTotal();
	}
	
	
	/**
	 * Agrega una nueva orden
	 * al listado de ordenes.
	 * @return
	 */
	public Caja nuevaOrden() {
		OrdenDeCompra ordenNueva = new OrdenDeCompra();
		orden.add(ordenNueva);
		return this;
	}
	
	/**
	 * Devuelve la orden n de compra.
	 * @param numero: El indice del orden a devolver.
	 * @return la orden de indice numero.
	 */
	public OrdenDeCompra getOrdenN(int numero) {
		return orden.get(numero);
	}
	
}
