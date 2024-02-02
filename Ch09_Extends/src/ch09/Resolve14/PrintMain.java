package ch09.Resolve14;

public class PrintMain {
	public static void modelNmae(PrintUnit[] units) {
		for(PrintUnit unit : units) {
			unit.modelName();
		}
	}
	public static void manufacturer(PrintUnit[] units) {
		for(PrintUnit unit : units) {
			unit.manufacturer();
		}
	}
	public static void portInterface(PrintUnit[] units) {
		for(PrintUnit unit : units) {
			unit.portInterface();
		}
	}
	public static void printQuantity(PrintUnit[] units) {
		for(PrintUnit unit : units) {
			unit.printQuantity();
		}
	}
	public static void paperResidue(PrintUnit[] units) {
		for(PrintUnit unit : units) {
			unit.paperResidue();
		}
	}
	
	public static void main(String[] args) {
		PrintUnit[] units = new PrintUnit[] {
				new InkjetPrinter(),
				new LaserPrinter()
				
		};
	
	modelNmae(units);
	manufacturer(units);
	portInterface(units);
	printQuantity(units);
	paperResidue(units);
	
}
}
