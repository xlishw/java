package arabamCom;

public class Main {

	public static void main(String[] args) {
		Otomobil araba = new Otomobil();
		MotorCycle motor = new MotorCycle();
		araba.name = "Honda S2000";
		araba.km = 114567;
		araba.color = "K�rm�z�";
		araba.lpg = false;
		araba.model = "2005";
		araba.fuelOil = true;
		araba.diesel = false;
		araba.price = 1200000;
		araba.brand = "Honda";
		motor.name = "ZX10R";
		motor.km = 0;
		motor.color = "Siyah";
		motor.electric = false;
		motor.fuelOil = true;
		motor.brand = "Kawazaki";
		motor.price = 3500000;
		motor.model = "2004";
		araba.print();
		motor.print();

	}

}
