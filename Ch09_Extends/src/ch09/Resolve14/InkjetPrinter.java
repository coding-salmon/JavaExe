package ch09.Resolve14;

public class InkjetPrinter  implements PrintUnit{

	@Override
	public void modelName() {
		System.out.println("잉크젯: 잉크마를날없다.");
		
	}

	@Override
	public void manufacturer() {
		System.out.println("삼성");
		
	}

	@Override
	public void portInterface() {
		System.out.println("USB타입");
		
	}

	@Override
	public void printQuantity() {
		System.out.println("1분에 100매 인쇄가능");
		
	}

	@Override
	public void paperResidue() {
		System.out.print("종이잔량 : 400매");
		
	}
	
	private int inkResidue;

}
