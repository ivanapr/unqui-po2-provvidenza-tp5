package mercado1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {

	Stock stock;
	OrdenDeCompra odc1, odc2;
	Producto vaso, mesa, taza;
	ProductoCoop plato;
	Caja caja;
	
	@BeforeEach
	void setUp() throws Exception {
		vaso = new Producto(200d);
		mesa = new Producto(2500d);
		taza = new Producto(575d);
		plato = new ProductoCoop(300d);
		stock = new Stock();
		caja = new Caja(stock);
		
		stock.setCantidad(vaso, 2);
		stock.setCantidad(mesa, 1);
		stock.setCantidad(taza, 5);
		stock.setCantidad(plato, 1);
		
		caja.nuevaOrden();
		caja.nuevaOrden();
	}
	
	@Test
	void test() {
		odc1 = caja.getOrdenN(0);
		odc2 = caja.getOrdenN(1);
		caja.registrarProducto(vaso, odc1);
		caja.registrarProducto(mesa, odc1);
		assertEquals(caja.montoAPagar(odc1), 2700d);
		caja.registrarProducto(plato, odc2);
		caja.registrarProducto(mesa, odc2);
		caja.registrarProducto(vaso, odc2);
		assertEquals(caja.montoAPagar(odc2), 470d);
		assertTrue(stock.hayStock(taza));
		assertFalse(stock.hayStock(vaso));
	}

}
