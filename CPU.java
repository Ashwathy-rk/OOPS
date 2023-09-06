class CPU{
	double price;
	class Processor{
		double cores;
		String manufac;
		
		double getCache(){,return 4.3;}
	}
	protected class RAM{
		double memory;
		String manufac;
		double getClockspeed(){return 5.5;}
	}
}
public class mai{
	public static void main(String args[]){
		CPU cpu = new CPU();
		CPU.Processor processor = cpu.new Processor();
		CPU.RAM ram = cpu.new RAM();
		System.out.println("Processor cache= "+processor.getCache());
		System.out.println("Ram Clock speed= "+ram.getClockspeed());}
}

