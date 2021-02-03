
package main;

import java.util.Scanner;

import service.ProductService;

public class ProductOperation {

	public static void main(String[] args) {
		boolean flag = true;
		int pid = 100, j = 0;
		int idret[] = new int[50];
		Scanner sc = new Scanner(System.in);
		ProductService ps = new ProductService();
		do {
			System.out.println(
					"\n1 for Add product\n2 for Update product\n3 for Delete product\n4 for Display all products");
			System.out.println("5 for Display all product price in ascending order");
			System.out.println("6 for Display all product price in descending order");
			System.out.println("7 for Display all product name in ascending order");
			System.out.println("8 for Display all product name in descending order");
			System.out.println("9 for Exit");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				System.out.println("Add product");
				pid++;
				sc.nextLine();
				System.out.println("Enter product name:");
				String pname = sc.nextLine();
				System.out.println("Enter product price:");
				float price = sc.nextFloat();
				// System.out.println("Enter date of purchase:");
				if (price > 500) {
					int i = ps.Addproduct(pid, pname, price);
					idret[j] = i;
					j++;
					System.out.println("Product Added");
				} else {
					System.out.println("Product Price should be greater then 500");
				}
				break;

			case 2:
				System.out.println("Enter product id:");
				int id = sc.nextInt();
				int count = 0;
				for (int k = 0; k < idret.length; k++) {
					if (id == idret[k]) {
						count = 0;
						System.out.println("Enter new price:");
						float pr = sc.nextFloat();
						ps.Updateproduct(id, pr);
						System.out.println("Price Updated Successfully");
						break;
					} else {
						count = 1;
					}
				}
				if (count == 1) {
					System.out.println("Incorrect Id");
				}
				break;

			case 3:
				System.out.println("Enter product id:");
				int did = sc.nextInt();
				int count1 = 0;
				for (int k = 0; k < idret.length; k++) {
					if (did == idret[k]) {
						count1 = 0;
						ps.Deleteproduct(did);
						System.out.println("Product Deleted Successfully");
						break;
					} else {
						count1 = 1;
					}
				}
				if (count1 == 1) {
					System.out.println("Incorrect Id...");
				}
				break;

			case 4:
				ps.Displayallproduct().stream()
						.forEach(p -> System.out.println("Product id:" + p.getPid() + ", Product name:" + p.getPname()
								+ ", Price:" + p.getPrice() + ", Margin:" + p.getPrice() * 0.2));
				break;

			case 5:
				System.out.println("\nProducts in Ascending order of price:");
				ps.DisplayallproductAsc().stream().forEach(p -> System.out.println(p));
				break;

			case 6:
				System.out.println("\nProducts in Descending order of price:");
				ps.DisplayallproductDesc().stream().forEach(p -> System.out.println(p));
				break;

			case 7:
				System.out.println("\nProducts in Ascending order of Name:");
				ps.DisplayallproductNameAsc().stream().forEach(p -> System.out.println(p));
				break;

			case 8:
				System.out.println("\nProducts in Descending order of Name:");
				ps.DisplayallproductNameDesc().stream().forEach(p -> System.out.println(p));
				break;

			case 9:
				System.out.println("Thankyou");
				flag = false;
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}

		} while (flag);

	}

}
