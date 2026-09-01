package busresv;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<bus> buses=new ArrayList<bus>();
		ArrayList<BusBooking> bookings=new ArrayList<BusBooking>();
	    buses.add(new bus(1,true,2,"madurai --> chennai"));
	    buses.add(new bus(2,false,49,"madurai --> coimbatore"));
	    buses.add(new bus(3,true,69,"madurai --> coimbatore"));
	    for(bus b : buses) {
	    	b.display();
	    }
	    
	    int useroption=1;
	    while(useroption==1) {
	    	System.out.print("Enter 1 to book or Enter 2 to exit : ");
	    	useroption=scan.nextInt();
	    	if(useroption==1) {
	    		BusBooking booking = new BusBooking();
	    		if(booking.isavailable(buses,bookings)) {
	    			bookings.add(booking);
	    			System.out.println("your booking is confirmed!!");
	    		}else {
	    			System.out.println("sorry ! bus is full try another bus and date");
	    		}
	    	}else {
	    		System.out.print("ThankYou!! Meet you on next Booking😊!!");
	    	}
	    }
	}

}
