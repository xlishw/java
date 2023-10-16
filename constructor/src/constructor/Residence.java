package constructor;

public class Residence {
	public String caption;
	public double price;
	public double m2;
	public int roomCount;
	public boolean floorHeating;
	public boolean sauna;
	public boolean fitnessCenter;
	public boolean specialGuard;
	public boolean automaticControl;
	public boolean remoteAccess;
	public int cameraCount;
	public double storageArea;
	public Residence() {

	}
	public Residence(String caption, double price, double m2) {
		super();
		this.caption = caption;
		this.price = price;
		this.m2 = m2;
	}
	public Residence(String caption, double price, double m2, int roomCount, boolean floorHeating, boolean sauna,
			boolean fitnessCenter, boolean specialGuard, boolean automaticControl, boolean remoteAccess,
			int cameraCount, double storageArea) {

		this.caption = caption;
		this.price = price;
		this.m2 = m2;
		this.roomCount = roomCount;
		this.floorHeating = floorHeating;
		this.sauna = sauna;
		this.fitnessCenter = fitnessCenter;
		this.specialGuard = specialGuard;
		this.automaticControl = automaticControl;
		this.remoteAccess = remoteAccess;
		this.cameraCount = cameraCount;
		this.storageArea = storageArea;
	}
	public void infoSmall() {
		System.out.println("-------------------------------");
		System.out.println(this.caption);
		System.out.println("Fiyat  :"+this.price+" TL");
		System.out.println("Metrekare : "+this.m2+" m2");
	}
	public void infoLarge() {
		System.out.println("-------------------------------");
		System.out.println(this.caption);
		System.out.println("Fiyat  :"+this.price+" TL");
		System.out.println("Metrekare : "+this.m2+" m2");
		System.out.println("Otomatik Kontrol :"+(this.automaticControl==true?"Var":"Yok"));
		
	}
	public void infoFull() {
	System.out.println("-------------------------------");
	System.out.println(this.caption);
	System.out.println("Fiyat  :"+this.price+" TL");
	System.out.println("Metrekare : "+this.m2+" m2");
	System.out.println("Yerden Is�tma :"+(this.floorHeating==true?"Var":"Yok"));
	System.out.println("Otomatik Kontrol :"+(this.automaticControl==true?"Var":"Yok"));
	System.out.println("Spor Salonu :"+(this.fitnessCenter==true?"Var":"Yok"));
	System.out.println("Uzaktan Erisim :"+(this.remoteAccess==true?"Var":"Yok"));
	System.out.println("Sauna:"+(this.sauna==true?"Var":"Yok"));
	System.out.println("Kamera Say�s� :"+this.cameraCount+"Tane");
	System.out.println("�zel G�venlik :"+(this.specialGuard==true?"Var":"Yok"));
	System.out.println("Depo :"+this.storageArea+"m2");
	}
}
