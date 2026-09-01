package busresv;

public class bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	private String route;
	
	bus(int no,boolean ac,int cap,String route){
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
		this.route=route;
	}
	
	public int getbusNo() {
		return busNo;
	}
	
	public boolean isac() {
		return ac;
	}
	
	public void setAc(boolean AC) {
		this.ac=AC;
	}
	
	public int getcapacity() {
		return capacity;
	}
	
	public void setCapacity(int capa) {
		this.capacity=capa;
	}
	
	public String getroute() {
		return route;
	}
	
	public void setroute(String route) {
		this.route=route;
	}
	
	public void display() {
		
		String busdetails="";
		busdetails+="Bus No : "+this.busNo+"\n";
		busdetails+="Ac : "+this.ac+"\n";
		busdetails+="capacity : "+this.capacity+"\n";
		busdetails+="Route : "+this.route+"\n";
		System.out.println(busdetails);
	}
}

