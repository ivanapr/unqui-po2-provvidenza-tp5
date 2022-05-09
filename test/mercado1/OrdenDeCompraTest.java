package mercado1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrdenDeCompraTest {

	OrdenDeCompra odc1, odc2;
	Producto silla, mesa, vaso;
	ProductoCoop plato, taza;
	
	@BeforeEach
	void setUp() throws Exception {
		odc1 = new OrdenDeCompra();
		odc2 = new OrdenDeCompra();
		silla = new Producto(1000d);
		mesa = new Producto(2000d);
		vaso = new Producto(200d);
		plato = new ProductoCoop(400d);
		taza = new ProductoCoop(600d);
		
		odc1.addProducto(silla);
		odc1.addProducto(mesa);
		odc1.addProducto(plato);
		odc2.addProducto(vaso);
		odc2.addProducto(taza);
		
	}
	@Test
	void test() {
		assertEquals(odc1.getPrecioTotal(), 3360d, 0d);
		assertEquals(odc2.getPrecioTotal(), 740d, 0d);
		odc2.addProducto(mesa);
		assertEquals(odc2.getPrecioTotal(), 2740d, 0d);
	}

}
