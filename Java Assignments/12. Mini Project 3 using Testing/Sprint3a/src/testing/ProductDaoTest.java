package testing;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bean.Product;
import dao.ProductDao;

public class ProductDaoTest {
	static ProductDao pd;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pd = new ProductDao();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDisplayAllProduct() {
		List<Product> listOfProduct = pd.displayAllProduct();
		assertEquals(3, listOfProduct.size());
	}

	@Test
	public void testAddProduct() throws NumberFormatException, IOException {
		Product p = new Product();
		p.setPid(106);
		p.setPname("mobile");
		p.setPrice(1700);
		int res = pd.addProduct(p);
		int msg = 1;
		assertEquals(msg, res);
	}

	@Test
	public void testUpdateProductPrice() {
		Product p = new Product();
		p.setPid(101);
		p.setPrice(1600);
		int res = pd.updateProductPrice(p);
		assertEquals(1, res);

	}

	@Test
	public void testDeleteProduct() {
		Product p = new Product();
		p.setPid(102);
		int res = pd.deleteProduct(p);
		assertEquals(1, res);
	}

}
