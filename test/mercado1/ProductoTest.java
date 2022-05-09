package mercado1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

	Producto silla, mesa, vaso, plato, taza;
	
	@BeforeEach
	void setUp() throws Exception {
		silla = new Producto(1000d);
		mesa = new Producto(2000d);
		vaso = new Producto(200d);
		plato = new Producto(400d);
		taza = new Producto(600d);
	}
	@Test
	void test() {
		assertEquals(silla.getPrecio(), 1000d, 0d);
		assertEquals(mesa.getPrecio(), 2000d, 0d);
		assertEquals(vaso.getPrecio(), 200d, 0d);
		assertEquals(plato.getPrecio(), 400d, 0d);
		assertEquals(taza.getPrecio(), 600d, 0d);
		silla.setPrecio(1500d);
		assertEquals(silla.getPrecio(), 1500d, 0d);
	}

}
