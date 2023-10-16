package phoneTest;

public class Main {

	public static void main(String[] args) {
		String model;
		double ram;
		double cpu;
		int coreCount;
		double performance;
		double maxRam=16*1024;
		double maxCpu=3600;
		double battery;
		double ramPerformance;
		double cpuPerformance;
		double batteryPerformance;
		model="Xiaomi Note 10 Lite";
		ram=6*1024;
		cpu=2400;
		coreCount=4;
		battery=0.10;
		ramPerformance=(0.4*ram/maxRam)*100;
		cpuPerformance=(0.5*cpu/maxCpu)*100;
		batteryPerformance=battery*100;
		performance=(ramPerformance+cpuPerformance+(batteryPerformance));
		System.out.println(model+" : %"+performance);
		System.out.println("Ram: % "+ramPerformance);
		System.out.println("Cpu: % "+cpuPerformance);
		System.out.println("Battery: %"+batteryPerformance);
	}

}
