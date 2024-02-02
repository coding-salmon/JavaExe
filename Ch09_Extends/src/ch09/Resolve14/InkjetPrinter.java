package ch09.Resolve14;

public class InkjetPrinter  implements PrintUnit{

	private int inkResidue;
	
	public InkjetPrinter(int inkResidue) {
		this.inkResidue =inkResidue;
	}
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
	
	
	
	
	
	public void print() {
		for(int i =inkResidue; inkResidue>0;inkResidue--) {
			System.out.println();
			System.out.println("----잉크젯----");
			System.out.println("1장 출력되었습니다.");
			
		}if(inkResidue ==0) {
			System.out.println("잉크가 부족합니다.");
		}
		
	}

}
