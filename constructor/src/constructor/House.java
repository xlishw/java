package constructor;

public class House {
	public String caption;
	public double price;
	public double m2;
	public int floorCount;
	public boolean pool;
	public House() {
		
	}
	public House(String caption,double price,double mt2,int floorCount,boolean pool) {
		this.caption=caption;
		this.price=price;
		this.m2=mt2;
		this.floorCount=floorCount;
		this.pool=pool;
		
	}
	public void info() {
	System.out.println("-------------");
	System.out.println(this.caption);
	System.out.println("Fiyat    :"+this.price+" TL");
	System.out.println("Metrekare :"+this.m2+" m2");
	System.out.println("Kat Say�s�  :"+this.floorCount);
	System.out.println("Havuz :"+this.pool);
	}
	public House(String caption,double price, int floorCount) {
		this.caption=caption;
		this.price=price;
		this.floorCount=floorCount;
	}
	}

