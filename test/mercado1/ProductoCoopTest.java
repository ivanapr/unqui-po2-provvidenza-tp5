package mercado1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoCoopTest {

	Producto silla, mesa, vaso, plato, taza;
	
	@BeforeEach
	void setUp() throws Exception {
		silla = new ProductoCoop(1000d);
		mesa = new ProductoCoop(2000d);
		vaso = new ProductoCoop(200d);
		plato = new ProductoCoop(400d);
		taza = new ProductoCoop(600d);
	}
	@Test
	void test() {
		assertEquals(silla.getPrecio(), 900d, 0d);
		assertEquals(mesa.getPrecio(), 1800d, 0d);
		assertEquals(vaso.getPrecio(), 180d, 0d);
		assertEquals(plato.getPrecio(), 360d, 0d);
		assertEquals(taza.getPrecio(), 540d, 0d);
		silla.setPrecio(1500d);
		assertEquals(silla.getPrecio(), 1350d, 0d);
	}
}
