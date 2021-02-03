package service;

import java.util.List;

import bean.Product;
import dao.ProductDao;

public class ProductService {
	public List<Product> Displayallproduct() {
		ProductDao pd = new ProductDao();
		// return pd.Displayallproduct().stream().collect(Collectors.toList());
		return pd.Displayallproduct();
	}

	public List<Product> DisplayallproductAsc() {
		ProductDao pd = new ProductDao();
		// return pd.Displayallproduct().stream().collect(Collectors.toList());
		return pd.DisplayallproductAsc();
	}

	public List<Product> DisplayallproductDesc() {
		ProductDao pd = new ProductDao();
		// return pd.Displayallproduct().stream().collect(Collectors.toList());
		return pd.DisplayallproductDesc();
	}

	public List<Product> DisplayallproductNameAsc() {
		ProductDao pd = new ProductDao();
		// return pd.Displayallproduct().stream().collect(Collectors.toList());
		return pd.DisplayallproductNameAsc();
	}

	public List<Product> DisplayallproductNameDesc() {
		ProductDao pd = new ProductDao();
		// return pd.Displayallproduct().stream().collect(Collectors.toList());
		return pd.DisplayallproductNameDesc();
	}

	public int Addproduct(int id, String name, float price) {
		int i = id;
		String nm = name;
		float pr = price;
		ProductDao pd = new ProductDao();
		int id1 = pd.Addproduct(i, nm, pr);
		return id1;
	}

	public void Updateproduct(int uid, float uprice) {
		int upid = uid;
		float upprice = uprice;
		ProductDao pd = new ProductDao();
		pd.Updateproduct(upid, upprice);
	}

	public void Deleteproduct(int did) {
		int deid = did;
		ProductDao pd = new ProductDao();
		pd.Deleteproduct(deid);
	}

}
