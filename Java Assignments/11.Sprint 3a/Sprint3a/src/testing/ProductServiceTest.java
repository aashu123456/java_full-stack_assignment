package testing;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bean.Product;
import service.ProductService;

class ProductServiceTest {
	static ProductService ps;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ps = new ProductService();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Class");

	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After");
	}

	@Test
	void testProductService() {

	}

	@Test
	void testDisplayAllProduct() {
		List<Product> listOfProduct = ps.displayAllProduct();
		assertEquals(7, listOfProduct.size());

	}

	// @Test
	void testAddProduct() throws NumberFormatException, IOException {
		Product p = new Product();
		p.setPid(109);
		p.setPname("Tshirt");
		p.setPrice(1500);
		LocalDate ld = LocalDate.now();
		p.setStoredate(ld);
		String res = ps.addProduct(p);
		String msg = "Record Stored Successfully";
		assertEquals(msg, res);

	}

	// @Test
	void testUpdateProductPrice() {
		Product p = new Product();
		p.setPid(105);
		p.setPrice(540);
		String res = ps.updateProductPrice(p);
		assertEquals("Product Price updated successfully", res);

	}

	// @Test
	void testDeleteProduct() {
		Product p = new Product();
		p.setPid(103);
		String res = ps.DeleteProduct(p);
		assertEquals("Product deleted", res);

	}

	// @Test
	void testDisplayProductByPriceASC() {
		List<Product> listOfProduct = ps.displayProductByPriceASC();
		assertEquals(7, listOfProduct.size());
		Product p = listOfProduct.get(3);
		assertEquals("MobilePhone", p.getPname());

	}

	// @Test
	void testDisplayProductByPriceDESC() {
		List<Product> listOfProduct = ps.displayProductByPriceDESC();
		assertEquals(7, listOfProduct.size());
		Product p = listOfProduct.get(0);
		assertEquals(550, p.getPid());

	}

	// @Test
	void testDisplayProductByNameASC() {
		List<Product> listOfProduct = ps.displayProductByNameASC();
		assertEquals(7, listOfProduct.size());
		Product p = listOfProduct.get(0);
		assertEquals("Laptop", p.getPname());

	}

}
