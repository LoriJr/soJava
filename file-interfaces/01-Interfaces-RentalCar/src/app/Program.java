package app;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;


public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		
		
		System.out.println("Enter rent car data:");
		
		System.out.print("Car model: ");
		String car = sc.nextLine();
		System.out.print("Pickup: ");
		LocalDateTime dateIn = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Return: ");
		LocalDateTime dateOut = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental rent = new CarRental(dateIn, dateOut, new Vehicle(car));
		
		System.out.print("Enter price per hour: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Enter price per day: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		
		rentalService.processInvoice(rent);
		
		System.out.println("INVOICE");
		System.out.println("Payment: " + rent.getInvoice().getBasePayment());
		System.out.println("Tax: " +  rent.getInvoice().getTax());
		System.out.println("Total: " + rent.getInvoice().getTotalPayment());
				
		sc.close();

	}

}
