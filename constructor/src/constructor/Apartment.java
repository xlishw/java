package constructor;

public class Apartment {
	public String caption;
	public double price;
	public Apartment() {
		this.caption="";
		this.price=0;
	}
	public  Apartment(String d1,double d2) {
		this.caption=d1;
		this.price=d2;
	}
	public Apartment(String caption) {
		this.caption=caption;
	}
}

