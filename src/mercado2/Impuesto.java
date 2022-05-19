package mercado2;

/**
 * Clase que modela un impuesto del mercado.
 * Sabe su tasa de servicio.
 * @author ivanapr
 *
 */
public class Impuesto implements Concepto, Factura {

	double tasaDeServicio ;
	Agencia agencia;
	
	/**
	 * Constructor del Impuesto.
	 * @param tasaDeServicio: El precio base del impuesto.
	 */
	public Impuesto(Agencia agencia, double tasaDeServicio) {
		this.setTasaDeServicio(tasaDeServicio);
		this.agencia = agencia;
	}
	public double getPrecio() {
		return tasaDeServicio;
	}
	public void setTasaDeServicio(double tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
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
