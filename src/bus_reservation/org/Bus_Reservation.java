package bus_reservation.org;

import java.util.Scanner;
import java.util.ArrayList;

public class Bus_Reservation {
	public static void main(String[] args) {
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Bus(101, "AC", 2));
		buses.add(new Bus(201, "Non AC", 55));
		buses.add(new Bus(301, "AC", 40));
		buses.add(new Bus(401, "Non AC", 53));
		int useropt = 1;
		Scanner input = new Scanner(System.in);
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		while (useropt == 1) {
			System.out.println("Enter 1 to Booking and Enter 2 to exit");
			useropt = input.nextInt();
			if (useropt == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
				else {
					System.out.println("Sorry... Bus is full.. Try anither bus or date..");
					
				}
			}

		}
	}
}


