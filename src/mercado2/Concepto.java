package mercado2;

public interface Concepto {
	
	/**
	 * Obtiene el precio del concepto a pagar.
	 * @return el precio a pagar.
	 */
	public double getPrecio();
	
	/**
	 * Describe el comportamiento del
	 * concepto cuando se confirma la compra.
	 */
	public boolean registrar();

}
