package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import bean.Product;
import server.ProductService;

public class ProductOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Product> al = new ArrayList<>();
		boolean flag = true;
		int id = 0;
		String name = null;
		double price = 0.0;

		int count = 0;

		ProductService ps = new ProductService();

		try {
			System.out.println("Welcome to Sprint 2:Product operation and Management");
			do {

				System.out.println("Enter the operation you want to perform for the product");
				System.out.println("1. Add\n2. Update\n3. Delete\n4. DisplayAll\n5. Find Price Using Id\n6. Exit");
				int choice = sc.nextInt();

				switch (choice) {

				case 1:
					try {
						System.out.println("You are going to perform Addition of product");

						System.out.println("Enter how many products you want to add : ");
						int n = sc.nextInt();

						for (int i = 0; i < n; i++) {
							count++;

							id++; // id starts from 1
							// id = i; //id starts from 0
							sc.nextLine();
							System.out.println("Enter the product Name : ");
							name = sc.nextLine();

							System.out.println("Enter the product Price : ");
							price = sc.nextDouble();

							Product p = new Product(id, name, price);
							al = ps.addProduct(p);

						}
					} catch (Exception e) {
						System.out.println("\"wrong addition\"");
					}

					break;

				case 2:
					if (count > 0) {
						try {

							System.out.println("You are going to perform updation of product");

							System.out.println("enter the id for the product to update");
							id = sc.nextInt();
							Product p = al.get(id - 1);

							if (p.getPid() == id) {
								System.out.println("enter the price for the product to update");
								price = sc.nextDouble();

								al = ps.updateProduct(p, id, price);

								System.out.println("The product with Id " + id + " is updated");
							} else {
								System.out.println("Please Enter the correct Id");
							}
						} catch (Exception e) {
							System.out.println("\"wrong updation\"");

						}
					}

					else {
						System.out.println("There is no product to update,please add first");
					}
					break;

				case 3:
					if (count > 0) {
						try {
							System.out.println("You are going to perform Deletion of product");
							System.out.println("Enter the Id of product you want to delete ");
							id = sc.nextInt();
							Product p = al.get(id - 1);
							if (p.getPid() == id) {
								ps.deleteProduct(id);

								System.out.println("The product with Id " + id + " is deleted");
							} else {
								System.out.println("Please Enter the correct Id");
							}
						} catch (Exception e) {
							System.out.println("\"wrong deletion\"");
						}
					} else {
						System.out.println("\" Sorry, No products are available to delete \"");
					}
					break;

				case 4:
					if (count > 0) {
						try {

							System.out.println("Displaying all products details");

							al = ps.displayAllProducts();
							Iterator<Product> i1 = al.iterator();
							while (i1.hasNext()) {

								System.out.println(i1.next());

							}

						} catch (Exception e) {
							System.out.println("\"products list is empty\"");
						}
					} else {
						System.out.println("\" Sorry,There are no products to show,Please add first \"");
					}
					break;

				case 5:
					if (count > 0) {
						try {
							System.out.println("Enter product Id:");
							id = sc.nextInt();
							Product p = al.get(id - 1);
							if (p.getPid() == id) {

								System.out.println("Retrieving product price");
								price = ps.retrieveProductPrice(id);
								System.out.println("Product price=" + price);
							} else {
								System.out.println("Please Enter the correct Id");
							}
						} catch (Exception e) {
							System.out.println("\"wrong retrieval\"");
						}
					} else {
						System.out.println("\" Sorry No products are available to retrieve \"");
					}

					break;

				case 6:

					flag = false;
					System.exit(0);
					break;

				default:
					System.out.println("Invalid choice ,please choose correct option");
					break;
				}

			} while (flag);

		} catch (

		Exception e) {
			System.out.println("\"wrong operation\"");
		}
	}

}
