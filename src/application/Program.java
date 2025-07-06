package application;

import java.util.Scanner;

import entties.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);

		System.out.println("\nProduct data: " + product);
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		int addStock = sc.nextInt();
		product.addProducts(addStock);
		
		System.out.println("\nUpdate data: " + product);
		System.out.print("\nEnter the number of products to be removed from stock: ");
		int removeStock = sc.nextInt();
		product.removeProducts(removeStock);
		
		System.out.println("\nUpdate data: " + product);

		sc.close();
	}

}
