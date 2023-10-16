package classMethod;

public class Main {

	public static void main(String[] args) {
		Villa aTipi=new Villa();
		Villa bTipi=new Villa();
		Villa cTipi=new Villa();
		Villa luksATipi=new Villa();
		bTipi.m2=114;
		bTipi.m2BetonPrice=1248.78;
		bTipi.m2DemirPrice=478.78;
		bTipi.m2iscilikPrice=158.47;
		System.out.println(bTipi.hesapla());
		System.out.println(bTipi.arsaHesap());
		
		

	}

}
