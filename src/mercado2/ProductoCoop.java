package mercado2;


/**
 * Clase que modela un producto cooperativo del mercado, hereda comportamiento de la clase Producto.
 * Sabe su precio.
 * @author ivanapr
 *
 */

public class ProductoCoop extends Producto {
	
	/**
	 * Constructor del Producto de Cooperativa.
	 * @param precio: El precio base del producto.
	 */
	public ProductoCoop(double precio) {
		super(precio);
	}
	
	/**
	 * Devuelve el precio final del producto cooperativo. Se le aplica un descuento del 10% en concentp de IVA al precio base.
	 * @return
	 */
	@Override
	public double getPrecio() {
		return super.getPrecio() * 0.9d;
	}
}
