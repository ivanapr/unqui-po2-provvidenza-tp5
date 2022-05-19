package mercado2;

import java.util.ArrayList;

/**
 * Clase que modela una orden de compra del mercado.
 * 
 * @author ivanapr
 *
 */
public class OrdenDeCompra {
	/**
	 * Lista de los conceptos que se confirmaron en la compra.
	 */
	ArrayList<Concepto> comprados;
	
	/**
	 * Constructor de OrdenDeCompra.
	 */
	public OrdenDeCompra() {
		comprados = new ArrayList<Concepto>();
	}
	
	/**
	 * Devuelve el precio total de la compra.
	 * @return
	 */
	public double getPrecioTotal() {
		double total = 0;
		for(Concepto concepto:comprados) {
			total += concepto.getPrecio();
		}
		return total;
	}
	
	/**
	 * Agrega conceptos a la lista de conceptos pagados en la Orden de Compra.
	 * @param concepto es el concepto a agregar
	 * @return
	 */
	public OrdenDeCompra addConcepto(Concepto concepto) {
		if(concepto.registrar()) {
			comprados.add(concepto);
		}
		return this;
	}
}
