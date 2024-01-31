package ch09.iskindof06;

public class Police extends Gun {
	
	private int handCuffs;
	
	public Police(int bullet, int handCuffs) {
		super(bullet);
		this.handCuffs  = handCuffs;
	}
	
	public void putHandCuffs() {
		if(handCuffs>0) {
			System.out.println("SNAP!");
			handCuffs--;
		}else {
			System.out.println("Miss...");
		}
	}

}
