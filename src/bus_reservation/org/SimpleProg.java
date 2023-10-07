package bus_reservation.org;
import java.util.Scanner;
import java.util.ArrayList;
public class SimpleProg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int useropt = 1;
		ArrayList<Integer> bus = new ArrayList<Integer>();
		bus.add(101);
		bus.add(102);
		bus.add(103);
		
		String buses = ("Bus No: 101 AC: true Total Capacity: 2\r\n"
				+ "Bus No: 201 AC: false Total Capacity: 55\r\n"
				+ "Bus No: 301 AC: true Total Capacity: 40\r\n"
				+ "Bus No: 401 AC: false Total Capacity: 53");
		System.out.println(buses);
	
		
		//while (useropt == 1) {
		System.out.println("Enter 1 to Booking and Enter 2 to exit");
		useropt = sc.nextInt();
		if (useropt == 1) {
			System.out.println("Enter your name: ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter "+" "+"AC"+" "+ "or not: ");
			String ac = sc.nextLine();
			System.out.println("Enter bus number: ");
			int num = sc.nextInt();
			System.out.println("Enter your travelling date: ");
			String date = sc.nextLine();
			sc.nextLine();
		}
		if(useropt == bus) {
			System.out.println("Your boking is confirmed..... ");
		}
		else {
			System.out.println("Sorry... booking is full");
		}
		//System.out.println(bus);
			
		}
	}
