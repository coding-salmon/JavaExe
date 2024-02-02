package ch09.Resolve14;

public class LaserPrinter implements PrintUnit {

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
	
	private int laserResidue;

}
