package arabamCom;

public class Otomobil {
	public String name;
	public String brand;
	public String model;
	public double km;
	public String color;
	public boolean lpg;
	public boolean fuelOil;
	public boolean diesel;
	public double price;


public void print() {
	System.out.print("�sim : ");
	System.out.println(this.name);   
	System.out.println("Fiyat :" + this.price);
	System.out.println("Marka :" + this.brand);
	System.out.println("Renk :" + this.color);
	System.out.println("Kilometresi :" + this.km);
      }
}