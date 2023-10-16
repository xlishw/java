package computerParts;

public class Main {

	public static void main(String[] args) {
		String ramText="Kingston 16 GB 14200Mhz DDR 4";
		double ramPrice=84.47;
		String cpuText="Ýntel Core i5 8400 2808Mhz ";
		double cpuPrice=54.67;
		String monText="Msi 265Hz 1Ms";
		double monPrice=267.43;
		String graphicCardText="Nvidia Rtx 4090";
		double graphicCardPrice=325.56;
		String chText="Rampage";
		double chPrice=72.24;
		String anText="Prime H310M-R R2";
		double anPrice=56.43;
		String keyText="Exper KA160Q";
		double keyPrice=26.42;
		String mouText="Exper M375";
		double mouPrice=14.25;
		String caseText="Exper M750";
		double casePrice=12.34;
		double computerPrice=0;
		double dolarTl=26.89;
		double computerTlPrice=0;
		double computerTaxPrice=0;//bilgisayarýn vergisi
		double taxRatio=0.20;//vergi orani
		double computerTlTaxPrice=0;//bilgisayarýn tl olarak vergisi
		
		computerPrice=ramPrice+casePrice+anPrice+chPrice+cpuPrice+graphicCardPrice+keyPrice+monPrice+mouPrice;
		computerTlPrice=computerPrice*dolarTl;
		computerTaxPrice=computerPrice*taxRatio;//dolar olarak kdv hesaplama
		computerTlTaxPrice=computerTlPrice*taxRatio;//türk lirasý kdv hesaplama
		
	    System.out.println("Ram :"+ramText+" ("+ramPrice+"$)");
	    System.out.println("Cpu :"+cpuText+" ("+cpuPrice+"$)");
	    System.out.println("Graphic Card :"+graphicCardText+" ("+graphicCardPrice+"$)");
	    System.out.println("Monitör :"+monText+" ("+monPrice+"$)");
	    System.out.println("Gamer Sofa :"+chText+" ("+chPrice+"$)");
	    System.out.println("MainBord : "+anText+" ("+anPrice+"$)");
	    System.out.println("Keyboard :"+keyText+" ("+keyPrice+"$)");
	    System.out.println("Mouse :"+mouText+" ("+mouPrice+"$)");
	    System.out.println("Case :"+caseText+" ("+casePrice+"$)");
	    System.out.println("Fiyat :"+computerPrice+"$ ("+computerTlPrice+"TL)");
	    System.out.println("Kdv :"+computerTaxPrice+" ("+computerTlTaxPrice+"TL)");
	    }

}
