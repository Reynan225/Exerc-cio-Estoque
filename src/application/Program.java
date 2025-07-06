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

		Product product = new Product(name, price);

		product.setName("Computer");
		System.out.println("\nUpdate name: " + product.getName());
		
		System.out.println("\nProduct data: " + product);
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("\nUpdate data: " + product);
		System.out.print("\nEnter the number of products to be removed from stock: ");
		int removeStock = sc.nextInt();
		product.removeProducts(removeStock);
		
		System.out.println("\nUpdate data: " + product);

		sc.close();
	}

}
