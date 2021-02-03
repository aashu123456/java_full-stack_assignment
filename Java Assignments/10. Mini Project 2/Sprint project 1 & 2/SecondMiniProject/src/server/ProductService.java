package server;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.Product;

public class ProductService {
	List<Product> pr = new ArrayList<>();
	int id;
	String name;
	double price;

	Scanner sc = new Scanner(System.in);

	public List<Product> addProduct(Product p) {

		pr.add(p);

		return pr;
	}

	public List<Product> updateProduct(Product p1, int id, double price) {

		Product p = pr.get(id - 1); // id starts from 1
		// Product p = pr.get(id); //id starts from 0

		p.setPrice(price);

		return pr;

	}

	public void deleteProduct(int pid) {
		Product p = pr.get(pid - 1); // id starts from 1

		// Product p = pr.get(pid); //id starts from 0
		pr.remove(p);

	}

	public List<Product> displayAllProducts() {

		return pr;
	}

	public double retrieveProductPrice(int pid) {
		Product p = pr.get(pid - 1); // id starts from 1
		// Product p = pr.get(pid);//id starts from 0
		return p.getPrice();

	}

}
