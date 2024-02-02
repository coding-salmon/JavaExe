package ch09.Resolve14;

public class LaserPrinter implements PrintUnit {
	
	private int tonerResidue;
	public LaserPrinter(int tonerResidue) {
		this.tonerResidue = tonerResidue;
	}
	
	
	@Override
	public void modelName() {
		System.out.println("레이저: 레이저빔발사!");
		
	}

	@Override
	public void manufacturer() {
		System.out.println("엘지");
		
	}

	@Override
	public void portInterface() {
		System.out.println("C핀 타입");
		
	}

	@Override
	public void printQuantity() {
		System.out.println("1분에 400매 인쇄가능");
		
	}

	@Override
	public void paperResidue() {
		System.out.println("종이잔량 : 500매");
		
	}
	
	public void print() {
		for(int i =tonerResidue; tonerResidue>0;tonerResidue--) {
			System.out.println();
			System.out.println("----레이저----");
			System.out.println("1장 출력되었습니다.");
			
		}if(tonerResidue ==0) {
			System.out.println("토너가 부족합니다.");
		}
	}
	
	

}
