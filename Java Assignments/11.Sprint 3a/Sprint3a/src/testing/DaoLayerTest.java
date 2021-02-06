package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bean.Product;
import dao.ProductDao;

class DaoLayerTest {
	static ProductDao pd;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		pd = new ProductDao();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	// @Test
	void testDisplayAllProduct() {
		List<Product> listOfProduct = pd.displayAllProduct();
		assertEquals(3, listOfProduct.size());
	}

	@Test
	void testAddProduct() throws Exception {
		Product p = new Product();
		p.setPid(109);
		p.setPname("Tshirt");
		p.setPrice(1500);
		LocalDate ld = LocalDate.now();
		p.setStoredate(ld);
		int res = pd.addProduct(p);
		int msg = 1;
		assertEquals(msg, res);
	}

	// @Test
	void testUpdateProductPrice() {
		Product p = new Product();
		p.setPid(101);
		p.setPrice(1600);
		int res = pd.updateProductPrice(p);
		assertEquals(1, res);

	}

	// @Test
	void testDeleteProduct() {
		Product p = new Product();
		p.setPid(102);
		int res = pd.deleteProduct(p);
		assertEquals(1, res);
	}

}
