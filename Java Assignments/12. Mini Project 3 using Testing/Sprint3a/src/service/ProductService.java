package service;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Product;
import dao.ProductDao;

public class ProductService {
	List<Product> listOfProduct;
	ProductDao pd;
	List<Product> listOfProduct1;

	public ProductService() {
		pd = new ProductDao();
		listOfProduct1 = pd.displayAllProduct();
	}

	public List<Product> displayAllProduct() {
		listOfProduct = pd.displayAllProduct();
		pd.displayAllProduct().stream().collect(Collectors.toList());

		return listOfProduct;
	}

	public String addProduct(Product pp) throws NumberFormatException, IOException {
		if (pp.getPrice() < 0) {
			return "Price must be positive";
		} else if (pp.getPrice() > 0 && pp.getPrice() < 500) {
			return "Minimum price must be >500";
		} else if (pd.addProduct(pp) > 0) {
			return "Record Stored Successfully";
		} else {
			return "Record didn't Store";
		}

	}

	public String updateProductPrice(Product pp) {
		if (pd.updateProductPrice(pp) > 0) {
			return "Product Price updated successfully";
		} else {
			return "Product not available";
		}
	}

	public String DeleteProduct(Product pp) {
		if (pd.deleteProduct(pp) > 0) {
			return "Product deleted";
		} else {
			return "Id not found";
		}

	}

	public List<Product> displayProductByPriceASC() {
		Comparator<Product> SortPriceASC = (Product p1, Product p2) -> (int) (p1.getPrice() - p2.getPrice());
		return (List<Product>) listOfProduct1.stream().sorted(SortPriceASC).collect(Collectors.toList());
	}

	public List<Product> displayProductByPriceDESC() {
		Comparator<Product> SortPriceDESC = (Product p1, Product p2) -> (int) (p1.getPrice() - p2.getPrice());
		return (List<Product>) listOfProduct1.stream().sorted(SortPriceDESC.reversed()).collect(Collectors.toList());
	}

	public List<Product> displayProductByNameASC() {
		Comparator<Product> SortNameASC = (Product p1, Product p2) -> p1.getPname().compareTo(p2.getPname());
		return (List<Product>) listOfProduct1.stream().sorted(SortNameASC).collect(Collectors.toList());
	}

}
