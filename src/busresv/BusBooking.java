package busresv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class BusBooking {
	private String passengername;
	private int BusNo;
	Date date;
	Scanner scan=new Scanner(System.in);
	BusBooking(){
		System.out.print("Enter passenger name : ");
		passengername=scan.next();
		System.out.print("Enter the bus No. : ");
		BusNo=scan.nextInt();
		System.out.print("Enter the date (dd-mm-yyyy) : ");
		String dateinput=scan.next();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateformat.parse(dateinput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isavailable(ArrayList<bus> buses,ArrayList<BusBooking> bookings) {
		int capacity=0;
		for(bus b:buses) {
			if(b.getbusNo()==BusNo) {
				capacity=b.getcapacity();
			}
		}
		int booked=0;
		for(BusBooking b:bookings) {
			if(b.BusNo==BusNo && b.date.equals(date) ) {
				booked++;
			}
		}
		return booked<capacity?true:false;
	}
}
