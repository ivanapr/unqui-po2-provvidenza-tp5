package mercado1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StockTest {

	Producto vaso, taza;
	Stock stock;
	
	@BeforeEach
	void setUp() throws Exception {
		stock = new Stock();
		vaso = new Producto(100d);
		taza = new ProductoCoop(100d);
		stock.setCantidad(vaso, 2);
	}
	
	@Test
	void test() {
		assertTrue(stock.hayStock(vaso));
		assertFalse(stock.hayStock(taza));
		stock.setCantidad(vaso, -3);
		assertFalse(stock.hayStock(vaso));
		stock.setCantidad(taza, 1);
		assertTrue(stock.hayStock(taza));
		stock.setCantidad(vaso, 0);
		assertFalse(stock.hayStock(vaso));
	}

}
