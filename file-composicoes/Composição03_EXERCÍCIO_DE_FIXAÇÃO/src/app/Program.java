package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String clientName = sc.next();
		System.out.print("Email: ");
		String clientEmail = sc.next();
		System.out.print("Birth Date (DD/MM/YYYY) ");
		Date clientBirth = sdf.parse(sc.next());	
		
		Client client = new Client(clientName, clientEmail, clientBirth);
		sc.nextLine();
		
		System.out.println("Enter order data:");
		OrderStatus orderStatus = OrderStatus.valueOf(sc.nextLine());
		Order order = new Order(new Date(), orderStatus, client);
		
		System.out.print("How many items to this order? ");
		int nItems = sc.nextInt();
		
		for(int i=1; i<=nItems; i++) {
			sc.nextLine();
			System.out.println("Enter #" + i + " item data:");
			
			System.out.print("Product name: ");
			String productName = sc.nextLine();			
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			Product product = new Product(productName, productPrice);
						
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
			
			order.addItem(orderItem);
			
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		
		
		sc.close();

	}

}
