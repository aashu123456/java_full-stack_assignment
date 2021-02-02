package testing;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bean.Product;
import service.ProductService;

public class ProductServiceTest {
	static ProductService ps;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ps = new ProductService();
		System.out.println("This method call only once at first time");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		ps = null;
		System.out.println("This method call only once at last time");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before every test method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After every test method");
	}

	// @Test
	public void testDisplayAllProduct() {
		List<Product> listOfProduct = ps.displayAllProduct();
		assertEquals(7, listOfProduct.size());
	}

	// @Test
	public void testAddProduct() throws NumberFormatException, IOException {
		// System.out.println("while testing");
		Product p = new Product();
		p.setPid(108);
		p.setPname("refrigerator");
		p.setPrice(2000);
		LocalDate ld = LocalDate.now();

		p.setStoredate(ld);
		String res = ps.addProduct(p);
		String msg = "Record Stored Successfully";
		assertEquals(msg, res);

	}

	// @Test
	public void testUpdateProductPrice() {
		Product p = new Product();
		p.setPid(105);
		p.setPrice(1900);
		String res = ps.updateProductPrice(p);
		assertEquals("Price updated successfully", res);
	}

	// @Test
	public void testDeleteProduct() {
		Product p = new Product();
		p.setPid(102);
		String res = ps.DeleteProduct(p);
		assertEquals("Product deleted", res);
	}

	@Test
	public void testDisplayProductBYPriceASC() {
		List<Product> listOfProduct = ps.displayProductByPriceASC();
		assertEquals(7, listOfProduct.size());
		Product p = listOfProduct.get(0);
		assertEquals("Laptop", p.getPname());
		Product p1 = listOfProduct.get(1);
		assertEquals("MobilePhone", p1.getPname());
		Product p2 = listOfProduct.get(2);
		assertEquals("AC", p2.getPname());
	}

	// @Test
	public void testDisplayProductBYPriceDESC() {
		List<Product> listOfProduct = ps.displayProductByPriceDESC();
		assertEquals(7, listOfProduct.size());
		Product p = listOfProduct.get(0);
		assertEquals("AC", p.getPname());
		Product p1 = listOfProduct.get(1);
		assertEquals("Mobile Phone", p1.getPname());
		Product p2 = listOfProduct.get(2);
		assertEquals("Laptop", p2.getPname());
	}

	// @Test
	public void testDisplayProductBYNameASC() {
		List<Product> listOfProduct = ps.displayProductByNameASC();
		assertEquals(7, listOfProduct.size());
		Product p = listOfProduct.get(0);
		assertEquals("Laptop", p.getPname());

	}

}
