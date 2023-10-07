package bus_reservation.org;

public class Bus {
	int busNo;
	String ac;
	int capacity; // get and set method

	Bus(int no, String ac, int cap) {
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}

	public int getBusNo() { // getmethod - it is one of the return type
		return busNo;
	}

	public String getAc() {
		return ac;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setBus(int bus) { // set method - it is no return type and it gives arguments or parameters
		
		busNo = bus;
	}

	public void setAc(String val) {
		ac = val;
	}

	public void setCapacity(int cap) {
		capacity = cap;
	}

	public void displayBusInfo() {
		System.out.println("Bus No: " + busNo + " " + "AC: " + ac + " " + "Total Capacity: " + capacity);
	}

}
