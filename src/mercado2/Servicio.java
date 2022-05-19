package mercado2;

/**
 * Clase que modela un servicio del mercado.
 * Sabe su costo por unidad y la cantidad de unidades consumida.
 * @author ivanapr
 *
 */
public class Servicio implements Concepto, Factura {
	double costoUnidad;
	int cantidadConsumida;
	Agencia agencia;

	/**
	 * Constructor del Servicio.
	 * @param costoUnidad: El precio base del servicio.
	 */
	public Servicio(Agencia agencia, double costoUnidad, int cantidadConsumida) {
		this.setCostoUnidad(costoUnidad);
		this.setCantidadConsumida(cantidadConsumida);
		this.agencia = agencia;
	}

	public double getCostoUnidad() {
		return costoUnidad;
	}

	public void setCostoUnidad(double costoUnidad) {
		this.costoUnidad = costoUnidad;
	}

	public int getCantidadConsumida() {
		return cantidadConsumida;
	}

	public void setCantidadConsumida(int cantidadConsumida) {
		this.cantidadConsumida = cantidadConsumida;
	}
	
	@Override
	/**
	 * Devuelve el costo por el servicio dado.
	 */
	public double getPrecio() {
		return getCostoUnidad() * getCantidadConsumida();
	}
	@Override
	/**
	 * @return
	 */
	public boolean registrar() {
		agencia.registrarPago(this);
		return true;
	}
}
